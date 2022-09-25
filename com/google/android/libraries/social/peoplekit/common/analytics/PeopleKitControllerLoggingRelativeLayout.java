package com.google.android.libraries.social.peoplekit.common.analytics;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* compiled from: PG */
public class PeopleKitControllerLoggingRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    public C42075e f109970a;

    /* renamed from: b */
    public PeopleKitVisualElementPath f109971b;

    /* renamed from: c */
    private boolean f109972c = true;

    public PeopleKitControllerLoggingRelativeLayout(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f109970a != null && motionEvent.getAction() == 0 && this.f109972c) {
            C42075e eVar = this.f109970a;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144448K));
            peopleKitVisualElementPath.mo44564a(this.f109971b.f109973a);
            eVar.mo44577c(4, peopleKitVisualElementPath);
            this.f109972c = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public PeopleKitControllerLoggingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PeopleKitControllerLoggingRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
