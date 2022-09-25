package com.google.android.apps.gsa.staticplugins.videoplayer.p8782b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54806z;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.videoplayer.b.c */
/* compiled from: PG */
public final class C117549c implements C23113i {

    /* renamed from: a */
    private final C117547a f326293a;

    public C117549c(C117547a aVar) {
        this.f326293a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("OneTapEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("logVideoWatchData_com.google.logs.proto.now.video.VideoWatchDataProto.VideoWatchData")) {
                this.f326293a.mo103366e((C54806z) new C23271p(C54806z.f143773n.getParserForType(), C62921ba.m95368a(), C54806z.f143773n).mo28733b("videoWatchData", pVar));
            } else if (str.equals("openVideoUrl_java.lang.String")) {
                String string = pVar.f63472a.getString("url");
                string.getClass();
                this.f326293a.mo103367f(string);
            }
        }
    }
}
