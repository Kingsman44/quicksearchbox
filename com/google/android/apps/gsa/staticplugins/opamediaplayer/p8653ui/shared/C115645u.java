package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.u */
/* compiled from: PG */
public final class C115645u extends HorizontalScrollView {

    /* renamed from: e */
    public static final /* synthetic */ int f320810e = 0;

    /* renamed from: a */
    public int f320811a = 0;

    /* renamed from: b */
    public int f320812b = 0;

    /* renamed from: c */
    public final Runnable f320813c = new C115644t(this);

    /* renamed from: d */
    final /* synthetic */ C115647w f320814d;

    /* renamed from: f */
    private final int f320815f;

    /* renamed from: g */
    private int f320816g;

    /* renamed from: h */
    private final int f320817h;

    /* renamed from: i */
    private final int f320818i;

    /* renamed from: j */
    private final LinearLayout f320819j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115645u(C115647w wVar, Context context) {
        super(context);
        this.f320814d = wVar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f320817h = getContext().getResources().getDimensionPixelSize(R.dimen.omp_horizontal_value_selector_scroll_item_width);
        this.f320818i = getContext().getResources().getDimensionPixelSize(R.dimen.omp_horizontal_value_selector_scroll_item_height);
        this.f320815f = wVar.f320824d.size();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f320819j = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(0);
        addView(linearLayout);
        setHorizontalScrollBarEnabled(false);
    }

    /* renamed from: b */
    private final View m191786b(ViewGroup.LayoutParams layoutParams) {
        View view = new View(getContext());
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* renamed from: a */
    public final void mo102166a(int i) {
        this.f320811a = i;
        smoothScrollTo(this.f320817h * i, 0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f320816g != size) {
            this.f320816g = size;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((size - this.f320817h) / 2, this.f320818i);
            this.f320819j.removeAllViewsInLayout();
            this.f320819j.addView(m191786b(layoutParams));
            for (int i3 = 0; i3 < this.f320815f; i3++) {
                View inflate = LayoutInflater.from(this.f320819j.getContext()).inflate(R.layout.omp_horizontal_value_selector_scroll_item_gm2, this.f320819j, false);
                C115646v vVar = (C115646v) this.f320814d.f320824d.get(i3);
                if (i3 % this.f320814d.f320823c == 0) {
                    TextView textView = (TextView) inflate.findViewById(R.id.horizontal_value_selector_scroll_item_text);
                    textView.setText(String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(vVar.f320820a.floatValue())}));
                    textView.setOnClickListener(new C115643s(this, vVar));
                }
                this.f320819j.addView(inflate);
            }
            this.f320819j.addView(m191786b(layoutParams));
        }
        super.onMeasure(i, i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            performClick();
            C115642r rVar = this.f320814d.f320825e;
            if (rVar != null) {
                rVar.mo102098b();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean performClick() {
        super.performClick();
        this.f320812b = getScrollX();
        postDelayed(this.f320813c, 50);
        return true;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        if (i <= 0) {
            i5 = 0;
        } else {
            int i6 = this.f320815f;
            int i7 = this.f320817h;
            i5 = i >= i6 * i7 ? i6 : (i + (i7 / 2)) / i7;
        }
        this.f320811a = i5;
        C115647w wVar = this.f320814d;
        wVar.f320826f = (C115646v) wVar.f320824d.get(i5);
        C115647w wVar2 = this.f320814d;
        wVar2.f320822b.setText(wVar2.f320826f.mo102172b());
        C115647w wVar3 = this.f320814d;
        C115642r rVar = wVar3.f320825e;
        if (rVar != null) {
            rVar.mo102099c(wVar3.f320826f);
        }
    }
}
