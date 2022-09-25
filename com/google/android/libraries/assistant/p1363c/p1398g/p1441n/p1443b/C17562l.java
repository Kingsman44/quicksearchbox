package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import android.os.Bundle;
import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17485au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1445a.C17574a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1447c.C17586a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1448d.C17587a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1450f.C17589a;
import com.google.assistant.p3897e.p3929l.p3930a.C52796x;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5205f.p5206a.C66501b;
import com.google.speech.p5205f.p5206a.C66502c;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5226l.p5227a.C67250b;
import com.google.speech.p5230n.p5232b.C67398an;
import com.google.speech.p5230n.p5232b.C67400ap;
import com.google.speech.p5230n.p5232b.C67402ar;
import java.io.File;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.l */
/* compiled from: PG */
final class C17562l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C17564n f50619a;

    /* renamed from: b */
    final /* synthetic */ C17565o f50620b;

    public C17562l(C17565o oVar, C17564n nVar) {
        this.f50620b = oVar;
        this.f50619a = nVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C17565o.f50627a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42773)).mo56389s("Cancellation/Failure in on-device TTS engine init for sessionToken %s. Shutting down on-device TTS engine.", C17377g.m34655c(this.f50620b.f50630d));
        this.f50619a.mo23394a(this.f50620b.f50630d);
        ((C2164c) this.f50620b.f50634h.get()).mo5437b(C17586a.m34876c(102));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C67190ah ahVar;
        String str;
        Optional optional;
        C67190ah ahVar2;
        Object obj2;
        C67402ar arVar;
        Object obj3;
        C67400ap apVar;
        Void voidR = (Void) obj;
        C52796x xVar = this.f50620b.f50629c.f50487e;
        if (xVar == null) {
            xVar = C52796x.f138517c;
        }
        Optional a = C17574a.m34861a(xVar);
        if (a.isPresent()) {
            this.f50619a.f50625a.setLanguage((Locale) a.get());
            C17564n nVar = this.f50619a;
            C52796x xVar2 = this.f50620b.f50629c.f50487e;
            if (xVar2 == null) {
                xVar2 = C52796x.f138517c;
            }
            C17589a.m34880a(nVar.f50625a, xVar2);
            C17565o oVar = this.f50620b;
            C17564n nVar2 = this.f50619a;
            if (((Optional) oVar.f50631e.mo6453a()).isPresent()) {
                C17485au auVar = oVar.f50629c;
                if (auVar.f50484b == 3) {
                    ahVar = (C67190ah) auVar.f50485c;
                } else {
                    ahVar = C67190ah.f182619q;
                }
                int i = ahVar.f182622a;
                if ((i & 1) != 0) {
                    C58976aa aaVar = C58975e.f156826a;
                    str = ahVar.f182625d;
                } else if ((i & 2) != 0) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    str = ahVar.f182626e;
                } else {
                    C58976aa aaVar3 = C58975e.f156826a;
                    C67250b bVar = ahVar.f182627f;
                    if (bVar == null) {
                        bVar = C67250b.f182809a;
                    }
                    C62940bt r2 = C62942bv.checkIsLite(C66502c.f180870a);
                    bVar.mo58887l(r2);
                    Object l = bVar.f169962ag.mo58854l(r2.f169971d);
                    if (l == null) {
                        obj3 = r2.f169969b;
                    } else {
                        obj3 = r2.mo58889c(l);
                    }
                    C66501b bVar2 = (C66501b) obj3;
                    if (bVar2.f180867a == 2) {
                        apVar = (C67400ap) bVar2.f180868b;
                    } else {
                        apVar = C67400ap.f183187c;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (C67398an anVar : apVar.f183189a) {
                        sb.append(anVar.f183183a == 1 ? (String) anVar.f183184b : BuildConfig.FLAVOR);
                    }
                    str = sb.toString();
                }
                Bundle bundle = new Bundle();
                bundle.putString("com.google.android.tts:UseGoogleOnlyVoice", "hol");
                C17485au auVar2 = oVar.f50629c;
                int i2 = auVar2.f50484b;
                if (i2 == 2) {
                    optional = Optional.m71637of((C67402ar) auVar2.f50485c);
                } else {
                    if (i2 == 3) {
                        ahVar2 = (C67190ah) auVar2.f50485c;
                    } else {
                        ahVar2 = C67190ah.f182619q;
                    }
                    C67250b bVar3 = ahVar2.f182627f;
                    if (bVar3 == null) {
                        bVar3 = C67250b.f182809a;
                    }
                    C62940bt r4 = C62942bv.checkIsLite(C66502c.f180870a);
                    bVar3.mo58887l(r4);
                    Object l2 = bVar3.f169962ag.mo58854l(r4.f169971d);
                    if (l2 == null) {
                        obj2 = r4.f169969b;
                    } else {
                        obj2 = r4.mo58889c(l2);
                    }
                    C66501b bVar4 = (C66501b) obj2;
                    if (bVar4.f180867a == 4) {
                        arVar = (C67402ar) bVar4.f180868b;
                    } else {
                        arVar = C67402ar.f183192d;
                    }
                    if (C17587a.m34878a(arVar)) {
                        optional = Optional.m71637of(arVar);
                    } else {
                        optional = Optional.empty();
                    }
                }
                if (optional.isPresent()) {
                    bundle.putByteArray("com.google.android.tts:TextProto", ((C67402ar) optional.get()).toByteArray());
                }
                nVar2.f50625a.synthesizeToFile(str, bundle, (File) ((Optional) oVar.f50631e.mo6453a()).get(), String.format(Locale.US, "unique utteranceId = %d", new Object[]{Integer.valueOf(str.hashCode())}));
                return;
            }
            nVar2.mo23394a(oVar.f50630d);
            ((C2164c) oVar.f50634h.get()).mo5437b(C17586a.m34876c(103));
            return;
        }
        C59104x d = C17565o.f50627a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) d).mo56372aa(42774)).mo56389s("Missing voice_settings in the SynthesisRequest for sessionToken %s. Shutting down on-device TTS engine.", C17377g.m34655c(this.f50620b.f50630d));
        this.f50619a.mo23394a(this.f50620b.f50630d);
        ((C2164c) this.f50620b.f50634h.get()).mo5437b(C17586a.m34876c(5));
    }
}
