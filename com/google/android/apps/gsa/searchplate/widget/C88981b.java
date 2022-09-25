package com.google.android.apps.gsa.searchplate.widget;

import android.util.Property;

/* renamed from: com.google.android.apps.gsa.searchplate.widget.b */
/* compiled from: PG */
final class C88981b extends Property {

    /* renamed from: a */
    final /* synthetic */ StreamingTextView f241140a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88981b(StreamingTextView streamingTextView, Class cls) {
        super(cls, "mAlphaSpanProperty");
        this.f241140a = streamingTextView;
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((C88982c) obj).f241141a);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((C88982c) obj).f241141a = ((Integer) obj2).intValue();
        this.f241140a.invalidate();
    }
}
