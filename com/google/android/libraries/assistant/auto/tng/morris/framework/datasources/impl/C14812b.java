package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.b */
/* compiled from: PG */
final class C14812b extends C14855cp {

    /* renamed from: a */
    private final String f44612a;

    /* renamed from: b */
    private final C60870cx f44613b;

    public C14812b(String str, C60870cx cxVar) {
        if (str != null) {
            this.f44612a = str;
            this.f44613b = cxVar;
            return;
        }
        throw new NullPointerException("Null requestingComponent");
    }

    /* renamed from: a */
    public final C60870cx mo21750a() {
        return this.f44613b;
    }

    /* renamed from: b */
    public final String mo21751b() {
        return this.f44612a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14855cp) {
            C14855cp cpVar = (C14855cp) obj;
            return this.f44612a.equals(cpVar.mo21751b()) && this.f44613b.equals(cpVar.mo21750a());
        }
    }

    public final int hashCode() {
        return ((this.f44612a.hashCode() ^ 1000003) * 1000003) ^ this.f44613b.hashCode();
    }

    public final String toString() {
        String str = this.f44612a;
        String obj = this.f44613b.toString();
        return "FetchMediaItemsDataRequestingComponentAndFuture{requestingComponent=" + str + ", fetchMediaItemsDataFuture=" + obj + "}";
    }
}
