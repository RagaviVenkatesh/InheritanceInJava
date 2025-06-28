// ✅ SINGLE INHERITANCE
class NetflixAccount {
    void playContent() {
        System.out.println("Playing content in HD.");
    }
}

class PremiumAccount extends NetflixAccount {
    void streamIn4K() {
        System.out.println("Streaming in 4K! 🔥");
    }
}

// ✅ MULTILEVEL INHERITANCE
class UltraPremiumAccount extends PremiumAccount {
    void downloadContent() {
        System.out.println("Downloading content for offline use. 📥");
    }
}

// ✅ HIERARCHICAL INHERITANCE
class KidsAccount extends NetflixAccount {
    void parentalControls() {
        System.out.println("Parental controls enabled 👶");
    }
}

class GuestAccount extends NetflixAccount {
    void limitedAccess() {
        System.out.println("Guest access: limited content available.");
    }
}

// ❌ HYBRID / MULTIPLE INHERITANCE (Not allowed in Java)
// This won't compile — shown only for illustration
/*
class HybridAccount extends PremiumAccount, KidsAccount {
    void something() {
        System.out.println("Trying multiple inheritance... won't work!");
    }
}
*/

public class Main{
    public static void main(String[] args) {
        // SINGLE
        System.out.println("🧪 Single Inheritance:");
        PremiumAccount premium = new PremiumAccount();
        premium.playContent();
        premium.streamIn4K();

        // MULTILEVEL
        System.out.println("\n🧪 Multilevel Inheritance:");
        UltraPremiumAccount ultra = new UltraPremiumAccount();
        ultra.playContent();
        ultra.streamIn4K();
        ultra.downloadContent();

        // HIERARCHICAL
        System.out.println("\n🧪 Hierarchical Inheritance:");

        KidsAccount kids = new KidsAccount();
        kids.playContent();
        kids.parentalControls();

        GuestAccount guest = new GuestAccount();
        guest.playContent();
        guest.limitedAccess();
    }
}
