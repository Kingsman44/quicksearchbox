package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.bi */
/* compiled from: PG */
abstract class C30381bi extends C30373ba {

    /* renamed from: g */
    public final int f82133g;

    /* renamed from: h */
    public ImageView f82134h;

    public C30381bi(ViewGroup viewGroup, Context context, C30897z zVar) {
        super(viewGroup, context, zVar);
        this.f82133g = C30899a.m57682a(context, R.attr.ogIconColor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35938b(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo35947c(C2391v vVar) {
        super.mo35947c(vVar);
        C58838bb.m90866a(this.f82112f, "setCardModel has to be called before attaching view.");
        ((C30379bg) this.f82112f).f82131k.mo5707k(vVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo35948d(ViewGroup viewGroup, ViewGroup viewGroup2) {
        View inflate = LayoutInflater.from(this.f82107a).inflate(R.layout.og_icon_dynamic_card, viewGroup);
        this.f82134h = (ImageView) inflate.findViewById(R.id.og_card_icon);
        mo35938b((ViewGroup) inflate.findViewById(R.id.og_card_view_container));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo35952e(C2391v vVar, C30379bg bgVar) {
        super.mo35937a(vVar, bgVar);
        bgVar.f82131k.mo5704e(vVar, new C30380bh(this));
    }
}
