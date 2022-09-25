package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.av */
/* compiled from: PG */
public final /* synthetic */ class C16025av implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16090ap f47447a;

    public /* synthetic */ C16025av(C16090ap apVar) {
        this.f47447a = apVar;
    }

    public final Object apply(Object obj) {
        C16090ap apVar = this.f47447a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            return (C16091aq) axVar.mo56107c();
        }
        throw new NoSuchElementException("Empty DisplayInfo for display type: ".concat(String.valueOf(apVar.name())));
    }
}
