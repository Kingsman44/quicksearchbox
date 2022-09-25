package com.google.android.libraries.lens.view.session;

import android.location.Location;
import com.google.android.apps.gsa.assist.C9361bb;
import com.google.android.apps.gsa.assist.C9362bc;
import com.google.android.apps.gsa.assist.C9363bd;
import com.google.android.apps.gsa.assist.C9364be;
import com.google.android.libraries.lens.view.p2148l.C27226f;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4535g.C59203do;
import com.google.p4017at.p4056g.p4057a.p4058a.C54018bz;
import com.google.p4017at.p4056g.p4057a.p4058a.C54020ca;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;

/* renamed from: com.google.android.libraries.lens.view.session.r */
/* compiled from: PG */
public final class C28020r {

    /* renamed from: a */
    public final C28021s f76262a;

    /* renamed from: b */
    public final C58833ax f76263b;

    static {
        C58974d.m91135i("ExternalImageManager");
    }

    public C28020r(C28021s sVar, C58833ax axVar) {
        this.f76262a = sVar;
        this.f76263b = axVar;
    }

    /* renamed from: a */
    public static C27228h m52205a(C27228h hVar) {
        C27226f a = hVar.mo32667a();
        a.mo32666e();
        return a.mo32662a();
    }

    /* renamed from: b */
    public static C27228h m52206b(C27228h hVar, C27232l lVar) {
        C58833ax axVar;
        C54018bz bzVar;
        if (!lVar.mo32712r().mo56113h()) {
            axVar = C58836b.f156633a;
        } else {
            Location location = (Location) lVar.mo32712r().mo56107c();
            if (location.getLatitude() == C59203do.f157270a && location.getLongitude() == C59203do.f157270a) {
                axVar = C58836b.f156633a;
            } else {
                C9361bb bbVar = (C9361bb) C9364be.f32516c.createBuilder();
                C9362bc bcVar = (C9362bc) C9363bd.f32511d.createBuilder();
                double latitude = location.getLatitude();
                bcVar.copyOnWrite();
                C9363bd bdVar = (C9363bd) bcVar.instance;
                bdVar.f32513a |= 1;
                bdVar.f32514b = (float) latitude;
                double longitude = location.getLongitude();
                bcVar.copyOnWrite();
                C9363bd bdVar2 = (C9363bd) bcVar.instance;
                bdVar2.f32513a |= 2;
                bdVar2.f32515c = (float) longitude;
                bbVar.copyOnWrite();
                C9364be beVar = (C9364be) bbVar.instance;
                C9363bd bdVar3 = (C9363bd) bcVar.build();
                bdVar3.getClass();
                beVar.f32519b = bdVar3;
                beVar.f32518a |= 1;
                axVar = C58833ax.m90834k((C9364be) bbVar.build());
            }
        }
        C9364be beVar2 = (C9364be) axVar.mo56111f();
        if (!((!hVar.mo32668b().mo56113h() && !hVar.mo32670d().mo56113h()) || beVar2 == null || (beVar2.f32518a & 1) == 0)) {
            C9363bd bdVar4 = beVar2.f32519b;
            if (bdVar4 == null) {
                bdVar4 = C9363bd.f32511d;
            }
            C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
            if ((bdVar4.f32513a & 1) != 0) {
                float f = bdVar4.f32514b;
                jVar.copyOnWrite();
                ((C58079k) jVar.instance).f155252a = (double) f;
            }
            if ((bdVar4.f32513a & 2) != 0) {
                float f2 = bdVar4.f32515c;
                jVar.copyOnWrite();
                ((C58079k) jVar.instance).f155253b = (double) f2;
            }
            C27226f a = hVar.mo32667a();
            C54018bz bzVar2 = (C54018bz) C54020ca.f141734f.createBuilder();
            bzVar2.copyOnWrite();
            C58079k kVar = (C58079k) jVar.build();
            kVar.getClass();
            ((C54020ca) bzVar2.instance).f141736a = kVar;
            a.mo32663b(C58833ax.m90834k((C54020ca) bzVar2.build()));
            hVar = a.mo32662a();
        }
        if (!lVar.mo32709o().mo56113h()) {
            return hVar;
        }
        if (hVar.mo32671e().mo56113h()) {
            bzVar = (C54018bz) ((C54020ca) hVar.mo32671e().mo56107c()).toBuilder();
        } else {
            bzVar = (C54018bz) C54020ca.f141734f.createBuilder();
        }
        C27226f a2 = hVar.mo32667a();
        String str = (String) lVar.mo32709o().mo56107c();
        bzVar.copyOnWrite();
        str.getClass();
        ((C54020ca) bzVar.instance).f141739d = str;
        a2.mo32663b(C58833ax.m90834k((C54020ca) bzVar.build()));
        return a2.mo32662a();
    }
}
