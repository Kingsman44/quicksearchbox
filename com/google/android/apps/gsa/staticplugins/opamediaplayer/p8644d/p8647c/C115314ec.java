package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ec */
/* compiled from: PG */
public final class C115314ec {

    /* renamed from: a */
    public final C52176ia f319951a;

    /* renamed from: b */
    public final C58833ax f319952b;

    public C115314ec(C52176ia iaVar) {
        this.f319951a = iaVar;
        this.f319952b = C58836b.f156633a;
    }

    public C115314ec(C52176ia iaVar, C84275o oVar) {
        this(iaVar);
        this.f319952b = C58833ax.m90834k(oVar);
    }

    /* renamed from: a */
    public final C52174hz mo101947a() {
        if (mo101949c()) {
            C52176ia iaVar = this.f319951a;
            return (C52174hz) iaVar.f136914b.get(iaVar.f136916d);
        }
        throw new IllegalStateException("Media has not been initialized.");
    }

    /* renamed from: b */
    public final C58833ax mo101948b() {
        C52176ia iaVar = this.f319951a;
        return C115387w.m191346g(iaVar, iaVar.f136916d + 1);
    }

    /* renamed from: c */
    public final boolean mo101949c() {
        return !this.f319951a.equals(C52176ia.f136911k);
    }

    /* renamed from: d */
    public final boolean mo101950d() {
        return !mo101948b().mo56113h();
    }

    /* renamed from: e */
    public final boolean mo101951e(C84275o oVar) {
        return oVar.mo77796b() == this.f319951a.f136916d && ((String) C115485b.m191569c((String) oVar.mo77806l().mo56109e(BuildConfig.FLAVOR)).mo56109e(BuildConfig.FLAVOR)).equals(mo101947a().f136895b);
    }

    /* renamed from: f */
    public final boolean mo101952f() {
        if (this.f319952b.mo56113h() && !this.f319951a.f136914b.isEmpty() && mo101951e((C84275o) this.f319952b.mo56107c())) {
            return ((C84275o) this.f319952b.mo56107c()).mo77814t();
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo101953g() {
        C52176ia iaVar = this.f319951a;
        return iaVar.f136914b.size() == 1 && C115387w.m191347h((C52174hz) iaVar.f136914b.get(0)) && !C115387w.m191348i(this.f319951a);
    }
}
