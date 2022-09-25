package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58733pz;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

@Deprecated
/* renamed from: com.google.android.apps.gsa.search.core.state.d.bg */
/* compiled from: PG */
public final class C86940bg extends C86898ct {

    /* renamed from: a */
    public final Map f234813a;

    /* renamed from: b */
    public final Set f234814b;

    /* renamed from: c */
    public final Set f234815c = new TreeSet();

    public C86940bg(C68214a aVar) {
        super(aVar, 19);
        HashMap hashMap = new HashMap();
        this.f234813a = hashMap;
        TreeSet treeSet = new TreeSet();
        this.f234814b = treeSet;
        hashMap.put("microdetection", 1);
        treeSet.add("microdetection");
    }

    /* renamed from: e */
    public final Set mo80595e(int i, int i2) {
        C58526ih ihVar = null;
        for (Map.Entry entry : this.f234813a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i) {
                if (ihVar == null) {
                    ihVar = new C58526ih();
                }
                ihVar.mo55373c((String) entry.getKey());
                entry.setValue(Integer.valueOf(i2));
            }
        }
        if (ihVar == null) {
            return C58733pz.f156496a;
        }
        return ihVar.mo55486f();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        fVar.mo85291r("ModuleState");
        fVar.mo85291r("Workers");
        for (Map.Entry entry : this.f234813a.entrySet()) {
            switch (((Integer) entry.getValue()).intValue()) {
                case 1:
                    str = "to be loaded";
                    break;
                case 2:
                    str = "loading";
                    break;
                case 3:
                    str = "loaded";
                    break;
                case 4:
                    str = "to be unloaded";
                    break;
                case 5:
                    str = "unloading";
                    break;
                case 6:
                    str = "failed to load";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            fVar.mo85279c((String) entry.getKey()).mo85276a(C90752i.m148229c(str));
        }
    }
}
