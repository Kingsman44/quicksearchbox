package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80787fh;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.g */
/* compiled from: PG */
final class C78481g extends C78483i {

    /* renamed from: a */
    private final C80787fh f216141a;

    public C78481g(C80787fh fhVar) {
        this.f216141a = fhVar;
    }

    /* renamed from: a */
    public final C80787fh mo73376a() {
        return this.f216141a;
    }

    /* renamed from: b */
    public final int mo73377b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78449dr) {
            C78449dr drVar = (C78449dr) obj;
            if (drVar.mo73377b() != 1 || !this.f216141a.equals(drVar.mo73376a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216141a.hashCode();
    }

    public final String toString() {
        String obj = this.f216141a.toString();
        return "PostExecutionStageInput{chips=" + obj + "}";
    }
}
