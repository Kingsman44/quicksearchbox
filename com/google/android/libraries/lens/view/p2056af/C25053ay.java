package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.view.p2067ak.C25199ae;
import com.google.android.libraries.lens.view.p2067ak.C25220az;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2067ak.C25282u;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.lens.view.af.ay */
/* compiled from: PG */
final class C25053ay implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f68282a;

    /* renamed from: b */
    final /* synthetic */ boolean f68283b;

    /* renamed from: c */
    final /* synthetic */ C25057bb f68284c;

    /* renamed from: d */
    final /* synthetic */ int f68285d;

    public C25053ay(C25057bb bbVar, String str, int i, boolean z) {
        this.f68284c = bbVar;
        this.f68282a = str;
        this.f68285d = i;
        this.f68283b = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) C25057bb.f68295a.mo56226d()).mo56372aa(49658)).mo56386p("Unable to get Lens Device Settings");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C25225bd bdVar = this.f68284c.f68297c;
        String str = this.f68282a;
        C25282u uVar = ((C25199ae) bdVar.f68662a.mo30362b(true)).f68641n;
        if (uVar == null) {
            uVar = C25282u.f68773d;
        }
        str.getClass();
        C62995dn dnVar = uVar.f68775a;
        Integer valueOf = Integer.valueOf(Math.min(dnVar.containsKey(str) ? ((Integer) dnVar.get(str)).intValue() : 1, 20));
        ((C19567d) this.f68284c.f68296b.f68262n.mo6453a()).mo24822a(1, this.f68282a, C25056ba.m46357a(this.f68285d), Boolean.valueOf(this.f68283b), valueOf);
        this.f68284c.f68297c.f68662a.mo30363c(new C25220az(this.f68282a));
    }
}
