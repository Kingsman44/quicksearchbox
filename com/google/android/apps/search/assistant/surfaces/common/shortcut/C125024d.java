package com.google.android.apps.search.assistant.surfaces.common.shortcut;

import java.util.regex.Pattern;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.common.shortcut.d */
/* compiled from: PG */
public final /* synthetic */ class C125024d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f344950a;

    public /* synthetic */ C125024d(String str) {
        this.f344950a = str;
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
        return Pattern.compile((String) obj).matcher(this.f344950a).find();
    }
}
