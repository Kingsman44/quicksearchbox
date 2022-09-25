package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.concurrent.futuresmixin.C46454t;
import com.google.apps.tiktok.dataservice.C46766cj;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.androidx.TracedDefaultLifecycleObserver;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class AccountControllerImpl extends C45989b {

    /* renamed from: a */
    public static final C59071e f120756a = C59071e.m91332i("com.google.apps.tiktok.account.api.controller.AccountControllerImpl");

    /* renamed from: b */
    public final C47215a f120757b;

    /* renamed from: c */
    public final C46041i f120758c;

    /* renamed from: d */
    public final ActivityAccountState f120759d;

    /* renamed from: e */
    public final C46439e f120760e;

    /* renamed from: f */
    public final KeepStateCallbacksHandler f120761f;

    /* renamed from: g */
    public final C46003bn f120762g;

    /* renamed from: h */
    public final C45966ad f120763h;

    /* renamed from: i */
    public final boolean f120764i;

    /* renamed from: j */
    public final boolean f120765j;

    /* renamed from: k */
    public final C62921ba f120766k;

    /* renamed from: l */
    public final C46440f f120767l = new C46440f() {
        /* renamed from: e */
        private final void m82092e(C46046n nVar, Throwable th) {
            if (nVar.f120910h) {
                KeepStateCallbacksHandler keepStateCallbacksHandler = AccountControllerImpl.this.f120761f;
                C69664n.m101061g(th, C42181t.f110467a);
                C19559g.m37304c();
                C46004bo boVar = keepStateCallbacksHandler.f120796b;
                C69664n.m101058d(boVar);
                int i = boVar.f120848a;
                int i2 = boVar.f120849b;
                C46022cf cfVar = (C46022cf) keepStateCallbacksHandler.f120795a.mo50439b(i);
                if (i2 == 1) {
                    cfVar.mo50161a();
                }
                cfVar.mo50163c();
                keepStateCallbacksHandler.f120796b = null;
                return;
            }
            AccountControllerImpl.this.f120759d.mo50104k(th);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            AccountId accountId;
            AccountActionResult accountActionResult = (AccountActionResult) obj2;
            C46046n nVar = (C46046n) ((ProtoParsers.ParcelableProto) obj).mo58938a(C46046n.f120901j, AccountControllerImpl.this.f120766k);
            AccountControllerImpl.m82071s(nVar);
            if (nVar.equals(AccountControllerImpl.this.f120769n)) {
                boolean z = false;
                if ((nVar.f120903a & 2) != 0) {
                    C58838bb.m90883r(accountActionResult.f120752a.mo50068a() == nVar.f120905c);
                    accountId = AccountId.m82057b(nVar.f120905c);
                } else if (accountActionResult.f120755d != null) {
                    if (!AccountControllerImpl.this.f120759d.mo50101h()) {
                        AccountControllerImpl.this.f120759d.mo50105l();
                    }
                    Intent intent = accountActionResult.f120755d;
                    if (AccountControllerImpl.this.f120759d.mo50101h()) {
                        ActivityAccountState activityAccountState = AccountControllerImpl.this.f120759d;
                        C19559g.m37304c();
                        C45963aa.m82131a(intent, AccountId.m82057b(activityAccountState.f120784d));
                    }
                    AccountControllerImpl.this.f120758c.mo50169c().mo526b(intent);
                    AccountControllerImpl.this.f120761f.mo50112g();
                    return;
                } else if (accountActionResult.f120754c != null) {
                    accountId = accountActionResult.f120752a;
                } else {
                    m82092e(nVar, new C46057y());
                    AccountControllerImpl.this.mo50090m();
                    AccountControllerImpl.this.mo50092o();
                    return;
                }
                ValidationResult validationResult = accountActionResult.f120754c;
                validationResult.getClass();
                if (validationResult.mo50108c()) {
                    ActivityAccountState activityAccountState2 = AccountControllerImpl.this.f120759d;
                    AccountId accountId2 = accountActionResult.f120752a;
                    C46215j jVar = accountActionResult.f120753b;
                    if (Log.isLoggable("ActivityAccountState", 3)) {
                        Log.d("ActivityAccountState", "Switch To Account: ".concat(String.valueOf(String.valueOf(accountId2))));
                    }
                    if (activityAccountState2.mo50102i(accountId2.mo50068a(), jVar, 2)) {
                        activityAccountState2.f120781a.mo50130b(jVar);
                        C45990ba baVar = activityAccountState2.f120781a;
                        C58838bb.m90883r(jVar != null);
                        C58838bb.m90883r(!jVar.equals(C46215j.f121154k));
                        if ((jVar.f121156a & 256) != 0) {
                            z = true;
                        }
                        C58838bb.m90883r(z);
                        C47558bi a = C47831fm.m85006a("onAccountReady");
                        try {
                            C45985aw awVar = new C45985aw(new C45986ax(accountId2, jVar.f121165j));
                            for (C45987ay a2 : baVar.f120818a) {
                                a2.mo19982a(awVar);
                            }
                            Iterator it = baVar.f120819b.iterator();
                            while (it.hasNext()) {
                                ((C45987ay) it.next()).mo19982a(awVar);
                            }
                            a.close();
                            activityAccountState2.mo50100g();
                            activityAccountState2.f120781a.mo50129a(accountId2, jVar);
                        } catch (Throwable th) {
                            C45988az.m82167a(th, th);
                        }
                    }
                    AccountControllerImpl.this.mo50090m();
                } else if (!AccountControllerImpl.this.f120758c.mo50172f()) {
                    AccountControllerImpl.this.mo50090m();
                    C46055w wVar = new C46055w();
                    m82092e(nVar, wVar);
                    ((C59052c) ((C59052c) ((C59052c) AccountControllerImpl.f120756a.mo56224b()).mo56382g(wVar)).mo56372aa(54681)).mo56389s("Account with id %s does not fulfill all the requirements.", accountId);
                    AccountControllerImpl.this.mo50092o();
                    return;
                } else {
                    if (validationResult.mo50107b()) {
                        AccountControllerImpl.this.f120759d.mo50105l();
                    }
                    Intent a3 = validationResult.mo50106a();
                    C45963aa.m82131a(a3, accountId);
                    a3.putExtra("$tiktok$for_requirement_activity", true);
                    a3.putExtra("$tiktok$canRestartAccountSelector", AccountControllerImpl.this.f120768m.mo50151c());
                    a3.addFlags(65536);
                    AccountControllerImpl.this.f120758c.mo50168b().mo526b(a3);
                }
                AccountControllerImpl.this.mo50092o();
                return;
            }
            return;
            throw th;
        }

        /* renamed from: d */
        public final void mo18066a(ProtoParsers.ParcelableProto parcelableProto, Throwable th) {
            Throwable th2;
            Throwable th3;
            ProtoParsers.InternalDontUse internalDontUse;
            Throwable th4 = th;
            C46046n nVar = (C46046n) parcelableProto.mo58938a(C46046n.f120901j, AccountControllerImpl.this.f120766k);
            AccountControllerImpl.m82071s(nVar);
            if (nVar.equals(AccountControllerImpl.this.f120769n)) {
                AccountControllerImpl.this.mo50090m();
                if (th4 instanceof C46454t) {
                    int i = nVar.f120909g;
                    if (i < 4) {
                        C59052c cVar = (C59052c) ((C59052c) ((C59052c) AccountControllerImpl.f120756a.mo56226d()).mo56382g(th4)).mo56372aa(54680);
                        int a = C46045m.m82275a(nVar.f120906d);
                        boolean z = true;
                        if (a == 0) {
                            a = 1;
                        }
                        cVar.mo56393w("Android killed the app process before the account operation completes.retrying the failed operation. AccountControllerOperation type enum number: %d, time(s) attempted: %d", a - 1, i);
                        int a2 = C46045m.m82275a(nVar.f120906d);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        C58480gp e = C58485gu.m89837e();
                        if (a2 == 2 || a2 == 3 || a2 == 6) {
                            for (String cls : nVar.f120907e) {
                                try {
                                    e.mo55395g(Class.forName(cls).asSubclass(C45982at.class));
                                } catch (ClassNotFoundException e2) {
                                    throw new IllegalStateException(e2);
                                }
                            }
                        }
                        C58833ax axVar = C58836b.f156633a;
                        if (a2 == 6) {
                            C58838bb.m90883r((nVar.f120903a & 64) != 0);
                            axVar = C58833ax.m90834k(Integer.valueOf(nVar.f120911i));
                        }
                        int i2 = nVar.f120909g;
                        int i3 = a2 - 1;
                        if (i3 == 1) {
                            AccountControllerImpl.this.mo50095r(e.mo55394f(), i2);
                            return;
                        } else if (i3 == 2) {
                            AccountControllerImpl accountControllerImpl = AccountControllerImpl.this;
                            C58485gu f = e.mo55394f();
                            accountControllerImpl.mo50088k();
                            accountControllerImpl.mo50087j();
                            C47558bi a3 = C47831fm.m85006a("Retry Switch Account Interactive with Specified Selectors");
                            try {
                                accountControllerImpl.mo50093p(f, i2);
                                a3.close();
                                return;
                            } catch (Throwable th5) {
                                C46016c.m82209a(th3, th5);
                            }
                        } else if (i3 == 3) {
                            int i4 = nVar.f120905c;
                            if (i4 < 0) {
                                z = false;
                            }
                            C58838bb.m90883r(z);
                            AccountControllerImpl.this.mo50094q(AccountId.m82057b(i4), nVar.f120908f, i2);
                            return;
                        } else if (i3 == 4) {
                            AccountControllerImpl accountControllerImpl2 = AccountControllerImpl.this;
                            accountControllerImpl2.f120771p = true;
                            accountControllerImpl2.mo50086i(i2);
                            return;
                        } else if (i3 == 5) {
                            AccountControllerImpl accountControllerImpl3 = AccountControllerImpl.this;
                            C58485gu f2 = e.mo55394f();
                            C46022cf cfVar = (C46022cf) AccountControllerImpl.this.f120761f.f120795a.mo50439b(((Integer) axVar.mo56107c()).intValue());
                            accountControllerImpl3.mo50088k();
                            f2.getClass();
                            C58838bb.m90883r(!f2.isEmpty());
                            accountControllerImpl3.mo50089l();
                            KeepStateCallbacksHandler keepStateCallbacksHandler = accountControllerImpl3.f120761f;
                            C19559g.m37304c();
                            keepStateCallbacksHandler.mo50112g();
                            keepStateCallbacksHandler.f120796b = new C46004bo(keepStateCallbacksHandler.f120795a.mo50438a(cfVar), 0);
                            C47558bi a4 = C47831fm.m85006a("Switch Account With Custom Selectors Keep State");
                            try {
                                C60870cx h = accountControllerImpl3.mo50085h(f2);
                                if (!h.isDone()) {
                                    KeepStateCallbacksHandler keepStateCallbacksHandler2 = accountControllerImpl3.f120761f;
                                    C19559g.m37304c();
                                    C46004bo boVar = keepStateCallbacksHandler2.f120796b;
                                    C69664n.m101058d(boVar);
                                    if (boVar.f120849b != 1) {
                                        boVar.f120849b = 1;
                                        ((C46022cf) keepStateCallbacksHandler2.f120795a.mo50439b(boVar.f120848a)).mo50162b();
                                    }
                                    accountControllerImpl3.mo50097u(6, (AccountId) null, C58833ax.m90834k(f2), C58836b.f156633a, true, C58833ax.m90834k(cfVar), h, i2);
                                } else {
                                    internalDontUse = new ProtoParsers.InternalDontUse((byte[]) null, accountControllerImpl3.mo50096t(6, (AccountId) null, C58833ax.m90834k(f2), C58836b.f156633a, true, C58833ax.m90834k(cfVar), i2));
                                    accountControllerImpl3.f120767l.mo18067c(internalDontUse, (AccountActionResult) C60856cj.m92909r(h));
                                }
                            } catch (ExecutionException e3) {
                                ((C459601) accountControllerImpl3.f120767l).mo18066a(internalDontUse, e3.getCause());
                            } catch (Throwable th6) {
                                Throwable th7 = th6;
                                try {
                                    a4.close();
                                } catch (Throwable th8) {
                                    C46016c.m82209a(th7, th8);
                                }
                                throw th7;
                            }
                            a4.close();
                            return;
                        } else {
                            throw new IllegalStateException("AccountControllerOperation type is UNKNOWN. Shouldn't reach here because we already checked this field at the beginning of the method.");
                        }
                    } else {
                        ActivityAccountState activityAccountState = AccountControllerImpl.this.f120759d;
                        C19559g.m37304c();
                        AccountId.m82057b(activityAccountState.f120784d);
                        m82092e(nVar, new C46053u(th4));
                    }
                } else {
                    if (th4 instanceof C46051s) {
                        th2 = (C46051s) th4;
                    } else {
                        th2 = new C46056x(th4);
                    }
                    m82092e(nVar, th2);
                }
                if ((nVar.f120903a & 2) != 0) {
                    AccountId b = AccountId.m82057b(nVar.f120905c);
                    if (th4 instanceof C46051s) {
                        ((C59052c) ((C59052c) ((C59052c) AccountControllerImpl.f120756a.mo56224b()).mo56382g(th4)).mo56372aa(54679)).mo56389s("Failed to use %s.", b);
                    } else {
                        ((C59052c) ((C59052c) ((C59052c) AccountControllerImpl.f120756a.mo56225c()).mo56382g(th4)).mo56372aa(54678)).mo56389s("Failed to use %s.", b);
                    }
                }
                AccountControllerImpl.this.mo50092o();
                return;
            }
            return;
            throw th3;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: m */
    public C46013bx f120768m;

    /* renamed from: n */
    public C46046n f120769n;

    /* renamed from: o */
    public boolean f120770o;

    /* renamed from: p */
    public boolean f120771p;

    /* renamed from: q */
    public C60870cx f120772q;

    /* renamed from: r */
    private final C45990ba f120773r;

    /* renamed from: s */
    private final boolean f120774s;

    /* renamed from: t */
    private final boolean f120775t;

    /* compiled from: PG */
    final class AccountControllerLifecycleObserver implements C2376g, C45965ac {

        /* renamed from: b */
        private boolean f120778b;

        /* renamed from: c */
        private boolean f120779c = false;

        /* renamed from: d */
        private Bundle f120780d;

        public AccountControllerLifecycleObserver() {
        }

        /* renamed from: g */
        public final C60870cx mo50099g() {
            AccountControllerImpl accountControllerImpl = AccountControllerImpl.this;
            accountControllerImpl.f120771p = true;
            if (accountControllerImpl.f120770o || accountControllerImpl.f120758c.mo50175i() || AccountControllerImpl.this.f120758c.mo50174h()) {
                return C60866ct.f164955a;
            }
            return AccountControllerImpl.this.mo50086i(0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bd, code lost:
            if (r5.getBoolean("tiktok_accounts_disabled") != false) goto L_0x00bf;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ee  */
        /* renamed from: gV */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3520gV(androidx.lifecycle.C2391v r5) {
            /*
                r4 = this;
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.account.api.controller.i r5 = r5.f120758c
                com.google.apps.tiktok.account.api.controller.g r0 = new com.google.apps.tiktok.account.api.controller.g
                r0.<init>(r4)
                com.google.apps.tiktok.account.api.controller.h r1 = new com.google.apps.tiktok.account.api.controller.h
                r1.<init>(r4)
                r5.mo50170d(r0, r1)
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.account.api.controller.bx r0 = r5.f120768m
                if (r0 != 0) goto L_0x0021
                com.google.apps.tiktok.account.api.controller.bw r0 = com.google.apps.tiktok.account.api.controller.C46013bx.m82200d()
                com.google.apps.tiktok.account.api.controller.bx r0 = r0.mo50146a()
                r5.f120768m = r0
            L_0x0021:
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.account.api.controller.i r5 = r5.f120758c
                android.content.Intent r5 = r5.mo50167a()
                java.lang.String r0 = "$tiktok$for_requirement_activity"
                boolean r5 = r5.hasExtra(r0)
                if (r5 == 0) goto L_0x008f
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.account.api.controller.bx r5 = r5.f120768m
                com.google.common.b.gu r5 = r5.mo50150b()
                if (r5 == 0) goto L_0x0049
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.account.api.controller.bx r5 = r5.f120768m
                com.google.common.b.gu r5 = r5.mo50150b()
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x008f
            L_0x0049:
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.account.api.controller.bn r0 = r5.f120762g
                com.google.apps.tiktok.account.api.controller.bx r5 = r5.f120768m
                com.google.common.b.gu r5 = r5.mo50150b()
                com.google.common.b.gu r5 = r0.mo50136a(r5)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                boolean r1 = r5.isEmpty()
                if (r1 == 0) goto L_0x0062
                java.lang.String r5 = ""
                goto L_0x0070
            L_0x0062:
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r5 = java.lang.String.valueOf(r5)
                java.lang.String r1 = " Requirements: "
                java.lang.String r5 = r1.concat(r5)
            L_0x0070:
                java.lang.String r1 = "Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?"
                java.lang.String r5 = r1.concat(r5)
                r0.<init>(r5)
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                boolean r5 = r5.f120765j
                if (r5 == 0) goto L_0x008e
                com.google.common.f.e r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.f120756a
                com.google.common.f.x r5 = r5.mo56225c()
                java.lang.String r1 = "The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent"
                r2 = 54682(0xd59a, float:7.6626E-41)
                ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r2)).mo56386p(r1)
                goto L_0x008f
            L_0x008e:
                throw r0
            L_0x008f:
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.inject.c.a r5 = r5.f120757b
                androidx.savedstate.d r5 = r5.getSavedStateRegistry()
                boolean r5 = r5.f13079d
                if (r5 == 0) goto L_0x00aa
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.inject.c.a r5 = r5.f120757b
                androidx.savedstate.d r5 = r5.getSavedStateRegistry()
                java.lang.String r0 = "tiktok_account_controller_saved_instance_state"
                android.os.Bundle r5 = r5.mo8584a(r0)
                goto L_0x00ab
            L_0x00aa:
                r5 = 0
            L_0x00ab:
                r4.f120780d = r5
                r0 = 1
                if (r5 == 0) goto L_0x00bf
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r1 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                boolean r1 = r1.f120764i
                r2 = 0
                if (r1 != 0) goto L_0x00c0
                java.lang.String r1 = "tiktok_accounts_disabled"
                boolean r5 = r5.getBoolean(r1)
                if (r5 == 0) goto L_0x00c0
            L_0x00bf:
                r2 = 1
            L_0x00c0:
                r4.f120778b = r2
                if (r2 == 0) goto L_0x00ee
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.account.api.controller.n r1 = com.google.apps.tiktok.account.api.controller.C46046n.f120901j
                com.google.protobuf.bn r1 = r1.createBuilder()
                com.google.apps.tiktok.account.api.controller.k r1 = (com.google.apps.tiktok.account.api.controller.C46043k) r1
                r1.copyOnWrite()
                com.google.protobuf.bv r2 = r1.instance
                com.google.apps.tiktok.account.api.controller.n r2 = (com.google.apps.tiktok.account.api.controller.C46046n) r2
                int r3 = r2.f120903a
                r0 = r0 | r3
                r2.f120903a = r0
                r0 = -1
                r2.f120904b = r0
                com.google.protobuf.bv r0 = r1.build()
                com.google.apps.tiktok.account.api.controller.n r0 = (com.google.apps.tiktok.account.api.controller.C46046n) r0
                r5.f120769n = r0
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.common.util.concurrent.cx r0 = r5.mo50084g()
                r5.f120772q = r0
                goto L_0x010c
            L_0x00ee:
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                android.os.Bundle r0 = r4.f120780d
                com.google.apps.tiktok.account.api.controller.n r1 = com.google.apps.tiktok.account.api.controller.C46046n.f120901j
                com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.f169869a
                java.lang.String r3 = "state_latest_operation"
                com.google.protobuf.MessageLite r0 = com.google.protobuf.contrib.android.ProtoParsers.m95522e(r0, r3, r1, r2)
                com.google.apps.tiktok.account.api.controller.n r0 = (com.google.apps.tiktok.account.api.controller.C46046n) r0
                r5.f120769n = r0
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                android.os.Bundle r0 = r4.f120780d
                java.lang.String r1 = "state_pending_op"
                boolean r0 = r0.getBoolean(r1)
                r5.f120770o = r0
            L_0x010c:
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.concurrent.futuresmixin.e r0 = r5.f120760e
                com.google.apps.tiktok.concurrent.futuresmixin.f r5 = r5.f120767l
                r0.mo50429i(r5)
                com.google.apps.tiktok.account.api.controller.AccountControllerImpl r5 = com.google.apps.tiktok.account.api.controller.AccountControllerImpl.this
                com.google.apps.tiktok.account.api.controller.ad r5 = r5.f120763h
                r5.mo50119c(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.account.api.controller.AccountControllerImpl.AccountControllerLifecycleObserver.mo3520gV(androidx.lifecycle.v):void");
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            AccountControllerImpl.this.f120763h.mo50120d(this);
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            AccountControllerImpl.this.mo50092o();
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            if (this.f120779c) {
                AccountControllerImpl.this.mo50092o();
                return;
            }
            this.f120779c = true;
            if (this.f120778b) {
                C58838bb.m90869d(true ^ AccountControllerImpl.this.f120759d.mo50101h(), "Should not have account before initial start.");
                C58838bb.m90866a(AccountControllerImpl.this.f120772q, "Should have had initial account fetch.");
                AccountControllerImpl accountControllerImpl = AccountControllerImpl.this;
                accountControllerImpl.mo50091n(accountControllerImpl.f120768m.mo50149a(), AccountControllerImpl.this.f120772q, 0);
                AccountControllerImpl.this.f120772q = null;
            } else {
                ActivityAccountState activityAccountState = AccountControllerImpl.this.f120759d;
                C19559g.m37304c();
                AccountId b = AccountId.m82057b(activityAccountState.f120784d);
                ActivityAccountState activityAccountState2 = AccountControllerImpl.this.f120759d;
                C19559g.m37304c();
                C46215j jVar = activityAccountState2.f120785e;
                activityAccountState.mo50100g();
                if (activityAccountState.mo50101h()) {
                    activityAccountState.f120781a.mo50129a(b, jVar);
                }
                AccountControllerImpl.this.f120771p = this.f120780d.getBoolean("state_do_not_revalidate");
                AccountControllerImpl.this.mo50092o();
            }
            Bundle bundle = this.f120780d;
            if (bundle != null && AccountControllerImpl.this.f120764i && !bundle.getBoolean("tiktok_accounts_disabled")) {
                AccountControllerImpl.this.f120759d.mo50103j();
            }
            this.f120780d = null;
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    public AccountControllerImpl(C47215a aVar, C46041i iVar, ActivityAccountState activityAccountState, C46439e eVar, C45990ba baVar, KeepStateCallbacksHandler keepStateCallbacksHandler, C46003bn bnVar, C45966ad adVar, C62921ba baVar2, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        this.f120757b = aVar;
        this.f120758c = iVar;
        this.f120759d = activityAccountState;
        this.f120760e = eVar;
        this.f120773r = baVar;
        this.f120761f = keepStateCallbacksHandler;
        this.f120762g = bnVar;
        this.f120763h = adVar;
        this.f120766k = baVar2;
        boolean z = false;
        this.f120764i = ((Boolean) axVar.mo56109e(false)).booleanValue();
        this.f120765j = ((Boolean) axVar2.mo56109e(false)).booleanValue();
        this.f120774s = ((Boolean) axVar3.mo56109e(false)).booleanValue();
        this.f120775t = ((Boolean) axVar4.mo56109e(false)).booleanValue();
        Object obj = activityAccountState.f120783c;
        C58838bb.m90883r((obj == null || obj == this) ? true : z);
        activityAccountState.f120783c = this;
        aVar.getLifecycle().mo5790b(new TracedDefaultLifecycleObserver(new AccountControllerLifecycleObserver()));
        aVar.getSavedStateRegistry().mo8585b("tiktok_account_controller_saved_instance_state", new C46030d(this, iVar));
    }

    /* renamed from: s */
    public static final void m82071s(C46046n nVar) {
        boolean z = false;
        C58838bb.m90883r((nVar.f120903a & 32) != 0);
        C58838bb.m90883r(nVar.f120909g > 0);
        int a = C46045m.m82275a(nVar.f120906d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1 || i == 2) {
            C58838bb.m90883r(!((nVar.f120903a & 2) != 0));
            C58838bb.m90883r(nVar.f120907e.size() > 0);
            C58838bb.m90883r(!((nVar.f120903a & 8) != 0));
            C58838bb.m90883r(!nVar.f120910h);
            if ((nVar.f120903a & 64) != 0) {
                z = true;
            }
            C58838bb.m90883r(!z);
        } else if (i == 3) {
            C58838bb.m90883r((nVar.f120903a & 2) != 0);
            C58838bb.m90883r(nVar.f120907e.size() == 0);
            C58838bb.m90883r((nVar.f120903a & 8) != 0);
            C58838bb.m90883r(!nVar.f120910h);
            if ((nVar.f120903a & 64) != 0) {
                z = true;
            }
            C58838bb.m90883r(!z);
        } else if (i == 4) {
            C58838bb.m90883r((nVar.f120903a & 2) != 0);
            C58838bb.m90883r(nVar.f120907e.size() == 0);
            C58838bb.m90883r(!((nVar.f120903a & 8) != 0));
            C58838bb.m90883r(!nVar.f120910h);
            if ((nVar.f120903a & 64) != 0) {
                z = true;
            }
            C58838bb.m90883r(!z);
        } else if (i == 5) {
            C58838bb.m90883r(!((nVar.f120903a & 2) != 0));
            C58838bb.m90883r(nVar.f120907e.size() > 0);
            C58838bb.m90883r(!((nVar.f120903a & 8) != 0));
            C58838bb.m90883r(nVar.f120910h);
            if ((nVar.f120903a & 64) != 0) {
                z = true;
            }
            C58838bb.m90883r(z);
        } else {
            throw new IllegalArgumentException("AccountControllerOperation.type is of value UNKNOWN - the proto might be skewed during the parcel/unparcel process.");
        }
    }

    /* renamed from: a */
    public final void mo50078a(Intent intent, C58817ah ahVar) {
        int i;
        mo50088k();
        mo50087j();
        this.f120758c.mo50171e(intent);
        AccountId b = C45963aa.m82132b(intent);
        ActivityAccountState activityAccountState = this.f120759d;
        C19559g.m37304c();
        if (!(activityAccountState.f120784d == -1 || b == null || (i = ((AutoValue_AccountId) b).f120739a) == -1)) {
            ActivityAccountState activityAccountState2 = this.f120759d;
            C19559g.m37304c();
            if (i == activityAccountState2.f120784d && ((Boolean) ahVar.apply(b)).booleanValue()) {
                return;
            }
        }
        mo50079b();
    }

    /* renamed from: b */
    public final void mo50079b() {
        mo50088k();
        mo50087j();
        mo50091n(this.f120768m.mo50149a(), mo50084g(), 0);
    }

    /* renamed from: c */
    public final void mo50080c() {
        Class cls;
        mo50088k();
        mo50087j();
        C47558bi a = C47831fm.m85006a("Switch Account Interactive");
        try {
            C58485gu a2 = this.f120768m.mo50149a();
            int size = a2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (C45980ar.class.isAssignableFrom((Class) a2.get(size))) {
                        cls = (Class) a2.get(size);
                        break;
                    }
                } else {
                    cls = null;
                    break;
                }
            }
            C58838bb.m90884s(cls != null, "No interactive selector found.");
            mo50093p(C58485gu.m89846n(cls), 0);
            a.close();
            return;
        } catch (Throwable th) {
            C46016c.m82209a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo50081d(C58485gu guVar) {
        mo50095r(guVar, 0);
    }

    /* renamed from: e */
    public final void mo50082e(C45987ay ayVar) {
        mo50088k();
        C45990ba baVar = this.f120773r;
        baVar.f120819b.add(ayVar);
        Collections.shuffle(baVar.f120819b, baVar.f120820c);
    }

    /* renamed from: f */
    public final void mo50083f(C46013bx bxVar) {
        mo50088k();
        C58838bb.m90884s(this.f120768m == null, "Config can be set once, in the constructor only.");
        this.f120768m = bxVar;
    }

    /* renamed from: g */
    public final C60870cx mo50084g() {
        return mo50085h(this.f120768m.mo50149a());
    }

    /* renamed from: h */
    public final C60870cx mo50085h(C58485gu guVar) {
        C46009bt btVar = new C46009bt(this.f120758c.mo50167a());
        this.f120771p = false;
        C46003bn bnVar = this.f120762g;
        C60870cx b = bnVar.mo50137b(btVar, guVar);
        return C60922j.m93045h(b, C47810es.m84966f(new C45994be(bnVar, this.f120768m.mo50150b(), this.f120758c.mo50167a(), b)), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo50086i(int i) {
        if (!this.f120771p) {
            return C60866ct.f164955a;
        }
        this.f120771p = false;
        C47558bi a = C47831fm.m85006a("Revalidate Account");
        try {
            ActivityAccountState activityAccountState = this.f120759d;
            C19559g.m37304c();
            int i2 = activityAccountState.f120784d;
            if (i2 == -1) {
                C60870cx cxVar = C60866ct.f164955a;
                a.close();
                return cxVar;
            }
            AccountId b = AccountId.m82057b(i2);
            C60870cx c = this.f120762g.mo50138c(b, this.f120768m.mo50150b(), this.f120758c.mo50167a());
            C58836b bVar = C58836b.f156633a;
            a.mo51417a(c);
            mo50097u(5, b, bVar, bVar, false, bVar, c, i);
            a.close();
            return c;
        } catch (Throwable th) {
            C46016c.m82209a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final void mo50087j() {
        C58838bb.m90884s(this.f120768m.mo50151c(), "Activity not configured for account selection.");
    }

    /* renamed from: k */
    public final void mo50088k() {
        C58838bb.m90884s(!this.f120764i, "Attempted to use the account controller when accounts are disabled");
    }

    /* renamed from: l */
    public final void mo50089l() {
        boolean z;
        if (this.f120775t) {
            C19559g.m37305d(Thread.currentThread());
            if (!C19559g.m37305d(Thread.currentThread())) {
                z = false;
            } else {
                z = C46766cj.f122117a;
            }
            C58838bb.m90884s(!z, "AccountController methods cannot be invoked from the SubscriptionCallbacks or LocalSubscriptionCallbacks, see b/216297191 for more details");
        }
    }

    /* renamed from: m */
    public final void mo50090m() {
        this.f120770o = false;
        if (!this.f120759d.mo50101h()) {
            this.f120771p = false;
        }
    }

    /* renamed from: n */
    public final void mo50091n(C58485gu guVar, C60870cx cxVar, int i) {
        mo50089l();
        if (!cxVar.isDone()) {
            this.f120759d.mo50105l();
            C58833ax k = C58833ax.m90834k(guVar);
            C58836b bVar = C58836b.f156633a;
            mo50097u(2, (AccountId) null, k, bVar, false, bVar, cxVar, i);
            return;
        }
        this.f120759d.mo50103j();
        C58833ax k2 = C58833ax.m90834k(guVar);
        C58836b bVar2 = C58836b.f156633a;
        C46046n t = mo50096t(2, (AccountId) null, k2, bVar2, false, bVar2, i);
        try {
            this.f120767l.mo18067c(new ProtoParsers.InternalDontUse((byte[]) null, t), (AccountActionResult) C60856cj.m92909r(cxVar));
        } catch (ExecutionException e) {
            ((C459601) this.f120767l).mo18066a(new ProtoParsers.InternalDontUse((byte[]) null, t), e.getCause());
        }
    }

    /* renamed from: o */
    public final void mo50092o() {
        if (!this.f120770o) {
            this.f120761f.mo50112g();
            mo50086i(0);
        }
    }

    /* renamed from: q */
    public final void mo50094q(AccountId accountId, boolean z, int i) {
        C60870cx cxVar;
        mo50089l();
        C47558bi a = C47831fm.m85006a("Switch Account");
        try {
            this.f120771p = false;
            if (z) {
                C46003bn bnVar = this.f120762g;
                cxVar = C60922j.m93045h(bnVar.f120842a.mo50282b(accountId), C47810es.m84966f(new C45993bd(bnVar, accountId, this.f120768m.mo50150b(), this.f120758c.mo50167a())), C60826bg.f164896a);
            } else {
                cxVar = this.f120762g.mo50138c(accountId, this.f120768m.mo50150b(), this.f120758c.mo50167a());
            }
            C60870cx cxVar2 = cxVar;
            if (!cxVar2.isDone()) {
                int i2 = ((AutoValue_AccountId) accountId).f120739a;
                ActivityAccountState activityAccountState = this.f120759d;
                C19559g.m37304c();
                if (i2 != activityAccountState.f120784d) {
                    this.f120759d.mo50105l();
                }
            }
            C58836b bVar = C58836b.f156633a;
            C58833ax k = C58833ax.m90834k(Boolean.valueOf(z));
            C58836b bVar2 = C58836b.f156633a;
            a.mo51417a(cxVar2);
            mo50097u(4, accountId, bVar, k, false, bVar2, cxVar2, i);
            a.close();
            return;
        } catch (Throwable th) {
            C46016c.m82209a(th, th);
        }
        throw th;
    }

    /* renamed from: t */
    public final C46046n mo50096t(int i, AccountId accountId, C58833ax axVar, C58833ax axVar2, boolean z, C58833ax axVar3, int i2) {
        if (this.f120774s) {
            C19559g.m37304c();
        }
        int i3 = this.f120769n.f120904b;
        int i4 = i3 == Integer.MAX_VALUE ? 0 : i3 + 1;
        C46043k kVar = (C46043k) C46046n.f120901j.createBuilder();
        kVar.copyOnWrite();
        C46046n nVar = (C46046n) kVar.instance;
        nVar.f120903a |= 1;
        nVar.f120904b = i4;
        if (accountId != null) {
            int i5 = ((AutoValue_AccountId) accountId).f120739a;
            kVar.copyOnWrite();
            C46046n nVar2 = (C46046n) kVar.instance;
            nVar2.f120903a |= 2;
            nVar2.f120905c = i5;
        }
        kVar.copyOnWrite();
        C46046n nVar3 = (C46046n) kVar.instance;
        nVar3.f120906d = i - 1;
        nVar3.f120903a |= 4;
        if (axVar.mo56113h()) {
            C58485gu guVar = (C58485gu) axVar.mo56107c();
            C58838bb.m90883r(!guVar.isEmpty());
            ArrayList arrayList = new ArrayList(guVar.size());
            int size = guVar.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(((Class) guVar.get(i6)).getName());
            }
            kVar.copyOnWrite();
            C46046n nVar4 = (C46046n) kVar.instance;
            C62971cq cqVar = nVar4.f120907e;
            if (!cqVar.mo58948c()) {
                nVar4.f120907e = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) nVar4.f120907e);
        }
        if (axVar2.mo56113h()) {
            boolean booleanValue = ((Boolean) axVar2.mo56107c()).booleanValue();
            kVar.copyOnWrite();
            C46046n nVar5 = (C46046n) kVar.instance;
            nVar5.f120903a |= 8;
            nVar5.f120908f = booleanValue;
        }
        kVar.copyOnWrite();
        C46046n nVar6 = (C46046n) kVar.instance;
        nVar6.f120903a |= 32;
        nVar6.f120910h = z;
        if (axVar3.mo56113h()) {
            KeepStateCallbacksHandler keepStateCallbacksHandler = this.f120761f;
            C46022cf cfVar = (C46022cf) axVar3.mo56107c();
            C69664n.m101061g(cfVar, "callbacks");
            int a = keepStateCallbacksHandler.f120795a.mo50438a(cfVar);
            kVar.copyOnWrite();
            C46046n nVar7 = (C46046n) kVar.instance;
            nVar7.f120903a |= 64;
            nVar7.f120911i = a;
        }
        kVar.copyOnWrite();
        C46046n nVar8 = (C46046n) kVar.instance;
        nVar8.f120903a |= 16;
        nVar8.f120909g = i2 + 1;
        C46046n nVar9 = (C46046n) kVar.build();
        this.f120769n = nVar9;
        m82071s(nVar9);
        return this.f120769n;
    }

    /* renamed from: u */
    public final void mo50097u(int i, AccountId accountId, C58833ax axVar, C58833ax axVar2, boolean z, C58833ax axVar3, C60870cx cxVar, int i2) {
        C46046n t = mo50096t(i, accountId, axVar, axVar2, z, axVar3, i2);
        this.f120770o = true;
        try {
            this.f120760e.mo50430j(new C46438d(cxVar), C46436b.m82808a(t), this.f120767l);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    /* renamed from: r */
    public final void mo50095r(C58485gu guVar, int i) {
        guVar.getClass();
        C58838bb.m90883r(!guVar.isEmpty());
        C47558bi a = C47831fm.m85006a("Switch Account With Custom Selectors");
        try {
            mo50091n(guVar, mo50085h(guVar), i);
            a.close();
            return;
        } catch (Throwable th) {
            C46016c.m82209a(th, th);
        }
        throw th;
    }

    /* renamed from: p */
    public final void mo50093p(C58485gu guVar, int i) {
        guVar.getClass();
        C58838bb.m90883r(!guVar.isEmpty());
        int i2 = ((C58724pq) guVar).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            Class cls = (Class) guVar.get(i3);
            C58838bb.m90873h(C45980ar.class.isAssignableFrom(cls), "selector %s is not an interactive selector", cls);
        }
        C60870cx b = this.f120762g.mo50137b(new C46009bt(this.f120758c.mo50167a()), guVar);
        C58833ax k = C58833ax.m90834k(guVar);
        C58836b bVar = C58836b.f156633a;
        mo50097u(3, (AccountId) null, k, bVar, false, bVar, b, i);
    }
}
