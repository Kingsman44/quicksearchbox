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
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66546ac;
import com.google.speech.p5208h.C66548ae;
import com.google.speech.p5208h.C66549af;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66615cm;
import com.google.speech.p5224k.p5225a.C67218bi;
import com.google.speech.p5224k.p5225a.C67220bk;
import com.google.speech.p5224k.p5225a.C67221bl;
import com.google.speech.p5224k.p5225a.C67222bm;
import com.google.speech.p5224k.p5225a.C67244v;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cy */
/* compiled from: PG */
public final /* synthetic */ class C94246cy implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263359a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f263360b;

    /* renamed from: c */
    public final /* synthetic */ String f263361c;

    /* renamed from: d */
    public final /* synthetic */ int f263362d;

    /* renamed from: e */
    public final /* synthetic */ Account f263363e;

    /* renamed from: f */
    public final /* synthetic */ int f263364f;

    public /* synthetic */ C94246cy(C94256dh dhVar, byte[] bArr, String str, int i, int i2, Account account) {
        this.f263359a = dhVar;
        this.f263360b = bArr;
        this.f263361c = str;
        this.f263362d = i;
        this.f263364f = i2;
        this.f263363e = account;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C60870cx cxVar;
        C94256dh dhVar = this.f263359a;
        byte[] bArr = this.f263360b;
        String str = this.f263361c;
        int i = this.f263362d;
        int i2 = this.f263364f;
        Account account = this.f263363e;
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
            ceVar.f181194b = "video-writer";
            String str2 = ((C66607ce) a2.instance).f181194b;
            C62940bt btVar = C66550ag.f180993d;
            C66549af afVar = (C66549af) C66550ag.f180992c.createBuilder();
            afVar.copyOnWrite();
            C66550ag agVar = (C66550ag) afVar.instance;
            agVar.f180995a |= 1;
            agVar.f180996b = true;
            a2.mo58885m(btVar, (C66550ag) afVar.build());
            C66615cm e = dhVar.mo88411e(account, dhVar.f263398m.e() ? dhVar.f263398m.a() : null);
            if (e != null) {
                a2.mo58885m(C66615cm.f181221k, e);
            }
            C66599by d = dhVar.mo88410d();
            if (d != null) {
                a2.mo58885m(C66599by.f181160q, d);
            }
            a2.mo58885m(C67244v.f182772t, C67244v.f182771s);
            C62940bt btVar2 = C67222bm.f182694f;
            C67221bl blVar = (C67221bl) C67222bm.f182693e.createBuilder();
            C67218bi biVar = (C67218bi) C67220bk.f182688d.createBuilder();
            C66546ac acVar = (C66546ac) C66548ae.f180987d.createBuilder();
            C63088z A = C63088z.m96139A(bArr);
            acVar.copyOnWrite();
            C66548ae aeVar = (C66548ae) acVar.instance;
            aeVar.f180989a |= 1;
            aeVar.f180990b = A;
            acVar.copyOnWrite();
            C66548ae aeVar2 = (C66548ae) acVar.instance;
            aeVar2.f180991c = 1;
            aeVar2.f180989a |= 2;
            biVar.copyOnWrite();
            C67220bk bkVar2 = (C67220bk) biVar.instance;
            C66548ae aeVar3 = (C66548ae) acVar.build();
            aeVar3.getClass();
            bkVar2.f182691b = aeVar3;
            bkVar2.f182690a |= 1;
            biVar.copyOnWrite();
            C67220bk bkVar3 = (C67220bk) biVar.instance;
            bkVar3.f182692c = i2 - 1;
            bkVar3.f182690a |= 2;
            blVar.copyOnWrite();
            C67222bm bmVar = (C67222bm) blVar.instance;
            C67220bk bkVar4 = (C67220bk) biVar.build();
            bkVar4.getClass();
            C62971cq cqVar = bmVar.f182699d;
            if (!cqVar.mo58948c()) {
                bmVar.f182699d = C62942bv.mutableCopy(cqVar);
            }
            bmVar.f182699d.add(bkVar4);
            blVar.copyOnWrite();
            C67222bm bmVar2 = (C67222bm) blVar.instance;
            str.getClass();
            bmVar2.f182696a |= 1;
            bmVar2.f182697b = str;
            blVar.copyOnWrite();
            C67222bm bmVar3 = (C67222bm) blVar.instance;
            bmVar3.f182696a |= 2;
            bmVar3.f182698c = i;
            a2.mo58885m(btVar2, (C67222bm) blVar.build());
            cVar.mo77820a((C66607ce) a2.build(), false);
            C94256dh.m155537i(cVar);
        } catch (IOException e2) {
            ((C59052c) ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56382g(e2)).mo56372aa(14338)).mo56386p("Send image request failed ");
            cxVar = C60856cj.m92899h(e2);
        }
        return dhVar.f263392g.mo28210j(cxVar, "Parse the http Response to get S3Response and the VideoWriterResponse ", new C94250db(dhVar));
    }
}
