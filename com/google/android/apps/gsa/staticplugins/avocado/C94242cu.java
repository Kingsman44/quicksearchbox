package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p6487s3.C84334w;
import com.google.android.apps.gsa.p6487s3.p6488a.C84282c;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89040bk;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p408c.p414c.p416b.C8466ai;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66615cm;
import com.google.speech.p5208h.p5209a.C66536g;
import com.google.speech.p5208h.p5209a.C66538i;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cu */
/* compiled from: PG */
public final /* synthetic */ class C94242cu implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263350a;

    /* renamed from: b */
    public final /* synthetic */ Account f263351b;

    public /* synthetic */ C94242cu(C94256dh dhVar, Account account) {
        this.f263350a = dhVar;
        this.f263351b = account;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C60870cx cxVar;
        C94256dh dhVar = this.f263350a;
        Account account = this.f263351b;
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14332)).mo56386p("Start enrollment fetcher request.");
        if (account != null) {
            String str = account.name;
        }
        C8466ai c = dhVar.mo88409c();
        try {
            C89020ar a = C84334w.m134551a(c, BuildConfig.FLAVOR).mo82989a();
            C89040bk bkVar = new C89040bk(dhVar.f263390e.mo27509a());
            C84282c cVar = new C84282c(bkVar, c.f29402f);
            C89012aj ajVar = dhVar.f263390e;
            cxVar = ajVar.mo27495f(a, bkVar, ajVar.mo27510b(C89066v.f241382a));
            C66606cd a2 = C118919a.m197403a();
            a2.copyOnWrite();
            C66607ce ceVar = (C66607ce) a2.instance;
            C66607ce ceVar2 = C66607ce.f181191f;
            ceVar.f181193a |= 1;
            ceVar.f181194b = "enrollment-fetcher";
            C66615cm e = dhVar.mo88411e(account, (C66595bu) null);
            if (e != null) {
                a2.mo58885m(C66615cm.f181221k, e);
            }
            cVar.mo77820a((C66607ce) a2.build(), false);
            String b = dhVar.f263399n.mo88400b();
            C66536g gVar = (C66536g) C66538i.f180961g.createBuilder();
            gVar.copyOnWrite();
            C66538i iVar = (C66538i) gVar.instance;
            iVar.f180965b = 4;
            iVar.f180964a |= 1;
            gVar.copyOnWrite();
            C66538i iVar2 = (C66538i) gVar.instance;
            b.getClass();
            iVar2.f180964a |= 2;
            iVar2.f180966c = b;
            gVar.copyOnWrite();
            C66538i iVar3 = (C66538i) gVar.instance;
            iVar3.f180964a |= 4;
            iVar3.f180967d = false;
            a2.mo58885m(C66538i.f180962h, (C66538i) gVar.build());
            cVar.mo77820a((C66607ce) a2.build(), false);
            C94256dh.m155537i(cVar);
            a2.build();
        } catch (IOException e2) {
            ((C59052c) ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56382g(e2)).mo56372aa(14335)).mo56386p("Enrollment fetcher request failed ");
            cxVar = C60856cj.m92899h(e2);
        }
        return dhVar.f263392g.mo28210j(cxVar, "Parse the http Response to get S3Response and the FaceValidationResult ", new C94236co());
    }
}
