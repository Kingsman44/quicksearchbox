package com.google.android.play.core.p3538g;

import android.os.Bundle;
import com.google.android.gms.tasks.C146010af;
import com.google.android.play.core.p3538g.p3540b.C45143b;

/* renamed from: com.google.android.play.core.g.at */
/* compiled from: PG */
class C45134at extends C45143b {

    /* renamed from: a */
    final C146010af f117827a;

    /* renamed from: b */
    final /* synthetic */ C45135au f117828b;

    public C45134at(C45135au auVar, C146010af afVar) {
        this.f117828b = auVar;
        this.f117827a = afVar;
    }

    /* renamed from: a */
    public void mo48959a(Bundle bundle) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onDeferredInstall", new Object[0]);
    }

    /* renamed from: b */
    public void mo48960b(Bundle bundle) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onDeferredLanguageInstall", new Object[0]);
    }

    /* renamed from: c */
    public void mo48961c(Bundle bundle) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onDeferredLanguageUninstall", new Object[0]);
    }

    /* renamed from: d */
    public void mo48962d(Bundle bundle) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onDeferredUninstall", new Object[0]);
    }

    /* renamed from: e */
    public void mo48963e(int i, Bundle bundle) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onStartInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo48964f(Bundle bundle) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        int i = bundle.getInt("error_code");
        C45135au.f117829a.mo48884b("onError(%d)", Integer.valueOf(i));
        C146010af afVar = this.f117827a;
        afVar.f394698a.mo122509w(new C45179n(i));
    }

    /* renamed from: g */
    public final void mo48965g(int i) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onCancelInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: h */
    public final void mo48966h(int i) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: i */
    public final void mo48967i() {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    /* renamed from: j */
    public final void mo48968j(int i) {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: k */
    public final void mo48969k() {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: l */
    public final void mo48970l() {
        this.f117828b.f117832c.mo48912f(this.f117827a);
        C45135au.f117829a.mo48886d("onGetSplitsForAppUpdate", new Object[0]);
    }
}
