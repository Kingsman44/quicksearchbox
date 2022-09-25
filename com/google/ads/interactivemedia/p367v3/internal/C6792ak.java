package com.google.ads.interactivemedia.p367v3.internal;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ak */
/* compiled from: PG */
public final class C6792ak {

    /* renamed from: a */
    private JSONObject f20772a;

    /* renamed from: b */
    private final C6805at f20773b;

    public C6792ak(C6805at atVar) {
        this.f20773b = atVar;
    }

    /* renamed from: a */
    public final void mo14875a(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f20773b.mo15385a(new C6808aw(this, hashSet, jSONObject, j));
    }

    /* renamed from: b */
    public final void mo14876b(JSONObject jSONObject, HashSet hashSet, long j) {
        this.f20773b.mo15385a(new C6807av(this, hashSet, jSONObject, j));
    }

    /* renamed from: c */
    public final void mo14877c() {
        this.f20773b.mo15385a(new C6806au(this));
    }

    /* renamed from: d */
    public final JSONObject mo14878d() {
        return this.f20772a;
    }

    /* renamed from: e */
    public final void mo14879e(JSONObject jSONObject) {
        this.f20772a = jSONObject;
    }
}
