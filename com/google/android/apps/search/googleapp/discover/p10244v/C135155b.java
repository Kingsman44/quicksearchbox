package com.google.android.apps.search.googleapp.discover.p10244v;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.b */
/* compiled from: PG */
public final class C135155b {

    /* renamed from: a */
    public final Executor f368127a;

    /* renamed from: b */
    public final Object f368128b = new Object();

    /* renamed from: c */
    public String f368129c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public List f368130d = new ArrayList();

    public C135155b(Executor executor) {
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f368127a = executor;
    }
}
