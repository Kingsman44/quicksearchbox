package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10401a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.a.e */
/* compiled from: PG */
public final class C137307e extends C137312j {

    /* renamed from: a */
    private final C57578av f373518a;

    public C137307e(C57578av avVar) {
        if (avVar != null) {
            this.f373518a = avVar;
            return;
        }
        throw new NullPointerException("Null listProto");
    }

    /* renamed from: a */
    public final C57578av mo113633a() {
        return this.f373518a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137312j) {
            return this.f373518a.equals(((C137312j) obj).mo113633a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f373518a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f373518a.toString();
        return "SaveConfirmationListClickedEvent{listProto=" + obj + "}";
    }
}
