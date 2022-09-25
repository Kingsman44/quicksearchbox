package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.m */
/* compiled from: PG */
public final /* synthetic */ class C78597m implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78583aa f216397a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f216398b;

    public /* synthetic */ C78597m(C78583aa aaVar, C60870cx cxVar) {
        this.f216397a = aaVar;
        this.f216398b = cxVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78583aa aaVar = this.f216397a;
        try {
            new C90873ag(aaVar.f216351k.mo74912a(), aaVar.f216348h, "[NGA] getAmbientVisualSearchGleamTapPreviewHasShown", new C78602r(aaVar, (Bitmap) C60856cj.m92909r(this.f216398b), (C58485gu) obj)).mo85223a(C78603s.f216407a);
        } catch (ExecutionException e) {
            C59104x c = C78583aa.f216340a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AvsController");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(5238)).mo56386p("Error getting bitmap for screenshot");
        }
    }
}
