package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.material.snackbar.aa */
/* compiled from: PG */
public final class C44870aa {

    /* renamed from: e */
    private static C44870aa f117113e;

    /* renamed from: a */
    public final Object f117114a = new Object();

    /* renamed from: b */
    public final Handler f117115b = new Handler(Looper.getMainLooper(), new C44894y(this));

    /* renamed from: c */
    public C44895z f117116c;

    /* renamed from: d */
    public C44895z f117117d;

    private C44870aa() {
    }

    /* renamed from: a */
    public static C44870aa m79667a() {
        if (f117113e == null) {
            f117113e = new C44870aa();
        }
        return f117113e;
    }

    /* renamed from: b */
    public final void mo48358b(C44895z zVar) {
        int i = zVar.f117153b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f117115b.removeCallbacksAndMessages(zVar);
            Handler handler = this.f117115b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, zVar), (long) i);
        }
    }

    /* renamed from: c */
    public final void mo48359c() {
        C44895z zVar = this.f117117d;
        if (zVar != null) {
            this.f117116c = zVar;
            this.f117117d = null;
            C44881l lVar = (C44881l) zVar.f117152a.get();
            if (lVar != null) {
                BaseTransientBottomBar.f117073a.sendMessage(BaseTransientBottomBar.f117073a.obtainMessage(0, lVar.f117128a));
            } else {
                this.f117116c = null;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo48360d(C44895z zVar, int i) {
        C44881l lVar = (C44881l) zVar.f117152a.get();
        if (lVar == null) {
            return false;
        }
        this.f117115b.removeCallbacksAndMessages(zVar);
        BaseTransientBottomBar.f117073a.sendMessage(BaseTransientBottomBar.f117073a.obtainMessage(1, i, 0, lVar.f117128a));
        return true;
    }

    /* renamed from: e */
    public final void mo48361e(C44881l lVar) {
        synchronized (this.f117114a) {
            if (mo48363g(lVar)) {
                C44895z zVar = this.f117116c;
                if (!zVar.f117154c) {
                    zVar.f117154c = true;
                    this.f117115b.removeCallbacksAndMessages(zVar);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo48362f(C44881l lVar) {
        synchronized (this.f117114a) {
            if (mo48363g(lVar)) {
                C44895z zVar = this.f117116c;
                if (zVar.f117154c) {
                    zVar.f117154c = false;
                    mo48358b(zVar);
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo48363g(C44881l lVar) {
        C44895z zVar = this.f117116c;
        return zVar != null && zVar.mo48395a(lVar);
    }

    /* renamed from: h */
    public final boolean mo48364h(C44881l lVar) {
        C44895z zVar = this.f117117d;
        return zVar != null && zVar.mo48395a(lVar);
    }
}
