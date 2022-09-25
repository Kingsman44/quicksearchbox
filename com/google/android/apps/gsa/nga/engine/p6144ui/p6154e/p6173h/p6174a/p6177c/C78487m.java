package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.m */
/* compiled from: PG */
final class C78487m extends C78385bh {

    /* renamed from: a */
    public final C78540aw f216150a;

    public C78487m(C78540aw awVar) {
        if (awVar != null) {
            this.f216150a = awVar;
            return;
        }
        throw new NullPointerException("Null inputPlateStagesContent");
    }

    /* renamed from: a */
    public final C78540aw mo73335a() {
        return this.f216150a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78385bh) {
            return this.f216150a.equals(((C78385bh) obj).mo73335a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f216150a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f216150a.toString();
        return "GoneStageInput{inputPlateStagesContent=" + obj + "}";
    }
}
