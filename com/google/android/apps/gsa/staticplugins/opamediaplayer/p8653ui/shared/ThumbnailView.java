package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.ThumbnailView */
/* compiled from: PG */
public class ThumbnailView extends FrameLayout {

    /* renamed from: a */
    public C60870cx f320710a;

    /* renamed from: b */
    public C51012dc f320711b;

    /* renamed from: c */
    public final ImageView f320712c;

    /* renamed from: d */
    private C51012dc f320713d;

    /* renamed from: e */
    private String f320714e;

    /* renamed from: f */
    private final View f320715f;

    /* renamed from: g */
    private final View f320716g;

    public ThumbnailView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo102127a(String str, C51012dc dcVar, C22871g gVar, C115620ah ahVar) {
        C60870cx cxVar;
        if (!dcVar.equals(this.f320713d) || !str.equals(this.f320714e)) {
            this.f320713d = dcVar;
            this.f320714e = str;
            C60870cx cxVar2 = this.f320710a;
            if (cxVar2 != null && !cxVar2.isDone() && !this.f320710a.isCancelled()) {
                this.f320710a.cancel(true);
                this.f320713d = C51012dc.f132813k;
                this.f320714e = BuildConfig.FLAVOR;
            }
            this.f320715f.setBackgroundColor(0);
            this.f320712c.setVisibility(4);
            this.f320716g.setVisibility(4);
            int i = dcVar.f132815a;
            if ((i & 8) == 0 && (i & 2) == 0) {
                mo102128b(str, C115621ai.m191764a(getResources(), str));
            } else if (this.f320711b.equals(dcVar)) {
                this.f320712c.setVisibility(0);
            } else {
                ImageView imageView = this.f320712c;
                C60870cx cxVar3 = (C60870cx) ahVar.f320744c.get(dcVar);
                if (cxVar3 != null) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    if ((dcVar.f132815a & 8) != 0) {
                        cxVar = ahVar.f320742a.mo85422j(dcVar.f132819e.mo59174N(), imageView);
                    } else {
                        cxVar = ahVar.f320742a.mo85421i(dcVar.f132817c, imageView);
                    }
                    cxVar3 = cxVar;
                    C90875ai.m148465b(C115618af.f320738a, cxVar3, ahVar.f320743b, "image-load-done").mo85223a(new C115619ag(ahVar, dcVar, cxVar3));
                }
                this.f320710a = cxVar3;
                C90875ai.m148465b(new C115622aj(this, dcVar), cxVar3, gVar, "load-thumbnail").mo85223a(new C115623ak(this, cxVar3, str));
            }
        }
    }

    /* renamed from: b */
    public final void mo102128b(String str, int i) {
        this.f320715f.setBackgroundColor(i);
        FontFitTextView fontFitTextView = (FontFitTextView) findViewById(R.id.thumbnail_title_text);
        fontFitTextView.f320707a = findViewById(R.id.thumbnail_title_line);
        fontFitTextView.mo102124a(fontFitTextView.getWidth());
        fontFitTextView.setText(str);
        fontFitTextView.setMaxLines(getContext().getResources().getInteger(R.integer.omp_thumbnail_title_max_lines));
        this.f320716g.setVisibility(0);
    }

    public ThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f320711b = C51012dc.f132813k;
        this.f320713d = C51012dc.f132813k;
        this.f320714e = BuildConfig.FLAVOR;
        LayoutInflater.from(context).inflate(R.layout.omp_thumbnail_view, this);
        this.f320715f = getChildAt(0);
        ImageView imageView = (ImageView) findViewById(R.id.thumbnail_image);
        imageView.getClass();
        this.f320712c = imageView;
        View findViewById = findViewById(R.id.title_overlay);
        findViewById.getClass();
        this.f320716g = findViewById;
        setClipToOutline(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C115616ad.f320735a, 0, 0);
        try {
            setBackground(new C115624al(obtainStyledAttributes.getDimension(0, 0.0f), context.getResources().getColor(R.color.quantum_white_100)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
