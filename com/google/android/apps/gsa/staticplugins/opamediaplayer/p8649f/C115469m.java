package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.p6486s.C84263c;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115395h;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115396i;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115397j;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115398k;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115400m;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115485b;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.m */
/* compiled from: PG */
public final class C115469m implements C23113i {

    /* renamed from: a */
    private final C115467k f320323a;

    public C115469m(C115467k kVar) {
        this.f320323a = kVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("MediaItemPageEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onTogglePlayPause")) {
                C115400m mVar = (C115400m) this.f320323a;
                C115466j jVar = (C115466j) ((C23251a) mVar.f320198b.mo102032c()).f63720e;
                C58833ax a = C115485b.m191567a((C52174hz) ((C23251a) mVar.f320198b.mo102031b()).f63720e);
                if (!a.mo56113h()) {
                    ((C59052c) ((C59052c) C115400m.f320197a.mo56225c()).mo56372aa(29718)).mo56386p("Couldn't get mediaId from MediaItem");
                } else if (((String) a.mo56107c()).equals(jVar.f320319n)) {
                    new C90873ag(mVar.f320199c.mo77787c(C84269i.TOGGLE_PLAY_PAUSE), mVar.f320200d, "toggle-play-pause", C115395h.f320191a).mo85223a(C115396i.f320192a);
                } else {
                    C84274n nVar = mVar.f320199c;
                    C84269i iVar = C84269i.PLAY;
                    C84263c cVar = new C84263c();
                    cVar.f229313a = C58833ax.m90834k((String) a.mo56107c());
                    new C90873ag(nVar.mo77788d(iVar, cVar.mo77754a()), mVar.f320200d, "play-media", C115397j.f320193a).mo85223a(C115398k.f320194a);
                }
            }
        }
    }
}
