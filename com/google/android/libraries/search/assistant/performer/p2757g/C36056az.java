package com.google.android.libraries.search.assistant.performer.p2757g;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2728a.C35467c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52167hs;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.az */
/* compiled from: PG */
public final class C36056az implements C35472h {

    /* renamed from: a */
    private static final C59071e f94314a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.g.az");

    /* renamed from: b */
    private final Context f94315b;

    public C36056az(Context context) {
        this.f94315b = context;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C52232kc kcVar;
        if (!"media.NOTIFY_NOW_PLAYING".equals(dyVar.f135936b)) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.UNIMPLEMENTED, "Cannot perform client op: ".concat(String.valueOf(dyVar.f135936b))));
        }
        try {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            Iterator it = dwVar.f135932a.iterator();
            do {
                if (it.hasNext()) {
                    kcVar = (C52232kc) it.next();
                } else {
                    throw new C35467c("notify_now_playing_args");
                }
            } while (!"notify_now_playing_args".equals(kcVar.f137065b));
            C52230ka kaVar = kcVar.f137066c;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            C52167hs hsVar = (C52167hs) C62942bv.parseFrom((C62942bv) C52167hs.f136885c, kaVar.f137061c, C62921ba.m95368a());
            if ((hsVar.f136887a & 1) == 0) {
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "No Payload"));
            }
            C59104x b = f94314a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaNotifyNPPerformer");
            ((C59052c) ((C59052c) b).mo56372aa(52142)).mo56386p("sending broadcast intent to Now Playing");
            Intent intent = new Intent("com.google.intelligence.sense.ambientmusic.HISTORY_ENTRY");
            C63070h hVar = hsVar.f136888b;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
            intent.putExtra("SOUND_SEARCH_PAYLOAD_EXTRA", hVar.toByteArray());
            this.f94315b.sendBroadcast(intent);
            return C60856cj.m92900i(C36180b.f94544a);
        } catch (C35467c | C62974ct unused) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "No NotifyNowPlayingArgs"));
        }
    }
}
