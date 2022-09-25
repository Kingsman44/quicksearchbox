package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.unifiedime.C118588f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.d */
/* compiled from: PG */
public final /* synthetic */ class C125498d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f346071a;

    /* renamed from: b */
    public final /* synthetic */ int f346072b;

    public /* synthetic */ C125498d(int i, int i2) {
        this.f346071a = i;
        this.f346072b = i2;
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
        int i = this.f346071a;
        int i2 = this.f346072b;
        C118588f fVar = (C118588f) obj;
        C125503i iVar = C125503i.f346078a;
        int i3 = fVar.f330862b;
        return i3 >= i && i3 + fVar.f330863c <= i + i2;
    }
}
