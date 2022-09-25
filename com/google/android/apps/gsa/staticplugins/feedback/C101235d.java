package com.google.android.apps.gsa.staticplugins.feedback;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.gsa.search.shared.multiuser.C87618u;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90462d;
import com.google.android.apps.gsa.shared.p7129r.C90468j;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91027k;
import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import com.google.android.apps.gsa.staticplugins.feedback.service.C101255d;
import com.google.android.libraries.gcoreclient.p1774k.p1775a.C21571f;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21590b;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21593e;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21594f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.d */
/* compiled from: PG */
public final class C101235d implements C90462d {

    /* renamed from: b */
    public final C101247p f282522b;

    /* renamed from: c */
    public final AtomicBoolean f282523c = new AtomicBoolean(false);

    /* renamed from: d */
    private final C22871g f282524d;

    public C101235d(C101247p pVar, C22871g gVar) {
        this.f282522b = pVar;
        this.f282524d = gVar;
    }

    /* renamed from: a */
    public final void mo84204a(Context context, C90461c cVar) {
        C101255d.m167496g(context, this.f282524d, new C101231b(this, context, cVar));
    }

    /* renamed from: b */
    public final void mo84205b(Context context, FeedbackData feedbackData) {
        C101255d.m167496g(context, this.f282524d, new C101234c(this, context, feedbackData));
    }

    /* renamed from: c */
    public final void mo84206c(Context context, C90461c cVar) {
        if (this.f282523c.compareAndSet(false, true)) {
            C101255d.m167496g(context, this.f282524d, new C101229a(this, context, cVar));
        }
    }

    /* renamed from: d */
    public final C101246o mo92184d(Context context, C101255d dVar, C90461c cVar) {
        Context context2 = context;
        if (!(context2 instanceof Activity)) {
            return this.f282522b.mo92193a(context2, dVar, cVar);
        }
        C101247p pVar = this.f282522b;
        Activity activity = (Activity) context2;
        Activity activity2 = activity;
        activity.getClass();
        cVar.getClass();
        C87618u uVar = (C87618u) pVar.f282557a.mo17428b();
        C87618u uVar2 = uVar;
        uVar.getClass();
        C69464a aVar = pVar.f282558b;
        C69464a aVar2 = pVar.f282559c;
        ((C21571f) pVar.f282560d.mo17428b()).getClass();
        C21590b bVar = (C21590b) pVar.f282561e.mo17428b();
        C21590b bVar2 = bVar;
        bVar.getClass();
        C21593e eVar = (C21593e) pVar.f282562f.mo17428b();
        C21593e eVar2 = eVar;
        eVar.getClass();
        C21594f fVar = (C21594f) pVar.f282563g.mo17428b();
        C21594f fVar2 = fVar;
        fVar.getClass();
        C90468j jVar = (C90468j) pVar.f282564h.mo17428b();
        C90468j jVar2 = jVar;
        jVar.getClass();
        C91027k kVar = (C91027k) pVar.f282565i.mo17428b();
        C91027k kVar2 = kVar;
        kVar.getClass();
        ((C90476a) pVar.f282566j.mo17428b()).getClass();
        C68214a a = C68219e.m98518a(((C68226l) pVar.f282567k).f184585a);
        C68214a aVar3 = a;
        a.getClass();
        C69464a aVar4 = pVar.f282568l;
        C68214a a2 = C68219e.m98518a(((C68226l) pVar.f282569m).f184585a);
        C68214a aVar5 = a2;
        a2.getClass();
        C22871g gVar = (C22871g) pVar.f282570n.mo17428b();
        C22871g gVar2 = gVar;
        gVar.getClass();
        C22871g gVar3 = (C22871g) pVar.f282571o.mo17428b();
        C22871g gVar4 = gVar3;
        gVar3.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) pVar.f282572p).f184585a);
        a3.getClass();
        return new C101246o(activity2, dVar, cVar, uVar2, aVar, aVar2, bVar2, eVar2, fVar2, jVar2, kVar2, aVar3, aVar4, aVar5, gVar2, gVar4, a3);
    }
}
