package com.google.android.libraries.search.assistant.performer.p2757g;

import android.os.Bundle;
import android.support.p031v4.media.session.C0320v;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36081e;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.ap */
/* compiled from: PG */
public final /* synthetic */ class C36046ap implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f94281a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f94282b;

    /* renamed from: c */
    public final /* synthetic */ C52174hz f94283c;

    /* renamed from: d */
    public final /* synthetic */ String f94284d;

    /* renamed from: e */
    public final /* synthetic */ C52176ia f94285e;

    public /* synthetic */ C36046ap(C60870cx cxVar, C60870cx cxVar2, C52174hz hzVar, String str, C52176ia iaVar) {
        this.f94281a = cxVar;
        this.f94282b = cxVar2;
        this.f94283c = hzVar;
        this.f94284d = str;
        this.f94285e = iaVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar = this.f94281a;
        C60870cx cxVar2 = this.f94282b;
        C52174hz hzVar = this.f94283c;
        String str = this.f94284d;
        C52176ia iaVar = this.f94285e;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        C36081e c = C36052av.m64449c(true, hzVar, (Bundle) C60856cj.m92909r(cxVar2));
        if (c == null) {
            return C60866ct.f164955a;
        }
        if (optional.isEmpty()) {
            C59104x d = C36052av.f94290a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d).mo56372aa(52129)).mo56389s("Failed to get media controller from package name: %s", str);
            return C60866ct.f164955a;
        }
        C0320v vVar = (C0320v) optional.get();
        if (C18434a.m35906b(vVar)) {
            C59104x d2 = C36052av.f94290a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d2).mo56372aa(52128)).mo56389s("Could not execute PREPARE_MEDIA because %s authentication is expired.", str);
            return C60866ct.f164955a;
        } else if (!C18434a.m35907c(vVar, 131072)) {
            C59104x d3 = C36052av.f94290a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "MediaInitPerformer");
            ((C59052c) ((C59052c) d3).mo56372aa(52127)).mo56389s("Could not execute prepare_from_uri because it isn't supported by: %s", vVar.mo1039g());
            return C60866ct.f164955a;
        } else {
            C36052av.m64450e(vVar, iaVar);
            c.mo21374a(vVar.mo1037e());
            return C60866ct.f164955a;
        }
    }
}
