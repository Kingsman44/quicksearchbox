package com.google.android.play.core.p3538g.p3541c;

import java.util.Map;

/* renamed from: com.google.android.play.core.g.c.b */
/* compiled from: PG */
final class C45148b extends C45163q {

    /* renamed from: b */
    private final Integer f117849b;

    /* renamed from: c */
    private final Map f117850c;

    public C45148b(Integer num, Map map) {
        this.f117849b = num;
        this.f117850c = map;
    }

    /* renamed from: a */
    public final Integer mo48982a() {
        return this.f117849b;
    }

    /* renamed from: b */
    public final Map mo48983b() {
        return this.f117850c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45163q) {
            C45163q qVar = (C45163q) obj;
            Integer num = this.f117849b;
            if (num != null ? num.equals(qVar.mo48982a()) : qVar.mo48982a() == null) {
                if (this.f117850c.equals(qVar.mo48983b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        Integer num = this.f117849b;
        String valueOf = String.valueOf(this.f117850c);
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + num + ", splitInstallErrorCodeByModule=" + valueOf + "}";
    }

    public final int hashCode() {
        int i;
        Integer num = this.f117849b;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f117850c.hashCode();
    }
}
