package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.assistant.p3861at.C49826ak;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.ax */
/* compiled from: PG */
final class C10337ax extends C10342bb {

    /* renamed from: a */
    private final long f35019a;

    /* renamed from: b */
    private final C49826ak f35020b;

    public C10337ax(long j, C49826ak akVar) {
        this.f35019a = j;
        if (akVar != null) {
            this.f35020b = akVar;
            return;
        }
        throw new NullPointerException("Null appShortcutUi");
    }

    /* renamed from: a */
    public final long mo18442a() {
        return this.f35019a;
    }

    /* renamed from: b */
    public final C49826ak mo18443b() {
        return this.f35020b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10342bb) {
            C10342bb bbVar = (C10342bb) obj;
            return this.f35019a == bbVar.mo18442a() && this.f35020b.equals(bbVar.mo18443b());
        }
    }

    public final int hashCode() {
        long j = this.f35019a;
        return this.f35020b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f35019a;
        String obj = this.f35020b.toString();
        return "ShortcutEntry{shortcutId=" + j + ", appShortcutUi=" + obj + "}";
    }
}
