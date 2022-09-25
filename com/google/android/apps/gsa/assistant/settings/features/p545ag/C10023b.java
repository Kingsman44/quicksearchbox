package com.google.android.apps.gsa.assistant.settings.features.p545ag;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.b */
/* compiled from: PG */
final class C10023b extends C10056v {

    /* renamed from: a */
    private final C10008ag f34228a;

    /* renamed from: b */
    private final int f34229b;

    public C10023b(C10008ag agVar, int i) {
        this.f34228a = agVar;
        this.f34229b = i;
    }

    /* renamed from: a */
    public final C10008ag mo18189a() {
        return this.f34228a;
    }

    /* renamed from: b */
    public final int mo18190b() {
        return this.f34229b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10056v) {
            C10056v vVar = (C10056v) obj;
            return this.f34228a.equals(vVar.mo18189a()) && this.f34229b == vVar.mo18190b();
        }
    }

    public final int hashCode() {
        return ((this.f34228a.hashCode() ^ 1000003) * 1000003) ^ this.f34229b;
    }

    public final String toString() {
        String obj = this.f34228a.toString();
        int i = this.f34229b;
        String str = i != 1 ? i != 2 ? "POSITIVE" : "NEGATIVE" : "CANCEL";
        return "WarmActionsSettingsCallsOptInDialogClosedEvent{params=" + obj + ", closeMethod=" + str + "}";
    }
}
