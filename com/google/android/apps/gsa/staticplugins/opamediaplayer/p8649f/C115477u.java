package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.p6486s.C84263c;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115408u;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.u */
/* compiled from: PG */
public final class C115477u implements C23113i {

    /* renamed from: a */
    private final C115475s f320327a;

    public C115477u(C115475s sVar) {
        this.f320327a = sVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("PlaybackPanelEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onAlertDismissed")) {
                C115475s sVar = this.f320327a;
                if (!((C23056g) sVar).f63405W.mo28420E()) {
                    ((C23251a) ((C115408u) sVar).f320212c.mo102034c()).mo28730f(C58836b.f156633a, false);
                }
            } else if (str.equals("onFastForward")) {
                C115475s sVar2 = this.f320327a;
                C58976aa aaVar = C58975e.f156826a;
                ((C115408u) sVar2).mo102047h(C84269i.FAST_FORWARD);
            } else if (str.equals("onPlaybackPanelStateChanged_int")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("state")).intValue();
                C115475s sVar3 = this.f320327a;
                if (!((C23056g) sVar3).f63405W.mo28420E()) {
                    ((C23251a) ((C115408u) sVar3).f320212c.mo102035d()).mo28730f(Integer.valueOf(intValue), false);
                }
            } else if (str.equals("onPlaybackSpeedChanged_float")) {
                float floatValue = Float.valueOf(pVar.f63472a.getFloat("newSpeed")).floatValue();
                C115475s sVar4 = this.f320327a;
                if (!((C23056g) sVar4).f63405W.mo28420E()) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackSpeed", floatValue);
                    ((C115408u) sVar4).f320213d.mo77794j(bundle);
                }
            } else if (str.equals("onRewind")) {
                C115475s sVar5 = this.f320327a;
                C58976aa aaVar2 = C58975e.f156826a;
                ((C115408u) sVar5).mo102047h(C84269i.REWIND);
            } else if (str.equals("onSeekTo_long")) {
                long longValue = Long.valueOf(pVar.f63472a.getLong("seekPositionMillis")).longValue();
                C115475s sVar6 = this.f320327a;
                C58976aa aaVar3 = C58975e.f156826a;
                C84269i iVar = C84269i.SEEK;
                C84263c cVar = new C84263c();
                cVar.mo77756c(longValue);
                ((C115408u) sVar6).mo102048i(iVar, cVar.mo77754a());
            } else if (str.equals("onSkipNext")) {
                C115475s sVar7 = this.f320327a;
                C58976aa aaVar4 = C58975e.f156826a;
                ((C115408u) sVar7).mo102047h(C84269i.PLAY_NEXT);
            } else if (str.equals("onSkipPrevious")) {
                ((C115408u) this.f320327a).mo102047h(C84269i.PLAY_PREVIOUS);
            } else if (str.equals("onTogglePlayPause")) {
                C115408u uVar = (C115408u) this.f320327a;
                C115466j jVar = (C115466j) ((C23251a) uVar.f320212c.mo102037f()).f63720e;
                if (jVar.f320308c) {
                    C84269i iVar2 = C84269i.PLAY;
                    C84263c cVar2 = new C84263c();
                    cVar2.mo77755b((int) jVar.f320307b);
                    uVar.mo102048i(iVar2, cVar2.mo77754a());
                    return;
                }
                uVar.mo102047h(C84269i.TOGGLE_PLAY_PAUSE);
            }
        }
    }
}
