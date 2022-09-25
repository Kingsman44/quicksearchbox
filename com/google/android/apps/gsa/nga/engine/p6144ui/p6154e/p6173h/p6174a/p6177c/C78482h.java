package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80751dz;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.h */
/* compiled from: PG */
final class C78482h extends C78483i {

    /* renamed from: a */
    private final C80751dz f216142a;

    public C78482h(C80751dz dzVar) {
        this.f216142a = dzVar;
    }

    /* renamed from: b */
    public final int mo73377b() {
        return 2;
    }

    /* renamed from: c */
    public final C80751dz mo73378c() {
        return this.f216142a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78449dr) {
            C78449dr drVar = (C78449dr) obj;
            if (drVar.mo73377b() != 2 || !this.f216142a.equals(drVar.mo73378c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216142a.hashCode();
    }

    public final String toString() {
        String obj = this.f216142a.toString();
        return "PostExecutionStageInput{legalNotice=" + obj + "}";
    }
}
