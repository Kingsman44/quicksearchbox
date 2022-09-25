package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.os.IBinder;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.Window;
import com.google.android.apps.gsa.binaries.satin.app.apl;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33563d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.am */
/* compiled from: PG */
public final class C121916am implements C121907ad {

    /* renamed from: a */
    public static final C59071e f338306a = C59071e.m91331h();

    /* renamed from: b */
    public final IBinder f338307b;

    /* renamed from: c */
    public final AccountId f338308c;

    /* renamed from: d */
    public final C28310af f338309d;

    /* renamed from: e */
    public final C28306ab f338310e;

    /* renamed from: f */
    public final C121941bk f338311f;

    /* renamed from: g */
    public C121928ay f338312g;

    /* renamed from: h */
    public C121909af f338313h;

    /* renamed from: i */
    public final apl f338314i;

    /* renamed from: j */
    private final Executor f338315j;

    /* renamed from: k */
    private final C121965z f338316k;

    /* renamed from: l */
    private final C121906ac f338317l;

    public C121916am(IBinder iBinder, AccountId accountId, C28310af afVar, C28306ab abVar, Executor executor, apl apl, C121965z zVar, C121941bk bkVar, C121906ac acVar) {
        C69664n.m101061g(iBinder, "windowToken");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        C69664n.m101061g(executor, "uiExecutor");
        C69664n.m101061g(apl, "windowFactory");
        C69664n.m101061g(zVar, "assistLayerSessionIdGenerator");
        C69664n.m101061g(bkVar, "windowIdGenerator");
        C69664n.m101061g(acVar, "assistLayerTracker");
        this.f338307b = iBinder;
        this.f338308c = accountId;
        this.f338309d = afVar;
        this.f338310e = abVar;
        this.f338315j = executor;
        this.f338314i = apl;
        this.f338316k = zVar;
        this.f338311f = bkVar;
        this.f338317l = acVar;
    }

    /* renamed from: h */
    public static final View m201383h(Window window) {
        View findViewById = window.findViewById(16908290);
        C69664n.m101060f(findViewById, "findViewById(android.R.id.content)");
        return findViewById;
    }

    /* renamed from: a */
    public final void mo105433a(String str) {
        this.f338315j.execute(C47810es.m84977q(new C121912ai(this, str)));
    }

    /* renamed from: b */
    public final void mo105434b() {
        this.f338315j.execute(C47810es.m84977q(new C121913aj(this)));
    }

    /* renamed from: c */
    public final void mo105435c() {
        this.f338315j.execute(C47810es.m84977q(new C121914ak(this)));
    }

    /* renamed from: d */
    public final void mo105436d(Fragment fragment, C34037b bVar, C33563d dVar) {
        C69664n.m101061g(bVar, "apaClient");
        this.f338315j.execute(C47810es.m84977q(new C121915al(this, fragment, dVar, bVar)));
    }

    /* renamed from: e */
    public final C121909af mo105444e(long j, C34037b bVar) {
        C121909af afVar = new C121909af(this, this.f338315j, this.f338316k.f338478a.incrementAndGet());
        this.f338317l.mo105432c(afVar.f338294b, j, bVar);
        return afVar;
    }

    /* renamed from: f */
    public final void mo105445f(String str) {
        C121928ay ayVar = this.f338312g;
        if (ayVar != null) {
            ayVar.dismiss();
        }
        this.f338312g = null;
        mo105446g(str);
    }

    /* renamed from: g */
    public final void mo105446g(String str) {
        C121909af afVar = this.f338313h;
        if (afVar != null) {
            if (afVar.f338293a == null) {
                C59052c cVar = (C59052c) f338306a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
                long j = afVar.f338294b;
                cVar.mo56379ah(new C59094n(36049));
                cVar.mo56388r("AssistLayerSession(%s).invalidate is called, but it was already invalidated", j);
            } else {
                afVar.f338293a = null;
            }
            this.f338317l.mo105431b(afVar.f338294b, str);
        }
        this.f338313h = null;
    }
}
