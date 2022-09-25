package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.VideoMetadataView */
/* compiled from: PG */
public class VideoMetadataView extends LinearLayout {

    /* renamed from: a */
    public LinearLayout f285520a;

    /* renamed from: b */
    public LinearLayout f285521b;

    /* renamed from: c */
    public LinearLayout f285522c;

    /* renamed from: d */
    public TextView f285523d;

    /* renamed from: e */
    public TextView f285524e;

    /* renamed from: f */
    public TextView f285525f;

    /* renamed from: g */
    public final List f285526g = new ArrayList();

    /* renamed from: h */
    public final List f285527h = new ArrayList();

    /* renamed from: i */
    public final DateFormat f285528i;

    /* renamed from: j */
    public final NumberFormat f285529j;

    /* renamed from: k */
    public C102374p f285530k;

    public VideoMetadataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        this.f285528i = dateInstance;
        this.f285529j = NumberFormat.getInstance();
        dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
    }

    /* renamed from: b */
    private static final void m169600b(LinearLayout linearLayout) {
        if (linearLayout.getChildCount() == 2) {
            linearLayout.removeViewAt(1);
        }
    }

    /* renamed from: a */
    public final void mo93101a() {
        if (this.f285520a.getChildCount() > 0) {
            LinearLayout linearLayout = this.f285520a;
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            m169600b(this.f285520a);
            return;
        }
        LinearLayout linearLayout2 = this.f285521b;
        linearLayout2.removeViewAt(linearLayout2.getChildCount() - 1);
        m169600b(this.f285521b);
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f285520a = (LinearLayout) findViewById(R.id.video_details_bottom_row);
        this.f285521b = (LinearLayout) findViewById(R.id.video_details_top_row);
        this.f285522c = (LinearLayout) findViewById(R.id.video_watch_layout);
        this.f285523d = (TextView) findViewById(R.id.video_author);
        this.f285524e = (TextView) findViewById(R.id.video_description);
        this.f285525f = (TextView) findViewById(R.id.video_duration);
        this.f285526g.add((LetterSpacingTextView) findViewById(R.id.video_details_label_1));
        this.f285526g.add((LetterSpacingTextView) findViewById(R.id.video_details_label_2));
        this.f285526g.add((LetterSpacingTextView) findViewById(R.id.video_details_label_3));
        this.f285526g.add((LetterSpacingTextView) findViewById(R.id.video_details_label_4));
        this.f285527h.add((TextView) findViewById(R.id.video_details_value_1));
        this.f285527h.add((TextView) findViewById(R.id.video_details_value_2));
        this.f285527h.add((TextView) findViewById(R.id.video_details_value_3));
        this.f285527h.add((TextView) findViewById(R.id.video_details_value_4));
        for (LetterSpacingTextView a : this.f285526g) {
            a.mo93091a();
        }
    }
}
