package com.google.android.apps.gsa.staticplugins.opa.p8185ah;

import android.app.Activity;
import android.app.KeyguardManager;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89134f;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ah.j */
/* compiled from: PG */
final class C106169j extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Activity f296297a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f296298b;

    /* renamed from: c */
    final /* synthetic */ C91097g f296299c;

    /* renamed from: d */
    final /* synthetic */ C106160a f296300d;

    /* renamed from: e */
    final /* synthetic */ C106171l f296301e;

    public C106169j(C106171l lVar, Activity activity, C60870cx cxVar, C91097g gVar, C106160a aVar) {
        this.f296301e = lVar;
        this.f296297a = activity;
        this.f296298b = cxVar;
        this.f296299c = gVar;
        this.f296300d = aVar;
    }

    public final void onDismissCancelled() {
        C106171l.m176834d(false, this.f296297a.getWindow());
        this.f296300d.mo95333b(2);
    }

    public final void onDismissError() {
        C106171l.m176834d(false, this.f296297a.getWindow());
        this.f296300d.mo95333b(3);
    }

    public final void onDismissSucceeded() {
        this.f296301e.mo95341e(C89134f.DEVICE_UNLOCKED);
        C106171l.m176834d(false, this.f296297a.getWindow());
        try {
            C106171l lVar = this.f296301e;
            if (!lVar.f296309g && lVar.f296307e.mo79746e(C90014bt.f247394gN) && this.f296298b.isDone() && ((Boolean) C60856cj.m92909r(this.f296298b)).booleanValue()) {
                this.f296301e.f296309g = true;
                C18509a c = C18522b.m35986c();
                ((C18523c) c).f52492a = "lockscreen_consent";
                c.mo24023e("assistant_lockscreen_jit_pop_up");
                this.f296299c.mo65090b(c.mo24020b().mo24031a(), new C106168i(this, this.f296300d));
                return;
            }
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C106171l.f296303a.mo56226d()).mo56382g(e)).mo56372aa(24727)).mo56386p("Unable to get the Lockscreen data from Lockscreen data service to promo AOL.");
        }
        this.f296300d.mo95333b(1);
    }
}
