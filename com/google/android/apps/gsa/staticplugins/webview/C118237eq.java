package com.google.android.apps.gsa.staticplugins.webview;

import android.os.Bundle;
import android.webkit.WebBackForwardList;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85452b;
import com.google.android.apps.gsa.search.core.webview.C87278x;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Deque;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.eq */
/* compiled from: PG */
public final /* synthetic */ class C118237eq implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C118248fa f328250a;

    /* renamed from: b */
    public final /* synthetic */ C85452b f328251b;

    public /* synthetic */ C118237eq(C118248fa faVar, C85452b bVar) {
        this.f328250a = faVar;
        this.f328251b = bVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C118119ai C = this.f328250a.mo103651C(this.f328251b);
        Query e = C.mo103532e();
        boolean z = true;
        if (!e.mo84416cw()) {
            long j = e.f252749G;
            if (C.f327788G.f235736a.canGoBack() && !C.f327798Q) {
                WebBackForwardList copyBackForwardList = C.f327788G.f235736a.copyBackForwardList();
                int currentIndex = copyBackForwardList.getCurrentIndex();
                if (currentIndex < 0) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    int b = C118119ai.m196239b(copyBackForwardList, copyBackForwardList.getItemAtIndex(currentIndex).getUrl(), currentIndex - 1);
                    if (b < 0) {
                        C58976aa aaVar2 = C58975e.f156826a;
                    } else {
                        C58976aa aaVar3 = C58975e.f156826a;
                        C.f327838s.mo80899v(j);
                        C87278x xVar = C.f327788G;
                        xVar.f235737b.incrementAndGet();
                        xVar.f235736a.goBackOrForward(b - currentIndex);
                        C.mo103537k(new C118116af(10, (String) null, (Query) null, 0));
                        C.f327838s.mo80895r(j);
                        C.f327812ae = 4;
                        return Boolean.valueOf(z);
                    }
                }
            }
            Deque deque = C.f327799R;
            if (deque == null || deque.isEmpty()) {
                C58976aa aaVar4 = C58975e.f156826a;
                C.f327812ae = 3;
            } else {
                C58976aa aaVar5 = C58975e.f156826a;
                WebBackForwardList copyBackForwardList2 = C.f327788G.f235736a.copyBackForwardList();
                int currentIndex2 = copyBackForwardList2.getCurrentIndex();
                if (currentIndex2 >= 0) {
                    String str = C.f327805X;
                    if (str != null) {
                        C.f327804W.remove(str);
                    }
                    C.f327798Q = true;
                    String url = copyBackForwardList2.getItemAtIndex(currentIndex2).getUrl();
                    Bundle bundle = (Bundle) C.f327799R.pollLast();
                    String j2 = C.mo103536j(url, C118119ai.m196240h(bundle));
                    int i = bundle.getInt("velvet:gsa_web_view_controller:substate_scroll_position");
                    if (i >= 0) {
                        C.f327804W.put(j2, Integer.valueOf(i));
                    }
                    C.f327805X = j2;
                    C.f327838s.mo80899v(j);
                    C.f327788G.mo80925d(j2);
                    C.f327791J = false;
                    C.mo103537k(new C118116af(10, (String) null, (Query) null, 0));
                    C.f327838s.mo80895r(j);
                    return Boolean.valueOf(z);
                }
            }
        } else if (C.f327788G.f235736a.copyBackForwardList().getCurrentIndex() > 0) {
            long j3 = e.f252749G;
            C.f327838s.mo80899v(j3);
            C.mo103537k(new C118116af(10, (String) null, (Query) null, 0));
            C.f327788G.mo80924c();
            C.f327838s.mo80895r(j3);
            return Boolean.valueOf(z);
        } else {
            C58976aa aaVar6 = C58975e.f156826a;
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
