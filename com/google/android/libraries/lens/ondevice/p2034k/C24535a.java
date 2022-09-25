package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.ondevice.k.a */
/* compiled from: PG */
final class C24535a {

    /* renamed from: a */
    public Class f67201a;

    /* renamed from: b */
    public String f67202b;

    /* renamed from: c */
    private final C58833ax f67203c = C58836b.f156633a;

    /* renamed from: a */
    public final C24633dq mo29948a() {
        String str;
        Class cls = this.f67201a;
        if (cls != null && (str = this.f67202b) != null) {
            return new C24633dq(cls, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f67201a == null) {
            sb.append(" primitiveEngineClass");
        }
        if (this.f67202b == null) {
            sb.append(" debugSinkName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
