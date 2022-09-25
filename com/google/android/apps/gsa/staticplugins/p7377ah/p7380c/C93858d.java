package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import android.content.Context;
import android.view.LayoutInflater;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.staticplugins.p7377ah.p7379b.C93851a;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.d */
/* compiled from: PG */
final class C93858d {

    /* renamed from: a */
    public final Context f262129a;

    /* renamed from: b */
    public final LayoutInflater f262130b;

    /* renamed from: c */
    public final C93851a f262131c;

    /* renamed from: d */
    public C58485gu f262132d = C58485gu.m89845m();

    /* renamed from: e */
    public Corpus f262133e;

    /* renamed from: f */
    public C44565p f262134f;

    /* renamed from: g */
    public C93863i f262135g;

    public C93858d(Context context, C93851a aVar) {
        this.f262129a = context;
        this.f262131c = aVar;
        this.f262130b = LayoutInflater.from(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88193a(Corpus corpus) {
        this.f262133e = corpus;
        C93863i iVar = this.f262135g;
        if (iVar != null) {
            iVar.f262144c = corpus;
        }
    }
}
