package com.google.android.libraries.material.p2205a;

import androidx.p060c.C0984n;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.libraries.material.a.n */
/* compiled from: PG */
public final class C28501n {

    /* renamed from: a */
    public final CopyOnWriteArrayList f77347a;

    /* renamed from: b */
    public final C0984n f77348b;

    /* renamed from: c */
    public int f77349c;

    /* renamed from: d */
    public long f77350d;

    /* renamed from: e */
    public boolean f77351e;

    /* renamed from: f */
    private boolean f77352f;

    /* renamed from: g */
    private final C28494g f77353g = new C28500m(this);

    /* renamed from: h */
    private final C28502o f77354h = new C28499l(this);

    public C28501n(C28498k... kVarArr) {
        this.f77347a = new CopyOnWriteArrayList(kVarArr);
        this.f77348b = new C0984n(1);
        this.f77349c = 1;
        for (int i = 0; i <= 0; i++) {
            C28498k kVar = kVarArr[i];
            kVar.f77334c.add(this.f77354h);
            this.f77348b.put(kVarArr[i], true);
        }
    }

    /* renamed from: a */
    public final void mo33958a() {
        if (!this.f77351e && this.f77352f && this.f77349c != 0) {
            this.f77351e = true;
            C28496i.m53268c().mo33952a(this.f77353g);
        }
    }

    /* renamed from: b */
    public final void mo33959b() {
        if (!this.f77352f) {
            this.f77352f = true;
            this.f77350d = -1;
            mo33958a();
        }
    }

    /* renamed from: c */
    public final void mo33960c() {
        if (this.f77352f) {
            if (this.f77351e) {
                this.f77351e = false;
                C28496i.m53268c().mo33953b(this.f77353g);
            }
            this.f77352f = false;
        }
    }
}
