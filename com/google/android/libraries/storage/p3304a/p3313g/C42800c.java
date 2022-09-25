package com.google.android.libraries.storage.p3304a.p3313g;

import android.net.Uri;
import android.util.Pair;
import com.google.android.libraries.storage.p3304a.p3307c.C42763p;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.storage.a.g.c */
/* compiled from: PG */
public abstract class C42800c implements C42799b {
    /* renamed from: a */
    public final long mo45825a(Uri uri) {
        return mo45819r().mo45825a(mo45818q(uri));
    }

    /* renamed from: b */
    public Pair mo45812b(Uri uri) {
        throw null;
    }

    /* renamed from: c */
    public final C42763p mo45826c() {
        return mo45819r().mo45826c();
    }

    /* renamed from: d */
    public /* synthetic */ File mo45813d(Uri uri) {
        throw null;
    }

    /* renamed from: e */
    public InputStream mo45814e(Uri uri) {
        throw null;
    }

    /* renamed from: f */
    public final OutputStream mo45827f(Uri uri) {
        return mo45819r().mo45827f(mo45818q(uri));
    }

    /* renamed from: g */
    public final OutputStream mo45828g(Uri uri) {
        return mo45819r().mo45828g(mo45818q(uri));
    }

    /* renamed from: h */
    public final Iterable mo45829h(Uri uri) {
        ArrayList arrayList = new ArrayList();
        for (Uri p : mo45819r().mo45829h(mo45818q(uri))) {
            arrayList.add(mo45817p(p));
        }
        return arrayList;
    }

    /* renamed from: j */
    public final void mo45830j(Uri uri) {
        mo45819r().mo45830j(mo45818q(uri));
    }

    /* renamed from: k */
    public final void mo45831k(Uri uri) {
        mo45819r().mo45831k(mo45818q(uri));
    }

    /* renamed from: l */
    public final void mo45832l(Uri uri) {
        mo45819r().mo45832l(mo45818q(uri));
    }

    /* renamed from: m */
    public final void mo45833m(Uri uri, Uri uri2) {
        mo45819r().mo45833m(mo45818q(uri), mo45818q(uri2));
    }

    /* renamed from: n */
    public boolean mo45816n(Uri uri) {
        throw null;
    }

    /* renamed from: o */
    public final boolean mo45834o(Uri uri) {
        return mo45819r().mo45834o(mo45818q(uri));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Uri mo45817p(Uri uri) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Uri mo45818q(Uri uri) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract C42799b mo45819r();
}
