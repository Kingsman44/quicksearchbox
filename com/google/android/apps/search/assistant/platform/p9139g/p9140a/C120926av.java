package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.RemoteViews;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.av */
/* compiled from: PG */
public final class C120926av extends AppWidgetHostView {

    /* renamed from: c */
    private static final C59071e f336212c = C59071e.m91332i("com.google.android.apps.search.assistant.platform.g.a.av");

    /* renamed from: a */
    public float f336213a = 0.0f;

    /* renamed from: b */
    public final Rect f336214b = new Rect();

    /* renamed from: d */
    private View f336215d;

    /* renamed from: e */
    private final ViewOutlineProvider f336216e = new C120925au(this);

    public C120926av(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m200158a() {
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setClipToOutline(false);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f336213a > 0.0f) {
            ArrayList arrayList = new ArrayList();
            C120937bf.m200201c(this, arrayList);
            if (arrayList.size() == 1) {
                view = (View) arrayList.get(0);
            } else {
                view = getChildCount() > 0 ? C120937bf.m200200b(getChildAt(0)) : this;
            }
            if (view == null || (view.getId() == 16908288 && view.getClipToOutline())) {
                m200158a();
                return;
            }
            Rect rect = this.f336214b;
            rect.left = 0;
            rect.right = view.getWidth();
            rect.top = 0;
            rect.bottom = view.getHeight();
            while (view != this) {
                rect.offset(view.getLeft(), view.getTop());
                view = (View) view.getParent();
            }
            setOutlineProvider(this.f336216e);
            setClipToOutline(true);
            return;
        }
        m200158a();
    }

    public final void updateAppWidget(RemoteViews remoteViews) {
        View view;
        if (getAppWidgetInfo() == null) {
            try {
                view = remoteViews.apply(getContext(), this);
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) f336212c.mo56225c()).mo56382g(e)).mo56372aa(35653)).mo56386p("Failed to inflate RemoteViews");
                view = null;
            }
            if (view == null) {
                view = getErrorView();
            }
            prepareView(view);
            addView(view);
            View view2 = this.f336215d;
            if (!(view2 == view || view2 == null)) {
                removeView(view2);
            }
            this.f336215d = view;
            return;
        }
        super.updateAppWidget(remoteViews);
    }
}
