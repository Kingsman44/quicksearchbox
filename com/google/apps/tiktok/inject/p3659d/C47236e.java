package com.google.apps.tiktok.inject.p3659d;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.Locale;

/* renamed from: com.google.apps.tiktok.inject.d.e */
/* compiled from: PG */
public final class C47236e extends ContextWrapper implements C47211g {

    /* renamed from: a */
    private final C58881cr f122900a;

    /* renamed from: a */
    private static Locale m84030a(Fragment fragment) {
        Locale h;
        if ((fragment instanceof C47233b) && (h = ((C47233b) fragment).mo17860h()) != null) {
            return h;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            return m84030a(parentFragment);
        }
        return null;
    }

    /* renamed from: b */
    private static void m84031b(Context context, Locale locale) {
        if (locale != null) {
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        return this.f122900a.mo6453a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47236e(Fragment fragment, Context context) {
        super(context);
        context.getClass();
        m84031b(context, m84030a(fragment));
        this.f122900a = C58886cw.m90973a(new C47235d(this));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47236e(android.support.p031v4.app.Fragment r2, android.view.LayoutInflater r3) {
        /*
            r1 = this;
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            java.util.Locale r2 = m84030a(r2)
            m84031b(r0, r2)
            r1.<init>(r0)
            com.google.apps.tiktok.inject.d.c r2 = new com.google.apps.tiktok.inject.d.c
            r2.<init>(r1, r3)
            com.google.common.base.cr r2 = com.google.common.base.C58886cw.m90973a(r2)
            r1.f122900a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.inject.p3659d.C47236e.<init>(android.support.v4.app.Fragment, android.view.LayoutInflater):void");
    }
}
