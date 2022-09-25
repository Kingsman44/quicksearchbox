package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.webview.C87258d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ci */
/* compiled from: PG */
public final class C116625ci extends C116780ib implements C87258d {

    /* renamed from: a */
    public Query f323444a = Query.f252741b;

    /* renamed from: b */
    public int f323445b = 0;

    /* renamed from: c */
    public int f323446c = 0;

    /* renamed from: d */
    private final BitFlags f323447d = new BitFlags(getClass(), "FLAG_", 0);

    public C116625ci(C68214a aVar) {
        super(aVar, 158);
    }

    /* renamed from: a */
    public final void mo80874a(Query query, int i, int i2) {
        if (query.mo84383cP(this.f323444a) && m193521j(i, i2)) {
            mo80591ar();
        }
    }

    /* renamed from: e */
    public final void mo102803e() {
        int i = this.f323444a.mo84263a("query-header-visibility") == 2 ? 3 : 0;
        if (m193521j(i, i)) {
            mo80591ar();
        }
    }

    /* renamed from: g */
    public final boolean mo102804g() {
        return BitFlags.m148144f(this.f323447d.f253762b, 4);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("HeaderState");
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f323447d.toString()));
    }

    /* renamed from: i */
    public final boolean mo102805i() {
        int a = this.f323444a.mo84263a("query-header-visibility");
        return a == 1 || a == 2;
    }

    public final String toString() {
        String b = this.f323447d.mo85048b();
        return "HeaderState[, flags=" + b + "]";
    }

    /* renamed from: j */
    private final boolean m193521j(int i, int i2) {
        int i3 = 0;
        if (this.f323445b == i && this.f323446c == i2) {
            return false;
        }
        this.f323445b = i;
        this.f323446c = i2;
        if (i == 1 || i == 2) {
            this.f323445b = 0;
            i = 0;
        }
        if (i2 == 1 || i2 == 2) {
            this.f323446c = 0;
            i2 = 0;
        } else {
            i3 = i2;
        }
        if (i == 3) {
            if (i2 == 3) {
                this.f323447d.mo85049c(0, 4);
                return true;
            }
        } else if (i == 5 && i3 == 5) {
            this.f323447d.mo85049c(0, 4);
            return true;
        }
        this.f323447d.mo85049c(4, 0);
        return true;
    }
}
