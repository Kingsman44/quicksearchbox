package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p839f;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12865i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.f.b */
/* compiled from: PG */
final class C12763b extends C12770d {

    /* renamed from: a */
    private final C12093d f39919a;

    /* renamed from: b */
    private final C12865i f39920b;

    /* renamed from: c */
    private final C12991i f39921c;

    /* renamed from: d */
    private final Optional f39922d;

    public C12763b(C12093d dVar, C12865i iVar, C12991i iVar2, Optional optional) {
        this.f39919a = dVar;
        this.f39920b = iVar;
        this.f39921c = iVar2;
        this.f39922d = optional;
    }

    /* renamed from: a */
    public final C12093d mo20779a() {
        return this.f39919a;
    }

    /* renamed from: b */
    public final C12865i mo20780b() {
        return this.f39920b;
    }

    /* renamed from: c */
    public final C12991i mo20781c() {
        return this.f39921c;
    }

    /* renamed from: d */
    public final Optional mo20782d() {
        return this.f39922d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12770d) {
            C12770d dVar = (C12770d) obj;
            return this.f39919a.equals(dVar.mo20779a()) && this.f39920b.equals(dVar.mo20780b()) && this.f39921c.equals(dVar.mo20781c()) && this.f39922d.equals(dVar.mo20782d());
        }
    }

    public final int hashCode() {
        return ((((((this.f39919a.hashCode() ^ 1000003) * 1000003) ^ this.f39920b.hashCode()) * 1000003) ^ this.f39921c.hashCode()) * 1000003) ^ this.f39922d.hashCode();
    }

    public final String toString() {
        String obj = this.f39919a.toString();
        String obj2 = this.f39920b.toString();
        String obj3 = this.f39921c.toString();
        String valueOf = String.valueOf(this.f39922d);
        return "PerformerFetcherConfig{audioClient=" + obj + ", conversationDeltaStateUpdater=" + obj2 + ", assistantRequestConfig=" + obj3 + ", unifiedAssistantRequestConfig=" + valueOf + "}";
    }
}
