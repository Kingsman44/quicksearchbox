package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.p4552o.p4566l.C60200dk;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.aw */
/* compiled from: PG */
final class C13141aw {

    /* renamed from: a */
    public final Fragment f40723a;

    /* renamed from: b */
    public int f40724b = -1;

    /* renamed from: c */
    public int f40725c = -1;

    /* renamed from: d */
    public int f40726d = -1;

    /* renamed from: e */
    public int f40727e = -1;

    /* renamed from: f */
    public int f40728f = -1;

    /* renamed from: g */
    private final C28443m f40729g;

    public C13141aw(Fragment fragment, C28443m mVar) {
        this.f40723a = fragment;
        this.f40729g = mVar;
    }

    /* renamed from: a */
    public final void mo20919a(LinearLayoutManager linearLayoutManager, int i, int i2) {
        C60200dk dkVar;
        C13140av avVar = new C13140av(this.f40723a.requireView().getContext(), i2);
        avVar.f2449g = i;
        linearLayoutManager.startSmoothScroll(avVar);
        C28443m mVar = this.f40729g;
        if (i2 == -1) {
            dkVar = C60200dk.RIGHT;
        } else {
            dkVar = C60200dk.LEFT;
        }
        C28442l l = C28442l.m53146l(dkVar);
        View findViewById = this.f40723a.requireView().findViewById(R.id.media_rec_plate);
        findViewById.getClass();
        mVar.mo33853c(l, C28485y.m53234a(findViewById));
    }
}
