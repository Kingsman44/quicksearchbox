package com.google.android.libraries.assistant.slices;

import androidx.slice.SliceItem;
import java.util.Arrays;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.slices.b */
/* compiled from: PG */
public final /* synthetic */ class C19226b implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C19226b f53830a = new C19226b();

    private /* synthetic */ C19226b() {
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
        return sliceItem.f13092b.equals("text") && Arrays.asList(sliceItem.f13091a).contains("title");
    }
}
