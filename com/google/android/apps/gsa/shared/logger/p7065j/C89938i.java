package com.google.android.apps.gsa.shared.logger.p7065j;

import com.google.android.libraries.logging.C28292j;
import com.google.common.p4552o.C59998iv;
import com.google.common.p4552o.aiv;
import com.google.common.p4552o.ajl;
import com.google.common.p4552o.akb;
import com.google.common.p4552o.aln;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.shared.logger.j.i */
/* compiled from: PG */
public final class C89938i extends C28292j {

    /* renamed from: f */
    private final C89940k f246433f;

    public C89938i(int i, C89940k kVar) {
        super(i);
        this.f246433f = kVar;
    }

    /* renamed from: a */
    public static aqs m146503a(aqs aqs, C28292j jVar) {
        if (!(jVar instanceof C89938i)) {
            return aqs;
        }
        C89940k kVar = ((C89938i) jVar).f246433f;
        aqp aqp = (aqp) aqs.toBuilder();
        if (kVar.mo83784c() != null) {
            C62940bt btVar = ajl.f158881f;
            ajl c = kVar.mo83784c();
            c.getClass();
            aqp.mo58885m(btVar, c);
        }
        if (kVar.mo83782a() != null) {
            C62940bt btVar2 = C59998iv.f162153d;
            C59998iv a = kVar.mo83782a();
            a.getClass();
            aqp.mo58885m(btVar2, a);
        }
        if (kVar.mo83786e() != null) {
            C62940bt btVar3 = aln.f159083g;
            aln e = kVar.mo83786e();
            e.getClass();
            aqp.mo58885m(btVar3, e);
        }
        if (kVar.mo83783b() != null) {
            C62940bt btVar4 = aiv.f158846d;
            aiv b = kVar.mo83783b();
            b.getClass();
            aqp.mo58885m(btVar4, b);
        }
        if (kVar.mo83785d() != null) {
            C62940bt btVar5 = akb.f158949d;
            akb d = kVar.mo83785d();
            d.getClass();
            aqp.mo58885m(btVar5, d);
        }
        return (aqs) aqp.build();
    }
}
