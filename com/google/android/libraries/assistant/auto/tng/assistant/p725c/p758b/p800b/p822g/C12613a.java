package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12113b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.g.a */
/* compiled from: PG */
public final class C12613a extends C12625d {

    /* renamed from: a */
    public final C12113b f39585a;

    public C12613a(C12113b bVar) {
        this.f39585a = bVar;
    }

    /* renamed from: a */
    public final C12113b mo20682a() {
        return this.f39585a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12625d) {
            return this.f39585a.equals(((C12625d) obj).mo20682a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f39585a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f39585a.toString();
        return "TranscriptionInteractionParams{audioListeningSessionConfig=" + obj + "}";
    }
}
