package com.google.android.gms.learning.dynamite.training;

import com.google.android.gms.learning.C144827n;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import com.google.common.p4552o.p4554b.p4555a.C59610af;
import com.google.common.p4552o.p4554b.p4555a.C59627g;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.common.p4552o.p4554b.p4555a.C59640t;
import com.google.common.p4552o.p4554b.p4555a.C59641u;
import com.google.common.p4552o.p4554b.p4555a.C59642v;
import com.google.common.p4552o.p4554b.p4555a.C59645y;
import com.google.common.p4552o.p4554b.p4555a.C59646z;
import com.google.p3728as.p3729a.p3730a.p3731a.C48021b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.gms.learning.dynamite.training.bc */
/* compiled from: PG */
final class C144687bc extends C144718n {

    /* renamed from: a */
    final /* synthetic */ String f391458a;

    /* renamed from: b */
    final /* synthetic */ String f391459b;

    /* renamed from: c */
    final /* synthetic */ String f391460c;

    /* renamed from: d */
    final /* synthetic */ C29700j f391461d;

    /* renamed from: e */
    final /* synthetic */ byte[] f391462e;

    /* renamed from: f */
    final /* synthetic */ C144719o f391463f;

    /* renamed from: g */
    final /* synthetic */ InAppTrainingServiceImpl f391464g;

    /* renamed from: h */
    final /* synthetic */ int f391465h;

    public C144687bc(InAppTrainingServiceImpl inAppTrainingServiceImpl, String str, String str2, String str3, int i, C29700j jVar, byte[] bArr, C144719o oVar) {
        this.f391464g = inAppTrainingServiceImpl;
        this.f391458a = str;
        this.f391459b = str2;
        this.f391460c = str3;
        this.f391465h = i;
        this.f391461d = jVar;
        this.f391462e = bArr;
        this.f391463f = oVar;
    }

    /* renamed from: e */
    public final void mo120156e(byte[] bArr, int i) {
        int i2;
        C144719o oVar;
        String str;
        boolean z;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        String str2;
        byte[] bArr4 = bArr;
        InAppTrainingServiceImpl inAppTrainingServiceImpl = this.f391464g;
        String str3 = this.f391458a;
        String str4 = this.f391459b;
        String str5 = this.f391460c;
        int i4 = this.f391465h;
        C29700j jVar = this.f391461d;
        byte[] bArr5 = this.f391462e;
        C144719o oVar2 = this.f391463f;
        synchronized (inAppTrainingServiceImpl.f391388d) {
            int i5 = inAppTrainingServiceImpl.f391396l + 1;
            inAppTrainingServiceImpl.f391396l = i5;
            if (i == 0) {
                inAppTrainingServiceImpl.f391397m = bArr4;
                i2 = 0;
            } else {
                i2 = i;
            }
            if (i2 == 0) {
                if (i5 >= inAppTrainingServiceImpl.f391393i.mo120035o()) {
                    i2 = 0;
                } else {
                    bArr3 = bArr4;
                    str = str5;
                    bArr2 = bArr5;
                    oVar = oVar2;
                    i3 = 0;
                    z = false;
                }
            }
            C144827n nVar = inAppTrainingServiceImpl.f391391g;
            C59627g gVar = (C59627g) C59628h.f159873h.createBuilder();
            C59642v vVar = (C59642v) C59610af.f159830g.createBuilder();
            vVar.copyOnWrite();
            C59610af afVar = (C59610af) vVar.instance;
            str3.getClass();
            afVar.f159832a |= 32;
            afVar.f159837f = str3;
            C59645y yVar = (C59645y) C59646z.f159917c.createBuilder();
            yVar.copyOnWrite();
            C59646z zVar = (C59646z) yVar.instance;
            str4.getClass();
            str = str5;
            zVar.f159919a |= 1;
            zVar.f159920b = str4;
            C59646z zVar2 = (C59646z) yVar.build();
            vVar.copyOnWrite();
            C59610af afVar2 = (C59610af) vVar.instance;
            zVar2.getClass();
            afVar2.f159834c = zVar2;
            afVar2.f159833b = 1;
            C59640t tVar = (C59640t) C59641u.f159905c.createBuilder();
            bArr2 = bArr5;
            oVar = oVar2;
            long j = (long) inAppTrainingServiceImpl.f391396l;
            tVar.copyOnWrite();
            C59641u uVar = (C59641u) tVar.instance;
            int i6 = i2;
            uVar.f159907a |= 1;
            uVar.f159908b = j;
            vVar.copyOnWrite();
            C59610af afVar3 = (C59610af) vVar.instance;
            C59641u uVar2 = (C59641u) tVar.build();
            uVar2.getClass();
            afVar3.f159836e = uVar2;
            afVar3.f159835d = 6;
            C59610af afVar4 = (C59610af) vVar.build();
            gVar.copyOnWrite();
            C59628h hVar = (C59628h) gVar.instance;
            afVar4.getClass();
            hVar.f159881g = afVar4;
            hVar.f159875a |= 8192;
            nVar.mo120050c((C59628h) gVar.build());
            bArr3 = inAppTrainingServiceImpl.f391397m;
            if (bArr3 == null) {
                bArr3 = bArr4;
            }
            inAppTrainingServiceImpl.f391396l = 0;
            inAppTrainingServiceImpl.f391397m = null;
            i3 = i6;
            z = true;
        }
        if (!z) {
            try {
                str2 = ((C48021b) C62942bv.parseFrom((C62942bv) C48021b.f124266d, bArr4, C62921ba.m95368a())).f124268a;
            } catch (C62974ct e) {
                InAppTrainingServiceImpl.f391384a.mo34864f(e, "Couldn't parse TaskRetry");
                str2 = str;
            }
            inAppTrainingServiceImpl.mo120130h(str3, str4, str2, i4, jVar, bArr2, oVar);
            return;
        }
        InAppTrainingServiceImpl.m235158i(new C144681ax(oVar, bArr3, i3));
    }
}
