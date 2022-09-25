package com.google.apps.tiktok.dataservice.p3638c;

import android.support.p033v7.widget.C0640fb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.apps.tiktok.dataservice.c.h */
/* compiled from: PG */
public final class C46751h {

    /* renamed from: a */
    public final C46755l f122095a;

    /* renamed from: b */
    public final C0640fb f122096b;

    /* renamed from: c */
    public final C46747d f122097c;

    /* renamed from: d */
    public final List f122098d;

    /* renamed from: e */
    public final int f122099e;

    /* renamed from: f */
    public final int[] f122100f;

    /* renamed from: g */
    public int f122101g = 0;

    public C46751h(C46755l lVar, int i) {
        C46750g gVar = new C46750g();
        this.f122096b = gVar;
        this.f122095a = lVar;
        C46747d dVar = new C46747d(lVar);
        this.f122097c = dVar;
        gVar.mObservable.registerObserver(dVar);
        this.f122099e = i;
        this.f122100f = new int[(i + 1)];
        this.f122098d = new ArrayList(i);
        for (int i2 = 0; i2 < this.f122099e; i2++) {
            this.f122098d.add((Object) null);
        }
        lVar.mo50772a(new C46749f(this));
    }
}
