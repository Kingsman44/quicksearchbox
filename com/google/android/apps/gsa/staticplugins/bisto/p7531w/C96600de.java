package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124628au;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124649bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.de */
/* compiled from: PG */
final class C96600de extends C96588ct {

    /* renamed from: a */
    public static final C59071e f270228a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.de");

    /* renamed from: A */
    public final SettableFuture f270229A = new SettableFuture();

    /* renamed from: B */
    public volatile int f270230B;

    /* renamed from: C */
    private final C22871g f270231C;

    /* renamed from: D */
    private final C89492cd f270232D;

    /* renamed from: E */
    private final C89656k f270233E;

    /* renamed from: F */
    private final C96618u f270234F;

    /* renamed from: G */
    private final C95355bf f270235G;

    /* renamed from: H */
    private int f270236H;

    /* renamed from: I */
    private boolean f270237I;

    /* renamed from: b */
    public final C96586cr f270238b;

    /* renamed from: c */
    public final C124650bp f270239c;

    /* renamed from: d */
    public final int f270240d;

    /* renamed from: e */
    public final int f270241e;

    /* renamed from: v */
    public final int f270242v;

    /* renamed from: w */
    public int f270243w = 0;

    /* renamed from: x */
    public long f270244x;

    /* renamed from: y */
    public boolean f270245y;

    /* renamed from: z */
    public Integer f270246z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96600de(C22871g gVar, C22871g gVar2, C22871g gVar3, C96579ck ckVar, C89656k kVar, C21370a aVar, C89492cd cdVar, C96618u uVar, C95355bf bfVar, C124721s sVar, C124629av avVar, C124650bp bpVar, int i, int i2) {
        super(gVar, gVar2, ckVar, aVar, bfVar, sVar, avVar);
        C124650bp bpVar2 = bpVar;
        this.f270231C = gVar3;
        this.f270232D = cdVar;
        this.f270233E = kVar;
        this.f270234F = uVar;
        this.f270242v = i;
        this.f270238b = new C96599dd(this);
        this.f270239c = bpVar2;
        this.f270240d = bpVar2.f343893b;
        this.f270241e = i2;
        this.f270235G = bfVar;
        this.f270244x = 20;
    }

    /* renamed from: a */
    public final String mo90248a() {
        return "UploadOtaTask";
    }

    /* renamed from: b */
    public final void mo90249b() {
        C58976aa aaVar = C58975e.f156826a;
        C22871g gVar = this.f270231C;
        int i = this.f270240d;
        gVar.mo28212l("startUpload: " + i, new C96598dc(this));
    }

    /* renamed from: c */
    public final synchronized void mo90271c(int i) {
        if (!mo90256d().isCancelled()) {
            double d = (double) (i - this.f270236H);
            double d2 = (double) this.f270230B;
            Double.isNaN(d2);
            if (d >= d2 * 0.01d) {
                C124649bo boVar = (C124649bo) this.f270239c.toBuilder();
                boVar.copyOnWrite();
                C124650bp bpVar = (C124650bp) boVar.instance;
                bpVar.f343892a |= 256;
                bpVar.f343901j = (long) i;
                int i2 = this.f270230B;
                boVar.copyOnWrite();
                C124650bp bpVar2 = (C124650bp) boVar.instance;
                bpVar2.f343892a |= 512;
                bpVar2.f343902k = (long) i2;
                C124650bp bpVar3 = (C124650bp) boVar.build();
                C124628au auVar = (C124628au) this.f270201m.toBuilder();
                for (int i3 = 0; i3 < ((C124629av) auVar.instance).f343828o.size(); i3++) {
                    if (auVar.mo106566a(i3).f343893b == bpVar3.f343893b) {
                        auVar.copyOnWrite();
                        C124629av avVar = (C124629av) auVar.instance;
                        bpVar3.getClass();
                        avVar.mo106569a();
                        avVar.f343828o.set(i3, bpVar3);
                    }
                }
                this.f270232D.mo83395ak(this.f270235G.mo89270k(), (C124629av) auVar.build());
                C58976aa aaVar = C58975e.f156826a;
                int i4 = this.f270239c.f343893b;
                if (this.f270233E.mo83553h("otaProgressNotification")) {
                    this.f270234F.mo90282f(i, this.f270230B);
                    this.f270237I = true;
                } else {
                    if (this.f270237I && i > 0) {
                        this.f270234F.mo90283g();
                    }
                    this.f270237I = false;
                }
                this.f270236H = i;
            }
        }
    }
}
