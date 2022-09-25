package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3745ab.C48258bo;
import com.google.assistant.p3745ab.C48260bq;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62940bt;
import java.util.concurrent.TimeUnit;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.q */
/* compiled from: PG */
public final /* synthetic */ class C14147q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14152v f42868a;

    /* renamed from: b */
    public final /* synthetic */ C37252a f42869b;

    /* renamed from: c */
    public final /* synthetic */ String f42870c;

    /* renamed from: d */
    public final /* synthetic */ String f42871d;

    public /* synthetic */ C14147q(C14152v vVar, C37252a aVar, String str, String str2) {
        this.f42868a = vVar;
        this.f42869b = aVar;
        this.f42870c = str;
        this.f42871d = str2;
    }

    public final void run() {
        Duration duration;
        C14152v vVar = this.f42868a;
        C37252a aVar = this.f42869b;
        String str = this.f42870c;
        String str2 = this.f42871d;
        if (vVar.f42892n != null) {
            vVar.mo21477b(vVar.mo21476a());
        }
        C37253b bVar = (C37253b) aVar;
        vVar.f42892n = bVar.f98999a.f98876a.toString();
        vVar.f42893o = str;
        vVar.f42894p = str2;
        if (C14152v.f42885g.equals(vVar.f42892n)) {
            duration = C14152v.f42881c;
        } else {
            duration = C14152v.f42880b;
        }
        vVar.f42890l = C60856cj.m92902k(C47810es.m84965e(new C14150t(vVar)), duration.toMillis(), TimeUnit.MILLISECONDS, vVar.f42888j);
        C37215b bVar2 = vVar.f42897s;
        C62940bt btVar = C59711cz.f160208s;
        C0027c cVar = vVar.f42891m;
        C58485gu f = vVar.f42899u.mo22271f();
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
        boVar.mo53150a(f);
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C48260bq bqVar4 = (C48260bq) boVar.build();
        bqVar4.getClass();
        czVar.f160214e = bqVar4;
        czVar.f160210a |= 32;
        bVar.mo40792p(btVar, (C59711cz) cyVar.build());
        bVar2.mo19974a(aVar);
    }
}
