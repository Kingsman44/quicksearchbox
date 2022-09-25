package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.p678a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.car.C143089aa;
import com.google.android.gms.car.C143121be;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.p10760f.C143274bh;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.C11530a;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.C11552b;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12985c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12994l;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12995m;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.p880a.C12968d;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d.p1020b.C13663a;
import com.google.android.libraries.search.p2871b.C37251i;
import com.google.android.libraries.search.p2871b.C37266j;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.u */
/* compiled from: PG */
public final class C11551u implements C11530a {

    /* renamed from: a */
    public static final C59071e f37447a = C59071e.m91332i("com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.u");

    /* renamed from: b */
    public final C69464a f37448b;

    /* renamed from: c */
    public final C69464a f37449c;

    /* renamed from: d */
    public final C68214a f37450d;

    /* renamed from: e */
    public final Executor f37451e;

    /* renamed from: f */
    public final Executor f37452f;

    /* renamed from: g */
    public final Executor f37453g;

    /* renamed from: h */
    public C143121be f37454h;

    /* renamed from: i */
    public C11552b f37455i = new C11550t();

    /* renamed from: j */
    public C12995m f37456j = null;

    /* renamed from: k */
    public C60870cx f37457k = C60856cj.m92899h(new IllegalStateException("Prewarm hasn't been started"));

    /* renamed from: l */
    public final C11534d f37458l;

    /* renamed from: m */
    private final Context f37459m;

    /* renamed from: n */
    private final C37251i f37460n;

    /* renamed from: o */
    private final C11636b f37461o;

    /* renamed from: p */
    private final C58833ax f37462p;

    public C11551u(Context context, C11534d dVar, C37266j jVar, C11636b bVar, Executor executor, Executor executor2, C69464a aVar, C69464a aVar2, C68214a aVar3, C58833ax axVar) {
        this.f37459m = context;
        this.f37458l = dVar;
        this.f37460n = jVar.mo40826a();
        this.f37461o = bVar;
        this.f37452f = executor;
        this.f37451e = executor2;
        this.f37453g = new C60904dr(executor2);
        this.f37448b = aVar;
        this.f37450d = aVar3;
        this.f37449c = aVar2;
        this.f37462p = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo20035a(C11552b bVar) {
        C11543m mVar = new C11543m(this, bVar);
        return C60856cj.m92905n(C47810es.m84965e(mVar), this.f37453g);
    }

    /* renamed from: b */
    public final C60870cx mo20036b() {
        C11542l lVar = new C11542l(this);
        return C60856cj.m92903l(C47810es.m84977q(lVar), this.f37453g);
    }

    /* renamed from: c */
    public final C60870cx mo20037c(C12986d dVar, C37251i iVar) {
        C11540j jVar = new C11540j(this, dVar, iVar);
        if (this.f37462p.mo56113h()) {
            return ((C13663a) this.f37462p.mo56107c()).mo21206a(dVar, jVar);
        }
        return (C60870cx) jVar.get();
    }

    /* renamed from: d */
    public final C60870cx mo20038d() {
        C11537g gVar = new C11537g(this);
        return C60856cj.m92905n(C47810es.m84965e(gVar), this.f37453g);
    }

    /* renamed from: e */
    public final C60870cx mo20039e() {
        C11541k kVar = new C11541k(this);
        return C60856cj.m92904m(C47810es.m84978r(kVar), this.f37453g);
    }

    /* renamed from: f */
    public final C60870cx mo20048f() {
        C11549s sVar = new C11549s(this);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(sVar), this.f37453g)).mo51515h(new C11536f(this), this.f37453g);
    }

    /* renamed from: h */
    public final void mo20049h() {
        if (this.f37454h != null) {
            this.f37460n.mo40774b(C37179a.f97662ed.mo40779c());
            C60870cx i = mo20050i((C12986d) null, 2, C58833ax.m90834k(this.f37460n));
            this.f37457k = i;
            C46459k.m82829b(i, "Error Prewarming CarActivity", new Object[0]);
        }
    }

    /* renamed from: i */
    public final C60870cx mo20050i(C12986d dVar, int i, C58833ax axVar) {
        C60870cx f = mo20048f();
        C11547q qVar = new C11547q(this, dVar, i, axVar);
        return C60922j.m93045h(f, C47810es.m84966f(qVar), this.f37452f);
    }

    /* renamed from: j */
    public final void mo20051j(C12986d dVar, int i, C58833ax axVar) {
        Intent intent = new Intent();
        intent.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
        intent.putExtra("assistant_activity", true);
        int i2 = i - 1;
        int i3 = 3;
        if (i2 == 1) {
            intent.putExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_PREWARM", true);
        } else if (i2 != 2) {
            if (i2 == 3) {
                intent.putExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_START_MEDIA_REC", true);
            }
            if (!axVar.mo56113h()) {
                intent.putExtra("start_event_already_logged", true);
            }
        } else {
            intent.putExtra("com.google.android.libraries.assistant.auto.jumpboost.gearhead.request.EXTRA_STOP_VOICE_SESSION", true);
        }
        intent.setComponent(new ComponentName(this.f37459m, "com.google.android.libraries.assistant.auto.jumpboost.caractivity.VoicePlateCarService"));
        if (dVar != null) {
            C11636b bVar = this.f37461o;
            C12991i iVar = dVar.f40370d;
            if (iVar == null) {
                iVar = C12991i.f40380k;
            }
            C13007y yVar = iVar.f40383b;
            if (yVar == null) {
                yVar = C13007y.f40413d;
            }
            bVar.f37597g = Long.valueOf(yVar.f40416b);
            C143121be beVar = this.f37454h;
            if (beVar != null) {
                C143274bh a = C143089aa.m232074a(beVar);
                CarInfo a2 = a.f388479a.mo117914a();
                if (a2 == null) {
                    i3 = 1;
                } else if (a2.f387966h != 1) {
                    i3 = 2;
                }
                if (this.f37456j == null) {
                    CarUiInfo a3 = a.mo118327a();
                    if (a3 == null) {
                        C12985c cVar = (C12985c) dVar.toBuilder();
                        C12991i iVar2 = dVar.f40370d;
                        if (iVar2 == null) {
                            iVar2 = C12991i.f40380k;
                        }
                        C12987e eVar = (C12987e) iVar2.toBuilder();
                        eVar.copyOnWrite();
                        C12991i iVar3 = (C12991i) eVar.instance;
                        iVar3.f40391j = i3 - 1;
                        iVar3.f40382a |= 128;
                        C12991i iVar4 = (C12991i) eVar.build();
                        cVar.copyOnWrite();
                        C12986d dVar2 = (C12986d) cVar.instance;
                        iVar4.getClass();
                        dVar2.f40370d = iVar4;
                        dVar2.f40367a |= 128;
                        dVar = (C12986d) cVar.build();
                    } else {
                        boolean z = a3.f387977b;
                        boolean z2 = a3.f387976a;
                        boolean z3 = a3.f387979d;
                        ((C59052c) ((C59052c) f37447a.mo56224b()).mo56372aa(43364)).mo56359L("Input type: \nTouchscreen: %s\nRotary: %s\nTouchpad: %s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
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
                        this.f37456j = (C12995m) lVar.build();
                    }
                }
                C12985c cVar2 = (C12985c) dVar.toBuilder();
                C12991i iVar5 = dVar.f40370d;
                if (iVar5 == null) {
                    iVar5 = C12991i.f40380k;
                }
                C12987e eVar2 = (C12987e) iVar5.toBuilder();
                C12995m mVar4 = this.f37456j;
                mVar4.getClass();
                eVar2.copyOnWrite();
                C12991i iVar6 = (C12991i) eVar2.instance;
                iVar6.f40388g = mVar4;
                iVar6.f40382a |= 32;
                eVar2.copyOnWrite();
                C12991i iVar7 = (C12991i) eVar2.instance;
                iVar7.f40391j = i3 - 1;
                iVar7.f40382a |= 128;
                cVar2.copyOnWrite();
                C12986d dVar3 = (C12986d) cVar2.instance;
                C12991i iVar8 = (C12991i) eVar2.build();
                iVar8.getClass();
                dVar3.f40370d = iVar8;
                dVar3.f40367a |= 128;
                dVar = (C12986d) cVar2.build();
            }
            C12968d.m29210b(intent, dVar);
        }
        if (axVar.mo56113h()) {
            intent.putExtra("assistant_auto_start_event_extra", ((C37251i) axVar.mo56107c()).mo40776d());
        }
        C143121be beVar2 = this.f37454h;
        if (beVar2 != null) {
            C143089aa.m232075b(beVar2, intent);
        }
    }
}
