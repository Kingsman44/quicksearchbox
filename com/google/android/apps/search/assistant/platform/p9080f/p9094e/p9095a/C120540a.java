package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9095a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33457k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.platform.f.e.a.a */
/* compiled from: PG */
public final class C120540a extends C120541b {

    /* renamed from: a */
    private final C58485gu f335214a;

    /* renamed from: b */
    private final C58485gu f335215b;

    /* renamed from: c */
    private final C33457k f335216c;

    public C120540a(C58485gu guVar, C58485gu guVar2, C33457k kVar) {
        if (guVar != null) {
            this.f335214a = guVar;
            if (guVar2 != null) {
                this.f335215b = guVar2;
                if (kVar != null) {
                    this.f335216c = kVar;
                    return;
                }
                throw new NullPointerException("Null utteranceProcessingDetails");
            }
            throw new NullPointerException("Null ignoredInteractions");
        }
        throw new NullPointerException("Null interactions");
    }

    /* renamed from: a */
    public final C33457k mo104815a() {
        return this.f335216c;
    }

    /* renamed from: b */
    public final C58485gu mo104816b() {
        return this.f335215b;
    }

    /* renamed from: c */
    public final C58485gu mo104817c() {
        return this.f335214a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C120541b) {
            C120541b bVar = (C120541b) obj;
            return C58597ky.m90218i(this.f335214a, bVar.mo104817c()) && C58597ky.m90218i(this.f335215b, bVar.mo104816b()) && this.f335216c.equals(bVar.mo104815a());
        }
    }

    public final int hashCode() {
        return ((((this.f335214a.hashCode() ^ 1000003) * 1000003) ^ this.f335215b.hashCode()) * 1000003) ^ this.f335216c.hashCode();
    }

    public final String toString() {
        String obj = this.f335214a.toString();
        String obj2 = this.f335215b.toString();
        String obj3 = this.f335216c.toString();
        return "ExecutionResult{interactions=" + obj + ", ignoredInteractions=" + obj2 + ", utteranceProcessingDetails=" + obj3 + "}";
    }
}
