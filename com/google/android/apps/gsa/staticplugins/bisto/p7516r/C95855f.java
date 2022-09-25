package com.google.android.apps.gsa.staticplugins.bisto.p7516r;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89619aq;
import com.google.android.apps.gsa.shared.bisto.C89683v;
import com.google.android.apps.gsa.shared.bisto.C89684w;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.r.f */
/* compiled from: PG */
public final class C95855f implements C89684w {

    /* renamed from: a */
    private final C91022f f268415a;

    /* renamed from: b */
    private final Map f268416b = new TreeMap();

    /* renamed from: c */
    private final C90476a f268417c;

    public C95855f(C90476a aVar, C91022f fVar) {
        this.f268417c = aVar;
        this.f268415a = fVar;
    }

    /* renamed from: c */
    public static void m158927c(C89683v vVar, C89619aq aqVar, boolean z) {
        vVar.mo83403iq(aqVar, z);
        aqVar.mo83483a("\n");
    }

    /* renamed from: a */
    public final void mo83587a(String str, C89683v vVar) {
        C95854e eVar = new C95854e(str, vVar);
        this.f268416b.put(str, eVar);
        this.f268415a.mo85301a(eVar);
    }

    /* renamed from: b */
    public final void mo83588b(PrintWriter printWriter, String[] strArr, boolean z) {
        Map map = this.f268416b;
        try {
            HashSet hashSet = new HashSet();
            boolean z2 = false;
            for (String str : strArr) {
                if (!"verbose".equalsIgnoreCase(str)) {
                    if (!"-v".equalsIgnoreCase(str)) {
                        hashSet.add(str.toLowerCase(Locale.US));
                    }
                }
                z2 = true;
            }
            C89619aq aqVar = new C89619aq(printWriter);
            for (Map.Entry entry : map.entrySet()) {
                C95854e eVar = (C95854e) entry.getValue();
                if (eVar != null) {
                    String str2 = (String) entry.getKey();
                    if (!hashSet.isEmpty()) {
                        String lowerCase = str2.toLowerCase(Locale.US);
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (lowerCase.contains((String) it.next())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    aqVar.println("#####################################");
                    aqVar.println((String) entry.getKey());
                    m158927c(eVar.f268413a, aqVar, z2);
                }
            }
            aqVar.f242690a.flush();
        } catch (Throwable th) {
            printWriter.println("caught exception while dumping: ".concat(String.valueOf(th.getMessage())));
            th.printStackTrace(printWriter);
        }
        if (z) {
            C91006f f = C91006f.m148645f(this.f268417c);
            this.f268415a.mo17602gS(f);
            f.mo85295u(printWriter, BuildConfig.FLAVOR);
        }
    }
}
