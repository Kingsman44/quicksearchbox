package com.google.android.apps.gsa.staticplugins.p7565bu;

import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.as */
/* compiled from: PG */
public final class C96826as {

    /* renamed from: a */
    public static final C59071e f270771a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bu.as");

    /* renamed from: b */
    public final Object f270772b = new Object();

    /* renamed from: c */
    public final Map f270773c = new HashMap();

    /* renamed from: a */
    public final Optional mo90363a(long j) {
        Optional ofNullable;
        synchronized (this.f270772b) {
            ofNullable = Optional.ofNullable((C96825ar) this.f270773c.remove(Long.valueOf(j)));
        }
        return ofNullable;
    }
}
