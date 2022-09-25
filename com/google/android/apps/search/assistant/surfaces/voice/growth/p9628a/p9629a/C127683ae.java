package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.assistant.p4008y.p4009a.C53608q;
import com.google.assistant.p4008y.p4009a.C53610s;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.p4632a.C61349j;
import com.google.frameworks.client.data.android.p4632a.C61354o;
import com.google.frameworks.client.data.android.p4632a.C61355p;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.p4017at.p4021b.p4022a.p4023a.p4024a.p4025a.C53820b;
import com.google.p4017at.p4021b.p4022a.p4023a.p4024a.p4025a.C53821c;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70846h;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.ae */
/* compiled from: PG */
public final class C127683ae {

    /* renamed from: a */
    private static final C59071e f351544a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.ae");

    /* renamed from: b */
    private C53820b f351545b;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.ae$a */
    /* compiled from: PG */
    public interface C127684a {
        /* renamed from: nX */
        void mo108180nX();
    }

    public C127683ae(C53820b bVar, AccountId accountId, Context context) {
        C70846h hVar = C61409d.f166071a;
        ((C127684a) C47245e.m84045a(context, C127684a.class, accountId)).mo108180nX();
        C61349j jVar = new C61349j();
        jVar.f165909a = C58833ax.m90834k(new C58759qy("https://www.googleapis.com/auth/assistant-activation-engagement-chalkboard"));
        C61354o a = C61355p.m93860a(C58528ij.m90011K("pseudonymous", "incognito"));
        a.f165916a = C58833ax.m90834k("AIzaSyDQz5AjjxDO4cCLd5fjK2hteg2S_eWeTHo");
        jVar.f165910b = C58833ax.m90834k(a.mo57929a());
        this.f351545b = (C53820b) bVar.mo62577p(hVar, new C61358s(jVar.mo57930b()));
    }

    /* renamed from: a */
    public final C60870cx mo108179a(C53608q qVar, boolean z) {
        C59104x b = f351544a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OlcClient");
        ((C59052c) ((C59052c) b).mo56372aa(37610)).mo56386p("#fetchOlcData");
        if (z) {
            C53820b bVar = this.f351545b;
            C70334de deVar = new C70334de();
            deVar.mo62033h(new C70290cs("x-response-encoding", C70334de.f187481c), "gzip");
            this.f351545b = (C53820b) bVar.mo62576o(new C70879r(deVar));
        }
        C53820b bVar2 = this.f351545b;
        C70888j jVar = bVar2.f189039a;
        C70338di diVar = C53821c.f141254a;
        if (diVar == null) {
            synchronized (C53821c.class) {
                diVar = C53821c.f141254a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.assistant.voice.growth.chalkboard.v1.AssistantLearningCenterService", "FetchOneLearningCenterData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53608q.f140706d);
                    d.f187486b = C70850d.m103697c(C53610s.f140712b);
                    C70338di a = d.mo62040a();
                    C53821c.f141254a = a;
                    diVar = a;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bVar2.f189040b), qVar);
    }
}
