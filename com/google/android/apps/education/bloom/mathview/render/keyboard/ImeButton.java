package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.content.Context;
import android.support.p033v7.widget.AppCompatImageView;
import android.support.p033v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import java.util.Map;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* compiled from: PG */
public final class ImeButton extends FrameLayout {

    /* renamed from: a */
    public static final Map f31299a;

    /* renamed from: b */
    public static final Map f31300b = C69505av.m100867i(new C69685i(2, Integer.valueOf(R.string.keyboard_ime_action_go_description)), new C69685i(4, Integer.valueOf(R.string.keyboard_ime_action_send_description)), new C69685i(3, Integer.valueOf(R.string.keyboard_ime_action_search_description)), new C69685i(6, Integer.valueOf(R.string.keyboard_ime_action_done_description)), new C69685i(5, Integer.valueOf(R.string.keyboard_ime_action_next_description)), new C69685i(7, Integer.valueOf(R.string.keyboard_ime_action_previous_description)));

    /* renamed from: c */
    public final AppCompatTextView f31301c;

    /* renamed from: d */
    public final AppCompatImageView f31302d;

    static {
        Integer valueOf = Integer.valueOf(R.drawable.quantum_gm_ic_keyboard_tab_vd_theme_24);
        f31299a = C69505av.m100867i(new C69685i(2, Integer.valueOf(R.drawable.quantum_gm_ic_arrow_forward_vd_theme_24)), new C69685i(4, Integer.valueOf(R.drawable.quantum_gm_ic_send_vd_theme_24)), new C69685i(3, Integer.valueOf(R.drawable.quantum_gm_ic_search_vd_theme_24)), new C69685i(6, Integer.valueOf(R.drawable.quantum_gm_ic_done_vd_theme_24)), new C69685i(5, valueOf), new C69685i(7, valueOf));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ImeButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ImeButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImeButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C69664n.m101061g(context, "context");
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setAllCaps(true);
        appCompatTextView.setTextAppearance(context, 16974331);
        if ((appCompatTextView.getResources().getConfiguration().uiMode & 48) == 16) {
            appCompatTextView.setTextColor(-1);
        } else {
            appCompatTextView.setTextColor(-16777216);
        }
        this.f31301c = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        if ((appCompatImageView.getResources().getConfiguration().uiMode & 48) == 16) {
            appCompatImageView.setColorFilter(-1);
        } else {
            appCompatImageView.setColorFilter(-16777216);
        }
        this.f31302d = appCompatImageView;
        addView(appCompatTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        addView(appCompatImageView, new FrameLayout.LayoutParams(-2, -2, 17));
        setClickable(true);
        setFocusable(true);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        CharSequence text = this.f31301c.getText();
        if (text != null && !C69764m.m101229h(text)) {
            this.f31301c.setVisibility(0);
        }
        this.f31302d.setVisibility(0);
        super.onMeasure(i, i2);
        if (this.f31301c.getVisibility() == 0 && this.f31301c.getMeasuredWidth() <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight() && this.f31301c.getLayout().getEllipsisCount(0) == 0) {
            this.f31302d.setVisibility(8);
            return;
        }
        this.f31301c.setVisibility(8);
        this.f31302d.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImeButton(Context context, AttributeSet attributeSet, int i, int i2, C69659i iVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
