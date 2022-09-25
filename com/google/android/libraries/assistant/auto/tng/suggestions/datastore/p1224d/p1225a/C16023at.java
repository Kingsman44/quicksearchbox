package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.at */
/* compiled from: PG */
public final /* synthetic */ class C16023at implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47442a;

    /* renamed from: b */
    public final /* synthetic */ List f47443b;

    /* renamed from: c */
    public final /* synthetic */ C16090ap f47444c;

    /* renamed from: d */
    public final /* synthetic */ List f47445d;

    public /* synthetic */ C16023at(C16027ax axVar, List list, C16090ap apVar, List list2) {
        this.f47442a = axVar;
        this.f47443b = list;
        this.f47444c = apVar;
        this.f47445d = list2;
    }

    public final Object apply(Object obj) {
        C16027ax axVar = this.f47442a;
        List<C16143co> list = this.f47443b;
        C16090ap apVar = this.f47444c;
        List list2 = this.f47445d;
        Void voidR = (Void) obj;
        for (C16143co coVar : list) {
            C15973f fVar = axVar.f47453d;
            fVar.f47375p.put(coVar.mo22804h(), coVar);
            if (!coVar.mo22805i()) {
                C15973f fVar2 = axVar.f47453d;
                fVar2.f47376q.remove(coVar.mo22804h());
            }
            C58976aa aaVar = C58975e.f156826a;
        }
        C15973f fVar3 = axVar.f47453d;
        fVar3.f47364e.put(apVar, Instant.ofEpochMilli(fVar3.f47360a.mo26870b()));
        return list2;
    }
}
