package com.google.android.libraries.p10908a.p10911c.p10913b;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.p10908a.p10910b.C146620b;
import com.google.android.libraries.p10908a.p10911c.p10912a.C146622b;
import com.google.android.libraries.p10908a.p10911c.p10912a.C146623c;
import com.google.android.libraries.p10908a.p10911c.p10912a.C146624d;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42715b;
import com.google.android.libraries.storage.p3304a.p3305a.C42716c;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42881ag;
import com.google.android.libraries.storage.protostore.C42939cg;
import com.google.android.libraries.storage.protostore.C42979do;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4820d.p4821a.C63213e;
import com.google.protos.p4816ai.p4820d.p4821a.C63216h;
import com.google.protos.p4816ai.p4820d.p4821a.C63220l;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.a.c.b.p */
/* compiled from: PG */
public final class C146640p {
    public C146640p(Class cls) {
        C69664n.m101061g(cls, "widgetProvider");
    }

    /* renamed from: a */
    public static final C146626b m238877a(Context context, ExecutorService executorService) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executorService, "executorService");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executorService, "executorService");
        C146620b bVar = C146620b.f396004a;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executorService, "executorService");
        C42880af afVar = C146620b.f396005b;
        if (afVar == null) {
            synchronized (bVar) {
                afVar = C146620b.f396005b;
                if (afVar == null) {
                    C42932a aVar = C42932a.f112315a;
                    HashMap hashMap = new HashMap();
                    C42813k kVar = new C42813k(C69540x.m100944b(new C42716c(new C42715b(context.getApplicationContext()))));
                    C42881ag.m75749a(C42979do.f112413a, hashMap);
                    C42880af afVar2 = new C42880af(executorService, kVar, aVar, hashMap);
                    C146620b.f396005b = afVar2;
                    afVar = afVar2;
                }
            }
        }
        C146625a aVar2 = C146626b.f396016a;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executorService, "executorService");
        C146626b bVar2 = C146625a.f396015b;
        if (bVar2 == null) {
            synchronized (aVar2) {
                bVar2 = C146625a.f396015b;
                if (bVar2 == null) {
                    C146623c cVar = C146624d.f396013d;
                    C69664n.m101061g(context, "context");
                    C69664n.m101061g(executorService, "executorService");
                    C146624d dVar = C146623c.f396012b;
                    if (dVar == null) {
                        synchronized (cVar) {
                            dVar = C146623c.f396012b;
                            if (dVar == null) {
                                dVar = new C146622b(context, afVar, executorService);
                                C146623c.f396012b = dVar;
                            }
                        }
                    }
                    C42718e a = C42719f.m75461a(((C146622b) dVar).f396008a);
                    C42719f.m75463c("androidatgoogle_widgets");
                    a.f111968c = "androidatgoogle_widgets";
                    a.mo45821b("WidgetInstallations.pb");
                    Uri a2 = a.mo45820a();
                    C42877ac i = C42878ad.m75739i();
                    i.mo45968e(a2);
                    i.mo45967d(C63220l.f170798b);
                    for (C42939cg g : ((C146622b) dVar).f396010c) {
                        i.mo45965b().mo55395g(g);
                    }
                    C146631g gVar = new C146631g(((C146622b) dVar).f396009b.mo45979a(i.mo45964a()));
                    C146625a.f396015b = gVar;
                    bVar2 = gVar;
                }
            }
        }
        return bVar2;
    }

    /* renamed from: b */
    public static final void m238878b(C146642r rVar, Context context, C63213e eVar) {
        String str = rVar.f396086N;
        eVar.copyOnWrite();
        C63216h hVar = (C63216h) eVar.instance;
        C63216h hVar2 = C63216h.f170786f;
        str.getClass();
        hVar.f170788a |= 2;
        hVar.f170790c = str;
        C146641q a = C146635k.f396028a.mo123421a(context);
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "event.build()");
        a.mo123422a((C63216h) build);
    }
}
