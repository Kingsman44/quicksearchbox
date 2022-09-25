package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.widgets;

import android.util.Property;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.widgets.c */
/* compiled from: PG */
final class C16831c extends Property {

    /* renamed from: a */
    final /* synthetic */ StreamingTextView f49291a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16831c(StreamingTextView streamingTextView, Class cls) {
        super(cls, "mAlphaSpanProperty");
        this.f49291a = streamingTextView;
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((C16832d) obj).f49292a);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((C16832d) obj).f49292a = ((Integer) obj2).intValue();
        this.f49291a.invalidate();
    }
}
