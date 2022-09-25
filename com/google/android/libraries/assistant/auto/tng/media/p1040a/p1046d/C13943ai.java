package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13982g;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13983h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.ai */
/* compiled from: PG */
final class C13943ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f42439a;

    /* renamed from: b */
    final /* synthetic */ C52176ia f42440b;

    /* renamed from: c */
    final /* synthetic */ C13920d f42441c;

    /* renamed from: d */
    final /* synthetic */ C52174hz f42442d;

    /* renamed from: e */
    final /* synthetic */ C13946al f42443e;

    public C13943ai(C13946al alVar, String str, C52176ia iaVar, C13920d dVar, C52174hz hzVar) {
        this.f42443e = alVar;
        this.f42439a = str;
        this.f42440b = iaVar;
        this.f42441c = dVar;
        this.f42442d = hzVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C13946al.f42444a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45201)).mo56389s("Failure in retrieving media controller for package %s.", this.f42439a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x d = C13946al.f42444a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(45204)).mo56389s("Failed to get media controller from package name: %s", this.f42439a);
            return;
        }
        C0320v vVar = (C0320v) optional.get();
        if (C13983h.m30278e(vVar)) {
            C59104x d2 = C13946al.f42444a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d2).mo56372aa(45203)).mo56389s("Could not execute PREPARE_MEDIA because %s authentication is expired.", this.f42439a);
        } else if (!C13983h.m30279f(vVar, 131072)) {
            C59104x d3 = C13946al.f42444a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d3).mo56372aa(45202)).mo56389s("Could not execute prepare_from_uri because it isn't supported by: %s", vVar.mo1039g());
        } else {
            C13946al.m30234g(vVar, this.f42440b);
            C13942ah ahVar = new C13942ah(this.f42441c, optional);
            C60870cx m = C60856cj.m92904m(C47810es.m84978r(ahVar), this.f42443e.f42447b);
            if (((Boolean) this.f42443e.f42453h.mo17428b()).booleanValue()) {
                C13982g gVar = this.f42443e.f42455j;
                String str = this.f42442d.f136895b;
                gVar.f42571b = m;
                gVar.f42572c = str;
            }
        }
    }
}
