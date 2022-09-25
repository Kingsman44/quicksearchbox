package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import android.util.Base64;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.p4476cf.p4477a.C58059a;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63261f;
import com.google.protos.p4816ai.p4820d.p4829f.p4830a.C63265j;
import com.google.speech.p5228m.C67335cl;
import java.util.concurrent.TimeUnit;
import org.p5633c.p5634a.C72299w;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.am */
/* compiled from: PG */
public final /* synthetic */ class C100730am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C91006f f281619a;

    public /* synthetic */ C100730am(C91006f fVar) {
        this.f281619a = fVar;
    }

    public final Object apply(Object obj) {
        C91006f fVar = this.f281619a;
        C58485gu guVar = (C58485gu) obj;
        fVar.mo85281e((Object) null);
        fVar.mo85291r("Dumping Speech Learning Task Metrics. For viewing encoded speech learning task result, use command: `echo '[base64 string]' | base64 -d | gqui from rawproto:- proto speech.training_cache.SpeechLearningTaskResult`.");
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C67335cl clVar = (C67335cl) guVar.get(i);
            fVar.mo85281e((Object) null);
            fVar.mo85291r("Sheldon Speech Learning Task Metrics");
            C63265j jVar = clVar.f183022a;
            if (jVar == null) {
                jVar = C63265j.f170990j;
            }
            C63261f fVar2 = jVar.f170993b;
            if (fVar2 == null) {
                fVar2 = C63261f.f170949g;
            }
            C100733ap.m166929a(fVar2, fVar);
            fVar.mo85279c("Result Success").mo85276a(C90752i.m148228b(Boolean.valueOf(jVar.f170994c)));
            fVar.mo85279c("Task Success").mo85276a(C90752i.m148228b(Boolean.valueOf(jVar.f170999h)));
            fVar.mo85279c("Deploy Success").mo85276a(C90752i.m148228b(Boolean.valueOf(jVar.f171000i)));
            fVar.mo85279c("Acceptance Decision").mo85276a(C90752i.m148228b(Boolean.valueOf(jVar.f170995d)));
            fVar.mo85279c("Num Epochs").mo85276a(C90752i.m148230d(Integer.valueOf(jVar.f170997f)));
            fVar.mo85279c("Task Finish Timestamp").mo85276a(C90752i.m148229c(C72267x.f192324e.mo63597c(new C72299w(C58059a.m88814a(TimeUnit.MILLISECONDS.toMicros(jVar.f170996e))))));
            fVar.mo85279c("Base 64 Encoded Speech Learning Task Result").mo85276a(C90752i.m148229c(Base64.encodeToString(clVar.toByteArray(), 0)));
        }
        return null;
    }
}
