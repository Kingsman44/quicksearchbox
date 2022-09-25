package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import com.google.assistant.p3745ab.C48273ca;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.a */
/* compiled from: PG */
final class C35491a extends C35493c {

    /* renamed from: a */
    public final C48273ca f93214a;

    /* renamed from: b */
    public final Duration f93215b;

    public C35491a(C48273ca caVar, Duration duration) {
        if (caVar != null) {
            this.f93214a = caVar;
            if (duration != null) {
                this.f93215b = duration;
                return;
            }
            throw new NullPointerException("Null logDelay");
        }
        throw new NullPointerException("Null callUsage");
    }

    /* renamed from: a */
    public final C48273ca mo39668a() {
        return this.f93214a;
    }

    /* renamed from: b */
    public final Duration mo39669b() {
        return this.f93215b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35493c) {
            C35493c cVar = (C35493c) obj;
            return this.f93214a.equals(cVar.mo39668a()) && this.f93215b.equals(cVar.mo39669b());
        }
    }

    public final int hashCode() {
        return ((this.f93214a.hashCode() ^ 1000003) * 1000003) ^ this.f93215b.hashCode();
    }

    public final String toString() {
        String obj = this.f93214a.toString();
        String obj2 = this.f93215b.toString();
        return "BucketizedCallUsage{callUsage=" + obj + ", logDelay=" + obj2 + "}";
    }
}
