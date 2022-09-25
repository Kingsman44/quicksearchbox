package com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.p031v4.media.session.C0320v;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b.a.p */
/* compiled from: PG */
final class C36074p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C2164c f94365a;

    /* renamed from: b */
    final /* synthetic */ boolean f94366b;

    /* renamed from: c */
    final /* synthetic */ C0320v f94367c;

    /* renamed from: d */
    final /* synthetic */ C35470f f94368d;

    /* renamed from: e */
    final /* synthetic */ C36075q f94369e;

    public C36074p(C36075q qVar, C2164c cVar, boolean z, C0320v vVar, C35470f fVar) {
        this.f94369e = qVar;
        this.f94365a = cVar;
        this.f94366b = z;
        this.f94367c = vVar;
        this.f94368d = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C36075q.f94370a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(52171)).mo56386p("Failed to set clientOpResult.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C60870cx cxVar;
        this.f94365a.mo5437b((C52070ec) obj);
        if (this.f94366b) {
            C36075q qVar = this.f94369e;
            C0320v vVar = this.f94367c;
            C35470f fVar = this.f94368d;
            String g = vVar.mo1039g();
            PendingIntent c = vVar.mo1035c();
            if (c != null) {
                Intent intent = new Intent();
                C60870cx a = qVar.f94373d.mo39967a(intent);
                C36059a aVar = new C36059a(qVar, c, intent, g, fVar);
                cxVar = C60922j.m93045h(a, C47810es.m84966f(aVar), qVar.f94374e);
            } else {
                C59104x d = C36075q.f94370a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
                ((C59052c) ((C59052c) d).mo56372aa(52175)).mo56389s("Failed to open app by session activity. Fallback to intent with: %s", g);
                cxVar = qVar.mo39965f(g, fVar);
            }
            C36073o oVar = new C36073o(this);
            C60856cj.m92911t(cxVar, C47810es.m84974n(oVar), this.f94369e.f94374e);
        }
    }
}
