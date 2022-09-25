package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12093d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12180f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b */
/* compiled from: PG */
final class C12716b extends C12861e {

    /* renamed from: a */
    private final C12093d f39808a;

    /* renamed from: b */
    private final C12180f f39809b;

    /* renamed from: c */
    private final C12991i f39810c;

    /* renamed from: d */
    private final Optional f39811d;

    public C12716b(C12093d dVar, C12180f fVar, C12991i iVar, Optional optional) {
        this.f39808a = dVar;
        this.f39809b = fVar;
        this.f39810c = iVar;
        this.f39811d = optional;
    }

    /* renamed from: a */
    public final C12093d mo20757a() {
        return this.f39808a;
    }

    /* renamed from: b */
    public final C12180f mo20758b() {
        return this.f39809b;
    }

    /* renamed from: c */
    public final C12991i mo20759c() {
        return this.f39810c;
    }

    /* renamed from: d */
    public final Optional mo20760d() {
        return this.f39811d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12861e) {
            C12861e eVar = (C12861e) obj;
            return this.f39808a.equals(eVar.mo20757a()) && this.f39809b.equals(eVar.mo20758b()) && this.f39810c.equals(eVar.mo20759c()) && this.f39811d.equals(eVar.mo20760d());
        }
    }

    public final int hashCode() {
        return ((((((this.f39808a.hashCode() ^ 1000003) * 1000003) ^ this.f39809b.hashCode()) * 1000003) ^ this.f39810c.hashCode()) * 1000003) ^ this.f39811d.hashCode();
    }

    public final String toString() {
        String obj = this.f39808a.toString();
        String obj2 = this.f39809b.toString();
        String obj3 = this.f39810c.toString();
        String valueOf = String.valueOf(this.f39811d);
        return "ConversationDeltaRendererInput{audioClient=" + obj + ", conversationDeltaResponse=" + obj2 + ", assistantRequestConfig=" + obj3 + ", unifiedAssistantRequestConfig=" + valueOf + "}";
    }
}
