package com.google.android.apps.gsa.staticplugins.gearhead.projected;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.gms.car.C143089aa;
import com.google.android.gms.car.C143121be;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a.C11613n;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12994l;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12995m;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12968d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2871b.C37251i;
import com.google.android.libraries.search.p2871b.C37266j;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.projected.ad */
/* compiled from: PG */
public final class C101351ad implements C101380i {

    /* renamed from: a */
    public static final C59071e f282845a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.gearhead.projected.ad");

    /* renamed from: b */
    public final C101347a f282846b;

    /* renamed from: c */
    public final C22871g f282847c;

    /* renamed from: d */
    public final C22871g f282848d;

    /* renamed from: e */
    public C143121be f282849e;

    /* renamed from: f */
    public C12995m f282850f;

    /* renamed from: g */
    public C60870cx f282851g = C60856cj.m92899h(new IllegalStateException("Prewarm hasn't been started"));

    /* renamed from: h */
    private final Context f282852h;

    /* renamed from: i */
    private final C11636b f282853i;

    /* renamed from: j */
    private final C37251i f282854j;

    /* renamed from: k */
    private final Executor f282855k;

    /* renamed from: l */
    private final Executor f282856l;

    /* renamed from: m */
    private final C69464a f282857m;

    /* renamed from: n */
    private final C69464a f282858n;

    /* renamed from: o */
    private final C11613n f282859o;

    public C101351ad(Context context, C22871g gVar, C22871g gVar2, Executor executor, C101347a aVar, C37266j jVar, C11636b bVar, C69464a aVar2, C69464a aVar3, C11613n nVar) {
        this.f282852h = context;
        this.f282846b = aVar;
        this.f282854j = jVar.mo40826a();
        this.f282847c = gVar2;
        this.f282848d = gVar;
        this.f282855k = executor;
        this.f282856l = new C60904dr(executor);
        this.f282853i = bVar;
        this.f282858n = aVar2;
        this.f282859o = nVar;
        this.f282857m = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo92253a() {
        C101388q qVar = new C101388q(this);
        return C60856cj.m92904m(C47810es.m84978r(qVar), this.f282856l);
    }

    /* renamed from: b */
    public final void mo92254b() {
        C90875ai.m148465b(C101386o.f282917a, this.f282847c.mo28207g("Establishing car connection", new C101385n(this)), this.f282847c, "Establishing car connection callback").mo85223a(C101387p.f282918a);
    }

    /* renamed from: c */
    public final void mo92255c() {
        C90875ai.m148465b(C101396y.f282927a, this.f282847c.mo28207g("Disconnecting car connection", new C101395x(this)), this.f282847c, "Disconnecting car connection callback").mo85223a(C101397z.f282928a);
    }

    /* renamed from: d */
    public final void mo92256d(C12986d dVar, C37251i iVar) {
        C90875ai.m148465b(C101392u.f282923a, this.f282848d.mo28207g("Starting voice plate car activity", new C101381j(this, dVar, iVar)), this.f282848d, "Starting voice plate car activity callback").mo85223a(C101393v.f282924a);
    }

    /* renamed from: e */
    public final void mo92257e() {
        C90875ai.m148465b(C101390s.f282921a, this.f282848d.mo28207g("Stopping voice plate car activity", new C101389r(this)), this.f282848d, "Stopping voice plate car activity callback").mo85223a(C101391t.f282922a);
    }

    /* renamed from: f */
    public final void mo92258f() {
        C143121be beVar = this.f282849e;
        if (beVar == null || !beVar.mo117964b()) {
            mo92254b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo92259g() {
        if (!((Boolean) this.f282858n.mo17428b()).booleanValue()) {
            return;
        }
        if (((Boolean) this.f282857m.mo17428b()).booleanValue()) {
            new C90873ag(this.f282859o.mo20081a(), this.f282848d, "Start prewarm after connection", new C101382k(this)).mo85223a(C101383l.f282911a);
        } else {
            mo92260h();
        }
    }

    /* renamed from: h */
    public final void mo92260h() {
        if (this.f282849e != null) {
            this.f282854j.mo40774b(C37179a.f97662ed.mo40779c());
            this.f282851g = mo92261i((C12986d) null, 2, C58833ax.m90834k(this.f282854j));
        }
    }

    /* renamed from: i */
    public final C60870cx mo92261i(C12986d dVar, int i, C58833ax axVar) {
        C101384m mVar = new C101384m(this, dVar, i, axVar);
        return C60856cj.m92903l(C47810es.m84977q(mVar), this.f282855k);
    }

    /* renamed from: j */
    public final void mo92262j(C12986d dVar, int i, C58833ax axVar) {
        Intent intent = new Intent();
        intent.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
        intent.putExtra("assistant_activity", true);
        int i2 = i - 1;
        if (i2 == 1) {
            intent.putExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM", true);
        } else if (i2 == 2) {
            intent.putExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_STOP_VOICE_SESSION", true);
        } else if (i2 == 3) {
            intent.putExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_START_MEDIA_REC", true);
        }
        intent.setComponent(new ComponentName(this.f282852h, "com.google.android.apps.gsa.staticplugins.gearhead.projected.VoicePlateCarService"));
        if (dVar != null) {
            C143121be beVar = this.f282849e;
            if (beVar != null) {
                if (this.f282850f == null) {
                    CarUiInfo a = C143089aa.m232074a(beVar).mo118327a();
                    if (a != null) {
                        boolean z = a.f387977b;
                        boolean z2 = a.f387976a;
                        boolean z3 = a.f387979d;
                        ((C59052c) ((C59052c) f282845a.mo56224b()).mo56372aa(20093)).mo56359L("Input type: \nTouchscreen: %s\nRotary: %s\nTouchpad: %s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
                        C12994l lVar = (C12994l) C12995m.f40394e.createBuilder();
                        lVar.copyOnWrite();
                        C12995m mVar = (C12995m) lVar.instance;
                        mVar.f40396a = 1 | mVar.f40396a;
                        mVar.f40397b = z;
                        lVar.copyOnWrite();
                        C12995m mVar2 = (C12995m) lVar.instance;
                        mVar2.f40396a = 2 | mVar2.f40396a;
                        mVar2.f40398c = z2;
                        lVar.copyOnWrite();
                        C12995m mVar3 = (C12995m) lVar.instance;
                        mVar3.f40396a |= 4;
                        mVar3.f40399d = z3;
                        this.f282850f = (C12995m) lVar.build();
                    }
                }
                C12985c cVar = (C12985c) dVar.toBuilder();
                C12991i iVar = dVar.f40370d;
                if (iVar == null) {
                    iVar = C12991i.f40380k;
                }
                C12987e eVar = (C12987e) iVar.toBuilder();
                C12995m mVar4 = this.f282850f;
                mVar4.getClass();
                eVar.copyOnWrite();
                C12991i iVar2 = (C12991i) eVar.instance;
                iVar2.f40388g = mVar4;
                iVar2.f40382a |= 32;
                cVar.copyOnWrite();
                C12986d dVar2 = (C12986d) cVar.instance;
                C12991i iVar3 = (C12991i) eVar.build();
                iVar3.getClass();
                dVar2.f40370d = iVar3;
                dVar2.f40367a |= 128;
                dVar = (C12986d) cVar.build();
            }
            C12968d.m29210b(intent, dVar);
            C11636b bVar = this.f282853i;
            C12991i iVar4 = dVar.f40370d;
            if (iVar4 == null) {
                iVar4 = C12991i.f40380k;
            }
            C13007y yVar = iVar4.f40383b;
            if (yVar == null) {
                yVar = C13007y.f40413d;
            }
            bVar.f37597g = Long.valueOf(yVar.f40416b);
        }
        if (axVar.mo56113h()) {
            intent.putExtra("assistant_auto_start_event_extra", ((C37251i) axVar.mo56107c()).mo40776d());
        }
        C143121be beVar2 = this.f282849e;
        if (beVar2 != null) {
            C143089aa.m232075b(beVar2, intent);
        }
    }
}
