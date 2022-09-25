package com.facebook.p313c.p314a;

import android.view.ViewGroup;
import com.facebook.p313c.C6056o;

/* renamed from: com.facebook.c.a.c */
/* compiled from: PG */
public class C6023c {
    /* renamed from: a */
    public static void m15487a(Object obj) {
        if (obj instanceof C6056o) {
            ((C6056o) obj).mo12649u();
        } else if (obj instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) obj;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m15487a(viewGroup.getChildAt(i));
            }
        }
    }
}
