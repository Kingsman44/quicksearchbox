package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.C84381aa;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.libraries.gcoreclient.p1757e.C21495d;
import com.google.android.libraries.gcoreclient.p1757e.C21496e;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.h */
/* compiled from: PG */
public final class C86047h implements C86049j {

    /* renamed from: a */
    private final C86049j f232626a;

    /* renamed from: b */
    private final C86049j f232627b;

    /* renamed from: c */
    private final Object f232628c = new Object();

    /* renamed from: d */
    private C86049j f232629d;

    public C86047h(C86049j jVar, C86049j jVar2, C84413ad adVar, Context context, bm bmVar, boolean z) {
        this.f232626a = jVar;
        this.f232627b = jVar2;
        if (bmVar.o() || (z && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"))) {
            m138356g(jVar2);
            return;
        }
        adVar.mo77967d(new C86046g(this));
        new C84381aa(adVar, adVar.f229681b, new C86045f(this)).mo85242e(new Void[0]);
    }

    /* renamed from: f */
    private final C86049j m138355f() {
        C86049j jVar;
        synchronized (this.f232628c) {
            jVar = this.f232629d;
        }
        return jVar;
    }

    /* renamed from: g */
    private final void m138356g(C86049j jVar) {
        synchronized (this.f232628c) {
            this.f232629d = jVar;
        }
    }

    /* renamed from: a */
    public final void mo79642a(String str) {
        C86049j f = m138355f();
        if (f != null) {
            f.mo79642a(str);
            return;
        }
        this.f232626a.mo79642a(str);
        this.f232627b.mo79642a(str);
    }

    /* renamed from: b */
    public final void mo79643b() {
    }

    /* renamed from: c */
    public final String mo79644c(Account account, String str, C91032p pVar) {
        C86049j f = m138355f();
        if (f != null) {
            try {
                pVar.mo85308a("FallingBackGoogleAuthAdapter: try chosen adapter");
                return f.mo79644c(account, str, pVar);
            } finally {
                pVar.mo85310c();
            }
        } else {
            try {
                pVar.mo85308a("FallingBackGoogleAuthAdapter: try GMS core");
                return this.f232626a.mo79644c(account, str, pVar);
            } catch (C21496e unused) {
                try {
                    pVar.mo85308a("FallingBackGoogleAuthAdapter: try account manager");
                    return this.f232627b.mo79644c(account, str, pVar);
                } finally {
                    pVar.mo85310c();
                }
            } finally {
                pVar.mo85310c();
            }
        }
    }

    /* renamed from: d */
    public final String mo79645d(Account account, String str, C91032p pVar) {
        C86049j f = m138355f();
        if (f != null) {
            try {
                pVar.mo85308a("FallingBackGoogleAuthAdapter: try chosen adapter");
                return f.mo79645d(account, str, pVar);
            } finally {
                pVar.mo85310c();
            }
        } else {
            try {
                pVar.mo85308a("FallingBackGoogleAuthAdapter: try GMS core");
                return this.f232626a.mo79645d(account, str, pVar);
            } catch (C21495d unused) {
                try {
                    pVar.mo85308a("FallingBackGoogleAuthAdapter: try account manager");
                    return this.f232627b.mo79645d(account, str, pVar);
                } finally {
                    pVar.mo85310c();
                }
            } finally {
                pVar.mo85310c();
            }
        }
    }

    /* renamed from: e */
    public final void mo79703e(int i) {
        if (i != 0) {
            m138356g(this.f232627b);
        } else {
            m138356g(this.f232626a);
        }
    }
}
