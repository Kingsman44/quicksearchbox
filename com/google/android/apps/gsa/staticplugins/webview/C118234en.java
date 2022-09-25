package com.google.android.apps.gsa.staticplugins.webview;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.webview.C87278x;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.en */
/* compiled from: PG */
public final /* synthetic */ class C118234en implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328237a;

    /* renamed from: b */
    public final /* synthetic */ C85452b f328238b;

    /* renamed from: c */
    public final /* synthetic */ Query f328239c;

    /* renamed from: d */
    public final /* synthetic */ C87504b f328240d;

    /* renamed from: e */
    public final /* synthetic */ C86231bn f328241e;

    /* renamed from: f */
    public final /* synthetic */ C86230bm f328242f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f328243g;

    public /* synthetic */ C118234en(C118248fa faVar, C85452b bVar, Query query, C87504b bVar2, C86231bn bnVar, C86230bm bmVar, Bundle bundle) {
        this.f328237a = faVar;
        this.f328238b = bVar;
        this.f328239c = query;
        this.f328240d = bVar2;
        this.f328241e = bnVar;
        this.f328242f = bmVar;
        this.f328243g = bundle;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118219dz dzVar;
        Object obj;
        C118248fa faVar = this.f328237a;
        C85452b bVar = this.f328238b;
        Query query = this.f328239c;
        C87504b bVar2 = this.f328240d;
        C86231bn bnVar = this.f328241e;
        C86230bm bmVar = this.f328242f;
        Bundle bundle = this.f328243g;
        C118119ai C = faVar.mo103651C(bVar);
        C.f327792K.getClass();
        C58976aa aaVar = C58975e.f156826a;
        C.f327792K.f231614d = bmVar.f233050a;
        C.f327792K.mo79401c(query);
        if (bundle == null) {
            dzVar = C118219dz.m196361c().mo103513a();
        } else {
            List m = C58485gu.m89845m();
            C58833ax axVar = C58836b.f156633a;
            List parcelableArrayList = bundle.getParcelableArrayList("velvet:webview_history_state:webview_history");
            if (parcelableArrayList != null) {
                m = parcelableArrayList;
            }
            String string = bundle.getString("velvet:webview_history_state:webview_restored_uri");
            if (string != null) {
                axVar = C58833ax.m90834k(string);
            }
            C118218dy c = C118219dz.m196361c();
            c.mo103514b(m);
            ((C118108a) c).f327750a = axVar;
            dzVar = c.mo103513a();
        }
        C.f327829j = bmVar;
        if (query.mo84416cw()) {
            query.mo84416cw();
            C.mo103550x(query);
            List b = dzVar.mo103554b();
            if (b.isEmpty()) {
                C.f327798Q = true;
                UriRequest D = C.mo103530D(query, bVar2, bnVar, C58836b.f156633a);
                String uri = D.f236331a.toString();
                uri.getClass();
                C58495hd a = D.mo81502a();
                a.getClass();
                C.mo103534g();
                obj = C.mo103531c(uri, a, false, query);
                ((C89859i) C.f327841v.mo27525b()).mo83702b(C89849ae.VBUS_WEBVIEW_INVOKE_LOADURL);
            } else if (b.size() <= 1) {
                C.mo103530D(query, bVar2, bnVar, dzVar.mo103553a());
                C87278x xVar = C.f327788G;
                Bundle bundle2 = (Bundle) b.get(0);
                if (xVar.f235738c.get() <= 0) {
                    xVar.f235736a.restoreState(bundle2);
                    obj = new C118118ah(query.f252749G);
                    ((C118118ah) C.f327824e.getAndSet(obj)).mo103525c();
                    ((C89859i) C.f327841v.mo27525b()).mo83702b(C89849ae.VBUS_WEBVIEW_INVOKE_LOADURL);
                } else {
                    throw new IllegalStateException("WebView is not intact before calling restoreState");
                }
            } else {
                throw new IllegalStateException("History bundle shouldn't be more than 1 when substate is disabled");
            }
        } else {
            C.mo103550x(query);
            C.f327798Q = true;
            C.f327799R = null;
            C.mo103534g();
            C.f327804W.clear();
            List b2 = dzVar.mo103554b();
            if (b2 != null) {
                C.f327799R = new ArrayDeque();
                C.f327799R.addAll(b2);
                if (!C.f327799R.isEmpty()) {
                    C.f327812ae = 2;
                }
            }
            UriRequest D2 = C.mo103530D(query, bVar2, bnVar, C58836b.f156633a);
            String uri2 = D2.f236331a.toString();
            uri2.getClass();
            C58495hd a2 = D2.mo81502a();
            a2.getClass();
            Deque deque = C.f327799R;
            if (deque != null && !deque.isEmpty()) {
                Bundle bundle3 = (Bundle) C.f327799R.pollLast();
                uri2 = C.mo103536j(uri2, C118119ai.m196240h(bundle3));
                C.f327805X = uri2;
                C.f327804W.put(uri2, Integer.valueOf(bundle3.getInt("velvet:gsa_web_view_controller:substate_scroll_position")));
            }
            obj = C.mo103531c(uri2, a2, false, query);
            long f = C.f327833n.mo26874f();
            C.f327796O.cancel(false);
            long j = C.f327794M;
            if (j > f) {
                C.f327795N = true;
                C.f327796O = C.f327836q.mo28208h("endPreviousResultsSuppression", j - f, new C118266w(C));
            } else {
                C.f327795N = false;
            }
            ((C89859i) C.f327841v.mo27525b()).mo83702b(C89849ae.VBUS_WEBVIEW_INVOKE_LOADURL);
        }
        C118183cq cqVar = C.f327793L;
        cqVar.getClass();
        cqVar.mo103636b(query);
        faVar.f328282k = bVar2;
        return obj;
    }
}
