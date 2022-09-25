package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.os.Bundle;
import android.support.p031v4.app.C0210cb;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.assistant.p3861at.C50270qw;
import com.google.assistant.p3861at.C50282rh;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.as */
/* compiled from: PG */
public final class C9906as extends C0210cb {

    /* renamed from: c */
    private final C50282rh f33968c;

    /* renamed from: d */
    private final int f33969d;

    public C9906as(FragmentManager fragmentManager, C50282rh rhVar, int i) {
        super(fragmentManager);
        this.f33968c = rhVar;
        this.f33969d = i;
    }

    /* renamed from: b */
    public final Fragment mo668b(int i) {
        int i2 = this.f33969d;
        Bundle bundle = new Bundle();
        bundle.putInt("index_arg", i);
        bundle.putInt("focus_target", i2);
        C9943bz bzVar = new C9943bz();
        C68324h.m98669f(bzVar);
        bzVar.setArguments(bundle);
        return bzVar;
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f33968c.f130765b.size();
    }

    /* renamed from: m */
    public final CharSequence mo9177m(int i) {
        return ((C50270qw) this.f33968c.f130765b.get(i)).f130728a;
    }
}
