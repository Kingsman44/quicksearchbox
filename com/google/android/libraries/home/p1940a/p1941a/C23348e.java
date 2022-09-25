package com.google.android.libraries.home.p1940a.p1941a;

import com.google.protobuf.C62942bv;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64279a;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64284ac;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64285ad;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64286ae;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64288ag;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64289ah;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64301at;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64302au;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65403a;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65405c;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65406d;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65408f;
import java.util.Collection;
import java.util.Iterator;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.a.e */
/* compiled from: PG */
public final class C23348e {
    /* renamed from: a */
    public static final C64308b m43784a(Collection collection) {
        C69664n.m101061g(collection, "deviceIds");
        C64286ae aeVar = (C64286ae) C64289ah.f173826f.createBuilder();
        C64288ag agVar = C64288ag.QUERY;
        aeVar.copyOnWrite();
        C64289ah ahVar = (C64289ah) aeVar.instance;
        ahVar.f173830c = agVar.f173825e;
        ahVar.f173828a |= 1;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C64284ac acVar = (C64284ac) C64285ad.f173815c.createBuilder();
            acVar.copyOnWrite();
            C64285ad adVar = (C64285ad) acVar.instance;
            str.getClass();
            adVar.f173817a |= 1;
            adVar.f173818b = str;
            aeVar.copyOnWrite();
            C64289ah ahVar2 = (C64289ah) aeVar.instance;
            C64285ad adVar2 = (C64285ad) acVar.build();
            adVar2.getClass();
            ahVar2.mo59269a();
            ahVar2.f173829b.add(adVar2);
        }
        C64301at atVar = (C64301at) C64302au.f173853h.createBuilder();
        atVar.copyOnWrite();
        C64302au auVar = (C64302au) atVar.instance;
        C64289ah ahVar3 = (C64289ah) aeVar.build();
        ahVar3.getClass();
        auVar.mo59270a();
        auVar.f173856b.add(ahVar3);
        C65403a aVar = (C65403a) C65405c.f177820c.createBuilder();
        aVar.copyOnWrite();
        C65405c cVar = (C65405c) aVar.instance;
        cVar.f177823b = 24;
        cVar.f177822a |= 1;
        atVar.copyOnWrite();
        C64302au auVar2 = (C64302au) atVar.instance;
        C65405c cVar2 = (C65405c) aVar.build();
        cVar2.getClass();
        auVar2.f173860f = cVar2;
        auVar2.f173855a |= 1024;
        C65406d dVar = (C65406d) C65408f.f177826c.createBuilder();
        dVar.copyOnWrite();
        C65408f fVar = (C65408f) dVar.instance;
        fVar.f177829b = 4;
        fVar.f177828a |= 1;
        atVar.copyOnWrite();
        C64302au auVar3 = (C64302au) atVar.instance;
        C65408f fVar2 = (C65408f) dVar.build();
        fVar2.getClass();
        auVar3.f173861g = fVar2;
        auVar3.f173855a |= 2048;
        C64279a aVar2 = (C64279a) C64308b.f173874c.createBuilder();
        aVar2.copyOnWrite();
        C64308b bVar = (C64308b) aVar2.instance;
        C64302au auVar4 = (C64302au) atVar.build();
        auVar4.getClass();
        bVar.f173877b = auVar4;
        bVar.f173876a = 2;
        C62942bv build = aVar2.build();
        C69664n.m101060f(build, "newBuilder().setSemantic…nRequest(request).build()");
        return (C64308b) build;
    }
}
