package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1932q.p1933a.C23324c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.o */
/* compiled from: PG */
public final class C107345o {

    /* renamed from: c */
    private static final C59071e f298733c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.o");

    /* renamed from: a */
    public C23324c f298734a;

    /* renamed from: b */
    public final Queue f298735b = new ArrayDeque();

    /* renamed from: d */
    private final C22871g f298736d;

    public C107345o(Context context, C22871g gVar) {
        this.f298736d = gVar;
        gVar.mo28212l("Init SsbServiceClient", new C107343m(this, context));
    }

    /* renamed from: a */
    public final void mo95921a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            C23324c cVar = this.f298734a;
            C23324c.m43753b();
            if (cVar.mo28821d()) {
                Message obtain = Message.obtain((Handler) null, 6);
                obtain.getData().putBoolean("ssb_service:ssb_enable_hotword_service", z);
                try {
                    cVar.mo28820c(obtain);
                } catch (RemoteException e) {
                    ((C59052c) ((C59052c) ((C59052c) C23324c.f63825a.mo56226d()).mo56382g(e)).mo56372aa(48655)).mo56386p("REQUEST_HOTWORD_DETECTION message failed");
                }
            }
        } catch (Exception e2) {
            C59104x c = f298733c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AppIntegSsbServiceCntlr");
            ((C59052c) ((C59052c) c).mo56372aa(23669)).mo56386p("#sendMessageForHotwordDetection(): Error occurs when requesting hotword service detection.");
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo95922b(Boolean bool) {
        C58976aa aaVar = C58975e.f156826a;
        this.f298736d.mo28212l("Connect to ssb service", new C107342l(this, bool));
    }
}
