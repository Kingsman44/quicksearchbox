package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82002j;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82010r;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C82013u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.material.chip.Chip;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.as */
/* compiled from: PG */
final class C81693as extends C82010r {

    /* renamed from: a */
    public static final C59071e f223424a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.as");

    /* renamed from: b */
    public final Optional f223425b;

    /* renamed from: c */
    public final int f223426c;

    /* renamed from: d */
    public final int f223427d;

    private C81693as(FrameLayout frameLayout, int i, C82013u uVar, Optional optional) {
        super(frameLayout, uVar.mo75450a(frameLayout, i, C82002j.m130248c("MaterialChipViewHolder"), Chip.class));
        this.f223425b = optional;
        Context context = frameLayout.getContext();
        this.f223426c = C19391a.m36980a(context, R.attr.colorPrimary);
        this.f223427d = C19391a.m36980a(context, R.attr.colorOnSurface);
    }

    /* renamed from: a */
    static C81693as m129834a(Context context, C82013u uVar, Optional optional) {
        return new C81693as(new FrameLayout(context), R.layout.nga_assist_material_next_chip, uVar, optional);
    }
}
