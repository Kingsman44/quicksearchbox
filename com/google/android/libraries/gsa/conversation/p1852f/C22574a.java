package com.google.android.libraries.gsa.conversation.p1852f;

/* renamed from: com.google.android.libraries.gsa.conversation.f.a */
/* compiled from: PG */
public final class C22574a extends C22583j {

    /* renamed from: a */
    private String f62210a;

    /* renamed from: a */
    public final C22584k mo27665a() {
        String str = this.f62210a;
        if (str != null) {
            return new C22575b(str);
        }
        throw new IllegalStateException("Missing required properties: responseEventId");
    }

    /* renamed from: b */
    public final void mo27666b(String str) {
        if (str != null) {
            this.f62210a = str;
            return;
        }
        throw new NullPointerException("Null responseEventId");
    }
}
