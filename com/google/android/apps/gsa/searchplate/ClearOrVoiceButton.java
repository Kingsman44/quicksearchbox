package com.google.android.apps.gsa.searchplate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ClearOrVoiceButton extends ImageView implements View.OnClickListener {

    /* renamed from: a */
    public View.OnClickListener f240667a;

    /* renamed from: b */
    public View.OnClickListener f240668b;

    /* renamed from: c */
    public boolean f240669c;

    /* renamed from: d */
    public boolean f240670d;

    /* renamed from: e */
    public boolean f240671e;

    /* renamed from: f */
    public LinearLayout f240672f;

    /* renamed from: g */
    public String f240673g;

    /* renamed from: h */
    public boolean f240674h;

    /* renamed from: i */
    public boolean f240675i;

    /* renamed from: j */
    public int f240676j;

    /* renamed from: k */
    private Drawable f240677k;

    /* renamed from: l */
    private Drawable f240678l;

    /* renamed from: m */
    private String f240679m;

    public ClearOrVoiceButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    private final void m144336f() {
        if (this.f240672f != null && getLayoutParams() != null) {
            LinearLayout linearLayout = this.f240672f;
            linearLayout.getClass();
            View findViewById = linearLayout.findViewById(R.id.progress_or_clear_or_voice);
            View findViewById2 = linearLayout.findViewById(R.id.voice_new_text);
            if (findViewById != null && findViewById2 != null) {
                findViewById2.setVisibility(8);
                findViewById.setBackground((Drawable) null);
                findViewById.setElevation(0.0f);
                getLayoutParams().height = (int) getResources().getDimension(R.dimen.clear_button_size);
                getLayoutParams().width = (int) getResources().getDimension(R.dimen.clear_button_size);
                int dimension = (int) getResources().getDimension(R.dimen.clear_button_padding);
                setPadding(dimension, dimension, dimension, dimension);
                if (!linearLayout.isInLayout()) {
                    linearLayout.requestLayout();
                }
                this.f240675i = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo82657a() {
        this.f240670d = false;
        mo82658b();
        mo82661e(this.f240669c);
    }

    /* renamed from: b */
    public final void mo82658b() {
        if (this.f240677k == null) {
            this.f240677k = getResources().getDrawable(R.drawable.ic_clear);
        }
        setImageDrawable(this.f240677k);
        setContentDescription(getResources().getString(R.string.clear));
        setColorFilter(getResources().getColor(R.color.agsa_color_on_surface_variant));
        if (this.f240671e) {
            m144336f();
        }
    }

    /* renamed from: c */
    public final void mo82659c() {
        setImageDrawable(this.f240678l);
        setContentDescription(this.f240679m);
        setColorFilter(0);
        if (!this.f240671e) {
            return;
        }
        if (this.f240674h) {
            m144336f();
        } else if (this.f240672f != null && getLayoutParams() != null) {
            LinearLayout linearLayout = this.f240672f;
            linearLayout.getClass();
            View findViewById = linearLayout.findViewById(R.id.progress_or_clear_or_voice);
            TextView textView = (TextView) linearLayout.findViewById(R.id.voice_new_text);
            if (findViewById != null && textView != null) {
                if (C90962a.m148577a(getContext())) {
                    findViewById.setBackground(getResources().getDrawable(R.drawable.voice_search_mic_dark_background));
                    textView.setTextColor(getResources().getColor(R.color.agsa_color_light_on_primary));
                } else {
                    findViewById.setBackground(getResources().getDrawable(R.drawable.voice_search_mic_background));
                }
                findViewById.setElevation(getResources().getDimension(R.dimen.voice_search_icon_kangra_elevation));
                int dimension = (int) getResources().getDimension(R.dimen.voice_search_icon_kangra_height);
                int dimension2 = (int) getResources().getDimension(R.dimen.voice_search_icon_kangra_width);
                int dimension3 = (int) getResources().getDimension(R.dimen.voice_search_icon_kangra_padding_horizontal);
                int dimension4 = (int) getResources().getDimension(R.dimen.voice_search_icon_kangra_padding_vertical);
                int dimension5 = (int) getResources().getDimension(R.dimen.voice_search_icon_kangra_padding_horizontal);
                int dimension6 = (int) getResources().getDimension(R.dimen.voice_search_icon_kangra_padding_vertical);
                int i = this.f240676j;
                if (i != 0) {
                    if (i == 4) {
                        dimension2 = (int) getResources().getDimension(R.dimen.voice_search_icon_kangra_width_v2);
                        dimension5 = 0;
                    }
                    getLayoutParams().height = dimension;
                    getLayoutParams().width = dimension2;
                    setPadding(dimension3, dimension4, dimension5, dimension6);
                    int i2 = this.f240676j;
                    if (i2 != 0) {
                        if (i2 == 4) {
                            textView.setVisibility(0);
                            if (!this.f240673g.isEmpty()) {
                                textView.setText(this.f240673g);
                            }
                        }
                        if (!linearLayout.isInLayout()) {
                            linearLayout.requestLayout();
                        }
                        this.f240675i = true;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        }
    }

    /* renamed from: d */
    public final void mo82660d() {
        this.f240678l = getResources().getDrawable(R.drawable.ic_mic_color);
        this.f240679m = getResources().getString(R.string.accessibility_voice_search_button);
    }

    /* renamed from: e */
    public final void mo82661e(boolean z) {
        this.f240669c = z;
        if (z) {
            mo82658b();
            setVisibility(0);
        } else if (this.f240670d) {
            mo82659c();
            setVisibility(0);
        } else {
            setVisibility(8);
        }
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        if (!this.f240669c || (onClickListener = this.f240667a) == null) {
            View.OnClickListener onClickListener2 = this.f240668b;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
                return;
            }
            return;
        }
        ((C88977u) onClickListener).f241113a.mo82666B();
    }

    public ClearOrVoiceButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClearOrVoiceButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f240670d = true;
        this.f240671e = false;
        this.f240672f = null;
        this.f240676j = 2;
        this.f240673g = BuildConfig.FLAVOR;
        this.f240674h = false;
        this.f240675i = false;
        mo82660d();
        mo82659c();
        this.f240669c = false;
        setOnClickListener(this);
    }
}
