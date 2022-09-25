package com.google.android.libraries.assistant.slices;

import androidx.slice.SliceItem;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.slices.c */
/* compiled from: PG */
public final /* synthetic */ class C19227c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C19227c f53831a = new C19227c();

    private /* synthetic */ C19227c() {
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
        SliceItem sliceItem = (SliceItem) obj;
        if (!sliceItem.f13092b.equals("action")) {
            return false;
        }
        if ("time_picker".equals(sliceItem.f13093c) || "date_picker".equals(sliceItem.f13093c)) {
            return true;
        }
        return false;
    }
}
