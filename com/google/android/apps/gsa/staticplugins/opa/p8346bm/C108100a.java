package com.google.android.apps.gsa.staticplugins.opa.p8346bm;

import android.util.Pair;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3745ab.C48247bd;
import com.google.assistant.p3897e.p3912f.C51211f;
import com.google.knowledge.p4671b.C61788ag;
import dagger.C68214a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p007b.p011b.p012a.C0031g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bm.a */
/* compiled from: PG */
public final class C108100a {

    /* renamed from: a */
    public final C68214a f300687a;

    /* renamed from: b */
    public int f300688b = 0;

    /* renamed from: c */
    public C51211f f300689c = C51211f.UNKNOWN_SOURCE;

    /* renamed from: d */
    public final AtomicReference f300690d = new AtomicReference((Object) null);

    /* renamed from: e */
    public C0031g f300691e;

    /* renamed from: f */
    public List f300692f;

    /* renamed from: g */
    public final C21370a f300693g;

    /* renamed from: h */
    public long f300694h = 0;

    /* renamed from: i */
    public C48247bd f300695i = C48247bd.f124805e;

    /* renamed from: j */
    private int f300696j = 0;

    /* renamed from: k */
    private boolean f300697k;

    /* renamed from: l */
    private boolean f300698l;

    /* renamed from: m */
    private boolean f300699m;

    /* renamed from: n */
    private int f300700n;

    /* renamed from: o */
    private int f300701o;

    /* renamed from: p */
    private String f300702p;

    /* renamed from: q */
    private boolean f300703q;

    /* renamed from: r */
    private boolean f300704r;

    public C108100a(C68214a aVar, C21370a aVar2) {
        this.f300687a = aVar;
        this.f300693g = aVar2;
    }

    /* renamed from: a */
    public final synchronized int mo96436a() {
        return this.f300696j;
    }

    /* renamed from: b */
    public final synchronized Pair mo96437b() {
        return Pair.create(Integer.valueOf(this.f300700n), Integer.valueOf(this.f300701o));
    }

    /* renamed from: c */
    public final C61788ag mo96438c() {
        return (C61788ag) this.f300690d.get();
    }

    /* renamed from: d */
    public final synchronized String mo96439d() {
        return this.f300702p;
    }

    /* renamed from: e */
    public final synchronized void mo96440e(int i, int i2) {
        this.f300700n = i;
        this.f300701o = i2;
    }

    /* renamed from: f */
    public final synchronized void mo96441f(boolean z) {
        this.f300699m = z;
    }

    /* renamed from: g */
    public final synchronized void mo96442g(String str) {
        this.f300702p = str;
    }

    /* renamed from: h */
    public final synchronized void mo96443h(int i) {
        this.f300696j = i;
    }

    /* renamed from: i */
    public final synchronized void mo96444i(boolean z) {
        this.f300704r = z;
    }

    /* renamed from: j */
    public final synchronized void mo96445j(boolean z) {
        this.f300703q = z;
    }

    /* renamed from: k */
    public final synchronized void mo96446k(boolean z) {
        this.f300697k = z;
    }

    /* renamed from: l */
    public final synchronized void mo96447l(boolean z) {
        this.f300698l = z;
    }

    /* renamed from: m */
    public final synchronized boolean mo96448m() {
        return this.f300704r;
    }

    /* renamed from: n */
    public final synchronized boolean mo96449n() {
        return this.f300703q;
    }

    /* renamed from: o */
    public final synchronized boolean mo96450o() {
        return this.f300697k;
    }

    /* renamed from: p */
    public final synchronized boolean mo96451p() {
        return this.f300698l;
    }

    /* renamed from: q */
    public final synchronized boolean mo96452q() {
        return this.f300699m;
    }
}
