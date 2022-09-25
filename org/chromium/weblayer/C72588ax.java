package org.chromium.weblayer;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import org.chromium.p5643b.p5644a.C72317am;
import org.chromium.p5643b.p5644a.C72323as;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.p5643b.p5644a.C72343bl;

/* renamed from: org.chromium.weblayer.ax */
/* compiled from: PG */
final class C72588ax extends C72323as {

    /* renamed from: a */
    public C72590az f193126a;

    /* renamed from: b */
    public boolean f193127b;

    public C72588ax(C72590az azVar) {
        this.f193126a = azVar;
    }

    /* renamed from: a */
    public final C72317am mo63716a() {
        C72343bl.m106991a();
        return new C72341bj(this.f193126a.getActivity());
    }

    /* renamed from: b */
    public final C72317am mo63717b() {
        C72343bl.m106991a();
        return new C72341bj(this.f193126a.getView());
    }

    /* renamed from: c */
    public final void mo63718c() {
        C72343bl.m106991a();
        if (this.f193126a.getParentFragmentManager() != null) {
            C0154a aVar = new C0154a(this.f193126a.getParentFragmentManager());
            aVar.mo516m(this.f193126a);
            aVar.mo505b(false);
        }
    }

    /* renamed from: d */
    public final void mo63719d(String[] strArr, int i) {
        C72343bl.m106991a();
        this.f193126a.requestPermissions(strArr, i);
    }

    /* renamed from: e */
    public final void mo63720e(C72317am amVar) {
        C72343bl.m106991a();
        this.f193126a.mo64461c((Bundle) C72341bj.m106988a(amVar, Bundle.class));
    }

    /* renamed from: f */
    public final void mo63721f(C72317am amVar) {
        C72343bl.m106991a();
        this.f193126a.mo64460b((Context) C72341bj.m106988a(amVar, Context.class));
    }

    /* renamed from: g */
    public final void mo63722g(C72317am amVar) {
        C72343bl.m106991a();
        this.f193126a.mo64461c((Bundle) C72341bj.m106988a(amVar, Bundle.class));
    }

    /* renamed from: h */
    public final void mo63723h() {
        C72343bl.m106991a();
        if (!this.f193127b) {
            this.f193126a.mo64462d();
        }
    }

    /* renamed from: i */
    public final void mo63724i() {
        C72343bl.m106991a();
        this.f193126a.mo64463e();
    }

    /* renamed from: j */
    public final void mo63725j() {
        C72343bl.m106991a();
        this.f193126a.mo64464f();
    }

    /* renamed from: k */
    public final void mo63726k() {
        C72343bl.m106991a();
        this.f193126a.mo64465g();
    }

    /* renamed from: l */
    public final void mo63727l() {
        C72343bl.m106991a();
        this.f193126a.mo64466h();
    }

    /* renamed from: m */
    public final void mo63728m(C72317am amVar) {
        C72343bl.m106991a();
        Bundle bundle = (Bundle) C72341bj.m106988a(amVar, Bundle.class);
    }

    /* renamed from: n */
    public final void mo63729n() {
        C72343bl.m106991a();
        this.f193126a.mo64467i();
    }

    /* renamed from: o */
    public final void mo63730o() {
        C72343bl.m106991a();
        this.f193126a.mo64468j();
    }

    /* renamed from: p */
    public final boolean mo63731p(String str) {
        C72343bl.m106991a();
        return this.f193126a.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: q */
    public final boolean mo63732q(C72317am amVar, int i, C72317am amVar2) {
        C72343bl.m106991a();
        try {
            this.f193126a.startActivityForResult((Intent) C72341bj.m106988a(amVar, Intent.class), i, (Bundle) C72341bj.m106988a(amVar2, Bundle.class));
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean mo63733r(C72317am amVar, int i, C72317am amVar2, int i2, int i3, int i4, C72317am amVar3) {
        C72343bl.m106991a();
        try {
            this.f193126a.startIntentSenderForResult((IntentSender) C72341bj.m106988a(amVar, IntentSender.class), i, (Intent) C72341bj.m106988a(amVar2, Intent.class), i2, i3, i4, (Bundle) C72341bj.m106988a(amVar3, Bundle.class));
            return true;
        } catch (IntentSender.SendIntentException unused) {
            return false;
        }
    }
}
