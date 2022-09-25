package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9420a.C125011a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9830a.C129570a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.C128560a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.C128564b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.p9732a.C128563c;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71643cp;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.s */
/* compiled from: PG */
final /* synthetic */ class C129497s implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C129484h f355532a;

    public C129497s(C129484h hVar) {
        this.f355532a = hVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C119903v vVar;
        C119904w wVar = (C119904w) obj;
        C69664n.m101061g(wVar, "p0");
        C129484h hVar = this.f355532a;
        C125011a.m204943a(wVar);
        if (wVar.f333911a == 2) {
            vVar = (C119903v) wVar.f333912b;
        } else {
            vVar = C119903v.f333904d;
        }
        if (vVar.f333906a == 1) {
            C129570a a = hVar.mo109052a();
            if (a != null) {
                a.mo109108i();
            }
        } else {
            C129570a a2 = hVar.mo109052a();
            if (a2 != null) {
                a2.mo109109j();
            }
        }
        if (wVar.f333911a != 1) {
            C128563c cVar = (C128563c) hVar.f355507o;
            C71643cp cpVar = cVar.f353510c;
            if (cpVar != null) {
                cpVar.mo62723u((CancellationException) null);
            }
            cVar.mo108519c(C128564b.CANCELLED);
        } else if (hVar.f355508p.isDeviceLocked()) {
            C128560a aVar = hVar.f355507o;
            Duration ofSeconds = Duration.ofSeconds(30);
            C69664n.m101060f(ofSeconds, "ofSeconds(30)");
            aVar.mo108518b(ofSeconds);
        }
    }
}
