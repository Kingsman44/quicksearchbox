package com.google.android.libraries.assistant.assistantactions.p633d;

/* renamed from: com.google.android.libraries.assistant.assistantactions.d.b */
/* compiled from: PG */
final class C11261b extends C11269f {

    /* renamed from: a */
    private final boolean f36687a;

    /* renamed from: b */
    private final String f36688b;

    /* renamed from: c */
    private final int f36689c;

    public C11261b(int i, boolean z, String str) {
        this.f36689c = i;
        this.f36687a = z;
        this.f36688b = str;
    }

    /* renamed from: a */
    public final String mo19679a() {
        return this.f36688b;
    }

    /* renamed from: b */
    public final boolean mo19680b() {
        return this.f36687a;
    }

    /* renamed from: c */
    public final int mo19681c() {
        return this.f36689c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11269f) {
            C11269f fVar = (C11269f) obj;
            return this.f36689c == fVar.mo19681c() && this.f36687a == fVar.mo19680b() && this.f36688b.equals(fVar.mo19679a());
        }
    }

    public final int hashCode() {
        return ((((this.f36689c ^ 1000003) * 1000003) ^ (true != this.f36687a ? 1237 : 1231)) * 1000003) ^ this.f36688b.hashCode();
    }

    public final String toString() {
        int i = this.f36689c;
        boolean z = this.f36687a;
        String str = this.f36688b;
        return "TaskCompletionData{action=" + C11267d.m26748a(i) + ", isNga=" + z + ", clientOpName=" + str + "}";
    }
}
