package com.google.android.apps.gsa.shared.p7007ay;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* renamed from: com.google.android.apps.gsa.shared.ay.a */
/* compiled from: PG */
public final class C89331a implements C90991b {

    /* renamed from: a */
    public final Object f242191a = new Object();

    /* renamed from: b */
    public String f242192b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f242193c = 0;

    /* renamed from: d */
    public boolean f242194d = false;

    /* renamed from: e */
    private final BitFlags f242195e = new BitFlags(getClass(), "FLAG_", 0);

    public C89331a(C91022f fVar) {
        fVar.mo85301a(this);
    }

    /* renamed from: b */
    public static boolean m145281b(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: a */
    public final boolean mo83275a(long j) {
        boolean e;
        synchronized (this.f242191a) {
            e = this.f242195e.mo85052e(j);
        }
        return e;
    }

    /* renamed from: c */
    public final void mo83276c(long j, boolean z) {
        synchronized (this.f242191a) {
            this.f242195e.mo85055h(j, z);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("GlobalState");
        synchronized (this.f242191a) {
            fVar.mo85279c("Flags").mo85276a(C90752i.m148229c(this.f242195e.mo85048b()));
            fVar.mo85279c("Hint text").mo85276a(C90752i.m148229c(this.f242192b));
            fVar.mo85279c("Hint mode").mo85276a(C90752i.m148230d(Integer.valueOf(this.f242193c)));
        }
    }
}
