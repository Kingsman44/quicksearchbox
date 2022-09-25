package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.webkit.WebView;
import androidx.p201w.p202a.C4325ab;
import androidx.p201w.p202a.C4348q;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.r */
/* compiled from: PG */
public final class C96498r {
    /* renamed from: a */
    public static void m159874a(WebView webView) {
        if (m159875b(webView.getContext()) && C4325ab.m12423b("FORCE_DARK")) {
            C4348q.m12489d(webView.getSettings(), 2);
        }
    }

    /* renamed from: b */
    public static boolean m159875b(Context context) {
        if (C90962a.m148577a(context)) {
            Build.VERSION.CODENAME.equals("Q");
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16844176, R.attr.lightTheme});
            boolean z = obtainStyledAttributes.getBoolean(0, true) && obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
            if (z) {
                return false;
            }
        }
        return true;
    }
}
