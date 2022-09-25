package com.google.android.apps.gsa.assistant.settings.features.appactions;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bb */
/* compiled from: PG */
final class C10226bb extends C10416n {

    /* renamed from: a */
    private final String f34703a;

    public C10226bb(String str) {
        if (str != null) {
            this.f34703a = str;
            return;
        }
        throw new NullPointerException("Null appPackageName");
    }

    /* renamed from: a */
    public final String mo18356a() {
        return this.f34703a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10416n) {
            return this.f34703a.equals(((C10416n) obj).mo18356a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f34703a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f34703a;
        return "AppIntegrationsLinkClickEvent{appPackageName=" + str + "}";
    }
}
