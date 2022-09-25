package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import com.google.android.apps.gsa.g.e.e;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108249bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108250bu;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.b */
/* compiled from: PG */
public final /* synthetic */ class C113623b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C113628g f314627a;

    public /* synthetic */ C113623b(C113628g gVar) {
        this.f314627a = gVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C113628g gVar = this.f314627a;
        e eVar = (e) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (gVar.f314641h != null) {
            ArrayList arrayList = new ArrayList();
            C58800sl lA = C113628g.f314633a.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                int intValue = ((Integer) entry.getKey()).intValue();
                String str = (String) entry.getValue();
                ArrayList arrayList2 = gVar.f314640g;
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Integer valueOf = Integer.valueOf(intValue);
                        i++;
                        if (((Integer) arrayList2.get(i)).equals(valueOf)) {
                            C113628g.f314633a.get(valueOf);
                            break;
                        }
                    } else {
                        C113628g.f314633a.get(Integer.valueOf(intValue));
                        String language = new Locale(str).getLanguage();
                        if (!language.equals(((C89994f) gVar.f314638e.mo27525b()).mo83892al().getLanguage())) {
                            Iterator it = ((C89994f) gVar.f314638e.mo27525b()).mo83890aj().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (language.equals(new Locale((String) it.next()).getLanguage())) {
                                        break;
                                    }
                                } else if (Collections.unmodifiableMap(eVar.a).containsKey(str)) {
                                    C108248bs bsVar = C108248bs.INTERPRETER;
                                    bsVar.f301130v = intValue;
                                    C108249bt a = ((C108250bu) gVar.f314637d.mo27525b()).mo96700a(bsVar, new Object[0]);
                                    a.f301138c = new C113627f(gVar, a);
                                    arrayList.add(a);
                                    gVar.f314640g.add(Integer.valueOf(intValue));
                                }
                            }
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                gVar.f314641h.mo95361C(arrayList);
            }
        }
    }
}
