package com.google.android.apps.gsa.staticplugins.searchwidget.p8755b;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.common.p4552o.C60519sx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.b.t */
/* compiled from: PG */
public final class C117232t implements C117226n {

    /* renamed from: a */
    private final bm f325423a;

    public C117232t(bm bmVar) {
        this.f325423a = bmVar;
    }

    /* renamed from: a */
    public final List mo103197a() {
        return new ArrayList();
    }

    /* renamed from: b */
    public final List mo103198b() {
        ArrayList arrayList = new ArrayList();
        if (!this.f325423a.q()) {
            arrayList.add(C60519sx.DEVICE_NOT_SUPPORTED);
        }
        if (!this.f325423a.t()) {
            arrayList.add(C60519sx.LOCALE_NOT_SUPPORTED);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo103199c() {
        return this.f325423a.u() && !this.f325423a.w();
    }

    /* renamed from: d */
    public final boolean mo103200d() {
        return this.f325423a.u() && this.f325423a.w();
    }

    /* renamed from: e */
    public final boolean mo103201e() {
        return !this.f325423a.u();
    }
}
