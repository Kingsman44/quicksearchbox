package com.google.android.apps.search.googleapp.search.p10415i;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58585km;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4543n.p4546c.C59400h;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61362ad;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.search.i.j */
/* compiled from: PG */
public final class C137508j implements C137501c {

    /* renamed from: a */
    public static final C58974d f374002a = C58974d.m91136j();

    /* renamed from: b */
    public static final C61362ad f374003b = C61362ad.m93870b("Refresh-Google-Creds");

    /* renamed from: c */
    public final ScheduledExecutorService f374004c;

    /* renamed from: d */
    public final Executor f374005d;

    /* renamed from: e */
    public final int f374006e;

    /* renamed from: f */
    private final C46423aj f374007f;

    /* renamed from: g */
    private final C44058f f374008g;

    public C137508j(ScheduledExecutorService scheduledExecutorService, Executor executor, ExecutorService executorService, long j, C69464a aVar, C44058f fVar) {
        C58838bb.m90869d(j < 2147483647L, "Flag network__http_request_max_retries >= Integer.MAX_VALUE, but its value + 1 must be cast to an int.");
        this.f374004c = scheduledExecutorService;
        C46423aj ajVar = new C46423aj(new C137504f(aVar), executor);
        this.f374007f = ajVar;
        ajVar.mo50395b();
        this.f374005d = executorService;
        this.f374006e = (int) j;
        this.f374008g = fVar;
    }

    /* renamed from: a */
    public final C60817ay mo113788a(String str, C58585km kmVar, int i, Profile profile) {
        C60870cx cxVar;
        try {
            URL url = new URL(str);
            C60870cx b = this.f374007f.mo50395b();
            if (profile == null || kmVar.mo54919w(C61362ad.m93870b("Cookie"))) {
                cxVar = C60856cj.m92900i(BuildConfig.FLAVOR);
            } else {
                cxVar = this.f374008g.mo47022b(profile).mo47012a(str);
            }
            return new C60817ay(C59417y.m92319e(new C137505g(this, cxVar, b, url, kmVar), new C59400h(i + 1), C137503e.f373993a, this.f374004c)).mo57272e(C47810es.m84970j(new C137506h(this)), this.f374004c);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
