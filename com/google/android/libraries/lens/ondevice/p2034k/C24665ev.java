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
import com.google.common.base.C58833ax;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;
import com.google.lens.p4705i.p4706a.C62368a;
import com.google.lens.p4705i.p4706a.C62371b;
import com.google.lens.p4705i.p4706a.C62372c;
import com.google.lens.p4705i.p4706a.C62373d;
import com.google.lens.p4705i.p4706a.C62374e;
import com.google.lens.p4705i.p4706a.C62375f;

@C24266a(mo29795a = "SalientRegionDetectionEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.ev */
/* compiled from: PG */
public final class C24665ev implements C24650eg {

    /* renamed from: a */
    final C24668ey f67476a;

    /* renamed from: b */
    final C26243ad f67477b;

    public C24665ev(C24668ey eyVar, C26243ad adVar) {
        this.f67476a = eyVar;
        this.f67477b = adVar;
    }

    /* renamed from: a */
    public final C58833ax mo29949a(C24795f fVar) {
        if (this.f67477b.mo31464k(C26242ac.ENABLE_GDD_LENS_AVS_GELLER_SYNC)) {
            return C58833ax.m90834k(C24473a.m45544c("mobile_one_stage_object_detector", "GddLensAvs"));
        }
        return C58833ax.m90834k(C24473a.m45543b("mobile_one_stage_object_detector_v3_1", 1));
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        C24668ey eyVar = this.f67476a;
        C62375f fVar2 = fVar.f67759k;
        if (fVar2 == null) {
            fVar2 = C62375f.f168386d;
        }
        boolean k = eyVar.f67483b.mo31464k(C26242ac.ENABLE_GDD_LENS_AVS_GELLER_SYNC);
        String str = "mobile_one_stage_object_detector_v3_1";
        String f = C24473a.m45547f(nVar, true != k ? str : "mobile_one_stage_object_detector");
        if (TextUtils.isEmpty(f)) {
            if (true == k) {
                str = "mobile_one_stage_object_detector";
            }
            throw new C24272d(str);
        }
        C19668f b = C24291a.m45355b(f);
        C62374e eVar = (C62374e) fVar2.toBuilder();
        C62368a aVar = (C62368a) C62371b.f168378c.createBuilder();
        C62372c cVar = (C62372c) C62373d.f168382c.createBuilder();
        cVar.copyOnWrite();
        C62373d dVar = (C62373d) cVar.instance;
        b.getClass();
        dVar.f168385b = b;
        dVar.f168384a = 1;
        C62373d dVar2 = (C62373d) cVar.build();
        aVar.copyOnWrite();
        C62371b bVar = (C62371b) aVar.instance;
        dVar2.getClass();
        bVar.f168381b = dVar2;
        bVar.f168380a = 1;
        C62371b bVar2 = (C62371b) aVar.build();
        eVar.copyOnWrite();
        C62375f fVar3 = (C62375f) eVar.instance;
        bVar2.getClass();
        fVar3.f168389b = bVar2;
        fVar3.f168388a |= 1;
        C62375f fVar4 = (C62375f) eVar.build();
        C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
        mVar.copyOnWrite();
        C62351n nVar2 = (C62351n) mVar.instance;
        fVar4.getClass();
        nVar2.f168324b = fVar4;
        nVar2.f168323a = 8;
        eyVar.f67482a.mo30015f(context, (C62351n) mVar.build());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo29952d(C24795f fVar) {
        return false;
    }
}
