package com.google.android.apps.search.assistant.platform.pcp.validity;

import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3809c.C48952az;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.a */
/* compiled from: PG */
public final class C124152a extends C124169r {

    /* renamed from: a */
    public final Optional f342849a;

    /* renamed from: b */
    public final String f342850b;

    /* renamed from: c */
    public final int f342851c;

    /* renamed from: d */
    public final int f342852d;

    /* renamed from: e */
    public final C48952az f342853e;

    /* renamed from: f */
    private final boolean f342854f;

    /* renamed from: g */
    private final C48904f f342855g;

    public C124152a(Optional optional, String str, int i, int i2, C48952az azVar, boolean z, C48904f fVar) {
        if (optional != null) {
            this.f342849a = optional;
            if (str != null) {
                this.f342850b = str;
                this.f342851c = i;
                this.f342852d = i2;
                if (azVar != null) {
                    this.f342853e = azVar;
                    this.f342854f = z;
                    if (fVar != null) {
                        this.f342855g = fVar;
                        return;
                    }
                    throw new NullPointerException("Null contextTriggerPayload");
                }
                throw new NullPointerException("Null triggerCondition");
            }
            throw new NullPointerException("Null dataId");
        }
        throw new NullPointerException("Null accountId");
    }

    /* renamed from: a */
    public final int mo106298a() {
        return this.f342852d;
    }

    /* renamed from: b */
    public final int mo106299b() {
        return this.f342851c;
    }

    /* renamed from: c */
    public final C48904f mo106300c() {
        return this.f342855g;
    }

    /* renamed from: d */
    public final C48952az mo106301d() {
        return this.f342853e;
    }

    /* renamed from: e */
    public final Optional mo106302e() {
        return this.f342849a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C124169r) {
            C124169r rVar = (C124169r) obj;
            return this.f342849a.equals(rVar.mo106302e()) && this.f342850b.equals(rVar.mo106304f()) && this.f342851c == rVar.mo106299b() && this.f342852d == rVar.mo106298a() && this.f342853e.equals(rVar.mo106301d()) && this.f342854f == rVar.mo106305g() && this.f342855g.equals(rVar.mo106300c());
        }
    }

    /* renamed from: f */
    public final String mo106304f() {
        return this.f342850b;
    }

    /* renamed from: g */
    public final boolean mo106305g() {
        return this.f342854f;
    }

    public final int hashCode() {
        return ((((((((((((this.f342849a.hashCode() ^ 1000003) * 1000003) ^ this.f342850b.hashCode()) * 1000003) ^ this.f342851c) * 1000003) ^ this.f342852d) * 1000003) ^ this.f342853e.hashCode()) * 1000003) ^ (true != this.f342854f ? 1237 : 1231)) * 1000003) ^ this.f342855g.hashCode();
    }

    public final String toString() {
        String obj = this.f342849a.toString();
        String str = this.f342850b;
        int i = this.f342851c;
        int i2 = this.f342852d;
        String obj2 = this.f342853e.toString();
        boolean z = this.f342854f;
        String obj3 = this.f342855g.toString();
        return "ValidityEntity{accountId=" + obj + ", dataId=" + str + ", dataType=" + i + ", clientType=" + i2 + ", triggerCondition=" + obj2 + ", isDismissed=" + z + ", contextTriggerPayload=" + obj3 + "}";
    }
}
