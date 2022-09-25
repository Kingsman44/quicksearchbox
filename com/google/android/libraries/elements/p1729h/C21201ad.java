package com.google.android.libraries.elements.p1729h;

import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40369aa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.elements.h.ad */
/* compiled from: PG */
final class C21201ad {

    /* renamed from: a */
    private final Object f59484a = new Object();

    /* renamed from: b */
    private volatile long f59485b = 0;

    /* renamed from: c */
    private volatile boolean f59486c = false;

    /* renamed from: d */
    private final List f59487d;

    /* renamed from: e */
    private final List f59488e;

    /* renamed from: f */
    private final C40369aa f59489f;

    public C21201ad(C40369aa aaVar) {
        this.f59489f = aaVar;
        this.f59487d = new ArrayList(15);
        this.f59488e = new ArrayList(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo26238a(String str, C21228z zVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this.f59484a) {
            arrayList = new ArrayList(this.f59487d);
            arrayList2 = new ArrayList(this.f59488e);
            this.f59487d.clear();
            this.f59488e.clear();
        }
        C21197a aVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                aVar = new C21197a();
                zVar.mo26251b(((Long) arrayList.get(i)).intValue());
            } else if (i2 == 1) {
                aVar.f59464a = (Long) arrayList.get(i);
            } else {
                aVar.mo26220b(str);
                aVar.f59465b = (Long) arrayList.get(i);
                ((C21205c) zVar).f59497a = (C21225w) arrayList2.get(i / 3);
                aVar.f59467d = zVar.mo26250a();
                arrayList3.add(aVar);
            }
        }
        return arrayList3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo26239b() {
        if (!this.f59486c) {
            synchronized (this.f59484a) {
                this.f59487d.clear();
                this.f59488e.clear();
                this.f59486c = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo26240c() {
        int size;
        if (!this.f59486c) {
            synchronized (this.f59484a) {
                if (!this.f59486c && (size = this.f59487d.size()) < 15 && size % 3 == 2) {
                    this.f59487d.add(Long.valueOf(TimeUnit.MICROSECONDS.convert(this.f59489f.f106020a.mo26872d(), TimeUnit.NANOSECONDS)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo26241d() {
        int size;
        if (!this.f59486c) {
            synchronized (this.f59484a) {
                if (!this.f59486c && (size = this.f59487d.size()) < 15 && size % 3 == 0) {
                    this.f59485b++;
                    this.f59487d.add(Long.valueOf(this.f59485b));
                    this.f59487d.add(Long.valueOf(TimeUnit.MICROSECONDS.convert(this.f59489f.f106020a.mo26872d(), TimeUnit.NANOSECONDS)));
                    this.f59488e.add(C21224v.m39930a());
                }
            }
        }
    }
}
