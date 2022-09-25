package com.google.apps.tiktok.inject;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.base.C58839bc;

/* renamed from: com.google.apps.tiktok.inject.q */
/* compiled from: PG */
public final class C47277q {

    /* renamed from: a */
    private static final C58839bc f122925a = C47275o.f122923a;

    /* renamed from: b */
    private static final C58839bc f122926b = C47276p.f122924a;

    /* renamed from: a */
    public static C47274n m84088a(Fragment fragment) {
        return m84090c(((C47200b) fragment).mo17857e(), f122926b);
    }

    /* renamed from: b */
    public static C47274n m84089b(C47215a aVar) {
        return m84090c(aVar.mo51121p(), f122925a);
    }

    /* renamed from: c */
    private static C47274n m84090c(Context context, C58839bc bcVar) {
        Context context2 = context;
        while (!bcVar.mo5941a(context2)) {
            if (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            } else {
                String valueOf = String.valueOf(context.getClass());
                throw new IllegalStateException("Cannot use base context of type " + valueOf + " for ViewContext.");
            }
        }
        return new C47274n(context);
    }
}
