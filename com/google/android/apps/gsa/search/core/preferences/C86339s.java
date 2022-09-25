package com.google.android.apps.gsa.search.core.preferences;

import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.s */
/* compiled from: PG */
public final /* synthetic */ class C86339s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C86346z f233431a;

    /* renamed from: b */
    public final /* synthetic */ Collection f233432b;

    /* renamed from: c */
    public final /* synthetic */ Set f233433c;

    public /* synthetic */ C86339s(C86346z zVar, Collection collection, Set set) {
        this.f233431a = zVar;
        this.f233432b = collection;
        this.f233433c = set;
    }

    public final void run() {
        this.f233431a.mo80102h(this.f233432b, this.f233433c);
    }
}
