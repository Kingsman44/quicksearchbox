package com.google.android.apps.search.assistant.verticals.ambient.trigger;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.a */
/* compiled from: PG */
public final class C131687a extends C131701c {

    /* renamed from: a */
    public final MessageLite f359794a;

    /* renamed from: b */
    public final long f359795b;

    public C131687a(MessageLite messageLite, long j) {
        if (messageLite != null) {
            this.f359794a = messageLite;
            this.f359795b = j;
            return;
        }
        throw new NullPointerException("Null event");
    }

    /* renamed from: a */
    public final long mo110259a() {
        return this.f359795b;
    }

    /* renamed from: b */
    public final MessageLite mo110260b() {
        return this.f359794a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131701c) {
            C131701c cVar = (C131701c) obj;
            return this.f359794a.equals(cVar.mo110260b()) && this.f359795b == cVar.mo110259a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f359794a.hashCode();
        long j = this.f359795b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f359794a.toString();
        long j = this.f359795b;
        return "AnnotatedEvent{event=" + obj + ", runId=" + j + "}";
    }
}
