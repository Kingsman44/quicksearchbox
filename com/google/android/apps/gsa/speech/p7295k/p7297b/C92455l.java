package com.google.android.apps.gsa.speech.p7295k.p7297b;

import android.accounts.Account;
import com.google.android.apps.gsa.p6487s3.producers.C84300aa;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66615cm;
import java.io.IOException;
import java.util.concurrent.Future;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.speech.k.b.l */
/* compiled from: PG */
public final class C92455l {

    /* renamed from: b */
    private static final C59071e f257882b = C59071e.m91332i("com.google.android.apps.gsa.speech.k.b.l");

    /* renamed from: a */
    public Future f257883a;

    /* renamed from: c */
    private final C69464a f257884c;

    /* renamed from: d */
    private final C84300aa f257885d;

    /* renamed from: e */
    private final C90931ca f257886e;

    /* renamed from: f */
    private final C92302a f257887f;

    /* renamed from: g */
    private final C89994f f257888g;

    /* renamed from: h */
    private final Account f257889h;

    /* renamed from: i */
    private final String f257890i;

    /* renamed from: j */
    private final C66595bu f257891j;

    public C92455l(C69464a aVar, C90931ca caVar, C92302a aVar2, C89994f fVar, Account account, String str, C66595bu buVar) {
        this.f257884c = aVar;
        this.f257886e = caVar;
        this.f257887f = aVar2;
        this.f257888g = fVar;
        this.f257889h = account;
        this.f257890i = str;
        this.f257891j = buVar;
        this.f257885d = new C84300aa(fVar.mo83859V());
        this.f257883a = (Future) aVar.mo17428b();
    }

    /* renamed from: a */
    public final void mo87155a() {
        this.f257883a.cancel(true);
    }

    /* renamed from: b */
    public final void mo87156b() {
        C66615cm cmVar;
        try {
            cmVar = (C66615cm) this.f257885d.mo77841a(this.f257883a);
        } catch (IOException unused) {
            C59104x d = f257882b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S3UserInfoRefreshHelper");
            ((C59052c) ((C59052c) d).mo56372aa(12808)).mo56386p("Could not get S3UserInfo for refresh.");
            cmVar = null;
        }
        if (cmVar == null) {
            this.f257883a = (Future) this.f257884c.mo17428b();
            return;
        }
        C92444a aVar = new C92444a();
        aVar.mo87128d(this.f257887f);
        aVar.mo87130f(this.f257888g);
        aVar.f257823d = C58833ax.m90834k(cmVar);
        aVar.f257829j = C58833ax.m90833j(this.f257889h);
        aVar.f257824e = C58833ax.m90833j(this.f257890i);
        aVar.f257830k = C58833ax.m90833j(this.f257891j);
        this.f257883a = this.f257886e.mo85138c(new C92452i(aVar.mo87125a()));
    }
}
