package com.google.android.libraries.assistant.assistantactions.p633d;

/* renamed from: com.google.android.libraries.assistant.assistantactions.d.a */
/* compiled from: PG */
public final class C11259a extends C11268e {

    /* renamed from: a */
    public String f36683a;

    /* renamed from: b */
    private boolean f36684b;

    /* renamed from: c */
    private byte f36685c;

    /* renamed from: d */
    private int f36686d;

    /* renamed from: a */
    public final C11269f mo19676a() {
        int i;
        String str;
        if (this.f36685c == 1 && (i = this.f36686d) != 0 && (str = this.f36683a) != null) {
            return new C11261b(i, this.f36684b, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36686d == 0) {
            sb.append(" action");
        }
        if (this.f36685c == 0) {
            sb.append(" isNga");
        }
        if (this.f36683a == null) {
            sb.append(" clientOpName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo19677b(boolean z) {
        this.f36684b = z;
        this.f36685c = 1;
    }

    /* renamed from: c */
    public final void mo19678c(int i) {
        this.f36686d = i;
    }
}
