package com.google.android.apps.gsa.staticplugins.nga.p8069l;

import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82334bi;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3745ab.p3771w.C48420g;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.ady;
import com.google.common.p4552o.aea;
import com.google.common.p4552o.aeb;
import com.google.common.p4552o.aec;
import com.google.common.p4552o.aef;
import com.google.common.p4552o.ahi;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.l.c */
/* compiled from: PG */
public final /* synthetic */ class C103391c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103393e f288213a;

    /* renamed from: b */
    public final /* synthetic */ ahi f288214b;

    public /* synthetic */ C103391c(C103393e eVar, ahi ahi) {
        this.f288213a = eVar;
        this.f288214b = ahi;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103393e eVar = this.f288213a;
        ahi ahi = this.f288214b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aea f = eVar.f288221f.mo93526f();
        String name = f.name();
        if (name != null) {
            C82334bi biVar = new C82334bi("NGA_DASHER_ACCOUNT_PRESENT", name);
            eVar.f288224i.mo75579d(biVar);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1464;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164236cn = ahi.f158764y;
            ufVar2.f164255j |= 16;
            C48420g b = eVar.f288220e.mo75573b();
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar3.f164237co = b;
            ufVar3.f164255j |= 32;
            ady ady = (ady) aeb.f158441d.createBuilder();
            aec aec = (aec) aef.f158453e.createBuilder();
            String str = biVar.f224921a;
            aec.copyOnWrite();
            aef aef = (aef) aec.instance;
            aef.f158455a |= 1;
            aef.f158456b = str;
            aef aef2 = (aef) aec.build();
            ady.copyOnWrite();
            aeb aeb = (aeb) ady.instance;
            aef2.getClass();
            aeb.f158444b = aef2;
            aeb.f158443a |= 1;
            ady.copyOnWrite();
            aeb aeb2 = (aeb) ady.instance;
            aeb2.f158445c = f.f158440f;
            aeb2.f158443a |= 2;
            tzVar.mo57112b((aeb) ady.build());
            if (booleanValue) {
                tzVar.copyOnWrite();
                C60555uf ufVar4 = (C60555uf) tzVar.instance;
                ufVar4.f164256k |= 4;
                ufVar4.f164211cL = true;
            }
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            return C118826c.f331422a;
        }
        throw new NullPointerException("Null dasherAccountStatus");
    }
}
