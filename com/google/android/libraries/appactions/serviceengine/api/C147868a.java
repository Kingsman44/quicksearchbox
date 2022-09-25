package com.google.android.libraries.appactions.serviceengine.api;

import com.google.assistant.p3897e.p3921j.C52235kf;

/* renamed from: com.google.android.libraries.appactions.serviceengine.api.a */
/* compiled from: PG */
public final class C147868a extends C147873f {

    /* renamed from: a */
    private final C52235kf f398896a;

    public C147868a(C52235kf kfVar) {
        if (kfVar != null) {
            this.f398896a = kfVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: a */
    public final C52235kf mo124529a() {
        return this.f398896a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147873f) {
            return this.f398896a.equals(((C147873f) obj).mo124529a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f398896a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String num = Integer.toString(this.f398896a.f137088t);
        return "ExecutionResultAccessor{status=" + num + "}";
    }
}
