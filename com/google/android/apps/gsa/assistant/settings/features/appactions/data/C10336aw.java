package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.aw */
/* compiled from: PG */
final class C10336aw extends C10341ba {

    /* renamed from: a */
    private final C58485gu f35018a;

    public C10336aw(C58485gu guVar) {
        if (guVar != null) {
            this.f35018a = guVar;
            return;
        }
        throw new NullPointerException("Null appSpecificPageDataList");
    }

    /* renamed from: a */
    public final C58485gu mo18438a() {
        return this.f35018a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10341ba) {
            return C58597ky.m90218i(this.f35018a, ((C10341ba) obj).mo18438a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f35018a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f35018a.toString();
        return "FullPageData{appSpecificPageDataList=" + obj + "}";
    }
}
