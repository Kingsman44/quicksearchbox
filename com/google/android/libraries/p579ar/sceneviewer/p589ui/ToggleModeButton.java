package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.p3723ar.core.viewer.jniprotolite.Types;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.ToggleModeButton */
/* compiled from: PG */
public final class ToggleModeButton extends LinearLayout {
    private static final int ANIMATION_DURATION_MS = 200;
    private TextView buttonText;
    private ImageView collapsedLogo;
    private int defaultPadding;
    private int expandedLeftPadding;
    private ImageView expandedLogo;
    private RelativeLayout logoButtonContainer;

    public ToggleModeButton(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C10753R.layout.toggle_mode_button, this);
        this.expandedLogo = (ImageView) viewGroup.findViewById(C10753R.C10755id.expanded_logo);
        this.collapsedLogo = (ImageView) viewGroup.findViewById(C10753R.C10755id.collapsed_logo);
        this.buttonText = (TextView) viewGroup.findViewById(C10753R.C10755id.toggle_button_text);
        this.logoButtonContainer = (RelativeLayout) viewGroup.findViewById(C10753R.C10755id.toggle_button_logo_container);
        this.defaultPadding = Math.round(context.getResources().getDimension(C10753R.dimen.toggle_button_padding));
        this.expandedLeftPadding = Math.round(context.getResources().getDimension(C10753R.dimen.toggle_button_expanded_left_padding));
        setExpanded(true, 0);
    }

    /* renamed from: lambda$setExpanded$0$com-google-android-libraries-ar-sceneviewer-ui-ToggleModeButton */
    public /* synthetic */ void mo19213x151ad077() {
        setEnabled(true);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, ANIMATION_DURATION_MS);
    }

    public void setMode(Types.ViewerMode viewerMode) {
        Types.ViewerMode viewerMode2 = Types.ViewerMode.INVALID;
        int ordinal = viewerMode.ordinal();
        if (ordinal == 1) {
            setExpanded(true);
            setContentDescription(getResources().getString(C10753R.string.viewer_enter_ar_button_content_description));
        } else if (ordinal == 2) {
            setExpanded(false);
            setContentDescription(getResources().getString(C10753R.string.viewer_enter_3d_button_content_description));
        }
    }

    private void setExpanded(boolean z, int i) {
        int i2;
        int i3 = 0;
        setEnabled(false);
        float f = 0.0f;
        long j = (long) i;
        this.expandedLogo.animate().alpha(true != z ? 0.0f : 1.0f).setDuration(j).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new ToggleModeButton$$ExternalSyntheticLambda0(this)).start();
        ViewPropertyAnimator animate = this.collapsedLogo.animate();
        if (true != z) {
            f = 1.0f;
        }
        animate.alpha(f).setDuration(j).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        TextView textView = this.buttonText;
        if (true != z) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        if (z) {
            i2 = this.expandedLeftPadding;
        } else {
            i2 = this.defaultPadding;
        }
        RelativeLayout relativeLayout = this.logoButtonContainer;
        int i4 = this.defaultPadding;
        relativeLayout.setPadding(i2, i4, i4, i4);
    }

    public ToggleModeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ToggleModeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
