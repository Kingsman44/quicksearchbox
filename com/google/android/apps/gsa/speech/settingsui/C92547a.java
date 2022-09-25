package com.google.android.apps.gsa.speech.settingsui;

import android.preference.Preference;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.speech.audio.p7263a.C92154p;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.a */
/* compiled from: PG */
public final class C92547a extends C88994i {

    /* renamed from: a */
    private final boolean f258293a;

    /* renamed from: b */
    private final C86124t f258294b;

    /* renamed from: c */
    private final C58833ax f258295c;

    public C92547a(C86124t tVar, C58833ax axVar) {
        this.f258293a = C92154p.m151288a() == null;
        this.f258294b = tVar;
        this.f258295c = axVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        if (!this.f258294b.mo79746e(C90110fh.f250676bf)) {
            return (this.f258294b.mo79746e(C90110fh.f250677bg) && this.f258295c.mo56113h() && ((C74720bx) this.f258295c.mo56107c()).mo71089f().a()) || this.f258293a;
        }
        return true;
    }
}
