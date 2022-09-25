package com.google.apps.tiktok.tracing;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.tracing.ab */
/* compiled from: PG */
public final class C47515ab {

    /* renamed from: a */
    public C47816ey f123353a;

    /* renamed from: b */
    public C47816ey f123354b;

    /* renamed from: c */
    private final Fragment f123355c;

    /* renamed from: d */
    private int f123356d = 0;

    /* renamed from: com.google.apps.tiktok.tracing.ab$a */
    /* compiled from: PG */
    public interface C47516a {
        /* renamed from: bT */
        C47770dh mo51384bT();
    }

    public C47515ab(Fragment fragment) {
        this.f123355c = fragment;
    }

    /* renamed from: l */
    private final void m84563l(C47816ey eyVar, Fragment fragment, boolean z) {
        if (fragment.isAdded()) {
            for (Fragment fragment2 : fragment.getChildFragmentManager().f634a.mo677i()) {
                if (fragment2 instanceof C47570bu) {
                    ((C47570bu) fragment2).mo17861i(eyVar, z);
                } else {
                    m84563l(eyVar, fragment2, z);
                }
            }
        }
    }

    /* renamed from: a */
    public final C47573bx mo51373a(String str) {
        if (C47831fm.m85027v()) {
            return C47831fm.m85006a(str);
        }
        C0167am activity = this.f123355c.getActivity();
        C58838bb.m90866a(activity, "called before fragment was attached to an Activity");
        return C47775dm.m84930a(activity).mo51613c(str);
    }

    /* renamed from: b */
    public final C47573bx mo51374b() {
        C47816ey eyVar = this.f123353a;
        if (eyVar != null) {
            return eyVar.mo51644a();
        }
        C47816ey eyVar2 = this.f123354b;
        if (eyVar2 != null) {
            return eyVar2.mo51644a();
        }
        C47831fm.m85023r();
        return C47825fg.f123846a;
    }

    /* renamed from: c */
    public final C47573bx mo51375c() {
        C47816ey eyVar = this.f123353a;
        if (eyVar != null) {
            return eyVar.mo51644a();
        }
        C47816ey eyVar2 = this.f123354b;
        if (eyVar2 != null) {
            return eyVar2.mo51644a();
        }
        C47831fm.m85023r();
        return C47825fg.f123846a;
    }

    /* renamed from: d */
    public final C47573bx mo51376d() {
        try {
            C47816ey eyVar = this.f123353a;
            if (eyVar != null) {
                return eyVar.mo51644a();
            }
            C47816ey eyVar2 = this.f123354b;
            if (eyVar2 != null) {
                C47573bx a = eyVar2.mo51644a();
                this.f123353a = null;
                this.f123354b = null;
                this.f123356d = 0;
                return a;
            }
            C47831fm.m85023r();
            C47825fg fgVar = C47825fg.f123846a;
            this.f123353a = null;
            this.f123354b = null;
            this.f123356d = 0;
            return fgVar;
        } finally {
            this.f123353a = null;
            this.f123354b = null;
            this.f123356d = 0;
        }
    }

    /* renamed from: e */
    public final C47573bx mo51377e() {
        C47816ey eyVar = this.f123353a;
        if (eyVar != null) {
            return eyVar.mo51644a();
        }
        C47816ey eyVar2 = this.f123354b;
        if (eyVar2 != null) {
            return eyVar2.mo51644a();
        }
        C47831fm.m85023r();
        return C47825fg.f123846a;
    }

    /* renamed from: f */
    public final C47573bx mo51378f(String str) {
        C47573bx bxVar;
        C47831fm.m85022q();
        if (C47831fm.m85027v()) {
            bxVar = C47831fm.m85006a(str);
        } else {
            bxVar = ((C47516a) C47266f.m84076a(this.f123355c.getContext(), C47516a.class)).mo51384bT().mo51613c(str);
        }
        return new C47514aa(C47831fm.m85028w(), bxVar);
    }

    /* renamed from: g */
    public final void mo51379g(boolean z) {
        mo51380h(z ? C47816ey.m84988b() : null, true);
    }

    /* renamed from: h */
    public final void mo51380h(C47816ey eyVar, boolean z) {
        if (z) {
            if (eyVar == null) {
                int i = this.f123356d - 1;
                if (i < 0) {
                    i = 0;
                }
                this.f123356d = i;
                if (i == 0) {
                    this.f123354b = null;
                    return;
                }
                return;
            }
            this.f123356d++;
        }
        this.f123354b = eyVar;
        m84563l(eyVar, this.f123355c, z);
    }

    /* renamed from: i */
    public final void mo51381i() {
        C47831fm.m85023r();
        if (this.f123356d > 0) {
            mo51380h(C47816ey.m84988b(), false);
        }
    }

    /* renamed from: j */
    public final void mo51382j(int i, int i2) {
        C47831fm.m85023r();
        if (i2 != 0) {
            this.f123353a = C47816ey.m84988b();
        }
        if (i != 0) {
            mo51380h(C47816ey.m84988b(), true);
        }
    }

    /* renamed from: k */
    public final void mo51383k() {
        C47831fm.m85023r();
        if (this.f123356d > 0) {
            mo51380h(C47816ey.m84988b(), false);
        }
    }
}
