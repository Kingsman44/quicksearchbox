package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.StateSet;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.material.chip.Chip;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.s */
/* compiled from: PG */
final class C129330s extends C5561c {

    /* renamed from: a */
    final /* synthetic */ Chip f355200a;

    /* renamed from: b */
    final /* synthetic */ C129331t f355201b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129330s(C129331t tVar, Chip chip) {
        super(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        this.f355201b = tVar;
        this.f355200a = chip;
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        ((C59052c) ((C59052c) C129331t.f355202a.mo56224b()).mo56372aa(38259)).mo56386p("Suggestion icon resource failed to load.");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo11861c(Object obj, C5582f fVar) {
        Chip chip = this.f355200a;
        C129331t tVar = this.f355201b;
        StateListDrawable stateListDrawable = new StateListDrawable();
        ColorDrawable colorDrawable = new ColorDrawable(C19391a.m36980a(tVar.f355204c, R.attr.colorSurface));
        colorDrawable.setAlpha(96);
        stateListDrawable.addState(new int[]{-16842910}, colorDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(0));
        chip.mo47694q(new LayerDrawable(new Drawable[]{(Drawable) obj, stateListDrawable}));
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        this.f355200a.mo47694q(drawable);
    }
}
