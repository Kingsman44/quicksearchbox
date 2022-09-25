package com.google.android.libraries.silk.p3240c.p3256p;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.silk.p3240c.C41763b;
import com.google.android.libraries.silk.p3240c.C41871q;
import com.google.common.p4543n.p4544a.C59347c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4293ac.C56630b;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4339p.C56924b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.silk.c.p.c */
/* compiled from: PG */
public final class C41870c implements C21312s {

    /* renamed from: a */
    private final C41763b f109262a;

    public C41870c(C69464a aVar, C41871q qVar) {
        C41871q qVar2 = qVar;
        this.f109262a = new C41763b(qVar2, C56630b.f151195c.getParserForType(), new C41869b(aVar), "WeatherSettings", "updateTemperatureUnit");
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56924b.f151922f;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56924b bVar = (C56924b) obj;
        C41763b bVar2 = this.f109262a;
        boolean z = false;
        boolean z2 = (bVar.f151924a & 4) != 0;
        C56630b bVar3 = bVar.f151927d;
        if (bVar3 == null) {
            bVar3 = C56630b.f151195c;
        }
        Optional a = C59347c.m92236a(z2, bVar3);
        int i = bVar.f151924a;
        Optional a2 = C59347c.m92236a(1 == (i & 1), bVar.f151925b);
        if ((bVar.f151924a & 2) != 0) {
            z = true;
        }
        return bVar2.mo44336a(a, a2, C59347c.m92236a(z, bVar.f151926c));
    }
}
