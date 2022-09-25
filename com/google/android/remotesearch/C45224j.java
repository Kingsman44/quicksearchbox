package com.google.android.remotesearch;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.remotesearch.j */
/* compiled from: PG */
final class C45224j implements C87682aj {

    /* renamed from: a */
    private final C45221g f118013a;

    public C45224j(C45221g gVar) {
        this.f118013a = gVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.RSS_GMM_COMMUTE_QUERY_RESPONSE) {
            try {
                C45221g gVar = this.f118013a;
                byte[] byteArray = serviceEventData.f236959a.toByteArray();
                Parcel gA = gVar.mo17260gA();
                gA.writeByteArray(byteArray);
                gVar.mo17263hf(1, gA);
            } catch (RemoteException e) {
                C59104x d = C45225k.f118014a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PublicSession");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(54267)).mo56386p("RemoteException: ");
            }
        }
    }
}
