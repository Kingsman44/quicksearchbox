package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import android.os.Bundle;
import androidx.media3.common.C2590aq;
import androidx.media3.exoplayer.p145h.C3038au;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85338g;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85341j;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85342k;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85343l;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85345n;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85346o;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85350s;
import com.google.android.apps.gsa.staticplugins.p8163o.C105791ab;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119097af;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119099ah;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119100ai;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119101aj;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119102ak;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.android.libraries.p11016ak.C147724f;
import com.google.assistant.p3897e.p3921j.C52577wx;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.assistant.p3897e.p3921j.C52591xk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p5285d.p5290b.p5291a.p5292a.C68188bx;
import p5285d.p5290b.p5291a.p5292a.C68189by;
import p5285d.p5290b.p5291a.p5292a.C68198k;
import p5285d.p5290b.p5291a.p5292a.C68199l;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.u */
/* compiled from: PG */
public final class C105826u implements C105791ab {

    /* renamed from: a */
    public static final /* synthetic */ int f295220a = 0;

    /* renamed from: b */
    private static final C52577wx f295221b = C52577wx.READ_IT_LATER;

    /* renamed from: c */
    private static final C58495hd f295222c = C58495hd.m89902p(C52577wx.READ_IT_LATER, "read_it_later_agsa", C52577wx.READ_IT_NOW_SINGLE, "read_it_now_agsa", C52577wx.READ_IT_NOW_PLAYLIST, "read_it_now_playlist_agsa");

    /* renamed from: d */
    private final C85350s f295223d;

    public C105826u(C85350s sVar) {
        this.f295223d = sVar;
    }

    /* renamed from: a */
    public final C3038au mo95058a(String str, Bundle bundle) {
        C119103al alVar;
        C58833ax axVar;
        int i = (int) bundle.getLong("com.google.android.apps.gsa.search.core.work.audioplayer.StartWindowIndex");
        String str2 = (String) f295222c.getOrDefault(C58833ax.m90833j(C52577wx.m86654a(bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrPlaybackType", 0))).mo56109e(f295221b), "read_it_later_agsa");
        C85342k kVar = (C85342k) C85343l.f231127h.createBuilder();
        C119097af afVar = (C119097af) C119103al.f332227e.createBuilder();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.google.android.apps.gsa.search.core.work.audioplayer.FreeText");
        if (stringArrayList != null) {
            C119099ah ahVar = (C119099ah) C119100ai.f332220c.createBuilder();
            ahVar.mo104187a(stringArrayList);
            afVar.copyOnWrite();
            C119103al alVar2 = (C119103al) afVar.instance;
            C119100ai aiVar = (C119100ai) ahVar.build();
            aiVar.getClass();
            alVar2.f332230b = aiVar;
            alVar2.f332229a = 2;
            alVar = (C119103al) afVar.build();
        } else {
            String string = bundle.getString("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrMediaContent");
            if (string != null) {
                C68198k kVar2 = (C68198k) C68199l.f184537d.createBuilder();
                kVar2.copyOnWrite();
                C68199l lVar = (C68199l) kVar2.instance;
                lVar.f184539a = 1;
                lVar.f184540b = string;
                String string2 = bundle.getString("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrMediaMimeType", "text/html");
                kVar2.copyOnWrite();
                string2.getClass();
                ((C68199l) kVar2.instance).f184541c = string2;
                C68199l lVar2 = (C68199l) kVar2.build();
                afVar.copyOnWrite();
                C119103al alVar3 = (C119103al) afVar.instance;
                lVar2.getClass();
                alVar3.f332230b = lVar2;
                alVar3.f332229a = 3;
                int i2 = bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrMediaContentHint");
                afVar.copyOnWrite();
                ((C119103al) afVar.instance).f332231c = i2;
                alVar = (C119103al) afVar.build();
            } else {
                C119101aj ajVar = (C119101aj) C119102ak.f332224b.createBuilder();
                ajVar.copyOnWrite();
                str.getClass();
                ((C119102ak) ajVar.instance).f332226a = str;
                afVar.copyOnWrite();
                C119103al alVar4 = (C119103al) afVar.instance;
                C119102ak akVar = (C119102ak) ajVar.build();
                akVar.getClass();
                alVar4.f332230b = akVar;
                alVar4.f332229a = 1;
                alVar = (C119103al) afVar.build();
            }
        }
        kVar.copyOnWrite();
        C85343l lVar3 = (C85343l) kVar.instance;
        alVar.getClass();
        lVar3.f231130b = alVar;
        lVar3.f231129a |= 1;
        kVar.copyOnWrite();
        C85343l lVar4 = (C85343l) kVar.instance;
        lVar4.f231129a |= 2;
        lVar4.f231131c = i;
        kVar.copyOnWrite();
        C85343l lVar5 = (C85343l) kVar.instance;
        str2.getClass();
        lVar5.f231129a |= 4;
        lVar5.f231132d = str2;
        if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrUseOnDeviceTts")) {
            kVar.copyOnWrite();
            C85343l lVar6 = (C85343l) kVar.instance;
            lVar6.f231135g = C147724f.m240800a(4);
            lVar6.f231129a |= 32;
        }
        byte[] byteArray = bundle.getByteArray("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrVoiceSettings");
        if (byteArray == null) {
            axVar = C58836b.f156633a;
        } else {
            try {
                C62921ba a = C62921ba.m95368a();
                C68188bx bxVar = (C68188bx) C68189by.f184505b.createBuilder();
                bxVar.mo60283a((Iterable) Collection.EL.stream(((C52591xk) C62942bv.parseFrom((C62942bv) C52591xk.f138094b, byteArray, a)).f138096a).map(C105825t.f295219a).collect(Collectors.toList()));
                axVar = C58833ax.m90834k((C68189by) bxVar.build());
            } catch (C62974ct unused) {
                axVar = C58836b.f156633a;
            }
        }
        if (axVar.mo56113h()) {
            C68189by byVar = (C68189by) axVar.mo56107c();
            kVar.copyOnWrite();
            C85343l lVar7 = (C85343l) kVar.instance;
            byVar.getClass();
            lVar7.f231134f = byVar;
            lVar7.f231129a |= 16;
        }
        if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrTargetLanguage") && !bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrUseOnDeviceTts")) {
            String string3 = bundle.getString("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrTargetLanguage", BuildConfig.FLAVOR);
            kVar.copyOnWrite();
            C85343l lVar8 = (C85343l) kVar.instance;
            string3.getClass();
            lVar8.f231129a |= 8;
            lVar8.f231133e = string3;
        }
        C85350s sVar = this.f295223d;
        C85343l lVar9 = (C85343l) kVar.build();
        C85338g gVar = (C85338g) C85341j.f231123c.createBuilder();
        if (bundle.getBoolean("com.google.android.apps.gsa.search.core.work.audioplayer.UseExistingSpeakrSession", false)) {
            gVar.copyOnWrite();
            C85341j jVar = (C85341j) gVar.instance;
            jVar.f231126b = 2;
            jVar.f231125a |= 1;
        } else {
            gVar.copyOnWrite();
            C85341j jVar2 = (C85341j) gVar.instance;
            jVar2.f231126b = 1;
            jVar2.f231125a |= 1;
        }
        C85346o oVar = new C85346o(bundle.getString("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrSessionId", "SPEAKR_DEFAULT_SESSION"), sVar);
        return new C105823r(C60922j.m93044g(oVar.f231139b.mo78875j(oVar.f231138a, lVar9, (C85341j) gVar.build(), (C52582xb) C58833ax.m90833j(C52582xb.m86658a(bundle.getInt("com.google.android.apps.gsa.search.core.work.audioplayer.SpeakrTriggerType"))).mo56109e(C52582xb.UNKNOWN_TRIGGER_TYPE)), new C85345n(oVar), C60826bg.f164896a), C2590aq.m6795b(str), i + 1, new C105824s(bundle));
    }
}
