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
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.C115515ai;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.h */
/* compiled from: PG */
public final class C115632h extends HorizontalScrollView {

    /* renamed from: e */
    public static final /* synthetic */ int f320774e = 0;

    /* renamed from: a */
    public int f320775a = 0;

    /* renamed from: b */
    public int f320776b = 0;

    /* renamed from: c */
    public final Runnable f320777c = new C115631g(this);

    /* renamed from: d */
    final /* synthetic */ C115634j f320778d;

    /* renamed from: f */
    private final int f320779f;

    /* renamed from: g */
    private int f320780g;

    /* renamed from: h */
    private final int f320781h;

    /* renamed from: i */
    private final int f320782i;

    /* renamed from: j */
    private final LinearLayout f320783j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115632h(C115634j jVar, Context context) {
        super(context);
        this.f320778d = jVar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f320781h = getContext().getResources().getDimensionPixelSize(R.dimen.omp_horizontal_value_selector_scroll_item_width);
        this.f320782i = getContext().getResources().getDimensionPixelSize(R.dimen.omp_horizontal_value_selector_scroll_item_height);
        this.f320779f = jVar.f320788d.size();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f320783j = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(0);
        addView(linearLayout);
        setHorizontalScrollBarEnabled(false);
    }

    /* renamed from: c */
    private final View m191768c(ViewGroup.LayoutParams layoutParams) {
        View view = new View(getContext());
        view.setLayoutParams(layoutParams);
        return view;
    }

    /* renamed from: a */
    public final void mo102145a(int i) {
        this.f320775a = i;
        smoothScrollTo(this.f320781h * i, 0);
    }

    /* renamed from: b */
    public final void mo102146b(C115633i iVar) {
        mo102145a(this.f320778d.f320788d.indexOf(iVar));
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f320780g != size) {
            this.f320780g = size;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((size - this.f320781h) / 2, this.f320782i);
            this.f320783j.removeAllViewsInLayout();
            this.f320783j.addView(m191768c(layoutParams));
            for (int i3 = 0; i3 < this.f320779f; i3++) {
                View inflate = LayoutInflater.from(this.f320783j.getContext()).inflate(R.layout.omp_horizontal_value_selector_scroll_item_gm2, this.f320783j, false);
                C115633i iVar = (C115633i) this.f320778d.f320788d.get(i3);
                if (i3 % this.f320778d.f320787c == 0) {
                    TextView textView = (TextView) inflate.findViewById(R.id.horizontal_value_selector_scroll_item_text);
                    textView.setText(iVar.mo102151a());
                    textView.setContentDescription(getContext().getResources().getString(R.string.omp_finish_selection, new Object[]{iVar.mo102151a()}));
                    textView.setOnClickListener(new C115629e(this, iVar));
                }
                this.f320783j.addView(inflate);
            }
            this.f320783j.addView(m191768c(layoutParams));
        }
        super.onMeasure(i, i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            performClick();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final boolean performClick() {
        super.performClick();
        this.f320776b = getScrollX();
        postDelayed(this.f320777c, 50);
        return true;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        if (i <= 0) {
            i5 = 0;
        } else {
            int i6 = this.f320779f;
            int i7 = this.f320781h;
            i5 = i >= i6 * i7 ? i6 : (i + (i7 / 2)) / i7;
        }
        this.f320775a = i5;
        C115634j jVar = this.f320778d;
        jVar.f320789e = (C115633i) jVar.f320788d.get(i5);
        C115634j jVar2 = this.f320778d;
        jVar2.f320786b.setText(jVar2.f320789e.mo102152b());
        C115634j jVar3 = this.f320778d;
        C115515ai aiVar = jVar3.f320790f;
        if (aiVar != null) {
            aiVar.mo102062a(jVar3.f320789e);
        }
    }
}
