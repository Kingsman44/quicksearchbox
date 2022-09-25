package com.google.android.libraries.search.assistant.p2828y.p2858q;

import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.assistant.p3897e.p3917i.p3918a.C51535lh;

/* renamed from: com.google.android.libraries.search.assistant.y.q.a */
/* compiled from: PG */
public final class C37059a extends C37060b {

    /* renamed from: a */
    public final C51535lh f96547a;

    /* renamed from: b */
    public final C51209d f96548b;

    public C37059a(C51535lh lhVar, C51209d dVar) {
        this.f96547a = lhVar;
        this.f96548b = dVar;
    }

    /* renamed from: a */
    public final C51209d mo40597a() {
        return this.f96548b;
    }

    /* renamed from: b */
    public final C51535lh mo40598b() {
        return this.f96547a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37060b) {
            C37060b bVar = (C37060b) obj;
            return this.f96547a.equals(bVar.mo40598b()) && this.f96548b.equals(bVar.mo40597a());
        }
    }

    public final int hashCode() {
        return ((this.f96547a.hashCode() ^ 1000003) * 1000003) ^ this.f96548b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f96547a.f134315r);
        String num2 = Integer.toString(this.f96548b.f133323n);
        return "RequestLoggingParamsConfiguration{requestReason=" + num + ", requestSourceType=" + num2 + "}";
    }
}
