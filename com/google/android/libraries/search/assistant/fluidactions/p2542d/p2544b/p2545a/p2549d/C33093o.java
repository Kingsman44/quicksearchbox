package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.text.TextUtils;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58557jl;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.o */
/* compiled from: PG */
public final /* synthetic */ class C33093o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Set f88610a;

    public /* synthetic */ C33093o(Set set) {
        this.f88610a = set;
    }

    public final Object apply(Object obj) {
        Set set = this.f88610a;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str) && set.contains(str)) {
            return Optional.m71637of(str);
        }
        if (set.contains("com.google.android.deskclock")) {
            return Optional.m71637of("com.google.android.deskclock");
        }
        return Optional.m71637of((String) C58557jl.m90130k(set, (Object) null));
    }
}
