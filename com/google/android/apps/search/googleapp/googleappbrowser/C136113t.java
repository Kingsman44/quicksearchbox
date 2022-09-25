package com.google.android.apps.search.googleapp.googleappbrowser;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.C135948d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.TabsFragmentPeer;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135461g;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.googleappbrowser.p10261b.C135504a;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.t */
/* compiled from: PG */
final class C136113t implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C136109q f370712a;

    public C136113t(C136109q qVar) {
        this.f370712a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        String str;
        C135504a aVar = (C135504a) bVar;
        C136109q qVar = this.f370712a;
        C135948d b = qVar.mo112757b();
        if (b != null) {
            TabsFragmentPeer a = b.mo17754z();
            if (!a.f370263l.f101930a && (str = a.f370255d.mo46384b().f112969h) != null) {
                if (a.f370262k.isEmpty() || a.mo112644b()) {
                    C133118a aVar2 = a.f370259h;
                    aVar2.f362917e++;
                    aVar2.mo110981a(C37182a.f97781aM.mo40805c(C62722b.OK));
                } else {
                    C133118a aVar3 = a.f370259h;
                    ((C59052c) ((C59052c) C133118a.f362913a.mo56224b()).mo56372aa(41416)).mo56386p("#logGoogleAppBrowserCloseButtonClicked");
                    aVar3.f362917e++;
                }
                a.mo112643a(str);
            }
        }
        if (qVar.f370700r.mo112949a()) {
            C135462h hVar = qVar.f370686d;
            if (hVar.f369069i && !hVar.f369072l) {
                C135461g a2 = C135461g.m219650a(hVar.f369064d);
                if (a2 == null) {
                    a2 = C135461g.UNKNOWN;
                }
                qVar.mo112765j(a2);
                return C47392e.f123115a;
            }
        }
        if (qVar.f370700r.mo112949a()) {
            C135462h hVar2 = qVar.f370686d;
            if (hVar2.f369069i && hVar2.f369072l) {
                qVar.f370687e.requireActivity().finishAndRemoveTask();
                return C47392e.f123115a;
            }
        }
        qVar.f370687e.requireActivity().finish();
        return C47392e.f123115a;
    }
}
