package com.google.android.apps.search.googleapp.stampviewer;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.googleapp.accounts.p10124b.C133155c;
import com.google.android.apps.search.googleapp.incognito.C136226a;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139338t;
import com.google.android.apps.search.googleapp.stampviewer.webview.C139516ac;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.search.logging.p3046g.C39196b;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aml;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.e */
/* compiled from: PG */
public final class C139381e implements C45987ay {

    /* renamed from: a */
    public static final C59071e f379003a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.e");

    /* renamed from: b */
    public final StampViewerActivity f379004b;

    /* renamed from: c */
    public final C139516ac f379005c;

    /* renamed from: d */
    public C28439i f379006d;

    /* renamed from: e */
    private final C139324f f379007e;

    /* renamed from: f */
    private final C28306ab f379008f;

    /* renamed from: g */
    private final C136226a f379009g;

    public C139381e(StampViewerActivity stampViewerActivity, C45989b bVar, C28306ab abVar, C139516ac acVar, C139338t tVar, C136226a aVar, C133155c cVar) {
        C139324f fVar;
        this.f379004b = stampViewerActivity;
        this.f379008f = abVar;
        this.f379005c = acVar;
        this.f379009g = aVar;
        try {
            fVar = tVar.mo114908b(stampViewerActivity.getIntent());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f379003a.mo56225c()).mo56382g(e)).mo56372aa(41367)).mo56386p("#StampViewerActivityPeer");
            stampViewerActivity.finish();
            fVar = C139324f.f378925k;
        }
        this.f379007e = fVar;
        cVar.mo110998a(stampViewerActivity, this, bVar);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        this.f379009g.mo112853b(awVar);
        C139433j a = C139433j.m226574a(awVar.f120815a.f120816a, this.f379007e);
        C0154a aVar = new C0154a(this.f379004b.f727a.f739a.f744e);
        aVar.mo689v(R.id.googleapp_stamp_viewer_activity_container, a, (String) null);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        this.f379006d = null;
        ((C59052c) ((C59052c) ((C59052c) f379003a.mo56226d()).mo56382g(th)).mo56372aa(41368)).mo56386p("#onAccountError");
        this.f379004b.finish();
    }

    /* renamed from: c */
    public final void mo19984c() {
        this.f379006d = null;
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C28313c a = this.f379008f.f76990a.mo33805a(C28427h.m53115a(89198));
        if ((this.f379007e.f378927a & 4) != 0) {
            C62940bt btVar = C39196b.f103148a;
            aml aml = this.f379007e.f378931e;
            if (aml == null) {
                aml = aml.f159155c;
            }
            a.mo33858f(new C28353e(btVar, aml));
        }
        C28306ab abVar = this.f379008f;
        StampViewerActivity stampViewerActivity = this.f379004b;
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        a.mo33859g(C28375ak.m53061c(89315));
        int i = C28485y.f77298f;
        this.f379006d = abVar.mo33801b(stampViewerActivity.findViewById(16908290), a);
    }
}
