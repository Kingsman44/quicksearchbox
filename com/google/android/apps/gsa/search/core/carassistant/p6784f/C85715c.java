package com.google.android.apps.gsa.search.core.carassistant.p6784f;

import com.google.android.apps.gsa.search.shared.actions.ActionData;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.f.c */
/* compiled from: PG */
final class C85715c extends C85717e {

    /* renamed from: a */
    private final ActionData f231784a;

    public C85715c(ActionData actionData) {
        this.f231784a = actionData;
    }

    /* renamed from: a */
    public final ActionData mo79365a() {
        return this.f231784a;
    }

    /* renamed from: b */
    public final int mo79366b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C85721i) {
            C85721i iVar = (C85721i) obj;
            if (iVar.mo79366b() != 1 || !this.f231784a.equals(iVar.mo79365a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f231784a.hashCode();
    }

    public final String toString() {
        String obj = this.f231784a.toString();
        return "FulfillmentOutput{actionData=" + obj + "}";
    }
}
