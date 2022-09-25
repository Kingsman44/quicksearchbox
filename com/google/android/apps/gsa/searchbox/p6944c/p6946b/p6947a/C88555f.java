package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88615s;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89207l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60826bg;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.protobuf.MessageLite;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.a.f */
/* compiled from: PG */
public final class C88555f implements C89200e, C89204i, C89207l, C89199d {

    /* renamed from: a */
    public final C21370a f239334a;

    /* renamed from: b */
    public final C88562m f239335b;

    /* renamed from: c */
    public final C88567r f239336c;

    /* renamed from: d */
    public final SparseArray f239337d = new SparseArray();

    /* renamed from: e */
    public final C58881cr f239338e;

    /* renamed from: f */
    public int f239339f;

    /* renamed from: g */
    public int f239340g;

    /* renamed from: h */
    public int f239341h;

    /* renamed from: i */
    public LruCache f239342i;

    /* renamed from: j */
    private final C68214a f239343j;

    public C88555f(C21370a aVar, C88562m mVar, C88567r rVar, C68214a aVar2, C118827a aVar3) {
        this.f239334a = aVar;
        this.f239335b = mVar;
        this.f239336c = rVar;
        this.f239343j = aVar2;
        this.f239338e = C58886cw.m90973a(new C88554e(aVar3));
    }

    /* renamed from: g */
    public static boolean m143067g(C88616t tVar) {
        if (tVar.f239557b != 7 || TextUtils.isEmpty((CharSequence) tVar.f239562g.mo55427f(false).get("pq"))) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private final void m143068h() {
        for (int i = 0; i < this.f239337d.size(); i++) {
            ((C88561l) this.f239337d.valueAt(i)).mo82230c();
        }
    }

    /* renamed from: c */
    public final C41626a mo82215c(C88616t tVar) {
        MessageLite b = this.f239336c.mo82240b(tVar);
        if (!(b instanceof C54229ar)) {
            return null;
        }
        ((C42876ab) this.f239343j.mo27525b()).mo46039a(new C88553d(this), C60826bg.f164896a);
        return this.f239335b.mo82232a((C54229ar) b, true);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        C58801sm G = ((C88614r) obj).f239548s.listIterator(0);
        while (G.hasNext()) {
            C88561l lVar = (C88561l) G.next();
            this.f239337d.put(lVar.mo82228a(), lVar);
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
        this.f239342i = null;
        m143068h();
    }

    /* renamed from: f */
    public final void mo82216f() {
        this.f239336c.mo82241j();
        this.f239342i = null;
        m143068h();
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        C88615s sVar = (C88615s) obj;
        this.f239339f = 600000;
        this.f239340g = 2;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        this.f239342i = null;
        m143068h();
        this.f239341h = 0;
    }
}
