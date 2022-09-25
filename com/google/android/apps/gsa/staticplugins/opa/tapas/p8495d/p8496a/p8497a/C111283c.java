package com.google.android.apps.gsa.staticplugins.opa.tapas.p8495d.p8496a.p8497a;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.assistant.p1594s.p1595a.C19127a;
import com.google.android.libraries.assistant.p1594s.p1595a.p1596a.C19128a;
import com.google.android.libraries.assistant.p1594s.p1599c.C19200b;
import com.google.android.libraries.assistant.p1594s.p1599c.C19201c;
import com.google.android.libraries.assistant.p1594s.p1599c.C19202d;
import com.google.android.libraries.assistant.p1594s.p1599c.C19203e;
import com.google.android.libraries.assistant.p1594s.p1599c.C19204f;
import com.google.android.libraries.assistant.p1594s.p1599c.C19205g;
import com.google.android.libraries.assistant.p1594s.p1599c.C19206h;
import com.google.android.libraries.assistant.p1594s.p1599c.C19208j;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.mdi.download.C28696ab;
import com.google.android.libraries.mdi.download.C28739bq;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C28742bt;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29436g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.d.a.a.c */
/* compiled from: PG */
public final class C111283c implements C19127a {

    /* renamed from: a */
    public static final C59071e f309678a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.d.a.a.c");

    /* renamed from: c */
    private static final C28742bt f309679c = new C111278a();

    /* renamed from: b */
    public final C19128a f309680b;

    /* renamed from: d */
    private final C29409fd f309681d;

    public C111283c(Context context, C58833ax axVar) {
        this.f309681d = (C29409fd) axVar.mo56111f();
        this.f309680b = new C19128a(context);
    }

    /* renamed from: c */
    public static boolean m185050c(C19205g gVar, List list, int i, AtomicInteger atomicInteger) {
        if (list == null) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        list.size();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C29690f fVar = (C29690f) it.next();
            int incrementAndGet = atomicInteger.incrementAndGet();
            if (fVar == null) {
                C59104x d = f309678a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AIEngineMdd");
                ((C59052c) ((C59052c) d).mo56372aa(27385)).mo56386p("#process: clientFileGroup is null");
            } else {
                for (C28595b bVar : fVar.f80416g) {
                    C29689e a = C29689e.m54781a(fVar.f80415f);
                    if (a == null) {
                        a = C29689e.UNSPECIFIED;
                    }
                    if (a == C29689e.DOWNLOADED) {
                        String str = bVar.f77798b;
                        if (!str.equals("model_index.pb") && !str.equals("collections.pb")) {
                            String str2 = fVar.f80411b;
                            String str3 = bVar.f77799c;
                            C19203e eVar = (C19203e) C19204f.f53768f.createBuilder();
                            eVar.copyOnWrite();
                            C19204f fVar2 = (C19204f) eVar.instance;
                            str2.getClass();
                            fVar2.f53770a |= 1;
                            fVar2.f53771b = str2;
                            eVar.copyOnWrite();
                            C19204f fVar3 = (C19204f) eVar.instance;
                            str.getClass();
                            fVar3.f53770a |= 2;
                            fVar3.f53772c = str;
                            eVar.copyOnWrite();
                            C19204f fVar4 = (C19204f) eVar.instance;
                            str3.getClass();
                            fVar4.f53770a |= 4;
                            fVar4.f53773d = str3;
                            gVar.mo24315a((C19204f) eVar.build());
                        }
                    }
                }
            }
            i2 = incrementAndGet;
        }
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C19202d mo24288a(C19200b bVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f309681d != null) {
            C19208j jVar = bVar.f53760e;
            if (jVar == null) {
                jVar = C19208j.f53782h;
            }
            boolean z = jVar.f53790g;
            ArrayList<C29690f> arrayList = new ArrayList<>();
            if (this.f309681d != null && jVar.f53790g) {
                for (String str : jVar.f53786c) {
                    try {
                        C28739bq m = C28740br.m53599m();
                        m.mo34338d(str);
                        m.mo34337c(C28696ab.f77968a);
                        ((C29436g) m).f79807g = C58833ax.m90834k(f309679c);
                        arrayList.add((C29690f) C90877ak.m148472f(this.f309681d.mo34714c(m.mo34335a())));
                    } catch (InterruptedException | ExecutionException e) {
                        C59104x c = f309678a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "AIEngineMdd");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(27375)).mo56354G("#downloadFileGroup: for %s, exception %s", str, e);
                    }
                }
            }
            for (C29690f fVar : arrayList) {
                String str2 = fVar.f80411b;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : jVar.f53786c) {
                C29409fd fdVar = this.f309681d;
                C28804cs f = C28805ct.m53747f();
                f.mo34449c(str3);
                C60870cx f2 = fdVar.mo34717f(f.mo34447a());
                if (f2 != null) {
                    arrayList2.add(f2);
                    try {
                        C29690f fVar2 = (C29690f) C90877ak.m148472f(f2);
                    } catch (InterruptedException | ExecutionException e2) {
                        C59104x c2 = f309678a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "AIEngineMdd");
                        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(27369)).mo56386p("#process: exception");
                    }
                } else {
                    C59104x d = f309678a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AIEngineMdd");
                    ((C59052c) ((C59052c) d).mo56372aa(27367)).mo56389s("#process: file group not found; returned null (%s)", str3);
                }
            }
            arrayList2.size();
            C19205g gVar = (C19205g) C19206h.f53775f.createBuilder();
            C19208j jVar2 = bVar.f53760e;
            if (jVar2 == null) {
                jVar2 = C19208j.f53782h;
            }
            int i = jVar2.f53785b;
            gVar.copyOnWrite();
            C19206h hVar = (C19206h) gVar.instance;
            hVar.f53777a |= 1;
            hVar.f53778b = i;
            ArrayList<C19204f> arrayList3 = new ArrayList<>();
            C19208j jVar3 = bVar.f53760e;
            if (jVar3 == null) {
                jVar3 = C19208j.f53782h;
            }
            Iterator it = jVar3.f53787d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str4 = (String) it.next();
                File file = new File(str4);
                if (!file.exists()) {
                    C59104x d2 = f309678a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "AIEngineMdd");
                    ((C59052c) ((C59052c) d2).mo56372aa(27378)).mo56386p("#process: local file does not exist");
                } else {
                    C19203e eVar = (C19203e) C19204f.f53768f.createBuilder();
                    eVar.copyOnWrite();
                    C19204f fVar3 = (C19204f) eVar.instance;
                    fVar3.f53770a |= 1;
                    fVar3.f53771b = "local:".concat(String.valueOf(str4));
                    if (file.isDirectory()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null) {
                            for (File absolutePath : listFiles) {
                                eVar.mo24314a(absolutePath.getAbsolutePath());
                            }
                        }
                    } else {
                        eVar.mo24314a(str4);
                    }
                    arrayList3.add((C19204f) eVar.build());
                }
            }
            for (C19204f a : arrayList3) {
                gVar.mo24315a(a);
            }
            for (Integer intValue : jVar.f53788e) {
                int intValue2 = intValue.intValue();
                gVar.copyOnWrite();
                C19206h hVar2 = (C19206h) gVar.instance;
                C62961ch chVar = hVar2.f53781e;
                if (!chVar.mo58948c()) {
                    hVar2.f53781e = C62942bv.mutableCopy(chVar);
                }
                hVar2.f53781e.mo58916g(intValue2);
            }
            int size = arrayList2.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            C19201c cVar = (C19201c) C19202d.f53762d.createBuilder();
            if (!jVar.f53789f) {
                C60856cj.m92911t(C60856cj.m92896e(arrayList2), new C111282b(this, gVar, size, atomicInteger), C60826bg.f164896a);
            } else {
                try {
                    if (m185050c(gVar, (List) C60856cj.m92909r(C60856cj.m92896e(arrayList2)), size, atomicInteger)) {
                        cVar.mo24313a((C19206h) gVar.build());
                    }
                } catch (ExecutionException e3) {
                    C59104x c3 = f309678a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "AIEngineMdd");
                    ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(27366)).mo56386p("#process: exception");
                }
            }
            return (C19202d) cVar.build();
        }
        C59104x c4 = f309678a.mo56225c();
        c4.mo56378ag(C58975e.f156826a, "AIEngineMdd");
        ((C59052c) ((C59052c) c4).mo56372aa(27372)).mo56386p("#process: mobileDataDownload == null");
        return C19202d.f53762d;
    }

    /* renamed from: b */
    public final boolean mo24289b(C19200b bVar) {
        if (this.f309681d != null) {
            return (bVar.f53756a & 256) != 0;
        }
        C59104x c = f309678a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AIEngineMdd");
        ((C59052c) ((C59052c) c).mo56372aa(27379)).mo56386p("#canProcess: mobileDataDownload == null");
        return false;
    }

    /* renamed from: d */
    public final C58833ax mo24290d() {
        return C58833ax.m90834k(new ArrayList());
    }

    /* renamed from: e */
    public final void mo24291e() {
        C58833ax.m90834k("MDD");
    }

    /* renamed from: f */
    public final void mo24292f() {
        C58976aa aaVar = C58975e.f156826a;
    }
}
