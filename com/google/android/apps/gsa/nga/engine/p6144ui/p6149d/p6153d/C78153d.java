package com.google.android.apps.gsa.nga.engine.p6144ui.p6149d.p6153d;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128103d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58247c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.d.d.d */
/* compiled from: PG */
public final /* synthetic */ class C78153d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78156g f215192a;

    /* renamed from: b */
    public final /* synthetic */ C128103d f215193b;

    /* renamed from: c */
    public final /* synthetic */ C70862aj f215194c;

    public /* synthetic */ C78153d(C78156g gVar, C128103d dVar, C70862aj ajVar) {
        this.f215192a = gVar;
        this.f215193b = dVar;
        this.f215194c = ajVar;
    }

    public final void run() {
        C58485gu guVar;
        C78156g gVar = this.f215192a;
        C128103d dVar = this.f215193b;
        C70862aj ajVar = this.f215194c;
        C83320io ioVar = dVar.f352476b;
        if (ioVar == null) {
            ioVar = C83320io.f227132d;
        }
        if (ioVar.equals(C83320io.f227132d)) {
            ajVar.mo20122b(new IllegalArgumentException("utteranceId is empty"));
            return;
        }
        C58247c cVar = gVar.f215201c;
        C83320io ioVar2 = dVar.f352476b;
        if (ioVar2 == null) {
            ioVar2 = C83320io.f227132d;
        }
        C51986gl glVar = (C51986gl) ((C58206am) cVar).f155647a.mo54792f(ioVar2);
        if (glVar != null) {
            C78156g.m125470e(ajVar, glVar);
        } else if (!gVar.f215202d.isPresent()) {
            C78156g.m125470e(ajVar, C51986gl.f136421f);
        } else {
            C83320io ioVar3 = dVar.f352476b;
            if (ioVar3 == null) {
                ioVar3 = C83320io.f227132d;
            }
            C58480gp e = C58485gu.m89837e();
            if (gVar.f215203e.containsKey(ioVar3) && (guVar = (C58485gu) gVar.f215203e.get(ioVar3)) != null) {
                e.mo55396h(guVar);
            }
            e.mo55395g(ajVar);
            gVar.f215203e.put(ioVar3, e.mo55394f());
        }
    }
}
