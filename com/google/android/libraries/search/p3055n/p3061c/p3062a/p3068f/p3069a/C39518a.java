package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a;

import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39356be;
import com.google.android.libraries.search.p3055n.C39357bf;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39387ac;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39389ae;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39392ah;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39393ai;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62955cb;
import com.google.speech.p5218j.C67030il;
import com.google.speech.p5218j.C67048jc;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67052jg;
import com.google.speech.p5218j.C67068jw;
import com.google.speech.p5218j.C67091ks;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71022bv;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71023bw;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71080dz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.f.a.a */
/* compiled from: PG */
public final class C39518a {

    /* renamed from: a */
    public static final C59071e f104055a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.f.a.a");

    /* renamed from: a */
    public static C58833ax m68939a(C39260aj ajVar, String str) {
        C71022bv bvVar = (C71022bv) C71023bw.f189405n.createBuilder();
        bvVar.copyOnWrite();
        C71023bw bwVar = (C71023bw) bvVar.instance;
        str.getClass();
        bwVar.f189407a |= 256;
        bwVar.f189416j = str;
        C67050je jeVar = ajVar.f103420d;
        if (jeVar == null) {
            jeVar = C67050je.f182262f;
        }
        if ((jeVar.f182264a & 1) != 0) {
            C67048jc jcVar = jeVar.f182265b;
            if (jcVar == null) {
                jcVar = C67048jc.f182253h;
            }
            float f = jcVar.f182258d;
            bvVar.copyOnWrite();
            C71023bw bwVar2 = (C71023bw) bvVar.instance;
            bwVar2.f189407a |= 1;
            bwVar2.f189408b = f;
            String str2 = jcVar.f182261g;
            bvVar.copyOnWrite();
            C71023bw bwVar3 = (C71023bw) bvVar.instance;
            str2.getClass();
            bwVar3.f189407a |= 2;
            bwVar3.f189409c = str2;
            boolean z = jcVar.f182259e;
            bvVar.copyOnWrite();
            C71023bw bwVar4 = (C71023bw) bvVar.instance;
            bwVar4.f189407a |= 4;
            bwVar4.f189410d = z;
            String str3 = jcVar.f182257c;
            bvVar.copyOnWrite();
            C71023bw bwVar5 = (C71023bw) bvVar.instance;
            str3.getClass();
            bwVar5.f189407a |= 1024;
            bwVar5.f189418l = str3;
        }
        if ((jeVar.f182264a & 4) != 0) {
            C67091ks ksVar = jeVar.f182267d;
            if (ksVar == null) {
                ksVar = C67091ks.f182386h;
            }
            boolean z2 = ksVar.f182389b;
            bvVar.copyOnWrite();
            C71023bw bwVar6 = (C71023bw) bvVar.instance;
            bwVar6.f189407a |= 8;
            bwVar6.f189411e = z2;
            float f2 = ksVar.f182391d;
            bvVar.copyOnWrite();
            C71023bw bwVar7 = (C71023bw) bvVar.instance;
            bwVar7.f189407a |= 512;
            bwVar7.f189417k = f2;
        }
        C67052jg jgVar = jeVar.f182268e;
        if (jgVar == null) {
            jgVar = C67052jg.f182269e;
        }
        if ((jgVar.f182271a & 1) != 0) {
            C67030il ilVar = jgVar.f182273c;
            if (ilVar == null) {
                ilVar = C67030il.f182195e;
            }
            float f3 = ilVar.f182198b;
            bvVar.copyOnWrite();
            C71023bw bwVar8 = (C71023bw) bvVar.instance;
            bwVar8.f189407a |= 16;
            bwVar8.f189412f = f3;
            float f4 = ilVar.f182199c;
            bvVar.copyOnWrite();
            C71023bw bwVar9 = (C71023bw) bvVar.instance;
            bwVar9.f189407a |= 32;
            bwVar9.f189413g = f4;
            int size = jgVar.f182272b.size();
            if (size > 1) {
                for (int i = 0; i < size; i++) {
                    boolean z3 = ((C67068jw) jgVar.f182272b.get(i)).f182313a;
                    bvVar.copyOnWrite();
                    C71023bw bwVar10 = (C71023bw) bvVar.instance;
                    C62955cb cbVar = bwVar10.f189419m;
                    if (!cbVar.mo58948c()) {
                        bwVar10.f189419m = C62942bv.mutableCopy(cbVar);
                    }
                    bwVar10.f189419m.mo58923f(z3);
                }
            }
        }
        return C58833ax.m90834k((C71023bw) bvVar.build());
    }

    /* renamed from: b */
    public static C71082ea m68940b(C39419h hVar) {
        C71080dz dzVar = (C71080dz) C71082ea.f189563q.createBuilder();
        C39389ae a = hVar.mo41826b().mo41820a();
        dzVar.copyOnWrite();
        C71082ea eaVar = (C71082ea) dzVar.instance;
        eaVar.f189566b = a.getNumber();
        eaVar.f189565a |= 1;
        C39357bf bfVar = hVar.mo41825a().f104599c;
        if (bfVar == null) {
            bfVar = C39357bf.f103644d;
        }
        C39356be a2 = C39356be.m68761a(bfVar.f103647b);
        if (a2 == null) {
            a2 = C39356be.DEFAULT_PERSONAL;
        }
        dzVar.copyOnWrite();
        C71082ea eaVar2 = (C71082ea) dzVar.instance;
        eaVar2.f189569e = a2.f103643f;
        eaVar2.f189565a |= 8;
        String str = hVar.mo41828d().mo41840a().f395888i;
        dzVar.copyOnWrite();
        C71082ea eaVar3 = (C71082ea) dzVar.instance;
        str.getClass();
        eaVar3.f189565a |= 16;
        eaVar3.f189570f = str;
        String str2 = hVar.mo41828d().mo41840a().f395891l;
        dzVar.copyOnWrite();
        C71082ea eaVar4 = (C71082ea) dzVar.instance;
        str2.getClass();
        eaVar4.f189565a |= 32;
        eaVar4.f189571g = str2;
        boolean b = C39387ac.m68782b(hVar.mo41828d());
        dzVar.copyOnWrite();
        C71082ea eaVar5 = (C71082ea) dzVar.instance;
        eaVar5.f189565a |= 64;
        eaVar5.f189572h = b;
        boolean z = hVar.mo41828d().mo41840a().f395899t;
        dzVar.copyOnWrite();
        C71082ea eaVar6 = (C71082ea) dzVar.instance;
        eaVar6.f189565a |= 128;
        eaVar6.f189573i = z;
        boolean j = hVar.mo41836j();
        dzVar.copyOnWrite();
        C71082ea eaVar7 = (C71082ea) dzVar.instance;
        eaVar7.f189565a |= 256;
        eaVar7.f189574j = j;
        boolean k = hVar.mo41837k();
        dzVar.copyOnWrite();
        C71082ea eaVar8 = (C71082ea) dzVar.instance;
        eaVar8.f189565a |= 512;
        eaVar8.f189575k = k;
        boolean g = hVar.mo41832g();
        dzVar.copyOnWrite();
        C71082ea eaVar9 = (C71082ea) dzVar.instance;
        eaVar9.f189565a |= 2048;
        eaVar9.f189576l = g;
        boolean z2 = hVar.mo41828d().mo41840a().f395873E;
        dzVar.copyOnWrite();
        C71082ea eaVar10 = (C71082ea) dzVar.instance;
        eaVar10.f189565a |= 4096;
        eaVar10.f189577m = z2;
        return (C71082ea) dzVar.build();
    }

    /* renamed from: c */
    public static int m68941c(C39393ai aiVar) {
        C39392ah ahVar = C39392ah.DSP_MODEL_NOT_SUPPORTED;
        switch (aiVar.mo41808a().ordinal()) {
            case 0:
                return 17;
            case 1:
                return 18;
            case 2:
                return 19;
            case 3:
                return 20;
            case 4:
                return 21;
            case 5:
                return 22;
            case 6:
                return 23;
            case 7:
                return 24;
            case 8:
                return 25;
            case 9:
                return 26;
            case 10:
                return 27;
            case 11:
                return 28;
            default:
                throw new IllegalStateException(String.format("Unknown hotwordDetectionError %s", new Object[]{aiVar.mo41808a().name()}));
        }
    }
}
