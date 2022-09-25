package com.google.android.libraries.assistant.auto.ondevice.p710d.p711a;

import android.net.Uri;
import com.google.android.libraries.assistant.auto.ondevice.p710d.p712b.C11883f;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28707am;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.libraries.mdi.download.C28724bb;
import com.google.android.libraries.mdi.download.C28725bc;
import com.google.android.libraries.mdi.download.C28728bf;
import com.google.android.libraries.mdi.download.C28730bh;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.d.a.d */
/* compiled from: PG */
public final class C11877d {

    /* renamed from: a */
    public static final C58974d f38231a = C58974d.m91136j();

    /* renamed from: b */
    public final Map f38232b;

    /* renamed from: c */
    public String f38233c = "generic";

    /* renamed from: d */
    private final C69464a f38234d;

    /* renamed from: e */
    private final Optional f38235e;

    /* renamed from: f */
    private final C69464a f38236f;

    public C11877d(C69464a aVar, Optional optional, C69464a aVar2, C28716av avVar, C42813k kVar, C69464a aVar3, C69464a aVar4, C69464a aVar5) {
        this.f38234d = aVar;
        this.f38235e = optional;
        HashMap hashMap = new HashMap();
        this.f38232b = hashMap;
        this.f38236f = aVar5;
        if (((Boolean) aVar2.mo17428b()).booleanValue()) {
            m27674g(hashMap, avVar, kVar, (Map) aVar3.mo17428b());
        } else {
            m27674g(hashMap, avVar, kVar, (Map) aVar4.mo17428b());
        }
    }

    /* renamed from: g */
    private static void m27674g(Map map, C28716av avVar, C42813k kVar, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            map.put(str, new C11876c(str, avVar, (C28730bh) entry.getValue(), kVar));
        }
    }

    /* renamed from: a */
    public final C28708an mo20272a(String str) {
        C11876c cVar = (C11876c) this.f38232b.get(str);
        if (cVar == null) {
            ((C58970a) ((C58970a) f38231a.mo56226d()).mo56372aa(43740)).mo56389s("Locale %s is not compatible", str);
            return null;
        }
        C28707am amVar = (C28707am) C28708an.f77994l.createBuilder();
        String str2 = cVar.f38222b;
        amVar.copyOnWrite();
        C28708an anVar = (C28708an) amVar.instance;
        str2.getClass();
        anVar.f77996a |= 1;
        anVar.f77997b = str2;
        C28716av avVar = cVar.f38223c;
        amVar.copyOnWrite();
        C28708an anVar2 = (C28708an) amVar.instance;
        anVar2.f78002g = avVar;
        anVar2.f77996a |= 1024;
        int i = cVar.f38227g;
        amVar.copyOnWrite();
        C28708an anVar3 = (C28708an) amVar.instance;
        anVar3.f77996a |= 4;
        anVar3.f77999d = i;
        amVar.copyOnWrite();
        C28708an anVar4 = (C28708an) amVar.instance;
        anVar4.f77996a |= 256;
        anVar4.f78001f = 86400;
        for (C28706al c : cVar.f38225e.values()) {
            amVar.mo34329c(c);
        }
        return (C28708an) amVar.build();
    }

    /* renamed from: b */
    public final C28730bh mo20273b(String str) {
        C11876c cVar = (C11876c) this.f38232b.get(str);
        if (cVar != null) {
            return cVar.f38224d;
        }
        ((C58970a) ((C58970a) f38231a.mo56226d()).mo56372aa(43742)).mo56389s("Locale %s is not compatible", str);
        return C28730bh.f78048d;
    }

    /* renamed from: c */
    public final Map mo20274c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f38232b.entrySet()) {
            hashMap.put((String) entry.getKey(), ((C11876c) entry.getValue()).mo20269a());
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: d */
    public final void mo20275d(String str, C28728bf bfVar) {
        String str2;
        C58974d dVar = f38231a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(43757)).mo56389s("Parse locale manifest for: %s", str);
        C11876c cVar = (C11876c) this.f38232b.get(str);
        if (cVar == null) {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(43763)).mo56389s("Locale was not initialized, bailing out: %s", str);
            return;
        }
        Optional empty = Optional.empty();
        boolean z = false;
        for (C28725bc bcVar : bfVar.f78046b) {
            if ((bcVar.f78036a & 1) != 0) {
                C28724bb bbVar = bcVar.f78037b;
                if (bbVar == null) {
                    bbVar = C28724bb.f78028e;
                }
                if ((bbVar.f78030a & 1) != 0) {
                    C63070h hVar = bbVar.f78032c;
                    if (hVar == null) {
                        hVar = C63070h.f170215c;
                    }
                    try {
                        C11883f fVar = (C11883f) C62942bv.parseFrom((C62942bv) C11883f.f38242d, hVar.f170218b, C62921ba.m95368a());
                        C62971cq cqVar = fVar.f38244a;
                        if (cqVar.isEmpty() || ((str2 = this.f38233c) != null && cqVar.contains(str2))) {
                            C62971cq cqVar2 = fVar.f38245b;
                            if ((cqVar2.isEmpty() || (this.f38235e.isPresent() && cqVar2.contains(this.f38235e.get()))) && fVar.f38246c == ((Boolean) this.f38236f.mo17428b()).booleanValue()) {
                                C28708an anVar = bcVar.f78038c;
                                if (anVar == null) {
                                    anVar = C28708an.f77994l;
                                }
                                cVar.mo20270b(anVar);
                                z = true;
                            }
                        }
                    } catch (C62974ct e) {
                        ((C58970a) ((C58970a) ((C58970a) f38231a.mo56225c()).mo56382g(e)).mo56372aa(43771)).mo56386p("Could not parse language pack modifier");
                    }
                }
            }
            C28724bb bbVar2 = bcVar.f78037b;
            if (bbVar2 == null) {
                bbVar2 = C28724bb.f78028e;
            }
            if ((bbVar2.f78030a & 1) == 0) {
                empty = Optional.m71637of(bcVar);
            }
        }
        if (((Boolean) this.f38234d.mo17428b()).booleanValue()) {
            if (!z && empty.isPresent()) {
                empty.get();
                C28708an anVar2 = ((C28725bc) empty.get()).f78038c;
                if (anVar2 == null) {
                    anVar2 = C28708an.f77994l;
                }
                cVar.mo20270b(anVar2);
            }
        } else if (empty.isPresent()) {
            empty.get();
            C28708an anVar3 = ((C28725bc) empty.get()).f78038c;
            if (anVar3 == null) {
                anVar3 = C28708an.f77994l;
            }
            cVar.mo20270b(anVar3);
        }
    }

    /* renamed from: e */
    public final void mo20276e(String str, C29690f fVar) {
        C11876c cVar = (C11876c) this.f38232b.get(str);
        if (cVar == null) {
            ((C58970a) ((C58970a) f38231a.mo56226d()).mo56372aa(43765)).mo56389s("Locale %s is not compatible", str);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C28595b bVar : fVar.f80416g) {
            Uri parse = Uri.parse(bVar.f77799c);
            String str2 = bVar.f77798b;
            try {
                if ("/metadata".equals(str2)) {
                    ((C58970a) ((C58970a) C11876c.f38221a.mo56224b()).mo56372aa(43735)).mo56386p("parsing language pack metadata file");
                    cVar.f38230j = (C8476as) cVar.f38226f.mo45889c(parse, new C42789m(C8476as.f29413p.getParserForType()));
                } else {
                    C42813k kVar = cVar.f38226f;
                    C42788l lVar = new C42788l();
                    lVar.f112052a = true;
                    arrayList.add((File) kVar.mo45889c(parse, lVar));
                }
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) C11876c.f38221a.mo56226d()).mo56382g(e)).mo56372aa(43734)).mo56354G("error reading language pack: %s: %s", cVar.f38222b, str2);
                return;
            }
        }
        if (cVar.f38230j == null) {
            ((C58970a) ((C58970a) C11876c.f38221a.mo56226d()).mo56372aa(43733)).mo56389s("language pack missing metadata file for: %s", cVar.f38222b);
            return;
        }
        cVar.f38228h = fVar;
        cVar.f38229i = Collections.unmodifiableList(arrayList);
        C29690f fVar2 = cVar.f38228h;
        fVar2.getClass();
        for (C28595b bVar2 : fVar2.f80416g) {
            if (bVar2.f77798b.equals("/metadata") || bVar2.f77798b.equals("/oem_metadata")) {
                try {
                    ((C58970a) ((C58970a) C11876c.f38221a.mo56224b()).mo56372aa(43731)).mo56359L("Locale %s languagepack (%s) version: %s", cVar.f38222b, bVar2.f77798b, Integer.valueOf(((C8476as) cVar.f38226f.mo45889c(Uri.parse(bVar2.f77799c), new C42789m(C8476as.f29413p.getParserForType()))).f29419d));
                } catch (Exception e2) {
                    ((C58970a) ((C58970a) ((C58970a) C11876c.f38221a.mo56226d()).mo56382g(e2)).mo56372aa(43732)).mo56386p("Error parsing metadata file");
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo20277f(String str) {
        C11876c cVar = (C11876c) this.f38232b.get(str);
        if (cVar == null) {
            return false;
        }
        return cVar.mo20271c();
    }
}
