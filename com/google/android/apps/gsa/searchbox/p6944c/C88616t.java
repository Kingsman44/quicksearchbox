package com.google.android.apps.gsa.searchbox.p6944c;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.p4522b.C58490gz;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.searchbox.c.t */
/* compiled from: PG */
public final class C88616t implements C41642a {

    /* renamed from: a */
    public final Query f239556a;

    /* renamed from: b */
    public final int f239557b;

    /* renamed from: c */
    public final String f239558c;

    /* renamed from: d */
    public final Query f239559d;

    /* renamed from: e */
    public final long f239560e;

    /* renamed from: f */
    public final Bundle f239561f;

    /* renamed from: g */
    public final C58490gz f239562g = new C58490gz(4);

    public C88616t(Query query, int i, String str, Query query2, C21370a aVar) {
        this.f239556a = query;
        this.f239557b = i;
        this.f239558c = str;
        this.f239559d = query2;
        this.f239560e = aVar.mo26871c();
        this.f239561f = new Bundle();
    }

    /* renamed from: a */
    public final long mo44233a() {
        return this.f239560e;
    }

    /* renamed from: b */
    public final boolean mo44234b() {
        return this.f239561f.getBoolean("cs::on_focus");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C88616t)) {
            return false;
        }
        C88616t tVar = (C88616t) obj;
        if (this == tVar) {
            return true;
        }
        if (this.f239556a.mo84352bk().equals(tVar.f239556a.mo84352bk()) && this.f239557b == tVar.f239557b && this.f239558c.equals(tVar.f239558c) && this.f239556a.mo84367c() == tVar.f239556a.mo84367c() && this.f239561f.getBoolean("bs:bootstrapping") == tVar.f239561f.getBoolean("bs:bootstrapping") && this.f239561f.getBoolean("cs::on_focus") == tVar.f239561f.getBoolean("cs::on_focus") && this.f239561f.getBoolean("cs::on_focus_prefetch") == tVar.f239561f.getBoolean("cs::on_focus_prefetch")) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f239556a.mo84352bk(), Integer.valueOf(this.f239557b), this.f239558c, Integer.valueOf(this.f239556a.mo84367c())});
    }

    public final String toString() {
        return "RootRequest[query=" + this.f239556a + " suggestMode=" + this.f239557b + " corpusId=" + this.f239558c + " lastSeenNonRewrittenQuery=" + this.f239559d + " timestamp=" + this.f239560e + " parameters=" + this.f239561f + "]";
    }
}
