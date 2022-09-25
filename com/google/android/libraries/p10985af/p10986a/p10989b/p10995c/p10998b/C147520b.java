package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p10998b;

import com.google.android.libraries.mdi.p2208a.p2209a.C28594a;
import com.google.android.libraries.p10985af.p10986a.p10987a.C147477a;
import com.google.android.libraries.p10985af.p10986a.p10987a.C147482b;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147478a;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147479b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10994b.C147490a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55929ac;
import com.google.p4184bj.p4193c.p4197c.C55931ae;
import com.google.p4184bj.p4193c.p4197c.C55932af;
import com.google.p4184bj.p4193c.p4197c.C55955bb;
import com.google.p4184bj.p4193c.p4197c.C55956bc;
import com.google.p4184bj.p4193c.p4197c.C55957bd;
import com.google.p4184bj.p4193c.p4197c.C55958be;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.af.a.b.c.b.b */
/* compiled from: PG */
public final class C147520b {

    /* renamed from: a */
    private final C58881cr f398155a;

    /* renamed from: b */
    private final C147490a f398156b;

    /* renamed from: c */
    private final C55957bd f398157c;

    /* renamed from: d */
    private final C28594a f398158d;

    public C147520b(C58881cr crVar, C28594a aVar, C147490a aVar2, C55957bd bdVar) {
        this.f398155a = C58886cw.m90973a(crVar);
        this.f398158d = aVar;
        this.f398156b = aVar2;
        this.f398157c = bdVar;
    }

    /* renamed from: a */
    public static C147520b m240516a(C147479b bVar, C28594a aVar, C147490a aVar2, C147477a aVar3) {
        Objects.requireNonNull(bVar);
        C147519a aVar4 = new C147519a(bVar);
        C55956bc bcVar = (C55956bc) C55957bd.f148946d.createBuilder();
        C147482b bVar2 = (C147482b) aVar3;
        String str = bVar2.f398103a + "#" + bVar2.f398104b;
        bcVar.copyOnWrite();
        C55957bd bdVar = (C55957bd) bcVar.instance;
        bdVar.f148948a |= 1;
        bdVar.f148949b = str;
        bcVar.copyOnWrite();
        C55957bd bdVar2 = (C55957bd) bcVar.instance;
        bdVar2.f148948a |= 2;
        bdVar2.f148950c = 1;
        return new C147520b(aVar4, aVar, aVar2, (C55957bd) bcVar.build());
    }

    /* renamed from: b */
    public final void mo124279b(int i, boolean z, long j, C55912b bVar, C55931ae aeVar, Boolean bool, Boolean bool2) {
        if (this.f398156b.mo43946d()) {
            long b = this.f398156b.mo43944b();
            if (this.f398158d.mo34272a(b)) {
                C55929ac acVar = (C55929ac) C55932af.f148888h.createBuilder();
                acVar.copyOnWrite();
                C55932af afVar = (C55932af) acVar.instance;
                afVar.f148890a |= 1;
                afVar.f148891b = z;
                acVar.copyOnWrite();
                C55932af afVar2 = (C55932af) acVar.instance;
                afVar2.f148890a |= 4;
                afVar2.f148893d = j;
                if (bVar != null) {
                    acVar.copyOnWrite();
                    C55932af afVar3 = (C55932af) acVar.instance;
                    afVar3.f148892c = bVar.f148826V;
                    afVar3.f148890a |= 2;
                }
                if (aeVar != null) {
                    acVar.copyOnWrite();
                    C55932af afVar4 = (C55932af) acVar.instance;
                    afVar4.f148894e = aeVar.f148887e;
                    afVar4.f148890a |= 8;
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    acVar.copyOnWrite();
                    C55932af afVar5 = (C55932af) acVar.instance;
                    afVar5.f148890a |= 16;
                    afVar5.f148895f = booleanValue;
                }
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    acVar.copyOnWrite();
                    C55932af afVar6 = (C55932af) acVar.instance;
                    afVar6.f148890a |= 32;
                    afVar6.f148896g = booleanValue2;
                }
                C55955bb bbVar = (C55955bb) C55958be.f148951f.createBuilder();
                bbVar.copyOnWrite();
                C55958be beVar = (C55958be) bbVar.instance;
                beVar.f148953a |= 64;
                beVar.f148956d = (int) b;
                C55957bd bdVar = this.f398157c;
                bbVar.copyOnWrite();
                C55958be beVar2 = (C55958be) bbVar.instance;
                bdVar.getClass();
                beVar2.f148957e = bdVar;
                beVar2.f148953a |= 128;
                bbVar.copyOnWrite();
                C55958be beVar3 = (C55958be) bbVar.instance;
                C55932af afVar7 = (C55932af) acVar.build();
                afVar7.getClass();
                beVar3.f148955c = afVar7;
                beVar3.f148954b = 8;
                ((C147478a) this.f398155a.mo6453a()).mo124229a(i, (C55958be) bbVar.build());
            }
        }
    }
}
