package com.google.android.apps.search.podcasts.widgets.queuebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141264b;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class QueueButton extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QueueButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C69664n.m101061g(context, "context");
        FrameLayout.inflate(context, R.layout.podcasts_queue_button, this);
        setClickable(true);
        setFocusable(true);
        View findViewById = findViewById(R.id.podcasts_add_to_queue_icon);
        C69664n.m101060f(findViewById, "findViewById(R.id.podcasts_add_to_queue_icon)");
        ImageView imageView = (ImageView) findViewById;
        setBackgroundResource(C141264b.m229298b(context));
    }
}
