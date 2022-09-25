package com.google.android.libraries.onegoogle.accountmenu.p2353c;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.c.c */
/* compiled from: PG */
public final class C30333c {

    /* renamed from: a */
    private final C30305n f82020a;

    /* renamed from: b */
    private final FragmentManager f82021b;

    /* renamed from: c */
    private final C0167am f82022c;

    public C30333c(FragmentManager fragmentManager, C30305n nVar, C0167am amVar) {
        this.f82021b = fragmentManager;
        this.f82020a = nVar;
        this.f82022c = amVar;
    }

    /* renamed from: b */
    public static C30333c m56496b(Fragment fragment, C30305n nVar) {
        return new C30333c(fragment.getChildFragmentManager(), nVar, fragment.getActivity());
    }

    /* renamed from: a */
    public final C30332b mo35898a() {
        return new C30332b(this.f82021b, this.f82020a, this.f82022c);
    }
}
