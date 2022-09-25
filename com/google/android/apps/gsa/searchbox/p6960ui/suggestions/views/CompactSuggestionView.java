package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.views.CompactSuggestionView */
/* compiled from: PG */
public class CompactSuggestionView extends C88795af {

    /* renamed from: a */
    public FrameLayout f240315a;

    /* renamed from: b */
    public FrameLayout f240316b;

    /* renamed from: c */
    private FrameLayout f240317c;

    /* renamed from: d */
    private TextView f240318d;

    /* renamed from: e */
    private final int f240319e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f240320f = new C88825i(this);

    /* renamed from: g */
    private final View.OnClickListener f240321g = new C88823g(this);

    /* renamed from: h */
    private final View.OnLongClickListener f240322h = new C88824h(this);

    public CompactSuggestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240319e = context.getResources().getDimensionPixelSize(R.dimen.compact_suggestion_border_width);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Drawable mo82341a() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo82342b(int i) {
        return i == 14;
    }

    /* renamed from: d */
    public final void mo82350d(Spanned spanned, int i) {
        this.f240318d.setText(spanned);
    }

    /* renamed from: f */
    public final void mo82537f(C88805ap apVar) {
        int i;
        super.mo82537f(apVar);
        FrameLayout frameLayout = this.f240317c;
        int i2 = apVar.f240431b;
        if ((i2 & 16) != 0) {
            i = 0;
        } else {
            i = this.f240319e;
        }
        frameLayout.setPadding(0, 0, i, (i2 & 32) != 0 ? 0 : this.f240319e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: hL */
    public final void mo82536hL() {
        FrameLayout frameLayout = this.f240317c;
        int i = this.f240319e;
        frameLayout.setPadding(0, 0, i, i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.compact_border);
        frameLayout.getClass();
        this.f240317c = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.compact_background_base);
        frameLayout2.getClass();
        this.f240315a = frameLayout2;
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.compact_background);
        frameLayout3.getClass();
        this.f240316b = frameLayout3;
        TextView textView = (TextView) findViewById(R.id.compact_text);
        textView.getClass();
        this.f240318d = textView;
        this.f240316b.setFocusable(isFocusable());
        setOnFocusChangeListener(this.f240320f);
        this.f240316b.setOnClickListener(this.f240321g);
        this.f240316b.setClickable(isClickable());
        this.f240316b.setOnLongClickListener(this.f240322h);
        this.f240316b.setLongClickable(isLongClickable());
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingRight = measuredWidth - this.f240317c.getPaddingRight();
        int paddingBottom = measuredHeight - this.f240317c.getPaddingBottom();
        this.f240317c.layout(0, 0, measuredWidth, measuredHeight);
        this.f240315a.layout(0, 0, paddingRight, paddingBottom);
        this.f240316b.layout(0, 0, paddingRight, paddingBottom);
    }

    public final void setNextFocusDownId(int i) {
        this.f240316b.setNextFocusDownId(i);
    }

    public final void setNextFocusForwardId(int i) {
        this.f240316b.setNextFocusForwardId(i);
    }

    public final void setNextFocusLeftId(int i) {
        this.f240316b.setNextFocusLeftId(i);
    }

    public final void setNextFocusRightId(int i) {
        this.f240316b.setNextFocusRightId(i);
    }

    public final void setNextFocusUpId(int i) {
        this.f240316b.setNextFocusUpId(i);
    }
}
