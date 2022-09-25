package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115466j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.g */
/* compiled from: PG */
public final /* synthetic */ class C115545g implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115546h f320490a;

    public /* synthetic */ C115545g(C115546h hVar) {
        this.f320490a = hVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115546h hVar = this.f320490a;
        C115466j jVar = (C115466j) obj;
        C58833ax a = C115485b.m191567a(hVar.f320501k);
        boolean z = a.mo56113h() && ((String) a.mo56107c()).equals(jVar.f320319n) && !jVar.f320309d;
        int i = z ? R.string.omp_pause : R.string.omp_play;
        for (Drawable drawable : hVar.f320496f.getCompoundDrawablesRelative()) {
            if (drawable != null) {
                drawable.setLevel(hVar.f320491a.getResources().getInteger(true != z ? R.integer.omp_play_toggle_level_paused : R.integer.omp_play_toggle_level_playing));
            }
        }
        hVar.f320500j.setContentDescription(hVar.f320491a.getResources().getString(i));
        hVar.f320496f.setText(i);
    }
}
