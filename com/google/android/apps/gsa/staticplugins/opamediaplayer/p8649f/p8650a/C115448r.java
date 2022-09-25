package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115274cq;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23257b;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.r */
/* compiled from: PG */
public final class C115448r implements C23113i {

    /* renamed from: a */
    private final C115446p f320287a;

    public C115448r(C115446p pVar) {
        this.f320287a = pVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SpeakrMediaPlayerEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onActivityResumed")) {
                this.f320287a.mo101927s();
            } else if (str.equals("onActivityStopped")) {
                this.f320287a.mo101928t();
            } else if (str.equals("onAlertDismissed")) {
                this.f320287a.mo101875e();
            } else if (str.equals("onChangeLanguagePressed")) {
                ((C115274cq) this.f320287a).f319851e.mo101984a();
            } else if (str.equals("onChangeVoicePressed")) {
                this.f320287a.mo101930v();
            } else if (str.equals("onChangingSpeedDone")) {
                this.f320287a.mo101931w();
            } else if (str.equals("onChangingSpeedStarted")) {
                C115446p pVar2 = this.f320287a;
                C58976aa aaVar = C58975e.f156826a;
                ((C115274cq) pVar2).f319860n = true;
            } else if (str.equals("onFastForward")) {
                this.f320287a.mo101876f();
            } else if (str.equals("onMediaItemSelected_int")) {
                Integer.valueOf(pVar.f63472a.getInt("index")).intValue();
            } else if (str.equals("onPlaybackSpeedChanged_float")) {
                this.f320287a.mo101878i(Float.valueOf(pVar.f63472a.getFloat("newSpeed")).floatValue());
            } else if (str.equals("onRewind")) {
                this.f320287a.mo101879j();
            } else if (str.equals("onSeekTo_long")) {
                this.f320287a.mo101880k(Long.valueOf(pVar.f63472a.getLong("seekPositionMillis")).longValue());
            } else if (str.equals("onSendCategorizedFeedback_byte[]_com.google.android.apps.gsa.staticplugins.opamediaplayer.shared.speakr.FeedbackType_java.lang.String_java.lang.String")) {
                C23259d dVar = new C23259d(C115435e.values());
                int i = pVar.f63472a.getInt("feedbackType");
                String string = pVar.f63472a.getString("word");
                string.getClass();
                String string2 = pVar.f63472a.getString("surroundingText");
                string2.getClass();
                ((C115274cq) this.f320287a).mo101922F(C23257b.m43596e("screenshot", pVar), (C115435e) dVar.f63738a[i], string, string2);
            } else if (str.equals("onSendFeedback_byte[]")) {
                this.f320287a.mo101881l(C23257b.m43596e("screenshot", pVar));
            } else if (str.equals("onShowInfo_int")) {
                Integer.valueOf(pVar.f63472a.getInt("index")).intValue();
            } else if (str.equals("onShowPlaylist")) {
                this.f320287a.mo101883n();
            } else if (str.equals("onSkipNext")) {
                C115446p pVar3 = this.f320287a;
                C58976aa aaVar2 = C58975e.f156826a;
                ((C115274cq) pVar3).mo101921E();
            } else if (str.equals("onSnapToParagraph_int")) {
                ((C115274cq) this.f320287a).f319853g.mo101967o(Integer.valueOf(pVar.f63472a.getInt("paragraphIndex")).intValue(), 0);
            } else if (str.equals("onSnapToWord_int_int")) {
                this.f320287a.mo101917A(Integer.valueOf(pVar.f63472a.getInt("paragraphIndex")).intValue(), Integer.valueOf(pVar.f63472a.getInt("wordOffset")).intValue());
            } else if (str.equals("onTextHighlightingTogglePressed")) {
                this.f320287a.mo101918B();
            } else if (str.equals("onTogglePlayPause")) {
                C115446p pVar4 = this.f320287a;
                C58976aa aaVar3 = C58975e.f156826a;
                ((C115274cq) pVar4).f319853g.mo101971s();
            } else if (str.equals("onUserNavigation_java.lang.String")) {
                String string3 = pVar.f63472a.getString("url");
                string3.getClass();
                this.f320287a.mo101919C(string3);
            } else if (str.equals("onWebPageLoaded")) {
                this.f320287a.mo101920D();
            }
        }
    }
}
