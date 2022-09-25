package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ImmersiveActionsExecuteButtonContainer extends FrameLayout {

    /* renamed from: a */
    public ImageView f285723a;

    /* renamed from: b */
    public ImageView f285724b;

    /* renamed from: c */
    public ProgressBar f285725c;

    /* renamed from: d */
    public boolean f285726d;

    /* renamed from: e */
    public int f285727e;

    /* renamed from: f */
    public boolean f285728f;

    public ImmersiveActionsExecuteButtonContainer(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo93185a() {
        this.f285723a.setColorFilter(this.f285727e, PorterDuff.Mode.MULTIPLY);
        this.f285725c.getIndeterminateDrawable().setColorFilter(this.f285727e, PorterDuff.Mode.MULTIPLY);
        this.f285724b.setColorFilter(this.f285727e, PorterDuff.Mode.MULTIPLY);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.immersive_actions_execute_icon);
        imageView.getClass();
        this.f285723a = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.immersive_actions_execute_icon_highlight);
        imageView2.getClass();
        this.f285724b = imageView2;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.immersive_actions_execute_button_spinner);
        progressBar.getClass();
        this.f285725c = progressBar;
        this.f285723a.requestFocus();
        C89941l.m146512c(this.f285723a, 21991);
    }

    public ImmersiveActionsExecuteButtonContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImmersiveActionsExecuteButtonContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
