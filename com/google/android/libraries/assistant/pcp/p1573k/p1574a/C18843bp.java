package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import com.google.android.libraries.assistant.pcp.p1573k.C18928h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.bp */
/* compiled from: PG */
public final /* synthetic */ class C18843bp implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C18844bq f53065a;

    public /* synthetic */ C18843bp(C18844bq bqVar) {
        this.f53065a = bqVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        boolean a = ((C18928h) this.f53065a.f53067b.mo27525b()).mo24225a(componentName.getPackageName());
        C58976aa aaVar = C58975e.f156826a;
        componentName.getPackageName();
        return a;
    }
}
