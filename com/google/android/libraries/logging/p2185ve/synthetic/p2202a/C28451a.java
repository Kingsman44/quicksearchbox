package com.google.android.libraries.logging.p2185ve.synthetic.p2202a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4552o.p4566l.C60214n;
import java.util.Set;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.a.a */
/* compiled from: PG */
public final class C28451a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Boolean f77238a;

    /* renamed from: b */
    private final Set f77239b;

    public C28451a(Boolean bool, Set set) {
        this.f77238a = bool;
        this.f77239b = set;
    }

    /* renamed from: a */
    private final boolean m53157a(Integer num) {
        if (!this.f77238a.booleanValue() && !this.f77239b.contains(num)) {
            return false;
        }
        return true;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        int i = C28485y.f77298f;
        C28439i a = C28485y.m53234a(activity.findViewById(16908290));
        if (a != null) {
            C60214n nVar = a.mo33884a().f77290c;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            if (m53157a(Integer.valueOf(nVar.f162918c)) && a.mo33891h() == 2) {
                a.mo33892i(1);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (!activity.isFinishing() && !activity.isChangingConfigurations()) {
            int i = C28485y.f77298f;
            C28439i a = C28485y.m53234a(activity.findViewById(16908290));
            if (a != null) {
                C60214n nVar = a.mo33884a().f77290c;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                if (m53157a(Integer.valueOf(nVar.f162918c)) && a.mo33891h() == 1) {
                    a.mo33892i(2);
                }
            }
        }
    }
}
