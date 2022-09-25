package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C13393e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15481g f41165a;

    public /* synthetic */ C13393e(C15481g gVar) {
        this.f41165a = gVar;
    }

    public final C60870cx apply(Object obj) {
        C15481g gVar = this.f41165a;
        Throwable th = (Throwable) obj;
        C59104x d = C13395g.f41166a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotifAnnounce");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44791)).mo56386p("Failed to execute online tts request.");
        if (th instanceof CancellationException) {
            C13395g.m29663a(C62722b.CANCELLED, gVar);
            return C60856cj.m92898g();
        }
        C13395g.m29663a(C62722b.ABORTED, gVar);
        return C60856cj.m92899h(th);
    }
}
