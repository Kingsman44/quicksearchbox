package com.google.android.apps.gsa.search.core.p6513aj;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.assistant.shared.bd;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.p6864a.C86794i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;

/* renamed from: com.google.android.apps.gsa.search.core.aj.aw */
/* compiled from: PG */
public final class C84538aw {

    /* renamed from: a */
    public final C58833ax f230056a;

    /* renamed from: b */
    public final C84516aa f230057b;

    /* renamed from: c */
    public final C86794i f230058c;

    /* renamed from: d */
    private final Context f230059d;

    /* renamed from: e */
    private final C86124t f230060e;

    /* renamed from: f */
    private final bm f230061f;

    /* renamed from: g */
    private final C58833ax f230062g;

    /* renamed from: h */
    private final C58833ax f230063h;

    /* renamed from: i */
    private final C91123v f230064i;

    public C84538aw(Context context, C86124t tVar, bm bmVar, C91123v vVar, C58833ax axVar, C58833ax axVar2, C84516aa aaVar, C86794i iVar, C58833ax axVar3) {
        this.f230059d = context;
        this.f230060e = tVar;
        this.f230061f = bmVar;
        this.f230064i = vVar;
        this.f230056a = axVar;
        this.f230062g = axVar2;
        this.f230057b = aaVar;
        this.f230058c = iVar;
        this.f230063h = axVar3;
    }

    /* renamed from: g */
    private final boolean m135190g(boolean z, boolean z2) {
        if (!this.f230064i.mo85390b()) {
            return z || z2;
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m135191h() {
        return C90721ae.f253797f.contains(((bd) ((C58847bk) this.f230056a).f156646a).l());
    }

    /* renamed from: a */
    public final Query mo78245a(boolean z, boolean z2, boolean z3, Uri uri, boolean z4) {
        Query ag = Query.f252741b.mo84295ag(z, z2, z3);
        if (mo78248d()) {
            ag = ag.mo84241D();
        }
        return uri != null ? ag.mo84298aj(uri, 0, z4) : ag;
    }

    /* renamed from: b */
    public final Query mo78246b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Uri uri, int i, boolean z6, boolean z7) {
        Query query;
        boolean z8 = z;
        boolean z9 = z3;
        Uri uri2 = uri;
        boolean g = m135190g(z3, z4);
        if (z7) {
            query = Query.m147222ac(Query.f252741b.mo84480i(), true, false, false, false, false, false, true).mo84286aW(QueryTriggerType.HOTWORD);
        } else if (g && !m135191h()) {
            query = Query.m147222ac(Query.f252741b.mo84480i(), true, false, false, false, false, false, false).mo84286aW(QueryTriggerType.HOTWORD).mo84241D();
            if (this.f230061f.s() && mo78250f(z6)) {
                query = query.mo84246I();
            }
        } else if (!z5) {
            if (((az) ((C58847bk) this.f230063h).f156646a).l()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.opa.extra.INITIAL_QUERY", true);
                query = Query.f252741b.mo84245H(1, true, (QueryTriggerType) null).mo84302an("android.opa.extra.MINI_PLATE_ENABLED", true).mo84278aO("user-agent-suffix", "AssistantDrivingMode").mo84264aA("and.opa.morris.hotword", bundle).mo84286aW(QueryTriggerType.OPA_MORRIS_HOTWORD).mo84260X(true);
                if (z9) {
                    query = query.mo84241D();
                }
            } else {
                query = Query.f252741b.mo84296ah();
            }
        } else if (!z8 || g || (this.f230061f.s() && this.f230060e.mo79746e(C90014bt.f247232dK))) {
            String str = "and.opa.hotword";
            if (this.f230064i.mo85390b()) {
                Query query2 = Query.f252741b;
                QueryTriggerType queryTriggerType = QueryTriggerType.HOTWORD;
                Bundle bundle2 = new Bundle();
                bundle2.putString("application-id-override", "gearhead");
                if (!TextUtils.isEmpty("AndroidAutoCarEmbedded")) {
                    bundle2.putString("user-agent-suffix", "AndroidAutoCarEmbedded");
                }
                C90498f i2 = query2.mo84480i();
                i2.mo84562U(1);
                i2.mo84572d(0, 16384);
                i2.mo84572d(0, 2097152);
                i2.mo84572d(0, 562949953421312L);
                i2.mo84572d(0, 1024);
                i2.mo84561T(queryTriggerType);
                i2.mo84589u(bundle2);
                query = i2.mo84568a().mo84342ba(3).mo84264aA(str, new Bundle());
            } else if (this.f230061f.s() || (((bd) ((C58847bk) this.f230056a).f156646a).s() && this.f230061f.u() && this.f230061f.w())) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("android.opa.extra.INITIAL_QUERY", true);
                Query H = Query.f252741b.mo84245H(1, true, (QueryTriggerType) null);
                if (true == z8) {
                    str = "and.opa.lockscreen.hotword";
                }
                Query aU = H.mo84264aA(str, bundle3).mo84286aW(QueryTriggerType.HOTWORD).mo84342ba(3).mo84284aU(C90685b.m148054b(this.f230059d, this.f230060e));
                if (g) {
                    query = aU.mo84241D().mo84260X(true).mo84302an("android.opa.extra.MINI_PLATE_ENABLED", true);
                } else {
                    Query j = ((bd) ((C58847bk) this.f230056a).f156646a).j(aU);
                    if (!z2) {
                        j = j.mo84291ab();
                    }
                    query = (!z8 || !this.f230060e.mo79746e(C90014bt.f247232dK)) ? j : j.mo84302an("android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN", true);
                }
            } else {
                query = Query.f252741b.mo84296ah().mo84342ba(3);
            }
        } else {
            query = Query.f252741b.mo84296ah().mo84342ba(4);
            if (!z2) {
                query = query.mo84291ab();
            }
        }
        return uri2 != null ? query.mo84298aj(uri2, i, false) : query;
    }

    /* renamed from: c */
    public final Query mo78247c(boolean z, boolean z2, boolean z3, boolean z4, Uri uri, boolean z5) {
        Query a = mo78245a(z, z2, z4, uri, z5);
        if (!z4 && z3) {
            return a.mo84342ba(6);
        }
        return a;
    }

    /* renamed from: d */
    public final boolean mo78248d() {
        return m135190g(this.f230058c.mo80452c(), this.f230058c.mo80451b());
    }

    /* renamed from: e */
    public final boolean mo78249e() {
        return this.f230061f.u() && !this.f230061f.n();
    }

    /* renamed from: f */
    public final boolean mo78250f(boolean z) {
        return (((Boolean) this.f230062g.mo56106b(C84537av.f230055a).mo56109e(Boolean.FALSE)).booleanValue() && z) || m135191h();
    }
}
