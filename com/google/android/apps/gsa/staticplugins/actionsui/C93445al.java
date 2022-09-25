package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.contacts.example.ExampleContact;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.al */
/* compiled from: PG */
public final class C93445al extends C93507m implements C93690o, C93492bt {

    /* renamed from: e */
    private C93491bs f260810e;

    public C93445al(Context context) {
        super(context, "HelpCard");
        C89941l.m146512c(this, 7469);
    }

    /* renamed from: A */
    public final void mo87754A(int i) {
        this.f260810e.mo87754A(i);
    }

    /* renamed from: B */
    public final void mo87755B(String str, String str2) {
        this.f260810e.mo87755B(str, str2);
    }

    /* renamed from: a */
    public final void mo87757a(String str) {
        this.f260810e.mo87757a(str);
    }

    /* renamed from: t */
    public final View mo87752t(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C93491bs bsVar = new C93491bs(getContext());
        this.f260810e = bsVar;
        bsVar.mo4475e((float) bsVar.getResources().getDimensionPixelSize(R.dimen.rounded_corner_radius));
        bsVar.f4345f.f4347b.setElevation((float) bsVar.getResources().getDimensionPixelSize(R.dimen.card_elevation));
        bsVar.mo4473c(bsVar.getResources().getColor(R.color.agsa_color_surface_elevation_2));
        C93491bs bsVar2 = this.f260810e;
        bsVar2.f260917i.setOnClickListener(new C93444ak(this));
        return this.f260810e;
    }

    /* renamed from: v */
    public final void mo87758v(String str) {
        this.f260810e.f260915g.setText(str);
    }

    /* renamed from: w */
    public final void mo87759w(String str, String str2) {
        this.f260810e.mo87759w(str, str2);
    }

    /* renamed from: x */
    public final void mo87760x(String str) {
        this.f260810e.mo87760x(str);
    }

    /* renamed from: y */
    public final void mo87761y(ExampleContact exampleContact) {
        this.f260810e.mo87761y(exampleContact);
    }

    /* renamed from: z */
    public final void mo87762z(String str, String str2, String str3) {
        this.f260810e.mo87762z(str, str2, str3);
    }

    /* renamed from: C */
    public final void mo87756C(String str) {
        C93491bs bsVar = this.f260810e;
        C88507a aVar = this.f239232a;
        aVar.getClass();
        bsVar.f260919k = ((C93446am) aVar).mo82040ap();
        this.f260810e.mo87756C(str);
    }
}
