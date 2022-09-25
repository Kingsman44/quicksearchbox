package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24272d;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24796g;
import com.google.android.libraries.lens.ondevice.p2037n.C24797h;
import com.google.android.libraries.lens.ondevice.p2037n.C24800k;
import com.google.android.libraries.lens.ondevice.p2037n.C24801l;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.p1657ba.p1664c.p1666b.p1667a.C19647a;
import com.google.android.libraries.p1657ba.p1664c.p1666b.p1667a.C19648b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19650a;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19651b;
import com.google.common.base.C58833ax;
import com.google.lens.p4701g.C62309ce;
import com.google.lens.p4701g.C62310cf;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;

@C24266a(mo29795a = "RegionDetectionEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.eo */
/* compiled from: PG */
public final class C24658eo implements C24650eg {

    /* renamed from: a */
    final C24661er f67464a;

    public C24658eo(C24661er erVar) {
        this.f67464a = erVar;
    }

    /* renamed from: a */
    public final C58833ax mo29949a(C24795f fVar) {
        C24796g gVar = (C24796g) C24797h.f67760b.createBuilder();
        gVar.mo30004a(C24473a.m45545d("model_object_detection_mobile_object_labeler_v1_1", 1));
        gVar.mo30004a(C24473a.m45545d("object_detection_mobile_object_localizer_v1_1_metadata_2", 1));
        C24797h hVar = (C24797h) gVar.build();
        C24800k kVar = (C24800k) C24801l.f67766c.createBuilder();
        kVar.copyOnWrite();
        C24801l lVar = (C24801l) kVar.instance;
        hVar.getClass();
        lVar.f67769b = hVar;
        lVar.f67768a |= 2;
        return C58833ax.m90834k((C24801l) kVar.build());
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        C24661er erVar = this.f67464a;
        String str = "object_detection_mobile_object_localizer_v1_1_metadata_2";
        String f = C24473a.m45547f(nVar, str);
        String f2 = C24473a.m45547f(nVar, "model_object_detection_mobile_object_labeler_v1_1");
        if (TextUtils.isEmpty(f) || TextUtils.isEmpty(f2)) {
            if (true != TextUtils.isEmpty(f)) {
                str = "model_object_detection_mobile_object_labeler_v1_1";
            }
            throw new C24272d(str);
        }
        C19668f a = C24661er.m45768a(f);
        C19668f a2 = C24661er.m45768a(f2);
        C62310cf cfVar = fVar.f67752d;
        if (cfVar == null) {
            cfVar = C62310cf.f168209d;
        }
        C19648b bVar = cfVar.f168212b;
        if (bVar == null) {
            bVar = C19648b.f54652d;
        }
        C19647a aVar = (C19647a) bVar.toBuilder();
        aVar.copyOnWrite();
        C19648b bVar2 = (C19648b) aVar.instance;
        a.getClass();
        bVar2.f54655b = a;
        bVar2.f54654a |= 2;
        C19648b bVar3 = (C19648b) aVar.build();
        C62309ce ceVar = (C62309ce) C62310cf.f168209d.createBuilder();
        ceVar.copyOnWrite();
        C62310cf cfVar2 = (C62310cf) ceVar.instance;
        bVar3.getClass();
        cfVar2.f168212b = bVar3;
        cfVar2.f168211a |= 1;
        C62310cf cfVar3 = fVar.f67752d;
        if (cfVar3 == null) {
            cfVar3 = C62310cf.f168209d;
        }
        C19651b bVar4 = cfVar3.f168213c;
        if (bVar4 == null) {
            bVar4 = C19651b.f54657d;
        }
        C19650a aVar2 = (C19650a) bVar4.toBuilder();
        aVar2.copyOnWrite();
        C19651b bVar5 = (C19651b) aVar2.instance;
        a2.getClass();
        bVar5.f54660b = a2;
        bVar5.f54659a |= 8;
        C19651b bVar6 = (C19651b) aVar2.build();
        ceVar.copyOnWrite();
        C62310cf cfVar4 = (C62310cf) ceVar.instance;
        bVar6.getClass();
        cfVar4.f168213c = bVar6;
        cfVar4.f168211a |= 2;
        C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
        mVar.copyOnWrite();
        C62351n nVar2 = (C62351n) mVar.instance;
        C62310cf cfVar5 = (C62310cf) ceVar.build();
        cfVar5.getClass();
        nVar2.f168324b = cfVar5;
        nVar2.f168323a = 2;
        erVar.f67467a.mo30015f(context, (C62351n) mVar.build());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo29952d(C24795f fVar) {
        return false;
    }
}
