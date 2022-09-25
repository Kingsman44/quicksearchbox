package com.google.android.apps.gsa.staticplugins.p7385ak;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65761as;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ak.h */
/* compiled from: PG */
public final /* synthetic */ class C93903h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93914s f262250a;

    /* renamed from: b */
    public final /* synthetic */ String f262251b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f262252c;

    public /* synthetic */ C93903h(C93914s sVar, String str, C58485gu guVar) {
        this.f262250a = sVar;
        this.f262251b = str;
        this.f262252c = guVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93914s sVar = this.f262250a;
        String str = this.f262251b;
        C58485gu guVar = this.f262252c;
        C118826c cVar = (C118826c) obj;
        C58976aa aaVar = C58975e.f156826a;
        ArrayList arrayList = new ArrayList();
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C65761as asVar = (C65761as) guVar.get(i2);
            C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
            long micros = TimeUnit.MILLISECONDS.toMicros(sVar.f262273j.mo26870b());
            long j = sVar.f262279p;
            if (micros <= j) {
                micros = 1 + j;
            }
            sVar.f262279p = micros;
            C65138c cVar2 = (C65138c) C65139d.f176307e.createBuilder();
            cVar2.copyOnWrite();
            C65139d dVar = (C65139d) cVar2.instance;
            dVar.f176309a |= 1;
            dVar.f176310b = micros;
            C65139d dVar2 = (C65139d) cVar2.build();
            ayVar.copyOnWrite();
            C65768az azVar = (C65768az) ayVar.instance;
            dVar2.getClass();
            azVar.f178796b = dVar2;
            azVar.f178795a |= 1;
            C51058ev evVar = asVar.f178779b;
            if (evVar == null) {
                evVar = C51058ev.f132941o;
            }
            String str2 = evVar.f132944b;
            ayVar.copyOnWrite();
            C65768az azVar2 = (C65768az) ayVar.instance;
            str2.getClass();
            azVar2.f178795a |= 4;
            azVar2.f178798d = str2;
            C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
            gVar.copyOnWrite();
            ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.DeviceInstalledAppsElement";
            C63088z byteString = asVar.toByteString();
            gVar.copyOnWrite();
            byteString.getClass();
            ((C63070h) gVar.instance).f170218b = byteString;
            ayVar.copyOnWrite();
            C65768az azVar3 = (C65768az) ayVar.instance;
            C63070h hVar = (C63070h) gVar.build();
            hVar.getClass();
            azVar3.f178799e = hVar;
            azVar3.f178795a |= 8;
            C65768az azVar4 = (C65768az) ayVar.build();
            String str3 = azVar4.f178798d;
            C60870cx d = sVar.f262278o.d(str, C65753ak.DEVICE_INSTALLED_APPS, azVar4, false);
            C90875ai.m148465b(C93909n.f262259a, d, sVar.f262270g, "Geller write logging").mo85223a(C93910o.f262260a);
            arrayList.add(d);
        }
        return C60856cj.m92892a(arrayList).mo57334a(C93911p.f262261a, C60826bg.f164896a);
    }
}
