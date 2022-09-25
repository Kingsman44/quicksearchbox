package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47240i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class BottomBarActionsLayout extends C136079be implements C47231d {

    /* renamed from: a */
    public C136094l f370497a;

    @Deprecated
    public BottomBarActionsLayout(Context context) {
        super(context);
        m220897d();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private final void m220897d() {
        if (this.f370497a == null) {
            try {
                C136096n nVar = (C136096n) mo112736a().mo17653jN();
                C136092j jVar = new C136092j(this);
                C47240i.m84036c(jVar);
                try {
                    C136094l h = nVar.mo112750h();
                    this.f370497a = h;
                    if (h == null) {
                        C47240i.m84035b(jVar);
                    }
                    this.f370497a.f370651d = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof C68288b) && !(context instanceof ViewComponentManager$FragmentContextWrapper) && !(context instanceof C47236e)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof C47211g)) {
                        String cls = getClass().toString();
                        throw new IllegalStateException("TikTok View " + cls + ", cannot be attached to a non-TikTok Fragment");
                    }
                } catch (Throwable th) {
                    if (this.f370497a == null) {
                        C47240i.m84035b(jVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m220897d();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List<View> list;
        m220897d();
        C136094l lVar = this.f370497a;
        if (lVar.f370649b.getLayoutDirection() == 1) {
            list = C69540x.m100834P(lVar.mo112749a());
        } else {
            list = lVar.mo112749a();
        }
        int i5 = 0;
        for (View view : list) {
            int measuredHeight = (lVar.f370649b.getMeasuredHeight() - view.getMeasuredHeight()) / 2;
            view.layout(i5, measuredHeight, view.getMeasuredWidth() + i5, view.getMeasuredHeight() + measuredHeight);
            i5 += view.getMeasuredWidth();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m220897d();
        C136094l lVar = this.f370497a;
        ViewParent parent = lVar.f370649b.getParent();
        C69664n.m101059e(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        int min = Math.min(view.getMeasuredWidth(), lVar.f370650c);
        List<View> a = lVar.mo112749a();
        int size = a.size();
        if (size > 0) {
            int i3 = 0;
            int i4 = min;
            int i5 = 0;
            for (View view2 : a) {
                view2.measure(0, View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), LinearLayoutManager.INVALID_OFFSET));
                if (view2.getMeasuredWidth() > i4 / size) {
                    i4 -= view2.getMeasuredWidth();
                    i5++;
                }
            }
            int max = i4 / Math.max(size - i5, 1);
            for (View view3 : a) {
                int max2 = Math.max(view3.getMeasuredWidth(), max);
                i3 += max2;
                view3.measure(View.MeasureSpec.makeMeasureSpec(max2, 1073741824), View.MeasureSpec.makeMeasureSpec(view3.getMeasuredHeight(), 1073741824));
            }
            if (i3 > min) {
                C59052c cVar = (C59052c) C136094l.f370648a.mo56226d();
                cVar.mo56379ah(new C59094n(40659));
                cVar.mo56386p("BottomBar actions are too wide, not all of them might be visible");
            }
        }
        lVar.f370649b.setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo17754z() {
        C136094l lVar = this.f370497a;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    public BottomBarActionsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomBarActionsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomBarActionsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public BottomBarActionsLayout(C47274n nVar) {
        super(nVar);
        m220897d();
    }
}
