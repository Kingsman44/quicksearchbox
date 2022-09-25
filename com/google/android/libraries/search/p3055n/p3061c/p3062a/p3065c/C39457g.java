package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c;

import android.content.Context;
import android.content.Intent;
import android.service.voice.AlwaysOnHotwordDetector;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39384d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.n.c.a.c.g */
/* compiled from: PG */
public final class C39457g implements C39384d {

    /* renamed from: a */
    public static final C59071e f103868a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.c.g");

    /* renamed from: b */
    public static final Duration f103869b = Duration.ofSeconds(10);

    /* renamed from: c */
    public final Context f103870c;

    /* renamed from: d */
    public final C47632e f103871d;

    /* renamed from: e */
    public final Executor f103872e;

    /* renamed from: f */
    public final AtomicInteger f103873f;

    /* renamed from: g */
    public final AtomicReference f103874g = new AtomicReference(C58836b.f156633a);

    /* renamed from: h */
    public final ScheduledExecutorService f103875h;

    /* renamed from: i */
    public String f103876i = "NOT_READY";

    /* renamed from: j */
    private final AlwaysOnHotwordDetector f103877j;

    /* renamed from: k */
    private final C21370a f103878k;

    /* renamed from: l */
    private String f103879l = BuildConfig.FLAVOR;

    public C39457g(AlwaysOnHotwordDetector alwaysOnHotwordDetector, int i, C21370a aVar, ScheduledExecutorService scheduledExecutorService, Context context, Executor executor) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        this.f103873f = atomicInteger;
        this.f103870c = context;
        this.f103877j = alwaysOnHotwordDetector;
        atomicInteger.set(i);
        this.f103871d = new C47632e();
        this.f103872e = executor;
        this.f103878k = aVar;
        this.f103875h = scheduledExecutorService;
    }

    /* renamed from: a */
    public final Intent mo41842a() {
        try {
            return this.f103877j.createEnrollIntent();
        } catch (IllegalStateException | UnsupportedOperationException e) {
            C59104x d = f103868a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(53652)).mo56386p("Exception thrown when createEnrollIntent");
            return null;
        } catch (Exception e2) {
            C59104x c = f103868a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(53653)).mo56386p("Error creating DSP enrollment intent");
            return null;
        }
    }

    /* renamed from: b */
    public final void mo41843b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US);
        if (!this.f103879l.isEmpty()) {
            this.f103879l = String.valueOf(this.f103879l).concat("\n");
        }
        String str2 = this.f103879l;
        String format = simpleDateFormat.format(Long.valueOf(this.f103878k.mo26870b()));
        this.f103879l = str2 + "\t \t     " + format + " " + str;
    }

    /* renamed from: u */
    public final String mo41796u() {
        StringBuilder sb = new StringBuilder("\t \t DspModelEnrollmentManager\n\t \t   Current Availability: ");
        sb.append(this.f103876i);
        sb.append("\n\t \t   Change History:\n");
        if (this.f103879l.isEmpty()) {
            sb.append("\t \t     No Updates Reported\n");
        } else {
            sb.append(this.f103879l);
            sb.append("\n");
        }
        return sb.toString();
    }
}
