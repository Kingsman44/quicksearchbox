package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80391d;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.ao */
/* compiled from: PG */
public final class C78042ao extends C78043ap {

    /* renamed from: a */
    public final C80391d f214992a;

    /* renamed from: b */
    public final Runnable f214993b;

    /* renamed from: c */
    public final Runnable f214994c;

    public C78042ao(C80391d dVar, Runnable runnable, Runnable runnable2) {
        this.f214992a = dVar;
        this.f214993b = runnable;
        this.f214994c = runnable2;
    }

    /* renamed from: a */
    public final C80391d mo73027a() {
        return this.f214992a;
    }

    /* renamed from: b */
    public final Runnable mo73028b() {
        return this.f214994c;
    }

    /* renamed from: c */
    public final Runnable mo73029c() {
        return this.f214993b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78043ap) {
            C78043ap apVar = (C78043ap) obj;
            return this.f214992a.equals(apVar.mo73027a()) && this.f214993b.equals(apVar.mo73029c()) && this.f214994c.equals(apVar.mo73028b());
        }
    }

    public final int hashCode() {
        return ((((this.f214992a.hashCode() ^ 1000003) * 1000003) ^ this.f214993b.hashCode()) * 1000003) ^ this.f214994c.hashCode();
    }

    public final String toString() {
        String obj = this.f214992a.toString();
        String obj2 = this.f214993b.toString();
        String obj3 = this.f214994c.toString();
        return "ConfirmCancelActionData{data=" + obj + ", onConfirm=" + obj2 + ", onCancel=" + obj3 + "}";
    }
}
