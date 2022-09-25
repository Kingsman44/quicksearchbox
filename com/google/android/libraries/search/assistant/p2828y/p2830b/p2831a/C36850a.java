package com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a;

import android.text.TextUtils;
import com.google.common.base.C58869cf;
import java.util.List;
import p3186j$.util.function.IntFunction;

/* renamed from: com.google.android.libraries.search.assistant.y.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C36850a implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ List f95989a;

    /* renamed from: b */
    public final /* synthetic */ int f95990b;

    public /* synthetic */ C36850a(List list, int i) {
        this.f95989a = list;
        this.f95990b = i;
    }

    public final Object apply(int i) {
        List list = this.f95989a;
        int i2 = this.f95990b;
        C58869cf cfVar = C36858f.f96003a;
        return TextUtils.join(" ", list.subList(i, i2 + i));
    }
}
