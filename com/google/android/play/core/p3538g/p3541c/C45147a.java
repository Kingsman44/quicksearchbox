package com.google.android.play.core.p3538g.p3541c;

import java.util.Map;

/* renamed from: com.google.android.play.core.g.c.a */
/* compiled from: PG */
final class C45147a extends C45162p {

    /* renamed from: a */
    public Integer f117847a;

    /* renamed from: b */
    public Map f117848b;

    /* renamed from: a */
    public final C45163q mo48979a() {
        if (this.f117848b != null) {
            return new C45148b(this.f117847a, this.f117848b);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    /* renamed from: b */
    public final Map mo48980b() {
        Map map = this.f117848b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }

    /* renamed from: c */
    public final void mo48981c(Map map) {
        if (map != null) {
            this.f117848b = map;
            return;
        }
        throw new NullPointerException("Null splitInstallErrorCodeByModule");
    }
}
