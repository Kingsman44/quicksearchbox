package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.WindowManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.BubbleView;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.p */
/* compiled from: PG */
public final class C40144p {

    /* renamed from: a */
    public final C40137i f105447a;

    /* renamed from: b */
    public final BubbleView f105448b;

    /* renamed from: c */
    public final View f105449c;

    /* renamed from: d */
    public final BubbleView f105450d;

    /* renamed from: e */
    public final C40145q f105451e;

    /* renamed from: f */
    public final C40129aa f105452f;

    public C40144p(WindowManager windowManager, DisplayManager displayManager, C40137i iVar, BubbleView bubbleView, BubbleView bubbleView2, View view, C40129aa aaVar) {
        this.f105452f = aaVar;
        this.f105447a = iVar;
        this.f105448b = bubbleView;
        this.f105449c = bubbleView2.findViewById(R.id.bubble_extended_card);
        this.f105450d = bubbleView2;
        this.f105451e = new C40145q(windowManager, displayManager, bubbleView2, view);
    }
}
