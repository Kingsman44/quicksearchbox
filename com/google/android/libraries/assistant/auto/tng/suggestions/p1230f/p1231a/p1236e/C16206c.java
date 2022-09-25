package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1236e;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.C16189a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.e.c */
/* compiled from: PG */
public final class C16206c implements C16189a {

    /* renamed from: a */
    private final C15973f f47770a;

    public C16206c(C15973f fVar) {
        this.f47770a = fVar;
    }

    /* renamed from: a */
    public final List mo22848a(List list, C15777d dVar) {
        C16359bf bfVar = dVar.mo22547e().f48165e;
        if (bfVar == null) {
            bfVar = C16359bf.f48152f;
        }
        List list2 = (List) Collection.EL.stream(this.f47770a.mo22634i(bfVar.f48156c)).filter(C16204a.f47768a).collect(Collectors.toCollection(C16205b.f47769a));
        C58976aa aaVar = C58975e.f156826a;
        list2.size();
        return list2;
    }
}
