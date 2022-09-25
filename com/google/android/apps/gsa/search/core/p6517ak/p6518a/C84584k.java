package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import android.net.Uri;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5224k.p5225a.C67215bf;
import com.google.speech.p5230n.p5232b.C67402ar;
import java.util.HashMap;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.k */
/* compiled from: PG */
final class C84584k extends C90888av {

    /* renamed from: a */
    final /* synthetic */ TtsRequest f230184a;

    /* renamed from: b */
    final /* synthetic */ C90908be f230185b;

    /* renamed from: c */
    final /* synthetic */ C90908be f230186c;

    /* renamed from: d */
    final /* synthetic */ String f230187d;

    /* renamed from: e */
    final /* synthetic */ C84591r f230188e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84584k(C84591r rVar, TtsRequest ttsRequest, C90908be beVar, C90908be beVar2, String str) {
        super("Enqueue TtsRequest", 1, 8);
        this.f230188e = rVar;
        this.f230184a = ttsRequest;
        this.f230185b = beVar;
        this.f230186c = beVar2;
        this.f230187d = str;
    }

    public final void run() {
        C84574ae aeVar;
        Object obj;
        C90908be beVar = null;
        this.f230188e.f230207e.mo71762w((String) null);
        C84591r rVar = this.f230188e;
        TtsRequest ttsRequest = this.f230184a;
        int d = rVar.f230207e.mo71743d();
        C90908be beVar2 = this.f230185b;
        C90908be beVar3 = this.f230186c;
        String str = this.f230187d;
        C67402ar arVar = ttsRequest.f236278b;
        if (arVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            synchronized (rVar.f230211i) {
                rVar.f230220r = false;
                int i = rVar.f230216n;
                rVar.f230216n = i + 1;
                String str2 = "utterance:" + i;
                HashMap hashMap = rVar.f230212j;
                C62940bt r7 = C62942bv.checkIsLite(C67215bf.f182681c);
                arVar.mo58887l(r7);
                if (arVar.f169962ag.mo58857o(r7.f169971d)) {
                    C62940bt r72 = C62942bv.checkIsLite(C67215bf.f182681c);
                    arVar.mo58887l(r72);
                    Object l = arVar.f169962ag.mo58854l(r72.f169971d);
                    if (l == null) {
                        obj = r72.f169969b;
                    } else {
                        obj = r72.mo58889c(l);
                    }
                    Optional findFirst = Collection.EL.stream(((C67215bf) obj).f182683a).map(C84580g.f230180a).filter(C84581h.f230181a).findFirst();
                    if (findFirst.isPresent()) {
                        Uri parse = Uri.parse((String) findFirst.get());
                        parse.getClass();
                        aeVar = new C84569a(parse);
                        C84589p pVar = r6;
                        C84589p pVar2 = new C84589p(aeVar, d, beVar2, beVar3, str);
                        hashMap.put(str2, pVar);
                        rVar.f230213k.addLast(str2);
                    }
                }
                aeVar = new C84576c(arVar);
                C84589p pVar3 = pVar2;
                C84589p pVar22 = new C84589p(aeVar, d, beVar2, beVar3, str);
                hashMap.put(str2, pVar3);
                rVar.f230213k.addLast(str2);
            }
        } else {
            List a = ttsRequest.mo81450a();
            if (a == null || a.isEmpty()) {
                C59104x d2 = C84591r.f230203a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "LocalTtsManager");
                ((C59052c) ((C59052c) d2).mo56372aa(9484)).mo56386p("Missing TTS markup or utterance list in TtsRequest. Nothing to do.");
                if (beVar3 != null) {
                    rVar.mo78352d("completionCallback", beVar3);
                    return;
                }
                return;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            synchronized (rVar.f230211i) {
                rVar.f230220r = false;
                int i2 = 0;
                while (i2 < a.size()) {
                    int i3 = rVar.f230216n;
                    rVar.f230216n = i3 + 1;
                    String str3 = "utterance:" + i3;
                    HashMap hashMap2 = rVar.f230212j;
                    String str4 = (String) a.get(i2);
                    str4.getClass();
                    C84575b bVar = new C84575b(str4);
                    C90908be beVar4 = i2 == 0 ? beVar2 : beVar;
                    C90908be beVar5 = i2 == a.size() + -1 ? beVar3 : beVar;
                    C84589p pVar4 = r6;
                    String str5 = str3;
                    C84589p pVar5 = new C84589p(bVar, d, beVar4, beVar5, str);
                    hashMap2.put(str5, pVar4);
                    rVar.f230213k.addLast(str5);
                    i2++;
                    a = a;
                    beVar = null;
                }
            }
        }
        C58833ax axVar = (C58833ax) rVar.f230210h.mo27525b();
        if (axVar.mo56113h()) {
            ((C100321a) axVar.mo56107c()).mo91879c("LocalTtsManager", "TTS_START", "TTS_TYPE_CLIENT", ttsRequest.toString(), (String) null);
        }
        rVar.mo78351c();
    }
}
