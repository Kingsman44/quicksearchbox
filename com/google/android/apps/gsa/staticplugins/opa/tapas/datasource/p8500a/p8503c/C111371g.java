package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.p4129b.p4136c.C54759g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.g */
/* compiled from: PG */
final class C111371g extends C111369e {

    /* renamed from: a */
    private final C54759g f309893a;

    /* renamed from: b */
    private final C49301bt f309894b;

    /* renamed from: c */
    private final double f309895c;

    public C111371g(C54759g gVar, C49301bt btVar, double d) {
        if (gVar != null) {
            this.f309893a = gVar;
            if (btVar != null) {
                this.f309894b = btVar;
                this.f309895c = d;
                return;
            }
            throw new NullPointerException("Null onDeviceAppAction");
        }
        throw new NullPointerException("Null androidAction");
    }

    /* renamed from: a */
    public final double mo99121a() {
        return this.f309895c;
    }

    /* renamed from: b */
    public final C54759g mo99122b() {
        return this.f309893a;
    }

    /* renamed from: c */
    public final C49301bt mo99123c() {
        return this.f309894b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111369e) {
            C111369e eVar = (C111369e) obj;
            return this.f309893a.equals(eVar.mo99122b()) && this.f309894b.equals(eVar.mo99123c()) && Double.doubleToLongBits(this.f309895c) == Double.doubleToLongBits(eVar.mo99121a());
        }
    }

    public final int hashCode() {
        return ((((this.f309893a.hashCode() ^ 1000003) * 1000003) ^ this.f309894b.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f309895c) >>> 32) ^ Double.doubleToLongBits(this.f309895c)));
    }

    public final String toString() {
        String obj = this.f309893a.toString();
        String obj2 = this.f309894b.toString();
        double d = this.f309895c;
        return "MatchedAction{androidAction=" + obj + ", onDeviceAppAction=" + obj2 + ", matchScore=" + d + "}";
    }
}
