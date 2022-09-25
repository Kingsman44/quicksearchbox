package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24272d;
import com.google.android.libraries.lens.ondevice.p2023c.C24291a;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.view.flags.C26242ac;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19650a;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19651b;
import com.google.common.base.C58833ax;
import com.google.lens.p4701g.C62325cu;
import com.google.lens.p4701g.C62326cv;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;

@C24266a(mo29795a = "ShoppingClassificationEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.ga */
/* compiled from: PG */
public final class C24698ga implements C24650eg {

    /* renamed from: a */
    final C24701gd f67543a;

    /* renamed from: b */
    final C26243ad f67544b;

    public C24698ga(C24701gd gdVar, C26243ad adVar) {
        this.f67543a = gdVar;
        this.f67544b = adVar;
    }

    /* renamed from: a */
    public final C58833ax mo29949a(C24795f fVar) {
        if (this.f67544b.mo31464k(C26242ac.ENABLE_GDD_LENS_AVS_GELLER_SYNC)) {
            return C58833ax.m90834k(C24473a.m45544c("shopping_intent_classifier", "GddLensAvs"));
        }
        return C58833ax.m90834k(C24473a.m45543b("shopping_intent_classifier_v1_1", 1));
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        C24701gd gdVar = this.f67543a;
        boolean k = gdVar.f67550b.mo31464k(C26242ac.ENABLE_GDD_LENS_AVS_GELLER_SYNC);
        String str = "shopping_intent_classifier_v1_1";
        String f = C24473a.m45547f(nVar, true != k ? str : "shopping_intent_classifier");
        if (TextUtils.isEmpty(f)) {
            if (true == k) {
                str = "shopping_intent_classifier";
            }
            throw new C24272d(str);
        }
        C19668f b = C24291a.m45355b(f);
        C62326cv cvVar = fVar.f67753e;
        if (cvVar == null) {
            cvVar = C62326cv.f168243c;
        }
        C19651b bVar = cvVar.f168246b;
        if (bVar == null) {
            bVar = C19651b.f54657d;
        }
        C19650a aVar = (C19650a) bVar.toBuilder();
        aVar.copyOnWrite();
        C19651b bVar2 = (C19651b) aVar.instance;
        b.getClass();
        bVar2.f54660b = b;
        bVar2.f54659a |= 8;
        C19651b bVar3 = (C19651b) aVar.build();
        C62325cu cuVar = (C62325cu) C62326cv.f168243c.createBuilder();
        cuVar.copyOnWrite();
        C62326cv cvVar2 = (C62326cv) cuVar.instance;
        bVar3.getClass();
        cvVar2.f168246b = bVar3;
        cvVar2.f168245a |= 1;
        C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
        mVar.copyOnWrite();
        C62351n nVar2 = (C62351n) mVar.instance;
        C62326cv cvVar3 = (C62326cv) cuVar.build();
        cvVar3.getClass();
        nVar2.f168324b = cvVar3;
        nVar2.f168323a = 3;
        gdVar.f67549a.mo30015f(context, (C62351n) mVar.build());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo29952d(C24795f fVar) {
        return false;
    }
}
