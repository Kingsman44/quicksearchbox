package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.m */
/* compiled from: PG */
public final class C32480m extends AppWidgetHostView {

    /* renamed from: c */
    private static final C59071e f87039c = C59071e.m91332i("com.google.android.libraries.search.assistant.appactions.appwidget.m");

    /* renamed from: a */
    public float f87040a = 0.0f;

    /* renamed from: b */
    public final Rect f87041b = new Rect();

    /* renamed from: d */
    private View f87042d = null;

    /* renamed from: e */
    private Context f87043e;

    /* renamed from: f */
    private final ViewOutlineProvider f87044f = new C32479l(this);

    public C32480m(Context context) {
        super(m60278a(context));
        this.f87043e = m60278a(context);
    }

    /* renamed from: a */
    private static Context m60278a(Context context) {
        return context.createConfigurationContext(context.getResources().getConfiguration());
    }

    /* renamed from: b */
    private final void m60279b() {
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setClipToOutline(false);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f87040a > 0.0f) {
            ArrayList arrayList = new ArrayList();
            C32486s.m60300c(this, arrayList);
            if (arrayList.size() == 1) {
                view = (View) arrayList.get(0);
            } else {
                view = getChildCount() > 0 ? C32486s.m60299b(getChildAt(0)) : this;
            }
            if (view == null || (view.getId() == 16908288 && view.getClipToOutline())) {
                m60279b();
                return;
            }
            Rect rect = this.f87041b;
            rect.left = 0;
            rect.right = view.getWidth();
            rect.top = 0;
            rect.bottom = view.getHeight();
            while (view != this) {
                rect.offset(view.getLeft(), view.getTop());
                view = (View) view.getParent();
            }
            setOutlineProvider(this.f87044f);
            setClipToOutline(true);
            return;
        }
        m60279b();
    }

    public final void updateAppWidget(RemoteViews remoteViews) {
        View view;
        if (getAppWidgetInfo() == null) {
            try {
                String str = remoteViews.getPackage();
                try {
                    if (!this.f87043e.getPackageName().equals(str)) {
                        this.f87043e = getContext().createPackageContext(str, 4);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    ((C59052c) ((C59052c) ((C59052c) f87039c.mo56225c()).mo56382g(e)).mo56372aa(50548)).mo56389s("Unable to create context for %s because it is not found", str);
                }
                view = remoteViews.apply(this.f87043e, this);
            } catch (RuntimeException e2) {
                ((C59052c) ((C59052c) ((C59052c) f87039c.mo56225c()).mo56382g(e2)).mo56372aa(50547)).mo56386p("Failed to inflate RemoteViews");
                view = null;
            }
            if (view == null) {
                view = getErrorView();
            }
            prepareView(view);
            addView(view);
            View view2 = this.f87042d;
            if (!(view2 == view || view2 == null)) {
                removeView(view2);
            }
            this.f87042d = view;
            return;
        }
        super.updateAppWidget(remoteViews);
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (getAppWidgetInfo() != null) {
            return super.generateLayoutParams(attributeSet);
        }
        return new FrameLayout.LayoutParams(this.f87043e, attributeSet);
    }
}
