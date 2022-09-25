package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82011s;
import com.google.android.material.chip.Chip;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.at */
/* compiled from: PG */
public final /* synthetic */ class C81694at implements C82011s {

    /* renamed from: a */
    public final /* synthetic */ C81695au f223428a;

    /* renamed from: b */
    public final /* synthetic */ C80784fe f223429b;

    /* renamed from: c */
    public final /* synthetic */ int f223430c;

    /* renamed from: d */
    public final /* synthetic */ C81674a f223431d;

    /* renamed from: e */
    public final /* synthetic */ C81688an f223432e;

    /* renamed from: f */
    public final /* synthetic */ C81698d f223433f;

    public /* synthetic */ C81694at(C81695au auVar, C80784fe feVar, int i, C81674a aVar, C81688an anVar, C81698d dVar) {
        this.f223428a = auVar;
        this.f223429b = feVar;
        this.f223430c = i;
        this.f223431d = aVar;
        this.f223432e = anVar;
        this.f223433f = dVar;
    }

    /* renamed from: a */
    public final void mo75243a(View view) {
        C81695au auVar = this.f223428a;
        C80784fe feVar = this.f223429b;
        int i = this.f223430c;
        C81674a aVar = this.f223431d;
        C81688an anVar = this.f223432e;
        C81698d dVar = this.f223433f;
        Chip chip = (Chip) view;
        if (auVar.f223434a.isPresent()) {
            ((C81697c) auVar.f223434a.get()).mo75244b(chip, feVar, i);
            C81691aq.m129832a(chip, feVar, aVar, anVar, dVar);
            return;
        }
        chip.mo47694q((Drawable) null);
        chip.setOnClickListener((View.OnClickListener) null);
        chip.setOnLongClickListener((View.OnLongClickListener) null);
    }
}
