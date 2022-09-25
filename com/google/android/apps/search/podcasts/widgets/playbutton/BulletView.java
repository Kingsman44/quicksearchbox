package com.google.android.apps.search.podcasts.widgets.playbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class BulletView extends FrameLayout {

    /* renamed from: a */
    public final PlayProgressButton f383520a;

    /* renamed from: b */
    public final ImageView f383521b;

    /* renamed from: c */
    public final ImageView f383522c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BulletView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
        FrameLayout.inflate(context, R.layout.podcasts_bullet_view, this);
        View findViewById = findViewById(R.id.podcasts_play_progress_button);
        C69664n.m101060f(findViewById, "findViewById(R.id.podcasts_play_progress_button)");
        this.f383520a = (PlayProgressButton) findViewById;
        View findViewById2 = findViewById(R.id.podcasts_bullet_image);
        C69664n.m101060f(findViewById2, "findViewById(R.id.podcasts_bullet_image)");
        this.f383521b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.podcasts_check_mark);
        C69664n.m101060f(findViewById3, "findViewById(R.id.podcasts_check_mark)");
        this.f383522c = (ImageView) findViewById3;
        setClickable(true);
        setFocusable(true);
    }
}
