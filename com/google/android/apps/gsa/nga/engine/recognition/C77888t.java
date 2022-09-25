package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.b.c.j;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.t */
/* compiled from: PG */
final class C77888t extends C77570aw {

    /* renamed from: a */
    private final String f214577a;

    /* renamed from: b */
    private final Instant f214578b;

    /* renamed from: c */
    private final boolean f214579c;

    /* renamed from: d */
    private final j f214580d;

    /* renamed from: e */
    private final C77563ap f214581e;

    public C77888t(String str, Instant instant, boolean z, j jVar, C77563ap apVar) {
        this.f214577a = str;
        this.f214578b = instant;
        this.f214579c = z;
        this.f214580d = jVar;
        this.f214581e = apVar;
    }

    /* renamed from: a */
    public final j mo72704a() {
        return this.f214580d;
    }

    /* renamed from: b */
    public final C77563ap mo72705b() {
        return this.f214581e;
    }

    /* renamed from: c */
    public final Instant mo72706c() {
        return this.f214578b;
    }

    /* renamed from: d */
    public final String mo72707d() {
        return this.f214577a;
    }

    /* renamed from: e */
    public final boolean mo72708e() {
        return this.f214579c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77570aw) {
            C77570aw awVar = (C77570aw) obj;
            return this.f214577a.equals(awVar.mo72707d()) && this.f214578b.equals(awVar.mo72706c()) && this.f214579c == awVar.mo72708e() && this.f214580d.equals(awVar.mo72704a()) && this.f214581e.equals(awVar.mo72705b());
        }
    }

    public final int hashCode() {
        return ((((((((this.f214577a.hashCode() ^ 1000003) * 1000003) ^ this.f214578b.hashCode()) * 1000003) ^ (true != this.f214579c ? 1237 : 1231)) * 1000003) ^ this.f214580d.hashCode()) * 1000003) ^ this.f214581e.hashCode();
    }

    public final String toString() {
        String str = this.f214577a;
        String obj = this.f214578b.toString();
        boolean z = this.f214579c;
        String obj2 = this.f214580d.toString();
        String obj3 = this.f214581e.toString();
        return "TranscriptResult{transcript=" + str + ", instant=" + obj + ", initial=" + z + ", candidateIdentifier=" + obj2 + ", speakerInfo=" + obj3 + "}";
    }
}
