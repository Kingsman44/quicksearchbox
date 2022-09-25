package com.google.android.apps.search.podcasts.widgets.playbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class FullPlayButton extends FrameLayout {

    /* renamed from: a */
    public final BulletView f383523a;

    /* renamed from: b */
    public final TextView f383524b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FullPlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
        C69664n.m101061g(attributeSet, "attrSet");
        FrameLayout.inflate(context, R.layout.podcasts_full_play_button, this);
        View findViewById = findViewById(R.id.podcasts_bullet_view);
        C69664n.m101060f(findViewById, "findViewById(R.id.podcasts_bullet_view)");
        BulletView bulletView = (BulletView) findViewById;
        this.f383523a = bulletView;
        View findViewById2 = findViewById(R.id.podcasts_bullet_text);
        C69664n.m101060f(findViewById2, "findViewById(R.id.podcasts_bullet_text)");
        this.f383524b = (TextView) findViewById2;
        bulletView.setClickable(false);
        bulletView.setFocusable(false);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.google_min_touch_target_size));
        setClickable(true);
        setFocusable(true);
    }
}
