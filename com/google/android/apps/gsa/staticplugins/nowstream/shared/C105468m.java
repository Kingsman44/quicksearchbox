package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.sidekick.shared.p7231b.C91647a;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.m */
/* compiled from: PG */
public final class C105468m implements C91647a {

    /* renamed from: b */
    private static final C59071e f294129b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.shared.m");

    /* renamed from: a */
    public C91647a f294130a;

    /* renamed from: a */
    public final C8142xb mo85966a() {
        C91647a aVar = this.f294130a;
        if (aVar != null) {
            return aVar.mo85966a();
        }
        ((C59052c) ((C59052c) f294129b.mo56226d()).mo56372aa(22329)).mo56386p("Trying to get surfaceType, but ActionLogger is not set.");
        int i = C90755l.f253831a;
        return C8142xb.UNKNOWN_SURFACE;
    }

    /* renamed from: b */
    public final void mo85967b(LoggingRequest loggingRequest) {
        C91647a aVar = this.f294130a;
        if (aVar == null) {
            ((C59052c) ((C59052c) f294129b.mo56226d()).mo56372aa(22330)).mo56386p("Trying to log action with LoggingRequest, but ActionLogger is not set.");
            int i = C90755l.f253831a;
            return;
        }
        aVar.mo85967b(loggingRequest);
    }

    /* renamed from: c */
    public final void mo85968c(C7718hj hjVar, C7681g gVar, C7526an anVar) {
        C91647a aVar = this.f294130a;
        if (aVar == null) {
            ((C59052c) ((C59052c) f294129b.mo56226d()).mo56372aa(22331)).mo56386p("Trying to log action without LoggingRequest, but ActionLogger is not set.");
            int i = C90755l.f253831a;
            return;
        }
        aVar.mo85968c(hjVar, gVar, anVar);
    }

    /* renamed from: d */
    public final void mo85969d(C7718hj hjVar, C7681g gVar) {
        C91647a aVar = this.f294130a;
        if (aVar == null) {
            ((C59052c) ((C59052c) f294129b.mo56226d()).mo56372aa(22332)).mo56386p("Trying to record feedback prompt action, but ActionLogger is not set.");
            int i = C90755l.f253831a;
            return;
        }
        aVar.mo85969d(hjVar, gVar);
    }
}
