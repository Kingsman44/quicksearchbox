package com.google.android.apps.gsa.shared.speech.dumper;

/* compiled from: PG */
final class AutoValue_EventForDump extends EventForDump {

    /* renamed from: a */
    private final String f253118a;

    /* renamed from: b */
    private final int f253119b;

    public AutoValue_EventForDump(int i, String str) {
        this.f253119b = i;
        this.f253118a = str;
    }

    /* renamed from: a */
    public final String mo84652a() {
        return this.f253118a;
    }

    /* renamed from: b */
    public final int mo84653b() {
        return this.f253119b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EventForDump) {
            EventForDump eventForDump = (EventForDump) obj;
            return this.f253119b == eventForDump.mo84653b() && this.f253118a.equals(eventForDump.mo84652a());
        }
    }

    public final int hashCode() {
        return ((this.f253119b ^ 1000003) * 1000003) ^ this.f253118a.hashCode();
    }

    public final String toString() {
        int i = this.f253119b;
        String str = this.f253118a;
        return "EventForDump{caller=" + C90551d.m147694a(i) + ", tag=" + str + "}";
    }
}
