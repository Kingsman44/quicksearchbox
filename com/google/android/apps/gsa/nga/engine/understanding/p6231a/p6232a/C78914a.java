package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5922i.C74922o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C78914a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f217133a;

    /* renamed from: b */
    public final /* synthetic */ Object[] f217134b;

    public /* synthetic */ C78914a(String str, Object[] objArr) {
        this.f217133a = str;
        this.f217134b = objArr;
    }

    public final void accept(Object obj) {
        String.format(this.f217133a, this.f217134b);
        ((C74922o) obj).mo71302b();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
