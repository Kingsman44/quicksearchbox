package com.google.android.libraries.p3329t.p3330a;

import android.content.ComponentName;
import android.content.Context;
import android.os.UserHandle;
import org.p5633c.p5634a.C72290n;

/* renamed from: com.google.android.libraries.t.a.a */
/* compiled from: PG */
public final class C43172a extends C43177f {

    /* renamed from: a */
    private final int f112872a = 1;

    /* renamed from: b */
    private final Context f112873b;

    /* renamed from: c */
    private final String f112874c;

    /* renamed from: d */
    private final ComponentName f112875d;

    /* renamed from: e */
    private final C72290n f112876e;

    /* renamed from: f */
    private final UserHandle f112877f;

    public C43172a(int i, Context context, String str, ComponentName componentName, C72290n nVar, UserHandle userHandle) {
        this.f112873b = context;
        this.f112874c = "IOfflineExternalSearch";
        this.f112875d = componentName;
        this.f112876e = nVar;
        this.f112877f = userHandle;
    }

    /* renamed from: a */
    public final int mo46226a() {
        return 1;
    }

    /* renamed from: b */
    public final ComponentName mo46227b() {
        return this.f112875d;
    }

    /* renamed from: c */
    public final Context mo46228c() {
        return this.f112873b;
    }

    /* renamed from: d */
    public final UserHandle mo46229d() {
        return this.f112877f;
    }

    /* renamed from: e */
    public final String mo46230e() {
        return this.f112874c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43177f) {
            C43177f fVar = (C43177f) obj;
            return fVar.mo46226a() == 1 && this.f112873b.equals(fVar.mo46228c()) && this.f112874c.equals(fVar.mo46230e()) && this.f112875d.equals(fVar.mo46227b()) && this.f112876e.equals(fVar.mo46232f()) && this.f112877f.equals(fVar.mo46229d());
        }
    }

    /* renamed from: f */
    public final C72290n mo46232f() {
        return this.f112876e;
    }

    public final int hashCode() {
        return ((((((((this.f112873b.hashCode() ^ -722379962) * 1000003) ^ this.f112874c.hashCode()) * 1000003) ^ this.f112875d.hashCode()) * 1000003) ^ this.f112876e.hashCode()) * 1000003) ^ this.f112877f.hashCode();
    }

    public final String toString() {
        String obj = this.f112873b.toString();
        String str = this.f112874c;
        String obj2 = this.f112875d.toString();
        String obj3 = this.f112876e.toString();
        String obj4 = this.f112877f.toString();
        return "BindingSpec{flags=1, contextToBind=" + obj + ", action=" + str + ", targetComponentName=" + obj2 + ", rebindDelay=" + obj3 + ", bindAsUser=" + obj4 + "}";
    }
}
