package com.google.apps.tiktok.p3643g;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p11029ao.p11032c.C147807h;
import com.google.android.libraries.p11029ao.p11032c.C147808i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47561bl;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47563bn;
import com.google.apps.tiktok.tracing.C47569bt;
import com.google.apps.tiktok.tracing.C47775dm;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;

/* renamed from: com.google.apps.tiktok.g.n */
/* compiled from: PG */
abstract class C47098n extends BroadcastReceiver {

    /* renamed from: a */
    public static final C59071e f122698a = C59071e.m91332i("com.google.apps.tiktok.g.n");

    /* renamed from: b */
    private final Class f122699b;

    /* renamed from: c */
    private final boolean f122700c;

    protected C47098n(Class cls, boolean z) {
        this.f122699b = cls;
        this.f122700c = z;
    }

    /* renamed from: e */
    public static final void m83760e(C60870cx cxVar) {
        if (!cxVar.isCancelled()) {
            C19559g.m37302a().post(C47810es.m84977q(new C47092h(cxVar)));
        }
    }

    /* renamed from: f */
    private final C60870cx m83761f(Context context, Intent intent) {
        C47558bi a = C47831fm.m85006a("getEntryPoint");
        try {
            C60870cx d = mo51007d(context, intent, this.f122699b);
            a.mo51417a(d);
            a.close();
            C47088d dVar = new C47088d(getResultCode(), getResultData(), getResultExtras(false));
            C47558bi a2 = C47831fm.m85006a("handleBroadcast");
            try {
                C60870cx h = C60922j.m93045h(d, C47810es.m84966f(new C47093i(this, intent, dVar)), C60826bg.f164896a);
                a2.mo51417a(h);
                a2.close();
                if (h.isDone()) {
                    try {
                        C47100p pVar = (C47100p) C60917ed.m93034a(h);
                        setResult(pVar.mo51010a(), pVar.mo51012c(), pVar.mo51011b());
                        if (pVar.mo51013d()) {
                            abortBroadcast();
                        }
                    } catch (ExecutionException e) {
                        return C60856cj.m92899h(e);
                    }
                } else {
                    C60856cj.m92911t(h, C47810es.m84974n(new C47096l(goAsync())), C60826bg.f164896a);
                }
                return h;
            } catch (Throwable th) {
                C47089e.m83756a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C47089e.m83756a(th, th2);
        }
    }

    /* renamed from: g */
    private final C60870cx m83762g(Context context, Intent intent) {
        C47558bi a = C47831fm.m85006a("getEntryPoint");
        try {
            C60870cx d = mo51007d(context, intent, this.f122699b);
            a.mo51417a(d);
            a.close();
            int resultCode = getResultCode();
            C47558bi a2 = C47831fm.m85006a("handleBroadcast");
            try {
                C60870cx h = C60922j.m93045h(d, C47810es.m84966f(new C47090f(this, intent, resultCode)), C60826bg.f164896a);
                a2.mo51417a(h);
                a2.close();
                if (!h.isDone()) {
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    Objects.requireNonNull(goAsync);
                    h.mo4106b(C47810es.m84977q(new C47091g(goAsync)), C60826bg.f164896a);
                }
                return h;
            } catch (Throwable th) {
                C47089e.m83756a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C47089e.m83756a(th, th2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C47101q mo50159a(Object obj) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo50160b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C47102r mo20091c(Object obj) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C60870cx mo51007d(Context context, Intent intent, Class cls);

    public final void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        C47538ax e;
        C60870cx cxVar;
        C47558bi t;
        C60870cx cxVar2;
        List<ResolveInfo> list;
        try {
            intent.hasExtra("foo");
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent(context, getClass()), C89885b.SOUND_SEARCH_VALUE);
            C47572bw bwVar = null;
            ResolveInfo resolveInfo = queryBroadcastReceivers.isEmpty() ? null : queryBroadcastReceivers.get(0);
            if (!this.f122700c || resolveInfo == null || !resolveInfo.activityInfo.exported) {
                try {
                    String name = getClass().getName();
                    if (resolveInfo != null) {
                        if (!name.equals(resolveInfo.activityInfo.name)) {
                            throw new IllegalArgumentException("ResolveInfo did not match receiver name: " + String.valueOf(getClass()) + " != " + resolveInfo.activityInfo.name);
                        }
                    }
                    if (resolveInfo != null) {
                        if (resolveInfo.activityInfo.exported) {
                            PackageManager packageManager = context.getPackageManager();
                            Intent cloneFilter = intent.setComponent((ComponentName) null).cloneFilter();
                            cloneFilter.setSelector((Intent) null);
                            cloneFilter.setPackage(context.getPackageName());
                            for (ResolveInfo next : packageManager.queryBroadcastReceivers(cloneFilter, 269221952)) {
                                if (name.equals(next.activityInfo.name)) {
                                    IntentFilter intentFilter = next.filter;
                                    intentFilter.getClass();
                                    if (!intentFilter.matchAction(intent.getAction())) {
                                        throw new C147807h(intent);
                                    } else if (intentFilter.matchCategories(intent.getCategories()) == null) {
                                        int matchData = intentFilter.matchData(intent.getType(), intent.getScheme(), intent.getData());
                                        if (matchData == -1 || matchData == -2) {
                                            throw new C147807h(intent);
                                        }
                                    } else {
                                        throw new C147807h(intent);
                                    }
                                }
                            }
                            PackageManager packageManager2 = context.getPackageManager();
                            synchronized (C147808i.f398787a) {
                                if (C147808i.f398788b == null) {
                                    Intent intent2 = new Intent();
                                    intent2.setPackage(context.getPackageName());
                                    C147808i.f398788b = packageManager2.queryBroadcastReceivers(intent2, 0);
                                }
                                list = C147808i.f398788b;
                            }
                            for (ResolveInfo resolveInfo2 : list) {
                                if (name.equals(resolveInfo2.activityInfo.name)) {
                                    throw new C147807h(intent);
                                }
                            }
                        }
                    }
                    String action = intent.getAction();
                    if (resolveInfo == null) {
                        str = "anonymous";
                    } else {
                        str = getClass().getName();
                    }
                    if (action != null) {
                        str2 = "Broadcast to " + str + " " + action;
                    } else {
                        str2 = "Broadcast to ".concat(String.valueOf(str));
                    }
                    if (C19559g.m37305d(Thread.currentThread()) && !C47831fm.m85027v()) {
                        bwVar = C47831fm.m85012g();
                    }
                    if (bwVar != null) {
                        try {
                            C47831fm.m85030y(bwVar);
                            C47097m mVar = new C47097m();
                            C47561bl b = C47562bm.f123426a.mo51423b();
                            b.mo51422a(C47569bt.f123458c, mVar);
                            t = C47831fm.m85025t(str2, ((C47563bn) b).mo51424e(), true);
                            if (!isOrderedBroadcast() || !mo50160b()) {
                                cxVar2 = m83762g(context, intent);
                            } else {
                                cxVar2 = m83761f(context, intent);
                            }
                            cxVar2.mo4106b(C47810es.m84977q(new C47094j(cxVar2)), C60826bg.f164896a);
                            t.close();
                            bwVar.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                C58887cx.m90980g(th);
                                throw new RuntimeException(th);
                            } catch (Throwable th2) {
                                bwVar.close();
                                throw th2;
                            }
                        }
                    } else {
                        try {
                            e = C47775dm.m84931b(context).mo51615e(str2, C47562bm.f123426a);
                            if (!isOrderedBroadcast() || !mo50160b()) {
                                cxVar = m83762g(context, intent);
                            } else {
                                cxVar = m83761f(context, intent);
                            }
                            cxVar.mo4106b(C47810es.m84977q(new C47095k(cxVar)), C60826bg.f164896a);
                            if (e != null) {
                                e.close();
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            C58887cx.m90980g(th3);
                            throw new RuntimeException(th3);
                        }
                    }
                } catch (C147807h e2) {
                    ((C59052c) ((C59052c) ((C59052c) f122698a.mo56225c()).mo56382g(e2)).mo56372aa(54757)).mo56389s("Got unexpected intent: %s", intent);
                    return;
                }
            } else {
                ((C59052c) ((C59052c) f122698a.mo56225c()).mo56372aa(54758)).mo56389s("Account receivers should not handle events from external broadcasts. %s", getClass());
                return;
            }
            throw th;
            throw th;
        } catch (Throwable th4) {
            ((C59052c) ((C59052c) ((C59052c) f122698a.mo56225c()).mo56382g(th4)).mo56372aa(54759)).mo56386p("Got invalid intent");
        }
    }
}
