package com.google.android.material.p3505b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import androidx.core.p094f.C1888a;
import com.google.android.googlequicksearchbox.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.material.b.d */
/* compiled from: PG */
public final class C44534d {

    /* renamed from: a */
    private static final int[] f115785a = {R.attr.dynamicColorThemeOverlay};

    /* renamed from: b */
    private static final C44533c f115786b;

    /* renamed from: c */
    private static final C44533c f115787c;

    /* renamed from: d */
    private static final Map f115788d;

    /* renamed from: e */
    private static final Map f115789e;

    static {
        C44531a aVar = new C44531a();
        f115786b = aVar;
        C44532b bVar = new C44532b();
        f115787c = bVar;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", aVar);
        hashMap.put("google", aVar);
        hashMap.put("hmd global", aVar);
        hashMap.put("infinix", aVar);
        hashMap.put("infinix mobility limited", aVar);
        hashMap.put("itel", aVar);
        hashMap.put("kyocera", aVar);
        hashMap.put("lenovo", aVar);
        hashMap.put("lge", aVar);
        hashMap.put("motorola", aVar);
        hashMap.put("nothing", aVar);
        hashMap.put("oneplus", aVar);
        hashMap.put("oppo", aVar);
        hashMap.put("realme", aVar);
        hashMap.put("robolectric", aVar);
        hashMap.put("samsung", bVar);
        hashMap.put("sharp", aVar);
        hashMap.put("sony", aVar);
        hashMap.put("tcl", aVar);
        hashMap.put("tecno", aVar);
        hashMap.put("tecno mobile limited", aVar);
        hashMap.put("vivo", aVar);
        hashMap.put("wingtech", aVar);
        hashMap.put("xiaomi", aVar);
        f115788d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", aVar);
        hashMap2.put("jio", aVar);
        f115789e = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static void m78714a(Activity activity) {
        int d;
        View peekDecorView;
        Context context;
        if (m78715b() && (d = m78717d(activity)) != 0) {
            activity.getTheme().applyStyle(d, true);
            if (activity instanceof Activity) {
                Window window = activity.getWindow();
                Resources.Theme theme = null;
                if (!(window == null || (peekDecorView = window.peekDecorView()) == null || (context = peekDecorView.getContext()) == null)) {
                    theme = context.getTheme();
                }
                if (theme != null) {
                    theme.applyStyle(d, true);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m78715b() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (C1888a.m5150d()) {
            return true;
        }
        C44533c cVar = (C44533c) f115788d.get(Build.MANUFACTURER.toLowerCase());
        if (cVar == null) {
            cVar = (C44533c) f115789e.get(Build.BRAND.toLowerCase());
        }
        return cVar != null && cVar.mo47470a();
    }

    /* renamed from: c */
    public static Context m78716c(Context context) {
        int d;
        if (m78715b() && (d = m78717d(context)) != 0) {
            return new ContextThemeWrapper(context, d);
        }
        return context;
    }

    /* renamed from: d */
    private static int m78717d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f115785a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
