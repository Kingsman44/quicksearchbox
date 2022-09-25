package com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.p1268a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.C16392a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.l.b.a.b */
/* compiled from: PG */
public final class C16394b implements C16392a {

    /* renamed from: a */
    private static final C59071e f48249a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.l.b.a.b");

    /* renamed from: b */
    private final HashMap f48250b = new HashMap();

    /* renamed from: a */
    public final List mo22894a(List list, C15777d dVar) {
        ArrayList arrayList = new ArrayList(list);
        C58485gu k = dVar.mo22555k();
        int size = k.size();
        for (int i = 0; i < size; i++) {
            C16170n nVar = (C16170n) k.get(i);
            this.f48250b.put(nVar.mo22752f(), Integer.valueOf(mo22896b(nVar.mo22752f()) + 1));
        }
        Collections.sort(arrayList, new C16393a(this));
        C58976aa aaVar = C58975e.f156826a;
        C59104x b = f48249a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SuggestionRanker");
        ((C59052c) ((C59052c) b).mo56372aa(46708)).mo56393w("CandidateSuggestion size: %d - seenCandidateSuggestions size: %d", arrayList.size(), this.f48250b.size());
        return arrayList;
    }

    /* renamed from: b */
    public final int mo22896b(String str) {
        if (this.f48250b.containsKey(str)) {
            return ((Integer) this.f48250b.get(str)).intValue();
        }
        return 0;
    }
}
