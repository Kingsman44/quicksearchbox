package com.google.android.apps.gsa.staticplugins.messages.monet.p8038ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.ui.GmmIntentFuseUiView */
/* compiled from: PG */
public class GmmIntentFuseUiView extends LinearLayout {

    /* renamed from: a */
    public FrameLayout f286852a;

    /* renamed from: b */
    public ImageButton f286853b;

    /* renamed from: c */
    public ProgressBar f286854c;

    /* renamed from: d */
    public C102761d f286855d;

    /* renamed from: e */
    public FrameLayout f286856e;

    /* renamed from: f */
    public boolean f286857f = true;

    /* renamed from: g */
    public boolean f286858g = false;

    public GmmIntentFuseUiView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo93413a() {
        this.f286853b.setVisibility(4);
        this.f286852a.setVisibility(4);
        C102761d dVar = this.f286855d;
        if (dVar != null) {
            dVar.cancel();
            this.f286858g = true;
        }
        this.f286854c.setProgress(0);
        this.f286854c.setVisibility(4);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f286852a = (FrameLayout) findViewById(R.id.fuse_ui_cancel_button_touch_target);
        this.f286853b = (ImageButton) findViewById(R.id.fuse_ui_cancel_button);
        this.f286854c = (ProgressBar) findViewById(R.id.fuse_ui_progress_bar);
        this.f286856e = (FrameLayout) findViewById(R.id.fuse_ui_confirm_button_touch_target);
    }

    public GmmIntentFuseUiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GmmIntentFuseUiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
