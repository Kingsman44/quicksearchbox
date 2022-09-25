package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.p6486s.C84263c;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115191aa;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115193ac;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115411x;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115412y;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115413z;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115198a;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23257b;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.y */
/* compiled from: PG */
public final class C115481y implements C23113i {

    /* renamed from: a */
    private final C115479w f320329a;

    public C115481y(C115479w wVar) {
        this.f320329a = wVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("PlaylistEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onMediaItemInfoRequested_int")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("index")).intValue();
                C115479w wVar = this.f320329a;
                C23056g gVar = (C23056g) wVar;
                if (!gVar.f63405W.mo28420E()) {
                    C115193ac acVar = (C115193ac) wVar;
                    acVar.f319691e.mo28601d(new C23129y(true != gVar.f63405W.mo28338g().f63477b.equals("media_player_playlist") ? "media_item_page" : "media_item_info_page"), C23245b.m43556a((C52174hz) ((C52176ia) ((C23251a) acVar.f319688b.mo102023b()).f63720e).f136914b.get(intValue)));
                }
            } else if (str.equals("onMediaItemRequested_int")) {
                int intValue2 = Integer.valueOf(pVar.f63472a.getInt("index")).intValue();
                C115193ac acVar2 = (C115193ac) this.f320329a;
                if (((C115466j) ((C23251a) acVar2.f319688b.mo102024c()).f63720e).f320307b == ((long) intValue2)) {
                    new C90873ag(acVar2.f319689c.mo77787c(C84269i.TOGGLE_PLAY_PAUSE), acVar2.f319690d, "toggle-play-pause", C115411x.f320219a).mo85223a(C115412y.f320220a);
                    return;
                }
                C84274n nVar = acVar2.f319689c;
                C84269i iVar = C84269i.PLAY;
                C84263c cVar = new C84263c();
                cVar.mo77755b(intValue2);
                new C90873ag(nVar.mo77788d(iVar, cVar.mo77754a()), acVar2.f319690d, "play-media", C115413z.f320221a).mo85223a(C115191aa.f319684a);
            } else if (str.equals("onSendFeedback_byte[]")) {
                C115193ac acVar3 = (C115193ac) this.f320329a;
                C115198a.m190984a(acVar3.f319692f, C58833ax.m90833j(acVar3.f319693g), C23257b.m43596e("screenshot", pVar));
            }
        }
    }
}
