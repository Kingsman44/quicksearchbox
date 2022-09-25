package com.google.android.libraries.p11016ak.p11017a;

import com.google.common.base.C58837ba;
import java.util.regex.Pattern;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.ak.a.h */
/* compiled from: PG */
public final /* synthetic */ class C147619h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f398433a;

    public /* synthetic */ C147619h(String str) {
        this.f398433a = str;
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
        String str = this.f398433a;
        String str2 = (String) obj;
        return C58837ba.m90858g(str2).equals(str) || Pattern.matches(C58837ba.m90858g(str2), str);
    }
}
