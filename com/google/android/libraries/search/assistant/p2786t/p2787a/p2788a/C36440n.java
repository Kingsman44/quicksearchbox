package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import com.google.android.apps.gsa.notificationlistener.C83387d;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36453d;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36412f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C36440n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36412f f95148a;

    public /* synthetic */ C36440n(C36412f fVar) {
        this.f95148a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C36412f fVar = this.f95148a;
        Void voidR = (Void) obj;
        C36453d dVar = fVar.f95099b;
        if (dVar == null) {
            dVar = C36453d.f95179d;
        }
        if (dVar.f95183c) {
            C36453d dVar2 = fVar.f95099b;
            if (dVar2 == null) {
                dVar2 = C36453d.f95179d;
            }
            if (!C83387d.m132716f(dVar2.f95182b)) {
                ((C59052c) ((C59052c) C36447u.f95161a.mo56226d()).mo56372aa(51483)).mo56386p("Failed to cancel notification after marking it as read");
                return C60856cj.m92899h(new IllegalStateException("Failed to cancel Notification because listener service was unbound."));
            }
        }
        return C60866ct.f164955a;
    }
}
