package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.a */
/* compiled from: PG */
public final class C15130a {

    /* renamed from: a */
    public final C14986h f45412a;

    /* renamed from: b */
    public View f45413b;

    public C15130a(C14986h hVar) {
        this.f45412a = hVar;
    }

    /* renamed from: a */
    public static Rect m31699a(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.offsetTo(iArr[0], iArr[1]);
        return rect;
    }
}
