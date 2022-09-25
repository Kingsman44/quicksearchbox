package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.common.base.C58838bb;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55915a;
import com.google.p4184bj.p4193c.p4197c.C55955bb;
import com.google.p4184bj.p4193c.p4197c.C55958be;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import com.google.p4184bj.p4193c.p4197c.C55967c;
import com.google.p4184bj.p4193c.p4197c.C55969e;
import com.google.p4184bj.p4193c.p4197c.C55977m;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;

/* renamed from: com.google.android.libraries.j.a.b.c */
/* compiled from: PG */
final class C23953c {

    /* renamed from: a */
    private final C23955e f65503a;

    /* renamed from: b */
    private final Integer f65504b;

    /* renamed from: c */
    private final C55960bg f65505c;

    /* renamed from: d */
    private final C143658k f65506d;

    /* renamed from: e */
    private final Context f65507e;

    /* renamed from: f */
    private final C55912b f65508f;

    public C23953c(C23955e eVar, Context context, Integer num, C55960bg bgVar, C143658k kVar, C55912b bVar) {
        this.f65503a = eVar;
        this.f65507e = context;
        this.f65504b = num;
        this.f65505c = bgVar;
        this.f65506d = kVar;
        this.f65508f = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29365a(C55977m mVar) {
        C55969e eVar = mVar.f149071c;
        if (eVar == null) {
            eVar = C55969e.f149044e;
        }
        if ((eVar.f149046a & 1) != 0) {
            C55969e eVar2 = mVar.f149071c;
            if (eVar2 == null) {
                eVar2 = C55969e.f149044e;
            }
            C55960bg a = C55960bg.m87868a(eVar2.f149047b);
            if (a == null) {
                a = C55960bg.UNKNOWN;
            }
            boolean equals = a.equals(this.f65505c);
            C55960bg bgVar = this.f65505c;
            C55969e eVar3 = mVar.f149071c;
            if (eVar3 == null) {
                eVar3 = C55969e.f149044e;
            }
            C55960bg a2 = C55960bg.m87868a(eVar3.f149047b);
            if (a2 == null) {
                a2 = C55960bg.UNKNOWN;
            }
            C58838bb.m90879n(equals, "This ClearcutHelper has been instantiated with the %s UI flow ID but the given event has %s instead.", bgVar, a2);
        }
        C23955e eVar4 = this.f65503a;
        int i = this.f65505c.f149026ao;
        int a3 = C55967c.m87871a(mVar.f149070b);
        if (a3 == 0) {
            a3 = 1;
        }
        ((C19567d) eVar4.f65511b.mo6453a()).mo24822a(1, Integer.valueOf(i), Integer.toString(a3 - 1), Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(this.f65508f.f148826V));
        C23949ag agVar = new C23949ag();
        C55955bb bbVar = (C55955bb) C55958be.f148951f.createBuilder();
        bbVar.copyOnWrite();
        C55958be beVar = (C55958be) bbVar.instance;
        mVar.getClass();
        beVar.f148955c = mVar;
        beVar.f148954b = 1;
        bbVar.copyOnWrite();
        C55958be beVar2 = (C55958be) bbVar.instance;
        beVar2.f148953a |= 64;
        beVar2.f148956d = 1;
        C143657j e = this.f65506d.mo119000e((C55958be) bbVar.build(), C24006d.m44596b(this.f65507e, agVar));
        int intValue = this.f65504b.intValue();
        C58149a aVar = e.f389461c;
        aVar.copyOnWrite();
        C58150b bVar = (C58150b) aVar.instance;
        C58150b bVar2 = C58150b.f155459k;
        bVar.f155461a |= 64;
        bVar.f155465e = (long) intValue;
        e.mo118992a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29366b(int i) {
        C55915a aVar = (C55915a) C55977m.f149067g.createBuilder();
        aVar.copyOnWrite();
        C55977m mVar = (C55977m) aVar.instance;
        mVar.f149070b = i - 1;
        mVar.f149069a |= 1;
        mo29365a((C55977m) aVar.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo29367c(int i) {
        C55915a aVar = (C55915a) C55977m.f149067g.createBuilder();
        aVar.copyOnWrite();
        C55977m mVar = (C55977m) aVar.instance;
        mVar.f149070b = 6;
        mVar.f149069a |= 1;
        aVar.copyOnWrite();
        C55977m mVar2 = (C55977m) aVar.instance;
        mVar2.f149074f = i - 1;
        mVar2.f149069a |= 16;
        mo29365a((C55977m) aVar.build());
    }
}
