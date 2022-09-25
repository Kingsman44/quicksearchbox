package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8074uo;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.a.i */
/* compiled from: PG */
public final class C105756i implements C105755h {

    /* renamed from: a */
    private final C23112h f295114a;

    public C105756i(C23112h hVar) {
        this.f295114a = hVar;
    }

    /* renamed from: a */
    public final void mo85775a(C8074uo uoVar, C7718hj hjVar) {
        Bundle bundle = new Bundle();
        C8074uo.values();
        bundle.putInt("state", uoVar.ordinal());
        C7718hj.f26927af.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("entry", C23245b.m43556a(hjVar));
        this.f295114a.mo28345s("onToggleStateAction_com.google.geo.sidekick.ServerModules.ToggleStateAction.State_com.google.geo.sidekick.EntryProto.Entry", "StreamEventsDispatcher", bundle);
    }

    /* renamed from: b */
    public final void mo86301b(int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("scrollAmount", Integer.valueOf(i).intValue());
        bundle.putLong("scrollEndTimestamp", Long.valueOf(j).longValue());
        this.f295114a.mo28345s("onScrollEvent_int_long", "StreamEventsDispatcher", bundle);
    }

    /* renamed from: n */
    public final void mo94976n() {
        this.f295114a.mo28345s("invalidateEntries", "StreamEventsDispatcher", new Bundle());
    }

    /* renamed from: s */
    public final void mo94981s(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("timestampElapsedRealtimeNanos", Long.valueOf(j).longValue());
        this.f295114a.mo28345s("onStreamRenderingComplete_long", "StreamEventsDispatcher", bundle);
    }

    /* renamed from: u */
    public final void mo94983u(C7642eo eoVar) {
        Bundle bundle = new Bundle();
        C7642eo.values();
        bundle.putInt("clientTrace", eoVar.ordinal());
        this.f295114a.mo28345s("refreshEntries_com.google.geo.sidekick.ClientTraceProto.ClientTrace", "StreamEventsDispatcher", bundle);
    }
}
