package com.google.android.apps.search.podcasts.widgets.expandabledescription;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.C1924a;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141264b;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ExpandableDescription extends FrameLayout {

    /* renamed from: a */
    public final TextView f383442a;

    /* renamed from: b */
    public final View f383443b;

    /* renamed from: c */
    public boolean f383444c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableDescription(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        GradientDrawable.Orientation orientation;
        C69664n.m101061g(context, "context");
        FrameLayout.inflate(context, R.layout.podcasts_expandable_description, this);
        View findViewById = findViewById(R.id.podcasts_description_text);
        C69664n.m101060f(findViewById, "findViewById(R.id.podcasts_description_text)");
        this.f383442a = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.podcasts_expandable_more);
        C69664n.m101060f(findViewById2, "findViewById(R.id.podcasts_expandable_more)");
        this.f383443b = findViewById2;
        View findViewById3 = findViewById(R.id.podcasts_expandable_more_background);
        C69664n.m101060f(findViewById3, "findViewById(R.id.podcas…pandable_more_background)");
        int a = C141264b.m229297a(context, 16842801);
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        findViewById3.setBackground(new GradientDrawable(orientation, new int[]{C1924a.m5189h(a, 0), a}));
    }

    /* renamed from: a */
    public final void mo116257a() {
        if (!this.f383444c) {
            this.f383444c = true;
            this.f383442a.setMaxLines(Integer.MAX_VALUE);
            this.f383443b.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f383442a.setEnabled(false);
        this.f383442a.setEnabled(true);
    }
}
