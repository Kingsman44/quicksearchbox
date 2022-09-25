package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p033v7.p040e.C0424f;
import android.support.p033v7.p040e.C0429k;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.C81666a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82013u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import dagger.p5294a.C68221g;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.ChipsCarousel */
/* compiled from: PG */
public class ChipsCarousel extends FrameLayout implements C81666a {

    /* renamed from: a */
    public final TextView f223371a;

    /* renamed from: b */
    public final View f223372b;

    /* renamed from: c */
    public C81714t f223373c;

    /* renamed from: d */
    public final RecyclerView f223374d;

    /* renamed from: e */
    public C81674a f223375e;

    /* renamed from: f */
    public C81698d f223376f;

    /* renamed from: g */
    public C81688an f223377g;

    /* renamed from: h */
    public C81676ab f223378h;

    /* renamed from: i */
    public Optional f223379i;

    /* renamed from: j */
    private final ImageView f223380j;

    public ChipsCarousel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo75225a(boolean z) {
        this.f223380j.setImageTintList(z ? ColorStateList.valueOf(C19391a.m36980a(getContext(), R.attr.colorOnBackground)) : null);
    }

    /* renamed from: b */
    public final void mo75226b(C81715u uVar) {
        C81717w wVar = new C81717w(this);
        C81718x xVar = new C81718x(this);
        C81719y yVar = new C81719y(this);
        Context context = (Context) ((C68221g) uVar.f223471a).f184583a;
        context.getClass();
        Optional optional = (Optional) ((C68221g) uVar.f223472b).f184583a;
        optional.getClass();
        C82013u uVar2 = (C82013u) uVar.f223473c.mo17428b();
        uVar2.getClass();
        C81714t tVar = new C81714t(wVar, xVar, yVar, context, optional, uVar2);
        this.f223373c = tVar;
        this.f223374d.setAdapter(tVar);
    }

    /* renamed from: c */
    public final void mo75227c(C58485gu guVar) {
        C81714t tVar = this.f223373c;
        if (tVar != null) {
            C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(new C81709o(tVar)).collect(C58370cn.f155946a);
            C0424f a = C0429k.m1383a(new C81712r(tVar, guVar2), true);
            tVar.f223462a = guVar2;
            a.mo1398a(new C81713s(tVar));
        }
    }

    public final void setVisibility(int i) {
        if (i != 4) {
            if (i == 8) {
                i = 8;
            }
            super.setVisibility(i);
        }
        this.f223374d.scrollToPosition(0);
        super.setVisibility(i);
    }

    public ChipsCarousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f223379i = Optional.empty();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).cloneInContext(context).inflate(R.layout.nga_assist_chips_carousel, this, true);
        this.f223372b = viewGroup.findViewById(R.id.nga_assist_chips_carousel_header_container);
        this.f223371a = (TextView) viewGroup.findViewById(R.id.nga_assist_chips_carousel_header_text);
        this.f223380j = (ImageView) viewGroup.findViewById(R.id.nga_assist_chips_carousel_header_logo);
        C81677ac acVar = new C81677ac(context, new C81720z(this));
        acVar.setClipToPadding(false);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.nga_assist_chip_carousel_horizontal_margin);
        acVar.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        acVar.setLayoutManager(new C81675aa(this, context));
        this.f223374d = acVar;
        ((FrameLayout) viewGroup.findViewById(R.id.nga_assist_chips_carousel_container)).addView(acVar);
    }
}
