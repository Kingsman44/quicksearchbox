package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80786fg;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82011s;
import com.google.android.material.chip.Chip;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.ar */
/* compiled from: PG */
public final /* synthetic */ class C81692ar implements C82011s {

    /* renamed from: a */
    public final /* synthetic */ C81693as f223418a;

    /* renamed from: b */
    public final /* synthetic */ C80784fe f223419b;

    /* renamed from: c */
    public final /* synthetic */ int f223420c;

    /* renamed from: d */
    public final /* synthetic */ C81674a f223421d;

    /* renamed from: e */
    public final /* synthetic */ C81688an f223422e;

    /* renamed from: f */
    public final /* synthetic */ C81698d f223423f;

    public /* synthetic */ C81692ar(C81693as asVar, C80784fe feVar, int i, C81674a aVar, C81688an anVar, C81698d dVar) {
        this.f223418a = asVar;
        this.f223419b = feVar;
        this.f223420c = i;
        this.f223421d = aVar;
        this.f223422e = anVar;
        this.f223423f = dVar;
    }

    /* renamed from: a */
    public final void mo75243a(View view) {
        C81693as asVar = this.f223418a;
        C80784fe feVar = this.f223419b;
        int i = this.f223420c;
        C81674a aVar = this.f223421d;
        C81688an anVar = this.f223422e;
        C81698d dVar = this.f223423f;
        Chip chip = (Chip) view;
        String f = feVar.mo74609f();
        boolean isEmpty = TextUtils.isEmpty(f);
        C80786fg b = feVar.mo74604b();
        if (!isEmpty) {
            chip.setText(f);
            int h = feVar.mo74611h();
            int i2 = h - 1;
            if (h == 0) {
                throw null;
            } else if (i2 == 0) {
                chip.setTextColor(asVar.f223427d);
            } else if (i2 == 1) {
                chip.setTextColor(asVar.f223426c);
            }
        } else if (b == null || !asVar.f223425b.isPresent()) {
            ((C59052c) ((C59052c) C81693as.f223424a.mo56226d()).mo56372aa(6220)).mo56386p("Neither icon nor label provided; ignoring chipData");
            return;
        }
        if (asVar.f223425b.isPresent()) {
            ((C81697c) asVar.f223425b.get()).mo75244b(chip, feVar, i);
        } else {
            chip.mo47694q((Drawable) null);
        }
        C81691aq.m129832a(chip, feVar, aVar, anVar, dVar);
    }
}
