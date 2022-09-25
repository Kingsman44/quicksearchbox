package com.google.android.apps.gsa.staticplugins.chime;

import android.text.TextUtils;
import com.google.common.base.C58833ax;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.ae */
/* compiled from: PG */
public final /* synthetic */ class C97662ae implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f272746a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f272747b;

    public /* synthetic */ C97662ae(List list, C58833ax axVar) {
        this.f272746a = list;
        this.f272747b = axVar;
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
        List list = this.f272746a;
        String str = (String) obj;
        if (TextUtils.equals(str, (CharSequence) this.f272747b.mo56111f())) {
            return false;
        }
        return Collection.EL.stream(list).anyMatch(new C97663af(str));
    }
}
