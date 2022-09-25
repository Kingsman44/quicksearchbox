package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78276a;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.j */
/* compiled from: PG */
final class C78484j extends C78378ba {

    /* renamed from: a */
    public final boolean f216143a;

    /* renamed from: b */
    public final boolean f216144b;

    /* renamed from: c */
    public final C78276a f216145c;

    public C78484j(boolean z, boolean z2, C78276a aVar) {
        this.f216143a = z;
        this.f216144b = z2;
        if (aVar != null) {
            this.f216145c = aVar;
            return;
        }
        throw new NullPointerException("Null afterExecutionChips");
    }

    /* renamed from: a */
    public final C78276a mo73314a() {
        return this.f216145c;
    }

    /* renamed from: b */
    public final boolean mo73315b() {
        return this.f216144b;
    }

    /* renamed from: c */
    public final boolean mo73316c() {
        return this.f216143a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78378ba) {
            C78378ba baVar = (C78378ba) obj;
            return this.f216143a == baVar.mo73316c() && this.f216144b == baVar.mo73315b() && this.f216145c.equals(baVar.mo73314a());
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.f216143a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.f216144b) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.f216145c.hashCode();
    }

    public final String toString() {
        boolean z = this.f216143a;
        boolean z2 = this.f216144b;
        String obj = this.f216145c.toString();
        return "AfterExecutionResponse{shouldShowLegalNotice=" + z + ", appShortcutContentPresent=" + z2 + ", afterExecutionChips=" + obj + "}";
    }
}
