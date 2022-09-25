package com.google.android.libraries.search.assistant.p2828y.p2859r;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.r.k */
/* compiled from: PG */
public final class C37083k {

    /* renamed from: a */
    public final Context f96586a;

    /* renamed from: b */
    public final KeyguardManager f96587b;

    /* renamed from: c */
    public final DisplayManager f96588c;

    public C37083k(Context context, KeyguardManager keyguardManager) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(keyguardManager, "keyguardManager");
        this.f96586a = context;
        this.f96587b = keyguardManager;
        Object systemService = context.getSystemService("display");
        this.f96588c = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
    }

    /* renamed from: a */
    public static final int m65850a(Paint paint, String str) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return Math.max(rect.width(), rect.height());
    }
}
