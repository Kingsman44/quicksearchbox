package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8753c.C117094f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.av */
/* compiled from: PG */
public final class C117121av extends C22939d {

    /* renamed from: a */
    public SeekBar f325145a;

    /* renamed from: b */
    public boolean f325146b = false;

    /* renamed from: c */
    public int f325147c = 0;

    /* renamed from: d */
    private final C117094f f325148d;

    /* renamed from: e */
    private final Context f325149e;

    public C117121av(C22945j jVar, C117094f fVar, Context context) {
        super(jVar);
        this.f325148d = fVar;
        this.f325149e = context;
    }

    /* renamed from: e */
    public final int mo103156e() {
        return this.f325145a.getProgress() + this.f325147c;
    }

    /* renamed from: g */
    public final Bundle mo103157g() {
        Bundle bundle = new Bundle();
        bundle.putInt("ALPHA", mo103156e());
        return bundle;
    }

    /* renamed from: h */
    public final void mo103158h(int i) {
        int i2 = i - this.f325147c;
        if (i2 < 0) {
            i2 = 0;
        }
        this.f325145a.setProgress(i2);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f325149e).inflate(R.layout.opacity_menu, (ViewGroup) null, false);
        mo28295iC(linearLayout);
        this.f325145a = (SeekBar) linearLayout.findViewById(R.id.alpha_value_slider);
        int intrinsicWidth = this.f325145a.getThumb().getIntrinsicWidth() / 2;
        this.f325145a.setPadding(intrinsicWidth, 0, intrinsicWidth, 0);
        ((TextView) linearLayout.findViewById(R.id.left_label)).setPadding(intrinsicWidth, 0, intrinsicWidth, 0);
        ((TextView) linearLayout.findViewById(R.id.right_label)).setPadding(intrinsicWidth, 0, intrinsicWidth, 0);
        ((C117132bf) this.f325148d).f325173b.mo28726b(new C117117ar(this));
        ((C117132bf) this.f325148d).f325172a.mo28726b(new C117118as(this));
        linearLayout.findViewById(R.id.close_button).setOnClickListener(new C117119at(this));
        this.f325145a.setOnSeekBarChangeListener(new C117120au(this));
    }
}
