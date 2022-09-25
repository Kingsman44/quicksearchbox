package com.google.android.apps.gsa.staticplugins.nowcards.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public class CarouselScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private boolean f290469a;

    public CarouselScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f290469a && super.onInterceptTouchEvent(motionEvent);
    }

    public CarouselScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarouselScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f290469a = true;
        new ArrayList();
        setTag(R.id.is_scrollable, true);
    }
}
