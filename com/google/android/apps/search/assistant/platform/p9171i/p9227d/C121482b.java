package com.google.android.apps.search.assistant.platform.p9171i.p9227d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.platform.i.d.b */
/* compiled from: PG */
final class C121482b extends C121489d {

    /* renamed from: a */
    private final C58485gu f337157a;

    public C121482b(C58485gu guVar) {
        this.f337157a = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo105177a() {
        return this.f337157a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121489d) {
            return C58597ky.m90218i(this.f337157a, ((C121489d) obj).mo105177a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f337157a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f337157a.toString();
        return "TapasSuggestionResponse{suggestions=" + obj + "}";
    }
}
