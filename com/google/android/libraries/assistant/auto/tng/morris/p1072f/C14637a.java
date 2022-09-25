package com.google.android.libraries.assistant.auto.tng.morris.p1072f;

import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.f.a */
/* compiled from: PG */
public final class C14637a extends C14644c {

    /* renamed from: a */
    public final C51474ja f44236a;

    public C14637a(C51474ja jaVar) {
        if (jaVar != null) {
            this.f44236a = jaVar;
            return;
        }
        throw new NullPointerException("Null source");
    }

    /* renamed from: a */
    public final C51474ja mo21564a() {
        return this.f44236a;
    }

    /* renamed from: b */
    public final String mo21565b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14644c) {
            C14644c cVar = (C14644c) obj;
            return this.f44236a.equals(cVar.mo21564a()) && cVar.mo21565b() == null;
        }
    }

    public final int hashCode() {
        return (this.f44236a.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        String num = Integer.toString(this.f44236a.f134124v);
        return "MorrisEventTrigger{source=" + num + ", btDeviceAddress=null}";
    }
}
