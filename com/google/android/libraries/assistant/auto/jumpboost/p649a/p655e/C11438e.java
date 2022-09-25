package com.google.android.libraries.assistant.auto.jumpboost.p649a.p655e;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13044f;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.p1106b.C15476b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59583ak;
import com.google.common.p4552o.C59584al;
import com.google.common.p4552o.C59687cb;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;
import p5535j.p5536a.p5543b.C70967n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.e.e */
/* compiled from: PG */
public final class C11438e {

    /* renamed from: a */
    private static final C59071e f37217a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.a.e.e");

    /* renamed from: b */
    private static final C58495hd f37218b;

    /* renamed from: c */
    private static final C58495hd f37219c = C58495hd.m89902p(C62722b.CANCELLED, C89849ae.ASSISTANT_AUTO_END_USER_TAPPED_OUT_CANCEL, C62722b.UNKNOWN, C89849ae.ASSISTANT_AUTO_END_GENERAL_FAILURE, C62722b.OK, C89849ae.ASSISTANT_AUTO_END_SUCCESS);

    /* renamed from: d */
    private static final C58495hd f37220d;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(Integer.valueOf(C37179a.f97460af.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_PTT_BUTTON));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97461ag.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_ON_SCREEN_MIC));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97462ah.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_MESSAGE_NOTIFICATION));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97463ai.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_HOTWORD));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97464aj.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_TAP_ASSISTANT_APP_ICON));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97567cg.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_TAP_DIALER_NUDGE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97568ch.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_TAP_LAUNCHER_SHORTCUT));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97554cT.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_ASSISTANT_SUGGESTION));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97486bE.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_MEDIA_RECOMMENDATION));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97465ak.f99011a.f98876a.f98906a), C11435b.m27122e(1, C89849ae.AAP_START_ENTRYPOINT_UNKNOWN));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97426Y.f99011a.f98876a.f98906a), C11435b.m27122e(2, C89849ae.AAP_START_MIC_OPEN_FOR_FOLLOW_ON));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97425X.f99011a.f98876a.f98906a), C11435b.m27122e(2, C89849ae.AAP_START_MIC_OPEN_FOR_FOLLOW_ON));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97614da.f99011a.f98876a.f98906a), C11435b.m27122e(2, C89849ae.AAP_START_TNG_IMMERSIVES));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97578cr.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_VOICE_PLATE_ACTIVITY_CREATE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97455aa.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.TTS_PLAY_STARTED));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97487bF.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.TTS_PLAY_DONE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97456ab.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_START_LISTENING));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97467am.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.SPEECH_START_RECEIVED));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97458ad.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.SPEECH_END_RECEIVED));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97459ae.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_START_ACTIVITY_INTENT));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97410I.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_VOICE_PLATE_USER_CLICKED_SCRIM));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97408G.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_VOICE_PLATE_OPEN));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97409H.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_VOICE_PLATE_UPDATE_STATE_DONE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97471aq.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_NO_SPEECH_DETECTED));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97587d.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_TIMEOUT_DETECTED));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97516bi.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.S3_HEADER_REQUEST_CREATION_START));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97518bk.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.S3_HEADER_REQUEST_ASSISTANT_REQUEST_COMPLETE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97519bl.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.S3_HEADER_REQUEST_CLIENT_INFO_COMPLETE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97524bq.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.S3_HEADER_REQUEST_USER_INFO_COMPLETE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97520bm.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.S3_HEADER_REQUEST_DEVICE_CAPABILITIES_COMPLETE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97527bt.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.S3_CDC_UPDATE_COMPLETE));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97528bu.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.CONVERSATION_DELTA_CLIENT_OPS_EXECUTED));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97427Z.f99010a.f98876a.f98906a), C11435b.m27122e(4, C89849ae.ASSISTANT_AUTO_END_SUCCESS));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97526bs.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.OPA_ANDROID_RENDERING_START));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97517bj.f99010a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.S3_HEADER_REQUEST_CREATION_SUCCESSFUL));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97561ca.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_AUDIO_SENT_TO_S3_STREAM_BEGIN));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97562cb.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_AUDIO_SENT_TO_S3));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97552cR.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_STALE_AUTH_TOKEN_IN_S3_REQUEST));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97553cS.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_AUTH_FETCH_ERROR));
        gzVar.mo55429h(Integer.valueOf(C37179a.f97616dc.f99011a.f98876a.f98906a), C11435b.m27122e(3, C89849ae.ASSISTANT_AUTO_PROJECTED_START_VOICE_SESSION));
        f37218b = gzVar.mo55427f(false);
        C62722b bVar = C62722b.CANCELLED;
        C89849ae aeVar = C89849ae.S3_HEADER_REQUEST_CREATION_ABORTED;
        C62722b bVar2 = C62722b.UNKNOWN;
        C89849ae aeVar2 = C89849ae.S3_HEADER_REQUEST_CREATION_FAILED;
        f37220d = C58495hd.m89903q(bVar, aeVar, bVar2, aeVar2, C62722b.DEADLINE_EXCEEDED, aeVar2, C62722b.OK, C89849ae.S3_HEADER_REQUEST_CREATION_SUCCESSFUL);
    }

    /* renamed from: a */
    public static C11435b m27134a(C37254c cVar, Optional optional) {
        Object obj;
        int i = cVar.mo40778b().f98906a;
        C58495hd hdVar = f37218b;
        Integer valueOf = Integer.valueOf(i);
        if (!hdVar.containsKey(valueOf)) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        C11435b bVar = (C11435b) hdVar.get(valueOf);
        bVar.getClass();
        if (optional.isEmpty()) {
            return bVar;
        }
        C15474b bVar2 = (C15474b) optional.get();
        if ((cVar.equals(C37179a.f97455aa) || cVar.equals(C37179a.f97487bF)) && (bVar2.f46406a & 8) != 0) {
            C70967n a = C70967n.m103850a(bVar2.f46412g);
            if (a == null) {
                a = C70967n.UNKNOWN;
            }
            if (!(a == C70967n.ONLINE_RESPONSE || a == C70967n.STRUCTURED_TTS)) {
                return null;
            }
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        if ((bVar2.f46406a & 1) != 0) {
            String str = bVar2.f46407b;
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            str.getClass();
            cbVar.f160115b |= 2;
            cbVar.f160039D = str;
        }
        if (!bVar2.f46410e.isEmpty()) {
            ajVar.mo57005b(bVar2.f46410e);
        }
        if ((bVar2.f46406a & 4) != 0) {
            String str2 = bVar2.f46411f;
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            str2.getClass();
            cbVar2.f160062a |= 16;
            cbVar2.f160129j = str2;
        }
        int d = bVar.mo19970d();
        C89849ae a2 = bVar.mo19967a();
        Optional empty = Optional.empty();
        C62940bt r5 = C62942bv.checkIsLite(C15476b.f46417g);
        bVar2.mo58887l(r5);
        if (bVar2.f169962ag.mo58857o(r5.f169971d)) {
            C62940bt r52 = C62942bv.checkIsLite(C15476b.f46417g);
            bVar2.mo58887l(r52);
            Object l = bVar2.f169962ag.mo58854l(r52.f169971d);
            if (l == null) {
                obj = r52.f169969b;
            } else {
                obj = r52.mo58889c(l);
            }
            C15476b bVar3 = (C15476b) obj;
            String str3 = bVar3.f46420b;
            ajVar.copyOnWrite();
            C59687cb cbVar3 = (C59687cb) ajVar.instance;
            str3.getClass();
            cbVar3.f160062a |= 4;
            cbVar3.f160127h = str3;
            C59583ak akVar = (C59583ak) C59584al.f159003e.createBuilder();
            C13044f fVar = bVar3.f46421c;
            if (fVar == null) {
                fVar = C13044f.f40495e;
            }
            String str4 = fVar.f40498b;
            akVar.copyOnWrite();
            C59584al alVar = (C59584al) akVar.instance;
            str4.getClass();
            alVar.f159005a |= 1;
            alVar.f159006b = str4;
            C13044f fVar2 = bVar3.f46421c;
            if (fVar2 == null) {
                fVar2 = C13044f.f40495e;
            }
            String str5 = fVar2.f40499c;
            akVar.copyOnWrite();
            C59584al alVar2 = (C59584al) akVar.instance;
            str5.getClass();
            alVar2.f159005a |= 2;
            alVar2.f159007c = str5;
            C13044f fVar3 = bVar3.f46421c;
            if (fVar3 == null) {
                fVar3 = C13044f.f40495e;
            }
            boolean z = fVar3.f40500d;
            akVar.copyOnWrite();
            C59584al alVar3 = (C59584al) akVar.instance;
            alVar3.f159005a |= 4;
            alVar3.f159008d = z;
            ajVar.copyOnWrite();
            C59687cb cbVar4 = (C59687cb) ajVar.instance;
            C59584al alVar4 = (C59584al) akVar.build();
            alVar4.getClass();
            cbVar4.f160077aO = alVar4;
            cbVar4.f160123d |= 256;
            if (d != 0) {
                if (d == 4) {
                    C62722b a3 = C62722b.m94931a(bVar3.f46422d);
                    if (a3 == null) {
                        a3 = C62722b.OK;
                    }
                    C58495hd hdVar2 = f37219c;
                    if (hdVar2.containsKey(a3)) {
                        a2 = (C89849ae) hdVar2.get(a3);
                    } else {
                        C59104x c = f37217a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "CALogEventConverter");
                        ((C59052c) ((C59052c) c).mo56372aa(43329)).mo56389s("Missing the mapping for the status code %s to the legacy appflow end event.", a3.name());
                    }
                } else if (a2.equals(C89849ae.S3_HEADER_REQUEST_CREATION_SUCCESSFUL)) {
                    C62722b a4 = C62722b.m94931a(bVar3.f46422d);
                    if (a4 == null) {
                        a4 = C62722b.OK;
                    }
                    C58495hd hdVar3 = f37220d;
                    if (hdVar3.containsKey(a4)) {
                        a2 = (C89849ae) hdVar3.get(a4);
                    } else {
                        C59104x c2 = f37217a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "CALogEventConverter");
                        ((C59052c) ((C59052c) c2).mo56372aa(43328)).mo56389s("Missing the mapping for the status code %s to the legacy appflow s3 header completion event.", a4.name());
                    }
                }
                if ((bVar3.f46419a & 8) != 0) {
                    empty = Optional.m71637of(bVar3.f46423e);
                }
            } else {
                throw null;
            }
        }
        return new C11436c(d, a2, Optional.m71637of((C59687cb) ajVar.build()), empty);
    }
}
