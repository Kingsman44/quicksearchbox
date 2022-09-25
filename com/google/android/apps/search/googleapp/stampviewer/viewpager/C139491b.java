package com.google.android.apps.search.googleapp.stampviewer.viewpager;

import android.content.Context;
import android.support.p031v4.app.C0210cb;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C4277j;
import com.google.android.apps.search.googleapp.stampviewer.C139316ab;
import com.google.android.apps.search.googleapp.stampviewer.C139317ac;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139391a;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.apps.search.googleapp.stampviewer.p10499j.C139434a;
import com.google.android.apps.search.googleapp.stampviewer.webview.C139527c;
import com.google.android.apps.search.googleapp.stampviewer.webview.C139618h;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.viewpager.b */
/* compiled from: PG */
public final class C139491b extends C0210cb implements C4277j, C139316ab {

    /* renamed from: c */
    public final C139317ac f379275c;

    /* renamed from: d */
    public C139343y f379276d;
    @Deprecated

    /* renamed from: e */
    private final SparseArray f379277e = new SparseArray();

    /* renamed from: f */
    private final AccountId f379278f;

    /* renamed from: g */
    private final int f379279g;

    /* renamed from: h */
    private final C139434a f379280h;

    /* renamed from: i */
    private final int f379281i;

    /* renamed from: j */
    private final boolean f379282j;

    /* renamed from: k */
    private final boolean f379283k;

    /* renamed from: l */
    private final boolean f379284l;

    /* renamed from: m */
    private final boolean f379285m;

    /* renamed from: n */
    private final FragmentManager f379286n;

    /* renamed from: o */
    private final boolean f379287o;

    /* renamed from: p */
    private final int f379288p;

    /* renamed from: q */
    private int f379289q;

    public C139491b(C139434a aVar, long j, boolean z, boolean z2, FragmentManager fragmentManager, C139317ac acVar, int i, boolean z3, boolean z4, AccountId accountId, boolean z5, C139343y yVar) {
        super(fragmentManager);
        this.f379286n = fragmentManager;
        this.f379275c = acVar;
        this.f379279g = acVar.mo114890a();
        this.f379288p = i;
        this.f379289q = i;
        this.f379278f = accountId;
        this.f379280h = aVar;
        this.f379281i = (int) j;
        this.f379282j = z;
        this.f379283k = z3;
        this.f379284l = z4;
        this.f379285m = z5;
        this.f379287o = z2;
        this.f379276d = yVar;
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
    }

    /* renamed from: b */
    public final Fragment mo668b(int i) {
        C139392b b = this.f379275c.mo114891b(i);
        C56610b bVar = b.f379032b;
        if (bVar == null) {
            bVar = C56610b.f151140k;
        }
        boolean z = false;
        String b2 = this.f379280h.mo114962b(bVar.f151144c, i != this.f379289q || this.f379276d.equals(C139343y.VIEWER_MODE_INLINE), (this.f379281i > 0 && this.f379283k) || this.f379275c.mo114890a() > 1);
        C56610b bVar2 = b.f379032b;
        if (bVar2 == null) {
            bVar2 = C56610b.f151140k;
        }
        C56609a aVar = (C56609a) bVar2.toBuilder();
        aVar.copyOnWrite();
        C56610b bVar3 = (C56610b) aVar.instance;
        b2.getClass();
        bVar3.f151142a |= 2;
        bVar3.f151144c = b2;
        C56610b bVar4 = (C56610b) aVar.build();
        C139391a aVar2 = (C139391a) b.toBuilder();
        aVar2.copyOnWrite();
        C139392b bVar5 = (C139392b) aVar2.instance;
        bVar4.getClass();
        bVar5.f379032b = bVar4;
        bVar5.f379031a |= 1;
        boolean z2 = this.f379284l;
        aVar2.copyOnWrite();
        C139392b bVar6 = (C139392b) aVar2.instance;
        bVar6.f379031a |= 8;
        bVar6.f379035e = z2;
        boolean z3 = i == this.f379289q;
        aVar2.copyOnWrite();
        C139392b bVar7 = (C139392b) aVar2.instance;
        bVar7.f379031a |= 2;
        bVar7.f379033c = z3;
        aVar2.copyOnWrite();
        C139392b bVar8 = (C139392b) aVar2.instance;
        bVar8.f379031a |= 64;
        bVar8.f379038h = i;
        boolean z4 = this.f379285m;
        aVar2.copyOnWrite();
        C139392b bVar9 = (C139392b) aVar2.instance;
        bVar9.f379031a |= 16;
        bVar9.f379036f = z4;
        C139343y yVar = this.f379276d;
        aVar2.copyOnWrite();
        C139392b bVar10 = (C139392b) aVar2.instance;
        bVar10.f379037g = yVar.f378967d;
        bVar10.f379031a |= 32;
        if (i == this.f379288p) {
            z = true;
        }
        aVar2.copyOnWrite();
        C139392b bVar11 = (C139392b) aVar2.instance;
        bVar11.f379031a |= 128;
        bVar11.f379039i = z;
        AccountId accountId = this.f379278f;
        C139527c cVar = new C139527c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        C47243l.m84039a(cVar, (C139392b) aVar2.build());
        if (!this.f379287o) {
            this.f379277e.put(i, cVar);
        }
        return cVar;
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
    }

    /* renamed from: d */
    public final void mo646d(ViewGroup viewGroup, int i, Object obj) {
        if (!this.f379287o) {
            this.f379277e.remove(i);
        }
        super.mo646d(viewGroup, i, obj);
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        int i2 = this.f379289q;
        if (i2 != i) {
            Optional o = mo115008o(i2);
            if (o.isPresent()) {
                ((C139618h) o.get()).mo17754z().mo115126i(false);
            }
            Optional o2 = mo115008o(i);
            if (o2.isPresent()) {
                ((C139618h) o2.get()).mo17754z().mo115126i(true);
            }
            this.f379289q = i;
            Optional o3 = mo115008o(i);
            if (this.f379282j && o3.isPresent() && i >= this.f379279g) {
                View view = ((C139618h) o3.get()).getView();
                view.getClass();
                Snackbar.m79661q((Context) null, view, "Dev: Recommended Story", -1).mo48343h();
            }
        }
    }

    /* renamed from: f */
    public final void mo114889f() {
        mo9178n();
    }

    /* renamed from: k */
    public final int mo9175k() {
        return this.f379275c.mo114890a();
    }

    /* renamed from: o */
    public final Optional mo115008o(int i) {
        if (this.f379287o) {
            for (Fragment fragment : this.f379286n.f634a.mo677i()) {
                if (fragment instanceof C139527c) {
                    C139618h a = ((C139527c) fragment).mo17754z().mo115043a();
                    a.getClass();
                    if (a.mo17754z().f379579c.f379038h == i) {
                        return Optional.m71637of(a);
                    }
                }
            }
            return Optional.empty();
        }
        C139527c cVar = (C139527c) this.f379277e.get(i);
        if (cVar == null || cVar.getView() == null) {
            return Optional.empty();
        }
        C139618h a2 = cVar.mo17754z().mo115043a();
        a2.getClass();
        return Optional.m71637of(a2);
    }
}
