package com.google.android.libraries.gsa.conversation.p1837a;

import android.media.MediaPlayer;
import android.util.Base64;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.gsa.conversation.a.u */
/* compiled from: PG */
public final /* synthetic */ class C22340u implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C22343x f61674a;

    /* renamed from: b */
    public final /* synthetic */ C63088z f61675b;

    public /* synthetic */ C22340u(C22343x xVar, C63088z zVar) {
        this.f61674a = xVar;
        this.f61675b = zVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C22343x xVar = this.f61674a;
        C63088z zVar = this.f61675b;
        synchronized (xVar.f61680c) {
            xVar.mo27568a();
            xVar.f61683f = cVar;
            xVar.f61681d = new C22342w(xVar);
            if (xVar.f61679b.requestAudioFocus(xVar.f61681d, 1, 4) != 1) {
                C2164c cVar2 = xVar.f61683f;
                cVar2.getClass();
                cVar2.mo5439d(new IllegalStateException("Audio focus not granted"));
            } else {
                xVar.f61682e = new MediaPlayer();
                xVar.f61682e.setOnCompletionListener(new C22341v(xVar));
                xVar.f61682e.setDataSource("data:audio/mpeg;base64,".concat(String.valueOf(Base64.encodeToString(zVar.mo59174N(), 2))));
                xVar.f61682e.prepare();
                xVar.f61682e.start();
                xVar.f61684g = true;
            }
        }
        return "play MP3";
    }
}
