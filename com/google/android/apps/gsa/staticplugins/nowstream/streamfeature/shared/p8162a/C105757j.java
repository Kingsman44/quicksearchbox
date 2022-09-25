package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8074uo;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.a.j */
/* compiled from: PG */
public final class C105757j implements C23113i {

    /* renamed from: a */
    private final C105755h f295115a;

    public C105757j(C105755h hVar) {
        this.f295115a = hVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("StreamEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("invalidateEntries")) {
                this.f295115a.mo94976n();
            } else if (str.equals("onScrollEvent_int_long")) {
                this.f295115a.mo86301b(Integer.valueOf(pVar.f63472a.getInt("scrollAmount")).intValue(), Long.valueOf(pVar.f63472a.getLong("scrollEndTimestamp")).longValue());
            } else if (str.equals("onStreamRenderingComplete_long")) {
                this.f295115a.mo94981s(Long.valueOf(pVar.f63472a.getLong("timestampElapsedRealtimeNanos")).longValue());
            } else if (str.equals("onToggleStateAction_com.google.geo.sidekick.ServerModules.ToggleStateAction.State_com.google.geo.sidekick.EntryProto.Entry")) {
                C23259d dVar = new C23259d(C8074uo.values());
                int i = pVar.f63472a.getInt("state");
                this.f295115a.mo85775a((C8074uo) dVar.f63738a[i], (C7718hj) new C23271p(C7718hj.f26927af.getParserForType(), C62921ba.m95368a(), C7718hj.f26927af).mo28733b("entry", pVar));
            } else if (str.equals("refreshEntries_com.google.geo.sidekick.ClientTraceProto.ClientTrace")) {
                C23259d dVar2 = new C23259d(C7642eo.values());
                int i2 = pVar.f63472a.getInt("clientTrace");
                this.f295115a.mo94983u((C7642eo) dVar2.f63738a[i2]);
            }
        }
    }
}
