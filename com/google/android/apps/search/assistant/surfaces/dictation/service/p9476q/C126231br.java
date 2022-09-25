package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126316ay;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.br */
/* compiled from: PG */
public final /* synthetic */ class C126231br implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126233bt f347837a;

    public /* synthetic */ C126231br(C126233bt btVar) {
        this.f347837a = btVar;
    }

    public final C60870cx apply(Object obj) {
        C126233bt btVar = this.f347837a;
        C126316ay ayVar = (C126316ay) obj;
        if (btVar.f347847h) {
            ((C59052c) ((C59052c) C126233bt.f347840a.mo56226d()).mo56372aa(36968)).mo56389s("Can't start a new oration in a terminated %s [SD]", btVar.f347844e);
            return C60856cj.m92899h(new IllegalStateException("Starting oration in a shut down manager."));
        }
        C126208av avVar = btVar.f347845f;
        if (avVar != null) {
            avVar.mo107461d(C126207au.KICKED_OUT_BY_OTHER_ORATION, (Throwable) null);
        }
        C126208av a = btVar.f347841b.mo70187a(btVar.f347848i.f345896a.f345793l.mo107508a(), btVar.f347842c, new C126227bn(btVar), ayVar);
        btVar.f347845f = a;
        return a.mo107458a();
    }
}
