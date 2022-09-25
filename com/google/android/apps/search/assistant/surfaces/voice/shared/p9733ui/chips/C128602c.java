package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips;

import android.content.Context;
import android.content.res.Resources;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.chip.Chip;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.chips.c */
/* compiled from: PG */
public final class C128602c extends C0673gh {

    /* renamed from: a */
    public final Chip f353585a;

    /* renamed from: b */
    public String f353586b = BuildConfig.FLAVOR;

    /* renamed from: c */
    final /* synthetic */ C128604e f353587c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128602c(C128604e eVar, View view) {
        super(view);
        C69664n.m101061g(view, "itemView");
        this.f353587c = eVar;
        View findViewById = view.findViewById(R.id.assistant_regular_material_chip);
        C69664n.m101060f(findViewById, "itemView.findViewById(R.…nt_regular_material_chip)");
        this.f353585a = (Chip) findViewById;
    }

    /* renamed from: a */
    public final void mo108548a(boolean z, boolean z2) {
        Resources resources;
        Context context = this.f353585a.getContext();
        Float f = null;
        if (!(context == null || (resources = context.getResources()) == null)) {
            f = Float.valueOf(resources.getDimension(R.dimen.assistant_chip_horizontal_space));
        }
        if (f != null) {
            float floatValue = f.floatValue();
            Chip chip = this.f353585a;
            if (z && z2) {
                chip.mo47664D(floatValue / 2.0f);
                chip.mo47663C(floatValue);
                chip.mo47662B(floatValue);
                chip.mo47661A(0.0f);
            } else if (z) {
                chip.mo47664D(floatValue);
                chip.mo47663C(floatValue);
                chip.mo47662B(0.0f);
                chip.mo47661A(0.0f);
            } else if (z2) {
                chip.mo47664D(0.0f);
                chip.mo47663C(0.0f);
                chip.mo47662B(floatValue);
                chip.mo47661A(floatValue);
            } else {
                chip.mo47664D(0.0f);
                chip.mo47663C(0.0f);
                chip.mo47662B(0.0f);
                chip.mo47661A(0.0f);
            }
        } else {
            throw new IllegalStateException("Failed to find dimens resource.");
        }
    }
}
