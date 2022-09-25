package com.google.android.apps.search.assistant.platform.ondevice.p9257a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.a */
/* compiled from: PG */
public final class C122091a extends C122107b {

    /* renamed from: a */
    private final C122106o f338727a;

    /* renamed from: b */
    private final String f338728b;

    public C122091a(C122106o oVar, String str) {
        if (oVar != null) {
            this.f338727a = oVar;
            if (str != null) {
                this.f338728b = str;
                return;
            }
            throw new NullPointerException("Null message");
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final C122106o mo105527a() {
        return this.f338727a;
    }

    /* renamed from: b */
    public final String mo105528b() {
        return this.f338728b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122107b) {
            C122107b bVar = (C122107b) obj;
            return this.f338727a.equals(bVar.mo105527a()) && this.f338728b.equals(bVar.mo105528b());
        }
    }

    public final int hashCode() {
        return ((this.f338727a.hashCode() ^ 1000003) * 1000003) ^ this.f338728b.hashCode();
    }

    public final String toString() {
        String obj = this.f338727a.toString();
        String str = this.f338728b;
        return "FailedContextData{key=" + obj + ", message=" + str + "}";
    }
}
