package com.google.android.apps.gsa.shared.p7066m;

import android.content.Context;
import android.databinding.C0118a;
import android.view.accessibility.AccessibilityManager;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.gsa.shared.m.k */
/* compiled from: PG */
public final class C90132k implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ Context f251807a;

    public C90132k(Context context) {
        this.f251807a = context;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        Method method;
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f251807a.getSystemService("accessibility");
        try {
            method = accessibilityManager.getClass().getMethod("isHighTextContrastEnabled", new Class[0]);
        } catch (NoSuchMethodException unused) {
            C58976aa aaVar = C58975e.f156826a;
            method = null;
        }
        if (method != null) {
            try {
                Object invoke = method.invoke(accessibilityManager, new Object[0]);
                if (invoke instanceof Boolean) {
                    return Boolean.valueOf(((Boolean) invoke).booleanValue());
                }
            } catch (Exception e) {
                C0118a.m116x(C90133l.f251808a.mo56225c(), "isHighTextContrastEnabled invoked with an exception", 10573, e, C58975e.f156826a, "highContrastSupplier");
            }
        }
        return false;
    }
}
