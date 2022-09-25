package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10011e;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131713d;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131691a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.p10007b.C131692b;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.e.h */
/* compiled from: PG */
public final class C131728h implements C131692b {

    /* renamed from: a */
    public final ActivityManager f359858a;

    /* renamed from: b */
    public final C47770dh f359859b;

    /* renamed from: c */
    public final PackageManager f359860c;

    /* renamed from: d */
    public String f359861d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public Optional f359862e = Optional.empty();

    /* renamed from: f */
    private final C58974d f359863f;

    /* renamed from: g */
    private final Context f359864g;

    /* renamed from: h */
    private final C131722b f359865h;

    /* renamed from: i */
    private final AppOpsManager f359866i;

    /* renamed from: j */
    private final C131727g f359867j;

    public C131728h(C130603a aVar, Context context, PackageManager packageManager, ActivityManager activityManager, C131722b bVar, C47770dh dhVar) {
        this.f359863f = aVar.mo109740b(this);
        this.f359864g = context;
        this.f359858a = activityManager;
        this.f359865h = bVar;
        this.f359859b = dhVar;
        this.f359866i = (AppOpsManager) Objects.requireNonNull(context.getSystemService("appops"));
        this.f359860c = packageManager;
        this.f359867j = new C131727g(this);
    }

    /* renamed from: e */
    private final void m214183e() {
        Class cls;
        ((C58970a) ((C58970a) this.f359863f.mo56224b()).mo56372aa(39346)).mo56386p("Stop app foreground monitoring");
        C131722b bVar = this.f359865h;
        ((C58970a) ((C58970a) bVar.f359850a.mo56224b()).mo56372aa(39337)).mo56386p("removeOnUidImportanceListener()");
        if (bVar.f359854e && (cls = bVar.f359852c) != null && bVar.f359853d != null) {
            try {
                bVar.f359851b.getClass().getMethod("removeOnUidImportanceListener", new Class[]{cls}).invoke(bVar.f359851b, new Object[]{bVar.f359853d});
                ((C58970a) ((C58970a) bVar.f359850a.mo56224b()).mo56372aa(39338)).mo56386p("listener removed");
                bVar.f359854e = false;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                ((C58970a) ((C58970a) ((C58970a) bVar.f359850a.mo56225c()).mo56382g(e)).mo56372aa(39339)).mo56386p("Error at reflection.");
            }
        }
    }

    /* renamed from: a */
    public final void mo110284a() {
        int checkOpNoThrow = this.f359866i.checkOpNoThrow("android:get_usage_stats", Process.myUid(), this.f359864g.getPackageName());
        if (checkOpNoThrow != 3 ? checkOpNoThrow != 0 : this.f359864g.checkSelfPermission("android.permission.PACKAGE_USAGE_STATS") != 0) {
            ((C58970a) ((C58970a) this.f359863f.mo56224b()).mo56372aa(39342)).mo56386p("Missing permissions to monitor usage stats");
            m214183e();
            return;
        }
        ((C58970a) ((C58970a) this.f359863f.mo56224b()).mo56372aa(39343)).mo56386p("Has permissions to monitor usage stats");
        ((C58970a) ((C58970a) this.f359863f.mo56224b()).mo56372aa(39344)).mo56386p("Start app foreground monitoring");
        C131722b bVar = this.f359865h;
        C131725e eVar = new C131725e(this);
        ((C58970a) ((C58970a) bVar.f359850a.mo56224b()).mo56372aa(39332)).mo56386p("addOnUidImportanceListener()");
        try {
            bVar.f359852c = Class.forName(String.valueOf(bVar.f359851b.getClass().getCanonicalName()).concat("$OnUidImportanceListener"));
            if (bVar.f359852c != null) {
                C131721a aVar = new C131721a(eVar);
                Class cls = bVar.f359852c;
                cls.getClass();
                ClassLoader classLoader = cls.getClassLoader();
                Class cls2 = bVar.f359852c;
                cls2.getClass();
                bVar.f359853d = Proxy.newProxyInstance(classLoader, new Class[]{cls2}, aVar);
                Class cls3 = bVar.f359852c;
                cls3.getClass();
                ((C58970a) ((C58970a) bVar.f359850a.mo56224b()).mo56372aa(39333)).mo56389s("Found listener class(%s) and instance", cls3);
                try {
                    Class<?> cls4 = bVar.f359851b.getClass();
                    Class[] clsArr = new Class[2];
                    Class cls5 = bVar.f359852c;
                    cls5.getClass();
                    clsArr[0] = cls5;
                    clsArr[1] = Integer.TYPE;
                    Method method = cls4.getMethod("addOnUidImportanceListener", clsArr);
                    ActivityManager activityManager = bVar.f359851b;
                    Object[] objArr = new Object[2];
                    Object obj = bVar.f359853d;
                    obj.getClass();
                    objArr[0] = obj;
                    objArr[1] = 100;
                    method.invoke(activityManager, objArr);
                    ((C58970a) ((C58970a) bVar.f359850a.mo56224b()).mo56372aa(39334)).mo56386p("listener added");
                    bVar.f359854e = true;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    ((C58970a) ((C58970a) ((C58970a) bVar.f359850a.mo56225c()).mo56382g(e)).mo56372aa(39335)).mo56386p("Error at reflection.");
                }
            }
        } catch (ClassNotFoundException e2) {
            ((C58970a) ((C58970a) ((C58970a) bVar.f359850a.mo56225c()).mo56382g(e2)).mo56372aa(39336)).mo56386p("Cannot find listener class.");
        }
    }

    /* renamed from: b */
    public final C60870cx mo110268b(C131713d dVar) {
        ((C58970a) ((C58970a) this.f359863f.mo56224b()).mo56372aa(39340)).mo56386p("Start monitoring");
        this.f359862e = Optional.m71637of(dVar);
        mo110284a();
        ((C58970a) ((C58970a) this.f359863f.mo56224b()).mo56372aa(39345)).mo56386p("Start usage stats permission monitoring");
        this.f359866i.startWatchingMode("android:get_usage_stats", this.f359864g.getPackageName(), this.f359867j);
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo110269c() {
        ((C58970a) ((C58970a) this.f359863f.mo56224b()).mo56372aa(39341)).mo56386p("Stop monitoring");
        this.f359862e = Optional.empty();
        m214183e();
        ((C58970a) ((C58970a) this.f359863f.mo56224b()).mo56372aa(39347)).mo56386p("Stop usage stats permission monitoring");
        this.f359866i.stopWatchingMode(this.f359867j);
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final /* synthetic */ C60870cx mo110270d(C53715bm bmVar, long j) {
        return C131691a.m214140a();
    }
}
