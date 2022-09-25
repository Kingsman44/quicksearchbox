package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c;

import android.content.Context;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147479b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10994b.C147490a;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.libraries.af.a.b.c.a */
/* compiled from: PG */
public final class C147491a extends C147543q {

    /* renamed from: a */
    public final Context f398107a;

    /* renamed from: b */
    public final String f398108b = "assistant_jit_udc";

    /* renamed from: c */
    public final C21370a f398109c;

    /* renamed from: d */
    public final C147490a f398110d;

    /* renamed from: e */
    public final C147479b f398111e;

    /* renamed from: f */
    private final C147542p f398112f;

    public C147491a(Context context, String str, C21370a aVar, C147479b bVar, C147542p pVar, C147490a aVar2) {
        this.f398107a = context;
        this.f398109c = aVar;
        this.f398111e = bVar;
        this.f398112f = pVar;
        this.f398110d = aVar2;
    }

    /* renamed from: a */
    public final Context mo124245a() {
        return this.f398107a;
    }

    /* renamed from: b */
    public final C21370a mo124246b() {
        return this.f398109c;
    }

    /* renamed from: c */
    public final C147490a mo124247c() {
        return this.f398110d;
    }

    /* renamed from: d */
    public final String mo124248d() {
        return this.f398108b;
    }

    /* renamed from: e */
    public final C147479b mo124249e() {
        return this.f398111e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147543q) {
            C147543q qVar = (C147543q) obj;
            return this.f398107a.equals(qVar.mo124245a()) && this.f398108b.equals(qVar.mo124248d()) && this.f398109c.equals(qVar.mo124246b()) && this.f398111e.equals(qVar.mo124249e()) && this.f398112f.equals(qVar.mo124251f()) && this.f398110d.equals(qVar.mo124247c());
        }
    }

    /* renamed from: f */
    public final C147542p mo124251f() {
        return this.f398112f;
    }

    public final int hashCode() {
        return ((((((((((this.f398107a.hashCode() ^ 1000003) * 1000003) ^ this.f398108b.hashCode()) * 1000003) ^ this.f398109c.hashCode()) * 1000003) ^ this.f398111e.hashCode()) * 1000003) ^ this.f398112f.hashCode()) * 1000003) ^ this.f398110d.hashCode();
    }

    public final String toString() {
        String obj = this.f398107a.toString();
        String str = this.f398108b;
        String obj2 = this.f398109c.toString();
        String obj3 = this.f398111e.toString();
        String obj4 = this.f398112f.toString();
        String obj5 = this.f398110d.toString();
        return "Deps{context=" + obj + ", instanceId=" + str + ", clock=" + obj2 + ", loggerFactory=" + obj3 + ", facsClientFactory=" + obj4 + ", flags=" + obj5 + "}";
    }
}
