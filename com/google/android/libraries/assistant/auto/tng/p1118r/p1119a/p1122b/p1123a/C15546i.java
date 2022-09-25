package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import com.google.common.p4526f.C59071e;
import java.text.Normalizer;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.i */
/* compiled from: PG */
public final /* synthetic */ class C15546i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f46528a;

    /* renamed from: b */
    public final /* synthetic */ String f46529b;

    public /* synthetic */ C15546i(Locale locale, String str) {
        this.f46528a = locale;
        this.f46529b = str;
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
        Locale locale = this.f46528a;
        String str = this.f46529b;
        C59071e eVar = C15553p.f46541a;
        return Normalizer.normalize((String) obj, Normalizer.Form.NFKC).toLowerCase(locale).matches(str);
    }
}
