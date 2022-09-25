package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.appdatasearch.C142787ac;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36904c;
import com.google.android.libraries.search.assistant.p2828y.p2836f.C36906e;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2847b.C36972g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.C50864a;
import com.google.assistant.p3897e.C50871b;
import com.google.assistant.p3897e.p3917i.p3918a.C51500k;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3917i.p3918a.C51565mk;
import com.google.assistant.p3897e.p3917i.p3918a.C51566ml;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61818k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.w */
/* compiled from: PG */
public final class C36899w implements C36904c {

    /* renamed from: a */
    public static final C59071e f96076a = C59071e.m91332i("com.google.android.libraries.search.assistant.y.f.a.w");

    /* renamed from: b */
    static final String[] f96077b = {"internal.3p:Alarm_cross_device", "internal.3p:Timer_cross_device", "internal.3p:Stopwatch_cross_device"};

    /* renamed from: g */
    private static final Duration f96078g = Duration.ofSeconds(1);

    /* renamed from: c */
    public final ScheduledExecutorService f96079c;

    /* renamed from: d */
    public final C37215b f96080d;

    /* renamed from: e */
    public final Optional f96081e;

    /* renamed from: f */
    public final C36972g f96082f;

    /* renamed from: h */
    private final C145948p f96083h;

    /* renamed from: i */
    private final Context f96084i;

    /* renamed from: j */
    private final C21370a f96085j;

    /* renamed from: k */
    private Optional f96086k = Optional.empty();

    /* renamed from: l */
    private Optional f96087l = Optional.empty();

    /* renamed from: m */
    private Instant f96088m;

    public C36899w(ScheduledExecutorService scheduledExecutorService, Context context, C21370a aVar, C11059d dVar, C36972g gVar, C145948p pVar, C37215b bVar) {
        this.f96079c = scheduledExecutorService;
        this.f96084i = context;
        this.f96081e = Optional.m71637of(dVar);
        this.f96082f = gVar;
        this.f96083h = pVar;
        this.f96080d = bVar;
        this.f96085j = aVar;
        this.f96088m = Instant.ofEpochMilli(aVar.mo26870b());
    }

    /* renamed from: h */
    private final C50871b m65580h(Intent intent) {
        C50864a aVar = (C50864a) C50871b.f132454d.createBuilder();
        String action = intent.getAction();
        if (action != null) {
            aVar.copyOnWrite();
            C50871b bVar = (C50871b) aVar.instance;
            bVar.f132456a |= 1;
            bVar.f132457b = action;
            List<ResolveInfo> queryIntentActivities = this.f96084i.getPackageManager().queryIntentActivities(intent, 0);
            ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52398)).mo56387q("[getClockAndroidIntentCapabilities] resolveInfos size: %d", queryIntentActivities.size());
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.applicationInfo.packageName;
                ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52399)).mo56354G("[getClockAndroidIntentCapabilities] intent action: %s, packageName: %s", intent.getAction(), str);
                aVar.mo53486a(str);
            }
        }
        return (C50871b) aVar.build();
    }

    /* renamed from: i */
    private final C60870cx m65581i(C36906e eVar) {
        if (!this.f96086k.isPresent() || Duration.between(this.f96088m, Instant.ofEpochMilli(this.f96085j.mo26870b())).compareTo(f96078g) > 0 || !this.f96087l.isPresent() || !((C36906e) this.f96087l.get()).mo40454c().equals(eVar.mo40454c())) {
            this.f96086k = Optional.m71637of(m65582j(eVar));
            this.f96088m = Instant.ofEpochMilli(this.f96085j.mo26870b());
            this.f96087l = Optional.m71637of(eVar);
        }
        return C60856cj.m92901j((C60870cx) this.f96086k.get());
    }

    /* renamed from: j */
    private final C60870cx m65582j(C36906e eVar) {
        String instant = this.f96088m.toString();
        this.f96080d.mo19974a(C37176a.f96896bN.mo40816j("ContextRequestTag", instant));
        C51500k kVar = (C51500k) C51527l.f134273f.createBuilder();
        C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
        C51565mk mkVar = (C51565mk) C51566ml.f134401b.createBuilder();
        C58528ij c = eVar.mo40454c();
        C58526ih ihVar = new C58526ih();
        c.size();
        C58800sl lA = c.iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            String[] split = str.split("/", 0);
            if (split.length != 3) {
                ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52409)).mo56389s("Bad clockapp spec: %s", str);
            } else {
                try {
                    try {
                        ihVar.mo55373c(new C36898v(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2])));
                    } catch (NumberFormatException unused) {
                        ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52407)).mo56389s("Bad clockapp max version code: %s", str);
                    }
                } catch (NumberFormatException unused2) {
                    ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52408)).mo56389s("Bad clockapp min version code: %s", str);
                }
            }
        }
        C58528ij f = ihVar.mo55486f();
        ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52406)).mo56387q("Config contains %d correctly-specified clock apps.", f.size());
        PackageManager packageManager = this.f96084i.getPackageManager();
        C58526ih ihVar2 = new C58526ih();
        C58800sl lA2 = f.iterator();
        while (lA2.hasNext()) {
            C36898v vVar = (C36898v) lA2.next();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(vVar.f96073a, 0);
                if (packageInfo == null) {
                    ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52403)).mo56389s("Packageinfo is null. Ignoring: %s", vVar);
                } else {
                    int i = packageInfo.versionCode;
                    int i2 = vVar.f96074b;
                    int i3 = vVar.f96075c;
                    boolean z = i3 == -1 || i <= i3;
                    if (i < i2 || !z) {
                        ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52401)).mo56395y("Installed version is is not in range. Installed: %d, Spec: %s", i, vVar);
                    } else {
                        ihVar2.mo55373c(vVar.f96073a);
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
            }
        }
        C58528ij f2 = ihVar2.mo55486f();
        ((C59052c) ((C59052c) f96076a.mo56224b()).mo56372aa(52400)).mo56387q("%d clock apps match version requirements.", f2.size());
        f2.size();
        ArrayList arrayList = new ArrayList();
        C58800sl lA3 = f2.iterator();
        while (lA3.hasNext()) {
            C145948p pVar = this.f96083h;
            String[] strArr = f96077b;
            C142787ac acVar = new C142787ac();
            acVar.f387581e = 1;
            acVar.mo117690b(new Section("thing_proto", false, 0));
            acVar.f387580d = 5;
            acVar.f387582f = new STSortSpec("(GET_NUM _LAST_USED_TIMESTAMP)");
            arrayList.add(C60856cj.m92908q(C43205e.m76192b(pVar.mo122337a("type:Timer OR type:Alarm OR type:Stopwatch", (String) lA3.next(), strArr, 0, 100, acVar.mo117689a())), 5, TimeUnit.SECONDS, this.f96079c));
        }
        return C60846c.m92878g(C47638k.m84750a(arrayList).mo51520a(new C36890n(this, arrayList, kVar, nlVar, mkVar, instant), this.f96079c), Exception.class, C47810es.m84963c(C36891o.f96059a), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final synchronized C60870cx mo40444a(C36906e eVar) {
        return C47633f.m84733g(m65581i(eVar)).mo51516i(new C36894r(this, eVar), this.f96079c);
    }

    /* renamed from: b */
    public final C60870cx mo40445b(C36906e eVar) {
        if (this.f96084i.getPackageManager() == null) {
            return C60856cj.m92900i(C61818k.f166999r);
        }
        return C47633f.m84733g(m65582j(eVar)).mo51516i(new C36895s(this, eVar), this.f96079c);
    }

    /* renamed from: c */
    public final synchronized C60870cx mo40446c(C36906e eVar) {
        return C47633f.m84733g(m65581i(eVar)).mo51515h(C36893q.f96065a, this.f96079c);
    }

    /* renamed from: d */
    public final synchronized C60870cx mo40447d(C36906e eVar) {
        return C47633f.m84733g(m65581i(eVar)).mo51516i(new C36896t(this, eVar), this.f96079c);
    }

    /* renamed from: e */
    public final C60870cx mo40448e(C60870cx cxVar) {
        return C47633f.m84733g(cxVar).mo51515h(C36897u.f96072a, this.f96079c).mo51517j(50, TimeUnit.MILLISECONDS, this.f96079c).mo51513e(Exception.class, C36888l.f96049a, this.f96079c);
    }

    /* renamed from: f */
    public final void mo40449f(C51500k kVar, C36906e eVar) {
        ArrayList arrayList = new ArrayList();
        C58800sl lA = eVar.mo40452a().iterator();
        while (lA.hasNext()) {
            arrayList.add(m65580h(new Intent((String) lA.next())));
        }
        kVar.mo53631c(arrayList);
    }

    /* renamed from: g */
    public final void mo40450g(C51593nl nlVar, C36906e eVar) {
        ArrayList arrayList = new ArrayList();
        C58800sl lA = eVar.mo40453b().iterator();
        while (lA.hasNext()) {
            arrayList.add(m65580h(new Intent((String) lA.next())));
        }
        nlVar.mo53647a(arrayList);
    }

    public C36899w(ScheduledExecutorService scheduledExecutorService, Context context, C21370a aVar, C36972g gVar, C145948p pVar, C37215b bVar) {
        this.f96079c = scheduledExecutorService;
        this.f96084i = context;
        this.f96082f = gVar;
        this.f96083h = pVar;
        this.f96081e = Optional.empty();
        this.f96080d = bVar;
        this.f96085j = aVar;
        this.f96088m = Instant.ofEpochMilli(aVar.mo26870b());
    }
}
