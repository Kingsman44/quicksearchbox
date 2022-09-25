package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1065d;

import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.C14046h;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.p1367b.C16939a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.d.b */
/* compiled from: PG */
public final class C14039b implements C16939a {
    /* renamed from: a */
    public final Optional mo21377a(String str) {
        Optional a = C14046h.m30338a(str);
        if (a.isEmpty()) {
            C59104x d = C14040c.f42660a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NewsMBSServiceModule");
            ((C59052c) ((C59052c) d).mo56372aa(45307)).mo56386p("The news Url does not exist");
        } else {
            C59104x b = C14040c.f42660a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NewsMBSServiceModule");
            ((C59052c) ((C59052c) b).mo56372aa(45306)).mo56389s("The news Url is %s.", a.get());
        }
        return a;
    }

    /* renamed from: b */
    public final /* synthetic */ Optional mo21378b() {
        return Optional.empty();
    }
}
