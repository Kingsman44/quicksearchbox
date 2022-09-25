package com.google.android.apps.gsa.plugins.nativeresults.canvas;

import android.os.Handler;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.j */
/* compiled from: PG */
final class C84106j implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ Runnable f229019a;

    /* renamed from: b */
    final /* synthetic */ C84108l f229020b;

    public C84106j(C84108l lVar, Runnable runnable) {
        this.f229020b = lVar;
        this.f229019a = runnable;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C0320v vVar;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.SEND_MEDIA_SESSION_TOKEN) {
            if (serviceEventData.mo81913d(MediaSessionCompat.Token.class)) {
                C84108l lVar = this.f229020b;
                MediaSessionCompat.Token token = (MediaSessionCompat.Token) serviceEventData.mo81912b(MediaSessionCompat.Token.class);
                C58976aa aaVar = C58975e.f156826a;
                lVar.mo77537i();
                try {
                    vVar = new C0320v(lVar.f229023b, token);
                } catch (Exception e) {
                    C20601ca caVar = lVar.f229024c;
                    C20614e eVar = new C20614e();
                    eVar.mo25535e(C19742a.AUDIO_ERROR);
                    eVar.f57824d = "CanvasAudioService";
                    eVar.f57821a = e;
                    eVar.f57822b = "Cannot construct media controller from token ".concat(String.valueOf(String.valueOf(token)));
                    caVar.mo25487b(eVar.mo25531a());
                    vVar = null;
                }
                lVar.f229026e = vVar;
                C0320v vVar2 = lVar.f229026e;
                vVar2.getClass();
                lVar.f229027f = vVar2.mo1037e();
                C0320v vVar3 = lVar.f229026e;
                vVar3.getClass();
                vVar3.mo1040h(lVar.f229028g, (Handler) null);
                this.f229019a.run();
            } else {
                C59104x d = C84108l.f229022a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CanvasAudioService");
                ((C59052c) ((C59052c) d).mo56372aa(7012)).mo56386p("No media session token passed.");
            }
            this.f229020b.f229025d.mo81960b(this, C88244um.SEND_MEDIA_SESSION_TOKEN);
        }
    }
}
