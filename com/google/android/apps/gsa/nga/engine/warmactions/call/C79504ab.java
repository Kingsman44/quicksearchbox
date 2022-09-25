package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.os.Build;
import android.telecom.Call;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.ab */
/* compiled from: PG */
public abstract class C79504ab {
    /* renamed from: e */
    public static C79504ab m127585e(Call call, int i) {
        Optional optional;
        C79497a aVar = new C79497a();
        aVar.f218195a = ((Long) Optional.ofNullable(call.getDetails()).map(C79539z.f218255a).orElse(0L)).longValue();
        aVar.f218196b = i;
        aVar.f218199e = 3;
        Optional map = Optional.ofNullable(call.getDetails()).map(C79537x.f218253a);
        if (map != null) {
            aVar.f218198d = map;
            if (Build.VERSION.SDK_INT < 30) {
                optional = Optional.empty();
            } else {
                optional = Optional.ofNullable(call.getDetails()).map(C79535v.f218251a).filter(C79536w.f218252a);
            }
            Objects.requireNonNull(aVar);
            optional.ifPresent(new C79538y(aVar));
            if (aVar.f218199e == 3) {
                return new C79506b(aVar.f218195a, aVar.f218196b, aVar.f218197c, aVar.f218198d);
            }
            StringBuilder sb = new StringBuilder();
            if ((aVar.f218199e & 1) == 0) {
                sb.append(" id");
            }
            if ((aVar.f218199e & 2) == 0) {
                sb.append(" callState");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null handle");
    }

    /* renamed from: a */
    public abstract int mo74103a();

    /* renamed from: b */
    public abstract long mo74104b();

    /* renamed from: c */
    public abstract Optional mo74105c();

    /* renamed from: d */
    public abstract Optional mo74106d();

    /* renamed from: f */
    public final boolean mo74107f() {
        return mo74103a() == 2;
    }
}
