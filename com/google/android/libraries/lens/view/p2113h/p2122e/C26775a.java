package com.google.android.libraries.lens.view.p2113h.p2122e;

import android.os.Build;
import android.os.Process;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26660u;
import com.google.android.libraries.lens.view.p2113h.p2120c.C26730g;
import com.google.android.libraries.lens.view.utils.C28122k;
import com.google.common.base.C58870cg;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60697zm;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.acg;
import com.google.common.p4552o.ach;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.lens.view.h.e.a */
/* compiled from: PG */
public final /* synthetic */ class C26775a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f72957a;

    /* renamed from: b */
    public final /* synthetic */ boolean f72958b;

    public /* synthetic */ C26775a(C26784ai aiVar, boolean z) {
        this.f72957a = aiVar;
        this.f72958b = z;
    }

    public final void run() {
        boolean z;
        C26784ai aiVar = this.f72957a;
        boolean z2 = this.f72958b;
        C26660u uVar = aiVar.f72973A;
        int a = C28122k.m52401a(uVar.f72691b);
        C60697zm zmVar = (C60697zm) uVar.f72692c.mo17428b();
        C26730g gVar = new C26730g();
        String arrays = Arrays.toString(Build.SUPPORTED_64_BIT_ABIS);
        if (arrays != null) {
            C58800sl lA = C58528ij.m90011K("arm64-v8a", "x86_64").iterator();
            while (true) {
                if (lA.hasNext()) {
                    if (arrays.contains((String) lA.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        String property = System.getProperty(C58870cg.OS_ARCH.f156706C);
        boolean contains = property != null ? property.contains("aarch64") : false;
        gVar.mo32038a();
        boolean z3 = gVar.f72859a;
        gVar.mo32038a();
        boolean z4 = gVar.f72860b;
        int i = ((a >> 16) * 100) + ((char) a);
        acg acg = (acg) ach.f158293j.createBuilder();
        acg.copyOnWrite();
        ach ach = (ach) acg.instance;
        ach.f158295a |= 1;
        ach.f158296b = z;
        acg.copyOnWrite();
        ach ach2 = (ach) acg.instance;
        ach2.f158295a |= 2;
        ach2.f158297c = contains;
        acg.copyOnWrite();
        ach ach3 = (ach) acg.instance;
        ach3.f158295a |= 4;
        ach3.f158298d = z3;
        acg.copyOnWrite();
        ach ach4 = (ach) acg.instance;
        ach4.f158295a |= 8;
        ach4.f158299e = z4;
        acg.copyOnWrite();
        ach ach5 = (ach) acg.instance;
        ach5.f158295a |= 32;
        ach5.f158301g = i;
        acg.copyOnWrite();
        ach ach6 = (ach) acg.instance;
        ach6.f158295a |= 64;
        ach6.f158302h = z2;
        acg.copyOnWrite();
        ach ach7 = (ach) acg.instance;
        ach7.f158303i = zmVar.f164687e;
        ach7.f158295a |= 128;
        boolean is64Bit = Process.is64Bit();
        acg.copyOnWrite();
        ach ach8 = (ach) acg.instance;
        ach8.f158295a |= 16;
        ach8.f158300f = is64Bit;
        ((C58970a) ((C58970a) C26660u.f72690a.mo56224b()).mo56372aa(49029)).mo56367T("***** LensSystemCapabilities (abi64_bit: %b cpu64_bit: %b heif_encoding: %b cq_mode: %b) abis: (%s) abis-64: (%s) arch: (%s); 64-bit proc: %s; gles: %d (%s); DeviceTierType: %s", Boolean.valueOf(z), Boolean.valueOf(contains), Boolean.valueOf(z3), Boolean.valueOf(z4), Build.SUPPORTED_ABIS, Build.SUPPORTED_64_BIT_ABIS, System.getProperty(C58870cg.OS_ARCH.f156706C), true != Process.is64Bit() ? "false" : "true", Integer.valueOf(i), Boolean.valueOf(z2), zmVar.name());
        ach ach9 = (ach) acg.build();
        C25050av avVar = uVar.f72693d.f72688a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1407;
        aar aar = (aar) aas.f158145p.createBuilder();
        aar.copyOnWrite();
        aas aas = (aas) aar.instance;
        ach9.getClass();
        aas.f158157k = ach9;
        aas.f158147a |= 65536;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        aas aas2 = (aas) aar.build();
        aas2.getClass();
        ufVar2.f164197by = aas2;
        ufVar2.f164253h |= 8;
        avVar.mo30241a((C60555uf) tzVar.build());
    }
}
