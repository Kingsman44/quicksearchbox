package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.common.base.C58817ah;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.af */
/* compiled from: PG */
public final /* synthetic */ class C16415af implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f48284a;

    /* renamed from: b */
    public final /* synthetic */ int f48285b;

    public /* synthetic */ C16415af(int i, int i2) {
        this.f48284a = i;
        this.f48285b = i2;
    }

    public final Object apply(Object obj) {
        int i = this.f48284a;
        int i2 = this.f48285b;
        C16348av avVar = (C16348av) C16349aw.f48126d.createBuilder();
        Collection.EL.stream((List) obj).limit((long) i).forEach(new C16411ab(avVar, i2));
        return (C16349aw) avVar.build();
    }
}
