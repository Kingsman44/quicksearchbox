package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80204ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80205az;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80256k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80257l;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.af */
/* compiled from: PG */
public final /* synthetic */ class C75805af implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C75808ai f210375a;

    public /* synthetic */ C75805af(C75808ai aiVar) {
        this.f210375a = aiVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C75808ai aiVar = this.f210375a;
        C80201av avVar = (C80201av) obj;
        aiVar.f210382d.mo74271b(C89849ae.PIE_ELIGIBILITY_REQUEST_SENT);
        C80256k kVar = (C80256k) C80257l.f220192c.createBuilder();
        kVar.copyOnWrite();
        C80257l lVar = (C80257l) kVar.instance;
        lVar.f220195b = Integer.valueOf(avVar.f220046m);
        lVar.f220194a = 2;
        C80257l lVar2 = (C80257l) kVar.build();
        C75830bd bdVar = aiVar.f210386h;
        C80204ay ayVar = (C80204ay) C80205az.f220051c.createBuilder();
        ayVar.copyOnWrite();
        C80205az azVar = (C80205az) ayVar.instance;
        lVar2.getClass();
        azVar.f220054b = lVar2;
        azVar.f220053a = 1;
        C60870cx a = bdVar.mo71917a((C80205az) ayVar.build());
        a.mo4106b(new C75804ae(aiVar, a), C60826bg.f164896a);
        C90875ai.m148465b(new C75800aa(aiVar, avVar), a, aiVar.f210381c, "[NGA] PieImpl.sendControllerRequestWithResult").mo85223a(new C75801ab(aiVar, avVar));
    }
}
