package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15938h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.b.m */
/* compiled from: PG */
public final /* synthetic */ class C16297m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16300p f47961a;

    /* renamed from: b */
    public final /* synthetic */ C15938h f47962b;

    public /* synthetic */ C16297m(C16300p pVar, C15938h hVar) {
        this.f47961a = pVar;
        this.f47962b = hVar;
    }

    public final C60870cx apply(Object obj) {
        C16300p pVar = this.f47961a;
        C15938h hVar = this.f47962b;
        ArrayList arrayList = new ArrayList();
        for (C16091aq g : (List) obj) {
            arrayList.add(pVar.mo22875b(g.mo22733g(), hVar));
        }
        return C47638k.m84750a(arrayList).mo51520a(C16295k.f47958a, pVar.f47968b);
    }
}
