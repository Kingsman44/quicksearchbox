package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.core.C42299by;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.e.b.c */
/* compiled from: PG */
public final class C42424c extends C42441t {

    /* renamed from: a */
    public PersonFieldMetadata f111272a;

    /* renamed from: b */
    public C58485gu f111273b;

    /* renamed from: c */
    private C42299by f111274c;

    /* renamed from: d */
    private String f111275d;

    /* renamed from: e */
    private String f111276e;

    /* renamed from: f */
    private C42418ao f111277f;

    /* renamed from: g */
    private String f111278g;

    /* renamed from: a */
    public final C42299by mo45455a() {
        C42299by byVar = this.f111274c;
        if (byVar != null) {
            return byVar;
        }
        throw new IllegalStateException("Property \"fieldType\" has not been set");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C42442u mo45456b() {
        String str;
        PersonFieldMetadata personFieldMetadata;
        String str2;
        C58485gu guVar;
        C42418ao aoVar;
        String str3;
        C42299by byVar = this.f111274c;
        if (byVar != null && (str = this.f111275d) != null && (personFieldMetadata = this.f111272a) != null && (str2 = this.f111276e) != null && (guVar = this.f111273b) != null && (aoVar = this.f111277f) != null && (str3 = this.f111278g) != null) {
            return new C42425d(byVar, str, personFieldMetadata, str2, guVar, aoVar, str3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111274c == null) {
            sb.append(" fieldType");
        }
        if (this.f111275d == null) {
            sb.append(" value");
        }
        if (this.f111272a == null) {
            sb.append(" metadata");
        }
        if (this.f111276e == null) {
            sb.append(" canonicalValue");
        }
        if (this.f111273b == null) {
            sb.append(" certificates");
        }
        if (this.f111277f == null) {
            sb.append(" rankingFeatureSet");
        }
        if (this.f111278g == null) {
            sb.append(" key");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final String mo45457c() {
        String str = this.f111276e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"canonicalValue\" has not been set");
    }

    /* renamed from: d */
    public final void mo45458d(String str) {
        if (str != null) {
            this.f111276e = str;
            return;
        }
        throw new NullPointerException("Null canonicalValue");
    }

    /* renamed from: e */
    public final void mo45459e(C42299by byVar) {
        if (byVar != null) {
            this.f111274c = byVar;
            return;
        }
        throw new NullPointerException("Null fieldType");
    }

    /* renamed from: f */
    public final void mo45460f(String str) {
        this.f111278g = str;
    }

    /* renamed from: g */
    public final void mo45461g(C42418ao aoVar) {
        if (aoVar != null) {
            this.f111277f = aoVar;
            return;
        }
        throw new NullPointerException("Null rankingFeatureSet");
    }

    /* renamed from: h */
    public final void mo45462h(String str) {
        if (str != null) {
            this.f111275d = str;
            return;
        }
        throw new NullPointerException("Null value");
    }
}
