package com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7957c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.fedass.trainingcache.p7956b.C101177c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5228m.C67294ay;
import com.google.speech.p5228m.C67295az;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.trainingcache.c.s */
/* compiled from: PG */
public final class C101196s implements C84235h {

    /* renamed from: a */
    public static final C59071e f282451a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.trainingcache.c.s");

    /* renamed from: b */
    public final C22871g f282452b;

    /* renamed from: c */
    public final C69464a f282453c;

    /* renamed from: d */
    public final C69464a f282454d;

    /* renamed from: e */
    public final C69464a f282455e;

    /* renamed from: f */
    public final AtomicReference f282456f = new AtomicReference((Object) null);

    /* renamed from: g */
    public final AtomicBoolean f282457g = new AtomicBoolean(false);

    /* renamed from: h */
    public final List f282458h = new ArrayList();

    /* renamed from: i */
    private final Context f282459i;

    /* renamed from: j */
    private final Executor f282460j;

    /* renamed from: k */
    private final AtomicBoolean f282461k = new AtomicBoolean(false);

    /* renamed from: l */
    private final ServiceConnection f282462l = new C101192o(this);

    public C101196s(Context context, C90821bm bmVar, Executor executor, C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f282459i = context;
        this.f282452b = bmVar.mo85163a(C101195r.class);
        this.f282460j = executor;
        this.f282454d = aVar;
        this.f282455e = aVar2;
        this.f282453c = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo77711a() {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19866)).mo56386p("on clear.");
        return mo92169m(C101182e.f282435a);
    }

    /* renamed from: b */
    public final C60870cx mo77712b(List list) {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19867)).mo56389s("deleteCache(%s)", list);
        return mo92169m(new C101188k(list));
    }

    /* renamed from: c */
    public final C60870cx mo77713c() {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19868)).mo56386p("on initEkho.");
        return mo92169m(C101181d.f282434a);
    }

    /* renamed from: d */
    public final C60870cx mo77714d(C89849ae aeVar) {
        if (aeVar == C89849ae.OPA_ACTIVITY_DISMISS_FLING || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_FOR_START_SHELL_APP || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_SCROLL || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_DRAG || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_BACK || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_HOME || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_CLICK_OUT || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_CLOSE_IMMERSIVE || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_AUTO_TIMER || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_OTHER || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_BACK_FROM_TAPAS || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_CLICK_TAPAS_BACKGROUND || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_3P || aeVar == C89849ae.OPA_ACTIVITY_DISMISS_RELAUNCH) {
            C67294ay ayVar = (C67294ay) C67295az.f182919c.createBuilder();
            int i = aeVar.f245884YW;
            ayVar.copyOnWrite();
            C67295az azVar = (C67295az) ayVar.instance;
            azVar.f182921a |= 1;
            azVar.f182922b = i;
            return mo77722l(1016, ((C67295az) ayVar.build()).toByteArray(), 1);
        }
        C59104x c = f282451a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        C59052c cVar = (C59052c) c;
        cVar.mo56378ag(C58975e.f156826a, "TrainingCacheEntryPoint");
        ((C59052c) cVar.mo56372aa(19872)).mo56387q("Unhandled FlowEvent: %d", aeVar.f245884YW);
        return C60866ct.f164955a;
    }

    /* renamed from: e */
    public final C60870cx mo77715e(String str) {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19873)).mo56386p("onAccountChanged()");
        if (true == TextUtils.isEmpty(str)) {
            str = BuildConfig.FLAVOR;
        }
        return mo92169m(new C101185h(str));
    }

    /* renamed from: f */
    public final C60870cx mo77716f(List list) {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19874)).mo56386p("onAccountsRemoved()");
        return mo92169m(new C101184g(list));
    }

    /* renamed from: g */
    public final C60870cx mo77717g() {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19875)).mo56386p("onRuntimeFlagsChanged()");
        C60870cx m = mo92169m(C101189l.f282445a);
        this.f282452b.mo28211k(m, "[TrainingCache]: onRuntimeFlagsChanged callback", new C101194q("[TrainingCache]: onRuntimeFlagsChanged callback"));
        return m;
    }

    /* renamed from: h */
    public final C60870cx mo77718h() {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19876)).mo56386p("onStartupFlagsChanged()");
        C60870cx m = mo92169m(C101178a.f282428a);
        this.f282452b.mo28211k(m, "[TrainingCache]: onStartupFlagsChanged callback", new C101194q("[TrainingCache]: onStartupFlagsChanged callback"));
        return m;
    }

    /* renamed from: i */
    public final void mo77719i(String str) {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19877)).mo56386p("onPrefsChanged()");
        this.f282452b.mo28211k(mo92169m(new C101186i(str)), "[TrainingCache]: onPrefsChanged callback", new C101194q("TrainingCache onPrefsChanged"));
    }

    /* renamed from: j */
    public final C60870cx mo77720j(int i) {
        return mo77722l(i, new byte[0], 1);
    }

    /* renamed from: k */
    public final C60870cx mo77721k(int i, byte[] bArr) {
        return mo77722l(i, bArr, 1);
    }

    /* renamed from: l */
    public final C60870cx mo77722l(int i, byte[] bArr, int i2) {
        C59104x b = f282451a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
        ((C59052c) ((C59052c) b).mo56372aa(19869)).mo56386p("on insertClientEvent.");
        C101179b bVar = new C101179b(this);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(bVar), this.f282460j)).mo51516i(new C101180c(this, i, bArr, i2), this.f282460j);
    }

    /* renamed from: m */
    public final C60870cx mo92169m(C101193p pVar) {
        return this.f282452b.mo28201a("[TrainingCache] TrainingCacheService.sendMessage", new C101183f(this, pVar));
    }

    /* renamed from: n */
    public final synchronized void mo92170n() {
        this.f282456f.set((Object) null);
        this.f282457g.set(false);
        this.f282461k.set(false);
    }

    /* renamed from: o */
    public final synchronized void mo92171o(C101177c cVar) {
        this.f282456f.set(cVar);
        this.f282457g.set(true);
        mo92172p();
    }

    /* renamed from: p */
    public final synchronized void mo92172p() {
        Iterator it = this.f282458h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C101193p pVar = (C101193p) it.next();
            C101177c cVar = (C101177c) this.f282456f.get();
            if (cVar == null) {
                C59104x d = f282451a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
                ((C59052c) ((C59052c) d).mo56372aa(19879)).mo56386p("service null while processing message.");
                break;
            }
            try {
                pVar.mo92166a(cVar);
            } catch (Exception e) {
                C59104x d2 = f282451a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(19878)).mo56389s("%s", e.getMessage());
            }
        }
        this.f282458h.clear();
        this.f282459i.unbindService(this.f282462l);
        mo92170n();
    }

    /* renamed from: q */
    public final synchronized void mo92173q() {
        if (this.f282461k.compareAndSet(false, true)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.f282459i, "com.google.android.apps.gsa.staticplugins.fedass.trainingcache.service.TrainingCacheService"));
            intent.setPackage("com.google.android.googlequicksearchbox");
            if (!this.f282459i.bindService(intent, this.f282462l, 1)) {
                C59104x c = f282451a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TrainingCacheConnection");
                ((C59052c) ((C59052c) c).mo56372aa(19880)).mo56386p("Unable to bind to TrainingCacheService");
            }
        }
    }
}
