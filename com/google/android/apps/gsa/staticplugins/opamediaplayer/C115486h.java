package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import com.google.android.apps.gsa.p6486s.C84261a;
import com.google.android.apps.gsa.p6486s.C84263c;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88453c;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.h */
/* compiled from: PG */
public final class C115486h implements C84261a {

    /* renamed from: a */
    public static final C59071e f320331a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.h");

    /* renamed from: b */
    private final C68214a f320332b;

    /* renamed from: c */
    private final C22871g f320333c;

    public C115486h(C68214a aVar, C22871g gVar) {
        this.f320332b = aVar;
        this.f320333c = gVar;
    }

    /* renamed from: b */
    public static void m191570b(long j, C84272l lVar) {
        if (lVar == C84272l.SUCCESS) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x c = f320331a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AudioPlayerMsgHandler");
        ((C59052c) ((C59052c) c).mo56372aa(29650)).mo56388r("Failed to execute action: %d", j);
    }

    /* renamed from: a */
    public final void mo77747a(C88458h hVar) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        if ((hVar.f239138a & 1) != 0) {
            int i = (int) hVar.f239139b;
            if (i == 1) {
                cxVar = ((C84274n) this.f320332b.mo27525b()).mo77787c(C84269i.STOP_SESSION);
            } else if (i == 2 || i == 4) {
                cxVar = ((C84274n) this.f320332b.mo27525b()).mo77787c(C84269i.TOGGLE_PLAY_PAUSE);
            } else if (i == 8) {
                cxVar = ((C84274n) this.f320332b.mo27525b()).mo77787c(C84269i.REWIND);
            } else if (i == 16) {
                cxVar = ((C84274n) this.f320332b.mo27525b()).mo77787c(C84269i.PLAY_PREVIOUS);
            } else if (i == 32) {
                cxVar = ((C84274n) this.f320332b.mo27525b()).mo77787c(C84269i.PLAY_NEXT);
            } else if (i != 64) {
                cxVar = null;
                if (i == 1024) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 86481;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                    C84269i iVar = C84269i.PLAY;
                    C84263c cVar = new C84263c();
                    cVar.f229313a = C58833ax.m90834k(hVar.f239143f);
                    cxVar = ((C84274n) this.f320332b.mo27525b()).mo77788d(iVar, cVar.mo77754a());
                } else if (i != 0) {
                    C59104x d = f320331a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AudioPlayerMsgHandler");
                    ((C59052c) ((C59052c) d).mo56372aa(29645)).mo56387q("Unsupported playback action: %d", i);
                }
            } else {
                cxVar = ((C84274n) this.f320332b.mo27525b()).mo77787c(C84269i.FAST_FORWARD);
            }
            if (cxVar != null) {
                new C90873ag(cxVar, this.f320333c, "playback-action-performed", new C115420f(hVar)).mo85223a(new C115483g(i));
            }
        }
        if ((hVar.f239138a & 2) != 0) {
            int a = C88453c.m142812a(hVar.f239140c);
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            if (i2 == 1) {
                ((C84274n) this.f320332b.mo27525b()).mo77793i();
            } else if (i2 == 2) {
                new C90873ag(((C84274n) this.f320332b.mo27525b()).mo77787c(C84269i.AUTO_PLAY_NEXT), this.f320333c, "auto-play-next-performed", C115089a.f319492a).mo85223a(C115140b.f319553a);
            } else if (i2 == 5) {
                C84274n nVar = (C84274n) this.f320332b.mo27525b();
                C60870cx h = C60922j.m93045h(nVar.mo77787c(C84269i.STOP), new C115163c(nVar), C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
                C90875ai.m148465b(C115170d.f319635a, h, this.f320333c, "stop-session").mo85223a(C115414e.f320222a);
            }
        }
    }
}
