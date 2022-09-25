package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10942i.C147084g;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C63964aa;
import com.google.protos.p4895aw.p4902b.C63971ah;
import com.google.protos.p4895aw.p4902b.C63997bg;
import com.google.protos.p4895aw.p4902b.C63998bh;
import com.google.protos.p4895aw.p4902b.C64044d;
import com.google.protos.p4895aw.p4902b.C64089g;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.dp */
/* compiled from: PG */
public final class C146967dp extends C68247h {

    /* renamed from: a */
    private final C68283d f396725a;

    public C146967dp(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C146967dp.class), aVar);
        this.f396725a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        ArrayList arrayList = new ArrayList();
        C58801sm G = ((C147084g) obj).f397128a.listIterator(0);
        while (G.hasNext()) {
            C63998bh bhVar = (C63998bh) G.next();
            C63964aa aaVar = (C63964aa) C63971ah.f173003f.createBuilder();
            C63088z zVar = bhVar.f173071c;
            aaVar.copyOnWrite();
            C63971ah ahVar = (C63971ah) aaVar.instance;
            zVar.getClass();
            ahVar.f173005a |= 4;
            ahVar.f173008d = zVar;
            long j = bhVar.f173072d;
            aaVar.copyOnWrite();
            C63971ah ahVar2 = (C63971ah) aaVar.instance;
            ahVar2.f173005a |= 1;
            ahVar2.f173006b = j;
            C64044d dVar = (C64044d) C64089g.f173264e.createBuilder();
            int a = C63997bg.m96332a(bhVar.f173070b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                dVar.copyOnWrite();
                C64089g gVar = (C64089g) dVar.instance;
                gVar.f173269d = 4;
                gVar.f173266a |= 1;
                C63971ah ahVar3 = (C63971ah) aaVar.build();
                dVar.copyOnWrite();
                C64089g gVar2 = (C64089g) dVar.instance;
                ahVar3.getClass();
                gVar2.f173268c = ahVar3;
                gVar2.f173267b = 4;
                arrayList.add((C64089g) dVar.build());
            } else {
                throw new UnsupportedOperationException("Don't know what local Footprints change type " + Integer.toString(i) + " means");
            }
        }
        return C60856cj.m92900i(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f396725a.mo60297gq();
    }
}
