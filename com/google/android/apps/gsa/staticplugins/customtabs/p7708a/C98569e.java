package com.google.android.apps.gsa.staticplugins.customtabs.p7708a;

import com.google.android.libraries.p1703d.C20636a;
import com.google.android.libraries.p1703d.C20646b;
import com.google.android.libraries.p1703d.C20647c;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.p4552o.C59719dd;
import com.google.common.p4552o.C59720de;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.a.e */
/* compiled from: PG */
final class C98569e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f275300a;

    /* renamed from: b */
    final /* synthetic */ C20646b f275301b;

    /* renamed from: c */
    final /* synthetic */ C98570f f275302c;

    public C98569e(C98570f fVar, boolean z, C20646b bVar) {
        this.f275302c = fVar;
        this.f275300a = z;
        this.f275301b = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C98570f.f275303a.mo56226d()).mo56382g(th)).mo56372aa(19107)).mo56386p("Failed to update data");
        this.f275302c.mo91184a(C37182a.f98123gk.mo40805c(C62722b.UNKNOWN));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59719dd ddVar = (C59719dd) C59720de.f160297d.createBuilder();
        int i = 3;
        if (this.f275300a) {
            ddVar.copyOnWrite();
            C59720de deVar = (C59720de) ddVar.instance;
            deVar.f160300b = 3;
            deVar.f160299a |= 1;
        } else {
            C20646b bVar = this.f275301b;
            if (bVar != null) {
                C20636a aVar = ((C20647c) bVar).f57885a;
                int ordinal = aVar.ordinal();
                if (ordinal == 0) {
                    i = 2;
                } else if (ordinal != 1) {
                    throw new AssertionError("Invalid status: " + aVar.ordinal());
                }
                ddVar.copyOnWrite();
                C59720de deVar2 = (C59720de) ddVar.instance;
                deVar2.f160300b = i - 1;
                deVar2.f160299a |= 1;
                C63042fg i2 = C62953e.m95484i(((C20647c) this.f275301b).f57886b);
                ddVar.copyOnWrite();
                C59720de deVar3 = (C59720de) ddVar.instance;
                i2.getClass();
                deVar3.f160301c = i2;
                deVar3.f160299a |= 2;
            }
        }
        C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
        C59720de deVar4 = (C59720de) ddVar.build();
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        deVar4.getClass();
        czVar.f160223n = deVar4;
        czVar.f160210a |= 8192;
        C98570f fVar = this.f275302c;
        C37252a c = C37182a.f98122gj.mo40805c(C62722b.OK);
        ((C37253b) c).mo40792p(C59711cz.f160208s, (C59711cz) cyVar.build());
        fVar.mo91184a(c);
    }
}
