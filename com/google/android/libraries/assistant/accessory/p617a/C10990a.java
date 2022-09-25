package com.google.android.libraries.assistant.accessory.p617a;

/* renamed from: com.google.android.libraries.assistant.accessory.a.a */
/* compiled from: PG */
public final class C10990a extends C10994e {

    /* renamed from: a */
    public C10993d f36134a;

    /* renamed from: b */
    private int f36135b;

    /* renamed from: c */
    private byte f36136c;

    /* renamed from: a */
    public final C10995f mo19354a() {
        C10993d dVar;
        if (this.f36136c == 1 && (dVar = this.f36134a) != null) {
            return new C10991b(dVar, this.f36135b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36134a == null) {
            sb.append(" header");
        }
        if (this.f36136c == 0) {
            sb.append(" headerResult");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo19355b(int i) {
        this.f36135b = i;
        this.f36136c = 1;
    }
}
