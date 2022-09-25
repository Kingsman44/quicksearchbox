package com.google.android.apps.gsa.speech.hotword.p7285c.p7288c;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.c.b */
/* compiled from: PG */
final class C92364b extends C92367e {

    /* renamed from: a */
    private final C58833ax f257528a;

    /* renamed from: b */
    private final C58833ax f257529b;

    /* renamed from: c */
    private final C58833ax f257530c;

    /* renamed from: d */
    private final C58833ax f257531d;

    /* renamed from: e */
    private final int f257532e;

    /* renamed from: f */
    private final C92365c f257533f;

    public C92364b(C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, int i, C92365c cVar) {
        this.f257528a = axVar;
        this.f257529b = axVar2;
        this.f257530c = axVar3;
        this.f257531d = axVar4;
        this.f257532e = i;
        this.f257533f = cVar;
    }

    /* renamed from: a */
    public final int mo87009a() {
        return this.f257532e;
    }

    /* renamed from: b */
    public final C92365c mo87010b() {
        return this.f257533f;
    }

    /* renamed from: c */
    public final C58833ax mo87011c() {
        return this.f257529b;
    }

    /* renamed from: d */
    public final C58833ax mo87012d() {
        return this.f257531d;
    }

    /* renamed from: e */
    public final C58833ax mo87013e() {
        return this.f257528a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C92367e) {
            C92367e eVar = (C92367e) obj;
            return this.f257528a.equals(eVar.mo87013e()) && this.f257529b.equals(eVar.mo87011c()) && this.f257530c.equals(eVar.mo87015f()) && this.f257531d.equals(eVar.mo87012d()) && this.f257532e == eVar.mo87009a() && this.f257533f.equals(eVar.mo87010b());
        }
    }

    /* renamed from: f */
    public final C58833ax mo87015f() {
        return this.f257530c;
    }

    public final int hashCode() {
        return ((((((((((this.f257528a.hashCode() ^ 1000003) * 1000003) ^ this.f257529b.hashCode()) * 1000003) ^ this.f257530c.hashCode()) * 1000003) ^ this.f257531d.hashCode()) * 1000003) ^ this.f257532e) * 1000003) ^ this.f257533f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f257528a);
        String valueOf2 = String.valueOf(this.f257529b);
        String valueOf3 = String.valueOf(this.f257530c);
        String valueOf4 = String.valueOf(this.f257531d);
        int i = this.f257532e;
        String obj = this.f257533f.toString();
        return "CheckReadyStatusResponse{isReady=" + valueOf + ", canEnroll=" + valueOf2 + ", isRetryable=" + valueOf3 + ", errorMsg=" + valueOf4 + ", canEnrollState=" + i + ", errorCode=" + obj + "}";
    }
}
