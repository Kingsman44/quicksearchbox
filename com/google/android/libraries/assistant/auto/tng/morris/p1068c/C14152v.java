package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15382j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3745ab.C48258bo;
import com.google.assistant.p3745ab.C48260bq;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.v */
/* compiled from: PG */
public final class C14152v {

    /* renamed from: a */
    public static final C59071e f42879a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.c.v");

    /* renamed from: b */
    public static final Duration f42880b = Duration.ofSeconds(10);

    /* renamed from: c */
    public static final Duration f42881c = Duration.ofSeconds(20);

    /* renamed from: d */
    public static final Duration f42882d = Duration.ofSeconds(3);

    /* renamed from: e */
    public static final Duration f42883e = Duration.ofSeconds(5);

    /* renamed from: f */
    public static final String f42884f = C37182a.f97839bR.f99011a.f98876a.toString();

    /* renamed from: g */
    public static final String f42885g = C37182a.f98188hw.f99011a.f98876a.toString();

    /* renamed from: h */
    public static final C58528ij f42886h = C58528ij.m90013M(C37182a.f97843bV.f99011a.f98876a.toString(), C37182a.f98190hy.f99011a.f98876a.toString(), C37182a.f98189hx.f99011a.f98876a.toString(), C37182a.f98188hw.f99011a.f98876a.toString());

    /* renamed from: i */
    public static final C58528ij f42887i = C58528ij.m90012L(C37182a.f98190hy.f99011a.f98876a.toString(), C37182a.f98189hx.f99011a.f98876a.toString(), C37182a.f98188hw.f99011a.f98876a.toString());

    /* renamed from: j */
    public final C60888db f42888j;

    /* renamed from: k */
    public final Executor f42889k;

    /* renamed from: l */
    public C60870cx f42890l;

    /* renamed from: m */
    public C0027c f42891m = C0027c.OFF;

    /* renamed from: n */
    public String f42892n;

    /* renamed from: o */
    public String f42893o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public String f42894p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public volatile long f42895q = 0;

    /* renamed from: r */
    public final AtomicBoolean f42896r = new AtomicBoolean(false);

    /* renamed from: s */
    public final C37215b f42897s;

    /* renamed from: t */
    public final C21370a f42898t;

    /* renamed from: u */
    public final C15382j f42899u;

    public C14152v(C37215b bVar, C60888db dbVar, C21370a aVar, C15382j jVar) {
        this.f42897s = bVar;
        this.f42888j = dbVar;
        this.f42898t = aVar;
        this.f42889k = new C60904dr(dbVar);
        this.f42899u = jVar;
    }

    /* renamed from: a */
    public final C37252a mo21476a() {
        String str = this.f42892n;
        str.getClass();
        if (str.equals(f42884f)) {
            return C37182a.f97841bT.mo40805c(C62722b.CANCELLED);
        }
        C58528ij ijVar = f42886h;
        String str2 = this.f42892n;
        str2.getClass();
        if (ijVar.contains(str2)) {
            return C37182a.f97846bY.mo40805c(C62722b.CANCELLED);
        }
        throw new AssertionError("This class was used with an unsupported flow event");
    }

    /* renamed from: c */
    public final void mo21478c(C37252a aVar, String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        C37253b bVar = (C37253b) aVar;
        if (bVar.f98999a.f98876a.toString().equals(f42884f) || f42886h.contains(bVar.f98999a.f98876a.toString())) {
            C14147q qVar = new C14147q(this, aVar, str, str2);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(qVar), this.f42889k), "Error logging playback start", new Object[0]);
            return;
        }
        throw new AssertionError("Wrong start event logged using this logger.");
    }

    /* renamed from: d */
    public final void mo21479d(String str, String str2) {
        C14149s sVar = new C14149s(this, str, str2);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(sVar), this.f42889k), "Error logging playback success", new Object[0]);
    }

    /* renamed from: b */
    public final void mo21477b(C37252a aVar) {
        C60870cx cxVar;
        if (this.f42892n == null || (cxVar = this.f42890l) == null) {
            C59104x d = f42879a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MedPlAppFlow");
            ((C59052c) ((C59052c) d).mo56372aa(45784)).mo56389s("*invalid* No ongoing MORRIS_MEDIA_PLAYBACK flow, logging of end_event[%s] should not be called", ((C37253b) aVar).f98999a.f98876a);
            return;
        }
        cxVar.cancel(false);
        C58976aa aaVar = C58975e.f156826a;
        C37215b bVar = this.f42897s;
        C62940bt btVar = C59711cz.f160208s;
        String str = this.f42893o;
        String str2 = this.f42894p;
        C0027c cVar = this.f42891m;
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        C48258bo boVar = (C48258bo) C48260bq.f124825o.createBuilder();
        boVar.copyOnWrite();
        C48260bq bqVar = (C48260bq) boVar.instance;
        str.getClass();
        bqVar.f124827a |= 1;
        bqVar.f124828b = str;
        boVar.copyOnWrite();
        C48260bq bqVar2 = (C48260bq) boVar.instance;
        str2.getClass();
        bqVar2.f124827a |= 2;
        bqVar2.f124829c = str2;
        boVar.copyOnWrite();
        C48260bq bqVar3 = (C48260bq) boVar.instance;
        bqVar3.f124837k = cVar.getNumber();
        bqVar3.f124827a |= 512;
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C48260bq bqVar4 = (C48260bq) boVar.build();
        bqVar4.getClass();
        czVar.f160214e = bqVar4;
        czVar.f160210a |= 32;
        ((C37253b) aVar).mo40792p(btVar, (C59711cz) cyVar.build());
        bVar.mo19974a(aVar);
        this.f42892n = null;
        this.f42893o = BuildConfig.FLAVOR;
        this.f42894p = BuildConfig.FLAVOR;
        this.f42896r.set(false);
    }
}
