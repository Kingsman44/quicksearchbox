package androidx.navigation.fragment;

import android.os.Bundle;

/* renamed from: androidx.navigation.fragment.g */
/* compiled from: PG */
public final class C3883g {
    /* renamed from: a */
    public static final C3884h m11185a(int i, Bundle bundle) {
        Bundle bundle2;
        if (i != 0) {
            bundle2 = new Bundle();
            bundle2.putInt("android-support-nav:fragment:graphId", i);
        } else {
            bundle2 = null;
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBundle("android-support-nav:fragment:startDestinationArgs", bundle);
        C3884h hVar = new C3884h();
        hVar.setArguments(bundle2);
        return hVar;
    }
}
