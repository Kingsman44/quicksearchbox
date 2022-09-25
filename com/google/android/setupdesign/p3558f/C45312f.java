package com.google.android.setupdesign.p3558f;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.C45251c;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3550b.C45250g;

/* renamed from: com.google.android.setupdesign.f.f */
/* compiled from: PG */
public final class C45312f {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m80761a(android.content.Context r4) {
        /*
            com.google.android.setupcompat.a.c r0 = com.google.android.setupcompat.p3549a.C45240c.m80574e(r4)
            com.google.android.setupcompat.a.a r1 = com.google.android.setupcompat.p3549a.C45238a.CONFIG_LAYOUT_GRAVITY
            java.lang.String r4 = r0.mo49104h(r4, r1)
            r0 = 0
            if (r4 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            int r1 = r4.hashCode()
            r2 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r3 = 1
            if (r1 == r2) goto L_0x002e
            r2 = 109757538(0x68ac462, float:5.219839E-35)
            if (r1 == r2) goto L_0x0024
            goto L_0x0038
        L_0x0024:
            java.lang.String r1 = "start"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0038
            r4 = 1
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "center"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0038
            r4 = 0
            goto L_0x0039
        L_0x0038:
            r4 = -1
        L_0x0039:
            if (r4 == 0) goto L_0x0042
            if (r4 == r3) goto L_0x003e
            return r0
        L_0x003e:
            r4 = 8388611(0x800003, float:1.1754948E-38)
            return r4
        L_0x0042:
            r4 = 17
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.p3558f.C45312f.m80761a(android.content.Context):int");
    }

    /* renamed from: b */
    public static TemplateLayout m80762b(Activity activity) {
        View findViewById;
        if (activity == null || (findViewById = activity.findViewById(R.id.suc_layout_status)) == null) {
            return null;
        }
        return (TemplateLayout) findViewById.getParent();
    }

    /* renamed from: c */
    public static boolean m80763c(View view) {
        Activity activity;
        if (view instanceof C45251c) {
            return ((C45251c) view).mo49121f();
        }
        Context context = view.getContext();
        if (!C45240c.m80574e(context).mo49106k()) {
            return false;
        }
        try {
            activity = C45251c.m80608a(context);
            if (activity != null) {
                try {
                    TemplateLayout b = m80762b(activity);
                    if (b instanceof C45251c) {
                        return ((C45251c) b).mo49121f();
                    }
                } catch (ClassCastException | IllegalArgumentException unused) {
                }
            }
        } catch (ClassCastException | IllegalArgumentException unused2) {
            activity = null;
        }
        boolean b2 = activity != null ? C45250g.m80606b(activity.getIntent()) : false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sucUsePartnerResource});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (b2 || z) {
            return true;
        }
        return false;
    }
}
