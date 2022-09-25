package com.google.android.libraries.assistant.auto.jumpboost.p649a.p655e;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.e.c */
/* compiled from: PG */
final class C11436c extends C11435b {

    /* renamed from: a */
    private final C89849ae f37209a;

    /* renamed from: b */
    private final Optional f37210b;

    /* renamed from: c */
    private final Optional f37211c;

    /* renamed from: d */
    private final int f37212d;

    public C11436c(int i, C89849ae aeVar, Optional optional, Optional optional2) {
        if (i != 0) {
            this.f37212d = i;
            if (aeVar != null) {
                this.f37209a = aeVar;
                if (optional != null) {
                    this.f37210b = optional;
                    if (optional2 != null) {
                        this.f37211c = optional2;
                        return;
                    }
                    throw new NullPointerException("Null appflowEventTagOptional");
                }
                throw new NullPointerException("Null gsaAppFlowEventMetadataOptional");
            }
            throw new NullPointerException("Null flowEvent");
        }
        throw new NullPointerException("Null flowEventType");
    }

    /* renamed from: a */
    public final C89849ae mo19967a() {
        return this.f37209a;
    }

    /* renamed from: b */
    public final Optional mo19968b() {
        return this.f37211c;
    }

    /* renamed from: c */
    public final Optional mo19969c() {
        return this.f37210b;
    }

    /* renamed from: d */
    public final int mo19970d() {
        return this.f37212d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11435b) {
            C11435b bVar = (C11435b) obj;
            return this.f37212d == bVar.mo19970d() && this.f37209a.equals(bVar.mo19967a()) && this.f37210b.equals(bVar.mo19969c()) && this.f37211c.equals(bVar.mo19968b());
        }
    }

    public final int hashCode() {
        return ((((((this.f37212d ^ 1000003) * 1000003) ^ this.f37209a.hashCode()) * 1000003) ^ this.f37210b.hashCode()) * 1000003) ^ this.f37211c.hashCode();
    }

    public final String toString() {
        int i = this.f37212d;
        String num = Integer.toString(this.f37209a.f245884YW);
        String obj = this.f37210b.toString();
        String obj2 = this.f37211c.toString();
        return "AgsaClassicAppFlowEvent{flowEventType=" + C11434a.m27121a(i) + ", flowEvent=" + num + ", gsaAppFlowEventMetadataOptional=" + obj + ", appflowEventTagOptional=" + obj2 + "}";
    }
}
