package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.a */
/* compiled from: PG */
public final /* synthetic */ class C111256a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C111262g f309594a;

    /* renamed from: b */
    public final /* synthetic */ View f309595b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f309596c;

    /* renamed from: d */
    public final /* synthetic */ Context f309597d;

    public /* synthetic */ C111256a(C111262g gVar, View view, ImageView imageView, Context context) {
        this.f309594a = gVar;
        this.f309595b = view;
        this.f309596c = imageView;
        this.f309597d = context;
    }

    public final void onClick(View view) {
        C111262g gVar = this.f309594a;
        View view2 = this.f309595b;
        ImageView imageView = this.f309596c;
        Context context = this.f309597d;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            imageView.setImageDrawable(context.getDrawable(R.drawable.quantum_ic_expand_more_white_24));
            gVar.mo99092c();
            ((Button) Objects.requireNonNull(gVar.f309615h)).setVisibility(8);
            return;
        }
        view2.setVisibility(0);
        imageView.setImageDrawable(context.getDrawable(R.drawable.quantum_ic_expand_less_white_24));
        gVar.mo99091b();
        ((Button) Objects.requireNonNull(gVar.f309615h)).setVisibility(0);
    }
}
