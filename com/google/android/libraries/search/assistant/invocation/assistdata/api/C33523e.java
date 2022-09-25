package com.google.android.libraries.search.assistant.invocation.assistdata.api;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34820a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.api.e */
/* compiled from: PG */
public final class C33523e extends Exception implements C34820a {

    /* renamed from: a */
    private final String f89689a;

    /* renamed from: b */
    private final Throwable f89690b;

    public C33523e() {
        this((String) null, (Throwable) null);
    }

    /* renamed from: a */
    public final C34819a mo23265a() {
        return C34819a.m63580c(C33522d.f89688a, C33521c.f89685a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33523e)) {
            return false;
        }
        C33523e eVar = (C33523e) obj;
        return C69664n.m101066l(this.f89689a, eVar.f89689a) && C69664n.m101066l(this.f89690b, eVar.f89690b);
    }

    public final Throwable getCause() {
        return this.f89690b;
    }

    public final String getMessage() {
        return this.f89689a;
    }

    public final int hashCode() {
        String str = this.f89689a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.f89690b;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.f89689a;
        Throwable th = this.f89690b;
        return "ScreenshotNotAvailableException(message=" + str + ", cause=" + th + ")";
    }

    public C33523e(String str, Throwable th) {
        super(str, th);
        this.f89689a = str;
        this.f89690b = th;
    }
}
