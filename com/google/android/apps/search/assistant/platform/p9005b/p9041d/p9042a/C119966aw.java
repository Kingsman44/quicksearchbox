package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.libraries.p8959d.C119259a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119872dm;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119873dn;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119896o;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119901t;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120513j;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120698m;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120699n;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120701p;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.aw */
/* compiled from: PG */
public final class C119966aw {

    /* renamed from: a */
    public static final C59071e f334066a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.b.d.a.aw");

    /* renamed from: b */
    public final C120701p f334067b;

    /* renamed from: c */
    public final C120513j f334068c;

    /* renamed from: d */
    public final C119834cb f334069d;

    /* renamed from: e */
    public final C120695j f334070e;

    /* renamed from: f */
    public final Executor f334071f;

    /* renamed from: g */
    public final List f334072g = new ArrayList();

    /* renamed from: h */
    public int f334073h = 1;

    /* renamed from: i */
    public final C33447g f334074i;

    /* renamed from: j */
    private final C119955al f334075j;

    /* renamed from: k */
    private final C119979bg f334076k;

    public C119966aw(C119955al alVar, C119979bg bgVar, C120701p pVar, C120513j jVar, C33447g gVar, C119834cb cbVar, C120695j jVar2, Executor executor) {
        this.f334075j = alVar;
        this.f334076k = bgVar;
        this.f334067b = pVar;
        this.f334068c = jVar;
        this.f334074i = gVar;
        this.f334069d = cbVar;
        this.f334070e = jVar2;
        this.f334071f = new C60904dr(executor);
    }

    /* renamed from: a */
    public static C119904w m198870a(C119901t tVar) {
        C119896o oVar = (C119896o) C119904w.f333909c.createBuilder();
        oVar.copyOnWrite();
        C119904w wVar = (C119904w) oVar.instance;
        C119903v vVar = (C119903v) tVar.build();
        vVar.getClass();
        wVar.f333912b = vVar;
        wVar.f333911a = 2;
        return (C119904w) oVar.build();
    }

    /* renamed from: b */
    public final void mo104590b(C119873dn dnVar) {
        C119785ag agVar;
        C119885dz dzVar;
        C120698m mVar = C120698m.OPENING_MICROPHONE;
        C120699n nVar = C120699n.EMPTY;
        int i = this.f334073h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            this.f334072g.add(dnVar);
        } else if (i2 == 1) {
            C119955al alVar = this.f334075j;
            int i3 = dnVar.f333838a;
            int a = C119872dm.m198755a(i3);
            int i4 = a - 1;
            if (a != 0) {
                if (i4 == 1) {
                    if (i3 == 2) {
                        agVar = (C119785ag) dnVar.f333839b;
                    } else {
                        agVar = C119785ag.f333648b;
                    }
                    if (agVar.f333650a != 0 && !alVar.f334046c.getAndSet(true)) {
                        alVar.f334044a.f334043a.mo19974a(C37176a.f96921bm);
                    }
                } else if (i4 == 2) {
                    if (i3 == 3) {
                        dzVar = (C119885dz) dnVar.f333839b;
                    } else {
                        dzVar = C119885dz.f333865f;
                    }
                    if (!dzVar.f333868b.isEmpty() && !alVar.f334045b.getAndSet(true)) {
                        alVar.f334044a.f334043a.mo19974a(C37176a.f96920bl);
                    }
                }
                this.f334076k.mo104597a(dnVar);
                return;
            }
            throw null;
        } else if (i2 == 2) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: c */
    public final void mo104591c(C119259a aVar, Consumer consumer) {
        C119965av avVar = new C119965av(this, aVar, consumer);
        aVar.mo104264b(avVar);
        avVar.accept(null);
    }
}
