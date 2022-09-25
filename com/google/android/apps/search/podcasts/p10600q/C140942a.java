package com.google.android.apps.search.podcasts.p10600q;

import com.google.android.libraries.play.unison.binding.C31958ag;
import com.google.android.libraries.play.unison.binding.C31975ax;
import com.google.android.libraries.play.unison.binding.C31996v;
import com.google.android.libraries.play.unison.binding.C31997w;
import com.google.android.libraries.play.unison.binding.C32000z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.q.a */
/* compiled from: PG */
public final class C140942a {

    /* renamed from: a */
    private final List f382698a = new ArrayList();

    /* renamed from: a */
    public final C31958ag mo116036a() {
        Object[] array = this.f382698a.toArray(new C32000z[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        C32000z[] zVarArr = (C32000z[]) array;
        return new C31996v((C31997w[]) Arrays.copyOf(zVarArr, zVarArr.length));
    }

    /* renamed from: b */
    public final void mo116037b(Class cls, C31975ax axVar) {
        C69664n.m101061g(axVar, "bindable");
        this.f382698a.add(new C32000z(cls, axVar));
    }
}
