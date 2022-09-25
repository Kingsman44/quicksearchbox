package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2714o.C34899a;
import com.google.android.libraries.search.assistant.p2714o.C34917c;
import com.google.android.libraries.search.assistant.p2714o.C34918d;
import com.google.android.libraries.search.assistant.p2714o.C34919e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.o.a.n */
/* compiled from: PG */
public final class C34913n implements C34919e {

    /* renamed from: a */
    public static final C58974d f92566a = C58974d.m91136j();

    /* renamed from: b */
    public static final Duration f92567b = Duration.ofHours(1);

    /* renamed from: c */
    public final UsageStatsManager f92568c;

    /* renamed from: d */
    public final PackageManager f92569d;

    /* renamed from: e */
    public final C21370a f92570e;

    /* renamed from: f */
    public final C60887da f92571f;

    /* renamed from: g */
    private final ActivityManager f92572g;

    public C34913n(Context context, C21370a aVar, C60887da daVar) {
        this.f92569d = context.getPackageManager();
        this.f92572g = (ActivityManager) context.getSystemService(ActivityManager.class);
        this.f92568c = (UsageStatsManager) context.getSystemService(UsageStatsManager.class);
        this.f92570e = aVar;
        this.f92571f = daVar;
    }

    /* renamed from: e */
    static /* synthetic */ C34917c m63765e(C58485gu guVar, int i) {
        try {
            return new C34899a(Optional.empty(), guVar, Optional.m71637of(C34915p.m63772a(guVar)), i);
        } catch (C34918d e) {
            return new C34899a(Optional.m71637of(e), C58485gu.m89845m(), Optional.empty(), i);
        }
    }

    /* renamed from: b */
    public final C60870cx mo39624b() {
        C34906g gVar = new C34906g(this);
        return C60856cj.m92904m(C47810es.m84978r(gVar), this.f92571f);
    }

    /* renamed from: c */
    public final C58485gu mo39625c() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f92572g.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return C58485gu.m89845m();
        }
        return (C58485gu) Collection.EL.stream(runningAppProcesses).filter(C34902c.f92555a).map(C34903d.f92556a).filter(C34904e.f92557a).collect(C58370cn.f155946a);
    }

    @Deprecated
    /* renamed from: d */
    public final C58485gu mo39626d() {
        return (C58485gu) Collection.EL.stream(this.f92572g.getRunningTasks(2)).filter(C34911l.f92564a).map(C34912m.f92565a).collect(C58370cn.f155946a);
    }

    /* renamed from: f */
    public final C60870cx mo39623a() {
        C34901b bVar = new C34901b(this);
        return C60856cj.m92904m(C47810es.m84978r(bVar), this.f92571f);
    }
}
