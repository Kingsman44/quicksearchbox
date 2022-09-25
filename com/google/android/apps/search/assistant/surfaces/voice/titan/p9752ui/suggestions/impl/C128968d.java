package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.suggestions.impl;

import android.content.Context;
import android.content.res.Resources;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.chip.Chip;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.suggestions.impl.d */
/* compiled from: PG */
public final class C128968d extends C0673gh {

    /* renamed from: a */
    public String f354366a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C51992gr f354367b;

    /* renamed from: c */
    public final Chip f354368c;

    /* renamed from: d */
    final /* synthetic */ C128970f f354369d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128968d(C128970f fVar, View view) {
        super(view);
        C69664n.m101061g(view, "itemView");
        this.f354369d = fVar;
        C51992gr grVar = C51992gr.f136445r;
        C69664n.m101060f(grVar, "getDefaultInstance()");
        this.f354367b = grVar;
        View findViewById = view.findViewById(R.id.assistant_voice_plate_suggestions_chip);
        C69664n.m101060f(findViewById, "itemView.findViewById(R.…e_plate_suggestions_chip)");
        this.f354368c = (Chip) findViewById;
    }

    /* renamed from: a */
    public final void mo108779a(boolean z, boolean z2) {
        Resources resources;
        this.f354368c.mo47664D(0.0f);
        this.f354368c.mo47663C(0.0f);
        this.f354368c.mo47662B(0.0f);
        this.f354368c.mo47661A(0.0f);
        Context context = this.f354369d.f354374c.getContext();
        Float f = null;
        if (!(context == null || (resources = context.getResources()) == null)) {
            f = Float.valueOf(resources.getDimension(R.dimen.assistant_voice_plate_suggestions_horizontal_space));
        }
        C69664n.m101058d(f);
        float floatValue = f.floatValue();
        if (z && z2) {
            this.f354368c.mo47664D(floatValue / 2.0f);
            this.f354368c.mo47663C(floatValue);
            this.f354368c.mo47662B(floatValue);
        } else if (z) {
            this.f354368c.mo47664D(floatValue);
            this.f354368c.mo47663C(floatValue);
        } else if (z2) {
            this.f354368c.mo47662B(floatValue);
            this.f354368c.mo47661A(floatValue);
        }
    }
}
