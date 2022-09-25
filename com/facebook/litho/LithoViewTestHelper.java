package com.facebook.litho;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import com.evernote.android.state.BuildConfig;
import java.util.Deque;

/* compiled from: PG */
public class LithoViewTestHelper {
    /* renamed from: a */
    private static void m15727a(C6110au auVar, StringBuilder sb, boolean z, boolean z2, int i, int i2, int i3, C6111av avVar) {
        for (int i4 = 0; i4 < i; i4++) {
            sb.append("  ");
        }
        C6112aw.addViewDescription(auVar, sb, i2, i3, z, z2, avVar);
        sb.append("\n");
        Rect a = auVar.mo12860a();
        for (C6110au a2 : auVar.mo12867l()) {
            m15727a(a2, sb, z, z2, i + 1, a.left, a.top, avVar);
        }
    }

    public static TestItem findTestItem(LithoView lithoView, String str) {
        Deque findTestItems = lithoView.findTestItems(str);
        if (findTestItems.isEmpty()) {
            return null;
        }
        return (TestItem) findTestItems.getLast();
    }

    public static Deque findTestItems(LithoView lithoView, String str) {
        return lithoView.findTestItems(str);
    }

    public static String viewToString(LithoView lithoView) {
        return viewToString(lithoView, false).trim();
    }

    public static String viewToStringForE2E(View view, int i, boolean z) {
        return viewToStringForE2E(view, i, z, (C6111av) null);
    }

    public static String viewToString(LithoView lithoView, boolean z) {
        int i;
        C6110au e = C6110au.m15899e(lithoView);
        if (e == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            int i2 = 3;
            for (ViewParent parent = lithoView.getParent(); parent != null; parent = parent.getParent()) {
                i2++;
            }
            i = i2;
        } else {
            i = 0;
        }
        sb.append("\n");
        m15727a(e, sb, z, false, i, 0, 0, (C6111av) null);
        return sb.toString();
    }

    public static String viewToStringForE2E(View view, int i, boolean z, C6111av avVar) {
        C6110au e;
        if (!(view instanceof LithoView) || (e = C6110au.m15899e((LithoView) view)) == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        m15727a(e, sb, true, z, i, 0, 0, avVar);
        return sb.toString();
    }
}
