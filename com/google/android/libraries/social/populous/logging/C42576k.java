package com.google.android.libraries.social.populous.logging;

import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.logging.k */
/* compiled from: PG */
public final class C42576k {

    /* renamed from: a */
    public static final C42576k f111734a = new C42575j().mo45662a();

    /* renamed from: b */
    public final Long f111735b;

    /* renamed from: c */
    public final Long f111736c;

    /* renamed from: d */
    public final Long f111737d;

    /* renamed from: e */
    public final Integer f111738e;

    /* renamed from: f */
    private final String f111739f = null;

    public C42576k(Long l, Long l2, Long l3, Integer num) {
        this.f111735b = l;
        this.f111736c = l2;
        this.f111737d = l3;
        this.f111738e = num;
    }

    /* renamed from: a */
    public final C42575j mo45663a() {
        C42575j jVar = new C42575j();
        jVar.f111733d = this.f111738e;
        jVar.f111730a = this.f111735b;
        jVar.f111731b = this.f111736c;
        jVar.f111732c = this.f111737d;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42576k) {
            C42576k kVar = (C42576k) obj;
            if (C58832aw.m90831a(this.f111735b, kVar.f111735b) && C58832aw.m90831a(this.f111736c, kVar.f111736c) && C58832aw.m90831a(this.f111737d, kVar.f111737d)) {
                String str = kVar.f111739f;
                return C58832aw.m90831a((Object) null, (Object) null) && C58832aw.m90831a(this.f111738e, kVar.f111738e);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111735b, this.f111736c, this.f111737d, null, this.f111738e});
    }
}
