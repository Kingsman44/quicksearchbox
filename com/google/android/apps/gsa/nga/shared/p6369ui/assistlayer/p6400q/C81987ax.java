package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ax */
/* compiled from: PG */
public final class C81987ax {

    /* renamed from: a */
    public final String f224142a;

    /* renamed from: b */
    public final String f224143b;

    public C81987ax(String str, int i) {
        if (i >= str.length()) {
            this.f224142a = str;
            this.f224143b = BuildConfig.FLAVOR;
            return;
        }
        int i2 = i + 1;
        this.f224142a = str.substring(0, i2);
        this.f224143b = str.substring(i2);
    }

    public C81987ax(String str) {
        this.f224142a = C58837ba.m90858g(BuildConfig.FLAVOR);
        this.f224143b = C58837ba.m90858g(str);
    }
}
