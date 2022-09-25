package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9301b;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.C123548v;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a.C123101ao;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a.C123114d;
import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58759qy;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.b.b */
/* compiled from: PG */
public final /* synthetic */ class C123139b {
    /* renamed from: a */
    public static C18207ak m202466a(Set set, Set set2) {
        try {
            return C18207ak.m35459a(set, set2);
        } catch (C18218av e) {
            throw new RuntimeException("Unexpected exception while providing long-lived Interface registry binding.", e);
        }
    }

    /* renamed from: e */
    public static C123114d m202470e(Executor executor, Context context, C122463r rVar, String str) {
        return new C123114d(executor, context, rVar.f339497c, str);
    }

    /* renamed from: b */
    public static Set m202467b(C123101ao aoVar, boolean z) {
        if (!z) {
            return C58733pz.f156496a;
        }
        Objects.requireNonNull(aoVar);
        return new C58759qy(new C123138a(aoVar));
    }

    /* renamed from: c */
    public static Set m202468c(C123548v vVar, boolean z) {
        if (z) {
            return new C58759qy(vVar);
        }
        return C58733pz.f156496a;
    }

    /* renamed from: d */
    public static Set m202469d(C123101ao aoVar, boolean z) {
        if (z) {
            return C58733pz.f156496a;
        }
        return new C58759qy(aoVar);
    }
}
