package com.google.android.material.badge;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.android.material.badge.c */
/* compiled from: PG */
public final class C44538c {
    /* renamed from: a */
    public static void m78734a(C44536a aVar, View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.mo47479d(view, (FrameLayout) null);
    }
}
