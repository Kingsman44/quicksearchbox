package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139868d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.protobuf.C62944bx;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.x */
/* compiled from: PG */
public final class C138909x implements C139868d {

    /* renamed from: a */
    private final int f377838a;

    public C138909x(int i) {
        this.f377838a = i;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return -1;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Fragment mo112669b() {
        C62944bx a = C62944bx.m95448a(this.f377838a);
        C138911z zVar = new C138911z();
        C68324h.m98669f(zVar);
        C47243l.m84039a(zVar, a);
        return zVar;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
