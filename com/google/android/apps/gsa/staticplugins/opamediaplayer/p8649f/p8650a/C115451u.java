package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.p7066m.C90125fw;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115211ah;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115306dv;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115315ed;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115322ek;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115323el;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115326eo;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115327ep;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c.C115331et;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23257b;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52577wx;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.a.u */
/* compiled from: PG */
public final class C115451u implements C23113i {

    /* renamed from: a */
    private final C115449s f320289a;

    public C115451u(C115449s sVar) {
        this.f320289a = sVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        C52583xc xcVar;
        if ("SpeakrPlaylistEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onChangeLanguagePressed")) {
                ((C115331et) this.f320289a).f319988e.mo101984a();
            } else if (str.equals("onChangeVoicePressed")) {
                C115331et etVar = (C115331et) this.f320289a;
                if (!etVar.f319990g.mo79746e(C90125fw.f250886C)) {
                    etVar.f319988e.mo101985b();
                } else {
                    new C90873ag(C115431ai.m191421a(etVar.f319992i, etVar.f319991h.mo101954a().mo101947a(), etVar.f319993j), etVar.f319986c, "get-narration-language", new C115322ek(etVar)).mo85223a(C115323el.f319972a);
                }
            } else {
                int i = 2;
                if (str.equals("onItemArchived_int")) {
                    int intValue = Integer.valueOf(pVar.f63472a.getInt("itemPosition")).intValue();
                    C115449s sVar = this.f320289a;
                    C58976aa aaVar = C58975e.f156826a;
                    C115331et etVar2 = (C115331et) sVar;
                    C52174hz hzVar = (C52174hz) ((C52176ia) ((C23251a) etVar2.f319985b.mo102023b()).f63720e).f136914b.get(intValue);
                    C115211ah ahVar = etVar2.f319989f;
                    String str3 = hzVar.f136895b;
                    C52568wo woVar = hzVar.f136897d;
                    if (woVar == null) {
                        woVar = C52568wo.f137992v;
                    }
                    if (woVar.f137996c == 26) {
                        xcVar = (C52583xc) woVar.f137997d;
                    } else {
                        xcVar = C52583xc.f138063o;
                    }
                    C52577wx a = C52577wx.m86654a(xcVar.f138069e);
                    if (a == null) {
                        a = C52577wx.UNKNOWN_PLAYBACK_TYPE;
                    }
                    ahVar.mo101898e(str3, a);
                    C115315ed edVar = etVar2.f319991h;
                    C115306dv dvVar = new C115306dv(intValue);
                    if (edVar.mo101954a().f319951a.f136916d != intValue) {
                        i = 1;
                    }
                    edVar.mo101973u(dvVar, i, "REMOVE_INDEX_AT");
                } else if (str.equals("onMediaItemInfoRequested_int")) {
                    Integer.valueOf(pVar.f63472a.getInt("index")).intValue();
                } else if (str.equals("onMediaItemRequested_int")) {
                    int intValue2 = Integer.valueOf(pVar.f63472a.getInt("index")).intValue();
                    C115449s sVar2 = this.f320289a;
                    C58976aa aaVar2 = C58975e.f156826a;
                    C115331et etVar3 = (C115331et) sVar2;
                    if (intValue2 != etVar3.f319991h.mo101954a().f319951a.f136916d) {
                        C115315ed edVar2 = etVar3.f319991h;
                        edVar2.mo101974v(intValue2, 2, "STOP_AND_MOVE_TO_INDEX");
                        edVar2.mo101968p();
                    }
                    C23149a aVar = etVar3.f319987d;
                    C23129y yVar = new C23129y(true != etVar3.f319990g.mo79746e(C90125fw.f250918ah) ? "speakr_media_item_feature" : "speakr_media_item_feature_refreshed");
                    C115438h hVar = (C115438h) C115439i.f320280c.createBuilder();
                    hVar.copyOnWrite();
                    C115439i iVar = (C115439i) hVar.instance;
                    iVar.f320282a |= 1;
                    iVar.f320283b = true;
                    aVar.mo28601d(yVar, C23245b.m43556a((C115439i) hVar.build()));
                } else if (str.equals("onSendFeedback_byte[]")) {
                    byte[] e = C23257b.m43596e("screenshot", pVar);
                    C115331et etVar4 = (C115331et) this.f320289a;
                    if (!etVar4.f319990g.mo79746e(C90125fw.f250942u)) {
                        etVar4.f319988e.mo101988e(e, C58836b.f156633a, C115435e.DEFAULT_FEEDBACK_TYPE);
                    } else {
                        new C90873ag(C90877ak.m148471e(C115431ai.m191422b(etVar4.f319992i, etVar4.f319991h.mo101954a().mo101947a(), etVar4.f319993j), 3, TimeUnit.SECONDS, etVar4.f319994k), etVar4.f319986c, "get-narration-voice", new C115326eo(etVar4, e)).mo85223a(new C115327ep(etVar4, e));
                    }
                } else if (str.equals("onTogglePlayPause")) {
                    ((C115331et) this.f320289a).f319991h.mo101971s();
                }
            }
        }
    }
}
