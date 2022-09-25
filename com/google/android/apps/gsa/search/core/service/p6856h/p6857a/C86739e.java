package com.google.android.apps.gsa.search.core.service.p6856h.p6857a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.service.h.a.e */
/* compiled from: PG */
public final class C86739e {

    /* renamed from: a */
    public static final C59071e f234306a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.h.a.e");

    /* renamed from: b */
    public final C22871g f234307b;

    /* renamed from: c */
    public final Map f234308c;

    /* renamed from: d */
    private final C22871g f234309d;

    public C86739e(Map map, C22871g gVar, C22871g gVar2) {
        this.f234308c = map;
        this.f234309d = gVar;
        this.f234307b = gVar2;
    }

    /* renamed from: a */
    public final C60870cx mo80353a(String str) {
        return this.f234309d.mo28202b("Loading worker: ".concat(String.valueOf(str)), new C86737c(this, str));
    }
}
