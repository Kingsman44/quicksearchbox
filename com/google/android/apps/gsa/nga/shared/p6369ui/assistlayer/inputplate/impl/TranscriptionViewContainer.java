package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.core.content.p091b.C1874w;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.TranscriptionViewContainer */
/* compiled from: PG */
public class TranscriptionViewContainer extends FrameLayout implements C81723ab {

    /* renamed from: a */
    public static final C59071e f223524a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.TranscriptionViewContainer");

    /* renamed from: b */
    public Boolean f223525b = null;

    /* renamed from: c */
    public final TranscriptionView f223526c;

    /* renamed from: d */
    public final int f223527d;

    /* renamed from: e */
    public final int f223528e;

    /* renamed from: f */
    public final int f223529f;

    /* renamed from: g */
    public final int f223530g;

    /* renamed from: h */
    private final int f223531h;

    /* renamed from: i */
    private final int f223532i;

    /* renamed from: j */
    private int f223533j = -1;

    public TranscriptionViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f223526c = (TranscriptionView) LayoutInflater.from(context).cloneInContext(context).inflate(R.layout.nga_assist_transcription, this, true).findViewById(R.id.nga_assist_transcription);
        this.f223532i = context.getResources().getDimensionPixelOffset(R.dimen.nga_tactile_transcription_text_size);
        this.f223531h = context.getResources().getDimensionPixelOffset(R.dimen.nga_lockscreen_transcription_text_size);
        this.f223527d = context.getResources().getDimensionPixelOffset(R.dimen.nga_transcription_vertical_padding);
        this.f223528e = context.getResources().getDimensionPixelOffset(R.dimen.nga_tactile_transcription_large_top_padding);
        this.f223529f = context.getResources().getDimensionPixelOffset(R.dimen.nga_tactile_transcription_large_non_expandable_top_padding);
        this.f223530g = context.getResources().getDimensionPixelOffset(R.dimen.nga_tactile_transcription_small_top_padding);
    }

    /* renamed from: a */
    private final void m129877a() {
        if (this.f223533j != R.font.google_sans_medium) {
            this.f223533j = R.font.google_sans_medium;
            C1874w.m5110g(getContext(), R.font.google_sans_medium, new C81778cc(this), getHandler());
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getWidth();
        this.f223526c.mo75255b(getWidth());
    }

    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.f223526c.setAlpha(f);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            this.f223526c.mo75255b(0);
        }
        this.f223526c.setVisibility(i);
    }

    /* renamed from: d */
    public final void mo75250d(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            m129877a();
            this.f223526c.setTextSize(0, (float) this.f223532i);
        } else if (i2 == 1) {
            m129877a();
            this.f223526c.setTextSize(0, (float) this.f223531h);
        }
    }
}
