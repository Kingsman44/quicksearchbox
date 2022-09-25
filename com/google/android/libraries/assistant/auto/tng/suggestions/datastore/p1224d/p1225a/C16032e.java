package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16115bn;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C16032e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47473a;

    /* renamed from: b */
    public final /* synthetic */ List f47474b;

    /* renamed from: c */
    public final /* synthetic */ List f47475c;

    public /* synthetic */ C16032e(C16027ax axVar, List list, List list2) {
        this.f47473a = axVar;
        this.f47474b = list;
        this.f47475c = list2;
    }

    public final Object apply(Object obj) {
        C16027ax axVar = this.f47473a;
        List<C16115bn> list = this.f47474b;
        List list2 = this.f47475c;
        Void voidR = (Void) obj;
        for (C16115bn bnVar : list) {
            C15973f fVar = axVar.f47453d;
            fVar.f47377r.put(bnVar.mo22777e(), bnVar);
        }
        return list2;
    }
}
