package com.google.android.apps.gsa.staticplugins.videoplayer.p8782b;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.b.b */
/* compiled from: PG */
public final class C117548b implements C117547a {

    /* renamed from: a */
    private final C23112h f326292a;

    public C117548b(C23112h hVar) {
        this.f326292a = hVar;
    }

    /* renamed from: e */
    public final void mo103366e(C54806z zVar) {
        Bundle bundle = new Bundle();
        C54806z.f143773n.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("videoWatchData", C23245b.m43556a(zVar));
        this.f326292a.mo28345s("logVideoWatchData_com.google.logs.proto.now.video.VideoWatchDataProto.VideoWatchData", "OneTapEventsDispatcher", bundle);
    }

    /* renamed from: f */
    public final void mo103367f(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        this.f326292a.mo28345s("openVideoUrl_java.lang.String", "OneTapEventsDispatcher", bundle);
    }
}
