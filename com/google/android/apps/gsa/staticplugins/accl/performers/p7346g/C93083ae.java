package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52167hs;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.ae */
/* compiled from: PG */
public final class C93083ae extends C22538o {

    /* renamed from: a */
    private static final C59071e f259655a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.g.ae");

    /* renamed from: b */
    private final Context f259656b;

    public C93083ae(Context context) {
        this.f259656b = context;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if ("media.NOTIFY_NOW_PLAYING".equals(dyVar.f135936b)) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52167hs hsVar = (C52167hs) m41992m(dwVar, "notify_now_playing_args", C52167hs.f136885c.getParserForType());
            if ((hsVar.f136887a & 1) != 0) {
                C59104x b = f259655a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "MediaNotifyNPPerformer");
                ((C59052c) ((C59052c) b).mo56372aa(13345)).mo56386p("sending broadcast intent to Now Playing");
                Intent intent = new Intent("com.google.intelligence.sense.ambientmusic.HISTORY_ENTRY");
                C63070h hVar = hsVar.f136888b;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                intent.putExtra("SOUND_SEARCH_PAYLOAD_EXTRA", hVar.toByteArray());
                this.f259656b.sendBroadcast(intent);
                return C60856cj.m92900i(C22402a.f61893a);
            }
            throw new C22534k();
        }
        throw new C22428d(dyVar);
    }
}
