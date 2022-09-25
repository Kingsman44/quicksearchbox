package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts;

import androidx.lifecycle.C2358bf;
import com.google.android.libraries.assistant.p1363c.p1398g.p1402b.p1403a.C17361a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17478an;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17479ao;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17482ar;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17484at;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17497bf;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17499bh;
import com.google.apps.tiktok.tracing.contrib.androidx.p3696a.C47615b;
import com.google.assistant.p3897e.p3929l.p3930a.C52795w;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.tts.TtsViewModel */
/* compiled from: PG */
public final class TtsViewModel extends C2358bf {

    /* renamed from: a */
    private final C127119a f350014a;

    /* renamed from: b */
    private final C47615b f350015b;

    public TtsViewModel(C127119a aVar, C47615b bVar) {
        this.f350014a = aVar;
        this.f350015b = bVar;
    }

    /* renamed from: a */
    public final void mo107940a(String str, String str2, boolean z) {
        C69664n.m101061g(str, "text");
        C69664n.m101061g(str2, "locale");
        this.f350014a.mo107941a();
        C127119a aVar = this.f350014a;
        C69664n.m101061g(str, "tts");
        C69664n.m101061g(str2, "locale");
        C59052c cVar = (C59052c) C127119a.f350016a.mo56224b();
        Boolean valueOf = Boolean.valueOf(z);
        cVar.mo56379ah(new C59094n(37387));
        cVar.mo56359L("Received triggerTts request with tts:%s, locale:%s and synthesizeOnClient:%s", str, str2, valueOf);
        C17361a aVar2 = aVar.f350018c;
        C17497bf bfVar = (C17497bf) C17499bh.f50509e.createBuilder();
        C17478an anVar = (C17478an) C17479ao.f50468d.createBuilder();
        C17482ar arVar = (C17482ar) C17485au.f50481h.createBuilder();
        C17484at atVar = z ? C17484at.CLIENT : C17484at.SERVER;
        arVar.copyOnWrite();
        C17485au auVar = (C17485au) arVar.instance;
        auVar.f50486d = atVar.f50480d;
        auVar.f50483a |= 8;
        C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
        aeVar.copyOnWrite();
        C67190ah ahVar = (C67190ah) aeVar.instance;
        str.getClass();
        ahVar.f182622a |= 1;
        ahVar.f182625d = str;
        aeVar.copyOnWrite();
        C67190ah ahVar2 = (C67190ah) aeVar.instance;
        str2.getClass();
        ahVar2.f182622a |= 8192;
        ahVar2.f182632k = str2;
        C67190ah ahVar3 = (C67190ah) aeVar.build();
        arVar.copyOnWrite();
        C17485au auVar2 = (C17485au) arVar.instance;
        ahVar3.getClass();
        auVar2.f50485c = ahVar3;
        auVar2.f50484b = 3;
        if (z) {
            C52795w wVar = (C52795w) C52796x.f138517c.createBuilder();
            wVar.mo53910a(str2);
            C52796x xVar = (C52796x) wVar.build();
            arVar.copyOnWrite();
            C17485au auVar3 = (C17485au) arVar.instance;
            xVar.getClass();
            auVar3.f50487e = xVar;
            auVar3.f50483a |= 16;
        }
        C62942bv build = arVar.build();
        C69664n.m101060f(build, "builder.build()");
        C17485au auVar4 = (C17485au) build;
        anVar.copyOnWrite();
        C17479ao aoVar = (C17479ao) anVar.instance;
        auVar4.getClass();
        aoVar.f50471b = auVar4;
        aoVar.f50470a |= 1;
        C17479ao aoVar2 = (C17479ao) anVar.build();
        bfVar.copyOnWrite();
        C17499bh bhVar = (C17499bh) bfVar.instance;
        aoVar2.getClass();
        bhVar.f50513c = aoVar2;
        bhVar.f50512b = 3;
        C62942bv build2 = bfVar.build();
        C69664n.m101060f(build2, "newBuilder()\n        .se…       )\n        .build()");
        aVar.f350017b = aVar2.mo23306a((C17499bh) build2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r1);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo639d() {
        /*
            r3 = this;
            com.google.apps.tiktok.tracing.contrib.androidx.a.b r0 = r3.f350015b
            com.google.apps.tiktok.tracing.bx r0 = r0.mo51503a()
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.tts.a r1 = r3.f350014a     // Catch:{ all -> 0x0010 }
            r1.mo107941a()     // Catch:{ all -> 0x0010 }
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            return
        L_0x0010:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.tts.TtsViewModel.mo639d():void");
    }
}
