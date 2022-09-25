package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.av */
/* compiled from: PG */
public final /* synthetic */ class C98989av implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98990aw f276762a;

    /* renamed from: b */
    public final /* synthetic */ Callable f276763b;

    public /* synthetic */ C98989av(C98990aw awVar, Callable callable) {
        this.f276762a = awVar;
        this.f276763b = callable;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C98990aw awVar = this.f276762a;
        Callable callable = this.f276763b;
        try {
            awVar.f276768e.compareAndSet(false, true);
            ((C98975ah) callable).f276674a.mo91357n();
            return C60856cj.m92900i(true);
        } catch (Exception unused) {
            return C60856cj.m92900i(false);
        }
    }
}
