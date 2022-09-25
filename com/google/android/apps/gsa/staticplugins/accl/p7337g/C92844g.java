package com.google.android.apps.gsa.staticplugins.accl.p7337g;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1448d.C17587a;
import com.google.android.libraries.gsa.conversation.p1837a.C22315af;
import com.google.android.libraries.gsa.conversation.p1837a.C22334o;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5205f.p5206a.C66501b;
import com.google.speech.p5205f.p5206a.C66502c;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5226l.p5227a.C67250b;
import com.google.speech.p5230n.p5232b.C67402ar;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.g.g */
/* compiled from: PG */
public final class C92844g implements C22315af {

    /* renamed from: a */
    private final C92843f f259051a;

    public C92844g(C92843f fVar) {
        this.f259051a = fVar;
    }

    /* renamed from: a */
    public final C22334o mo27565a(C60870cx cxVar, C84349ah ahVar) {
        return this.f259051a.mo87471a(cxVar, (TtsRequest) null, ahVar);
    }

    /* renamed from: b */
    public final C22334o mo27550b(C67190ah ahVar, C84349ah ahVar2, boolean z) {
        Object obj;
        C67402ar arVar;
        TtsRequest ttsRequest;
        C67250b bVar = ahVar.f182627f;
        if (bVar == null) {
            bVar = C67250b.f182809a;
        }
        C62940bt r1 = C62942bv.checkIsLite(C66502c.f180870a);
        bVar.mo58887l(r1);
        Object l = bVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C66501b bVar2 = (C66501b) obj;
        if (bVar2.f180867a == 4) {
            arVar = (C67402ar) bVar2.f180868b;
        } else {
            arVar = C67402ar.f183192d;
        }
        C67402ar arVar2 = arVar;
        if (!z || !C17587a.m34878a(arVar2)) {
            ttsRequest = new TtsRequest(ahVar, ahVar.f182625d);
        } else {
            ttsRequest = new TtsRequest((C67190ah) null, (List) null, arVar2, (Uri) null, false);
            ttsRequest.f236281e = true;
        }
        return this.f259051a.mo87471a(C60856cj.m92900i(C58836b.f156633a), ttsRequest, ahVar2);
    }
}
