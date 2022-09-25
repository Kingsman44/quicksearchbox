package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122302b;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122311k;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122312l;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122314n;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122316p;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122317q;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122318r;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17046am;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17064i;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17066k;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17136an;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17138ap;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17156s;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17158u;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29668l;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31480ac;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58890d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.Optional;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.q */
/* compiled from: PG */
public final class C122290q {

    /* renamed from: a */
    public static final C58974d f339104a = C58974d.m91136j();

    /* renamed from: b */
    public final C39141kp f339105b;

    /* renamed from: c */
    public final String f339106c;

    /* renamed from: d */
    public final C60888db f339107d;

    /* renamed from: e */
    public final C60950i f339108e;

    /* renamed from: f */
    public final Optional f339109f;

    /* renamed from: g */
    public final C122221ag f339110g;

    /* renamed from: h */
    private final Context f339111h;

    /* renamed from: i */
    private final C122302b f339112i;

    /* renamed from: j */
    private final C122277d f339113j;

    /* renamed from: k */
    private final C122218ad f339114k;

    /* renamed from: l */
    private final C122318r f339115l;

    /* renamed from: m */
    private final C17138ap f339116m;

    public C122290q(C39141kp kpVar, Context context, C122302b bVar, C60888db dbVar, C122277d dVar, C60950i iVar, Optional optional, C122218ad adVar, C122221ag agVar, C122318r rVar, C17138ap apVar) {
        this.f339105b = kpVar;
        this.f339111h = context;
        this.f339106c = C17136an.m34275j(context);
        this.f339112i = bVar;
        this.f339107d = dbVar;
        this.f339113j = dVar;
        this.f339108e = iVar;
        this.f339109f = optional;
        this.f339114k = adVar;
        this.f339110g = agVar;
        this.f339115l = rVar;
        this.f339116m = apVar;
    }

    /* renamed from: f */
    private static String m201806f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause instanceof StatusException) {
            return ((StatusException) cause).f186943a.getCode().name();
        }
        if (!(cause instanceof C70761fa)) {
            return "UNKNOWN_STATUS";
        }
        return ((C70761fa) cause).f188571a.getCode().name();
    }

    /* renamed from: g */
    private final void m201807g(Duration duration, String str, String str2, String str3, boolean z, Optional optional, Duration duration2) {
        Optional optional2 = optional;
        String str4 = ((C122288o) optional2.map(C122280g.f339069a).orElse(C122288o.BOOT_TIME_INACCESSIBLE)).f339101k;
        String str5 = ((C122288o) C122288o.m201804a(duration2).orElse(C122288o.ERROR)).f339101k;
        String str6 = this.f339106c;
        Boolean valueOf = Boolean.valueOf(z);
        ((C58970a) ((C58970a) f339104a.mo56224b()).mo56372aa(34725)).mo56367T("incrementApaDataDownloadStoreStatus(latency = %s, appVersion = %s, status = %s, locale = %s, fileGroupnames = %s, accountScoped = %s, localGroupsAvailable = %s, timeSinceSearchBoot = %s (%s), timeSinceDataDownloadInit = %s (%s))", duration, str6, str, str2, str3, valueOf, Boolean.valueOf(this.f339109f.isPresent()), optional2, str4, duration2, str5);
        C39141kp kpVar = this.f339105b;
        ((C19567d) kpVar.f102806Q.mo6453a()).mo24822a(1, this.f339106c, str, C58890d.m90988c(str2), str3, valueOf, Boolean.valueOf(this.f339109f.isPresent()));
        C39141kp kpVar2 = this.f339105b;
        long millis = duration.toMillis();
        ((C19569f) kpVar2.f102807R.mo6453a()).mo24824b((double) millis, this.f339106c, str, str3, Boolean.valueOf(this.f339109f.isPresent()), str4, str5);
    }

    /* renamed from: a */
    public final C60870cx mo105591a(C17156s sVar, C122289p pVar) {
        Instant a = this.f339108e.mo57444a();
        Optional ofNullable = Optional.ofNullable((Duration) C31480ac.m58694a().mo56106b(new C122217ac(this.f339114k)).mo56111f());
        C122218ad adVar = this.f339114k;
        if (adVar.f338926a.isPresent()) {
            Duration between = Duration.between((Temporal) adVar.f338926a.get(), adVar.f338927b.mo57444a());
            C122277d dVar = this.f339113j;
            C60870cx a2 = dVar.mo105583a();
            C122241b bVar = C122241b.f338981a;
            C60870cx q = C60856cj.m92908q(C60922j.m93044g(a2, C47810es.m84963c(bVar), dVar.f339065c), 60, TimeUnit.SECONDS, this.f339107d);
            C60870cx cxVar = sVar.f49861a;
            return C47638k.m84751b(q, cxVar).mo51520a(new C122283j(this, a, pVar, q, cxVar, ofNullable, between), this.f339107d);
        }
        throw new IllegalStateException("DataDownloadUptime not initialized!");
    }

    /* renamed from: b */
    public final void mo105592b(String str, String str2, String str3) {
        ((C58970a) ((C58970a) f339104a.mo56224b()).mo56372aa(34724)).mo56360M("incrementApaDataDownloadStoreLoggingErrors(debugStatusError = %s, locale = %s, groupName = %s, localGroupsAvailable = %s)", str, str2, str3, Boolean.valueOf(this.f339109f.isPresent()));
        C39141kp kpVar = this.f339105b;
        ((C19567d) kpVar.f102808S.mo6453a()).mo24822a(1, this.f339106c, str, C58890d.m90988c(str2), str3, Boolean.valueOf(this.f339109f.isPresent()));
    }

    /* renamed from: c */
    public final void mo105593c(String str, String str2, boolean z, int i, int i2, long j) {
        String str3 = this.f339106c;
        Boolean valueOf = Boolean.valueOf(z);
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i2);
        ((C58970a) ((C58970a) f339104a.mo56224b()).mo56372aa(34726)).mo56364Q("incrementApaDataDownloadStoreStatusNotFound(appVersion = %s, locale = %s, groupName = %s, accountScoped = %s, foundGroups = %s, status = %s, localGroupsAvailable = %s, freeBytes = %s)", str3, str, str2, valueOf, valueOf2, valueOf3, Boolean.valueOf(this.f339109f.isPresent()), Long.valueOf(j));
        C39141kp kpVar = this.f339105b;
        ((C19567d) kpVar.f102809T.mo6453a()).mo24822a(1, this.f339106c, C58890d.m90988c(str), str2, valueOf, valueOf2, valueOf3, Boolean.valueOf(this.f339109f.isPresent()));
    }

    /* renamed from: d */
    public final void mo105594d(C17044ak akVar, C60870cx cxVar, C60870cx cxVar2, Duration duration, Optional optional, Duration duration2) {
        C17044ak akVar2 = akVar;
        C17036ac acVar = akVar2.f49653b;
        if (acVar == null) {
            acVar = C17036ac.f49640d;
        }
        String str = (String) C17158u.m34308a(acVar).orElse(BuildConfig.FLAVOR);
        String str2 = acVar.f49644c;
        try {
            Optional optional2 = (Optional) C60856cj.m92909r(cxVar);
            try {
                List list = (List) C60856cj.m92909r(cxVar2);
                if (list.isEmpty()) {
                    mo105592b("NO_RESPONSE", str2, str);
                } else if (list.size() > 1) {
                    mo105592b("MULTIPLE_RESPONSES", str2, str);
                } else {
                    C17046am amVar = (C17046am) list.get(0);
                    Status status = (amVar.f49657a & 1) != 0 ? Status.f186902OK : Status.f186908f;
                    C17036ac acVar2 = akVar2.f49653b;
                    if (acVar2 == null) {
                        acVar2 = C17036ac.f49640d;
                    }
                    String str3 = acVar2.f49644c;
                    String str4 = (String) C17158u.m34308a(acVar2).orElse(BuildConfig.FLAVOR);
                    boolean isPresent = optional2.isPresent();
                    if ((amVar.f49657a & 1) == 0) {
                        C122318r rVar = this.f339115l;
                        C60870cx m = C60856cj.m92904m(C47810es.m84978r(new C122316p(this.f339111h)), rVar.f339178a);
                        C122318r rVar2 = this.f339115l;
                        C60870cx m2 = C60856cj.m92904m(C47810es.m84978r(new C122317q(this.f339111h)), rVar2.f339178a);
                        C122302b bVar = this.f339112i;
                        Locale forLanguageTag = Locale.forLanguageTag(str3);
                        C122314n nVar = (C122314n) bVar;
                        C28806cu h = C28807cv.m53759h();
                        ((C29668l) h).f80325a = C58833ax.m90834k(str4);
                        C47633f h2 = C47633f.m84733g(((C29409fd) nVar.f339172d.mo27525b()).mo34718g(h.mo34462f())).mo51516i(new C122311k(nVar), nVar.f339173e).mo51515h(new C122312l(nVar, optional2, forLanguageTag, str4), nVar.f339173e);
                        boolean isPresent2 = optional2.isPresent();
                        C60856cj.m92911t(C60856cj.m92897f(m, m2, h2, this.f339116m.mo23200a(this.f339111h)), C47810es.m84974n(new C122286m(this, str4, str3, isPresent2)), this.f339107d);
                    }
                    m201807g(duration, status.getCode().name(), str3, str4, isPresent, optional, duration2);
                }
            } catch (CancellationException unused) {
                m201807g(duration, "FUTURE_CANCELLED", str2, str, optional2.isPresent(), optional, duration2);
            } catch (ExecutionException e) {
                m201807g(duration, m201806f(e), str2, str, optional2.isPresent(), optional, duration2);
            }
        } catch (ExecutionException e2) {
            ((C58970a) ((C58970a) ((C58970a) f339104a.mo56226d()).mo56382g(e2)).mo56372aa(34728)).mo56386p("Error while requesting the account from AccountFetcher for logging.");
            mo105592b("ACCOUNT_FETCHER_ERROR", str2, str);
        }
    }

    /* renamed from: e */
    public final void mo105595e(C17064i iVar, C60870cx cxVar, C60870cx cxVar2, Duration duration, Optional optional, Duration duration2) {
        String str;
        C17064i iVar2 = iVar;
        C17036ac acVar = iVar2.f49676b;
        if (acVar == null) {
            acVar = C17036ac.f49640d;
        }
        String str2 = (String) C17158u.m34308a(acVar).orElse(BuildConfig.FLAVOR);
        String str3 = acVar.f49644c;
        try {
            Optional optional2 = (Optional) C60856cj.m92909r(cxVar);
            try {
                List list = (List) C60856cj.m92909r(cxVar2);
                str = list.isEmpty() ? "NO_RESPONSE" : list.size() > 1 ? "MULTIPLE_RESPONSES" : (((C17066k) list.get(0)).f49683a & 1) != 0 ? Status.f186902OK.getCode().name() : Status.f186908f.getCode().name();
            } catch (CancellationException unused) {
                str = "FUTURE_CANCELLED";
            } catch (ExecutionException e) {
                str = m201806f(e);
            }
            boolean isPresent = optional2.isPresent();
            boolean z = (iVar2.f49675a & 8) != 0;
            String str4 = ((C122288o) optional.map(C122281h.f339070a).orElse(C122288o.BOOT_TIME_INACCESSIBLE)).f339101k;
            String str5 = ((C122288o) C122288o.m201804a(duration2).orElse(C122288o.ERROR)).f339101k;
            String str6 = this.f339106c;
            Boolean valueOf = Boolean.valueOf(isPresent);
            Boolean valueOf2 = Boolean.valueOf(z);
            String str7 = str4;
            ((C58970a) ((C58970a) f339104a.mo56224b()).mo56372aa(34727)).mo56367T("incrementRestrictedServiceStatus(latency = %s, appVersion = %s, status = %s, locale = %s, fileGroupnames = %s, accountScoped = %s, hasCustomDownloadConditions = %s, timeSinceSearchBoot = %s (%s), timeSinceDataDownloadInit = %s (%s))", duration, str6, str, str3, str2, valueOf, valueOf2, optional, str7, duration2, str5);
            ((C19567d) this.f339105b.f102803N.mo6453a()).mo24822a(1, this.f339106c, str, C58890d.m90988c(str3), str2, valueOf, valueOf2);
            ((C19569f) this.f339105b.f102804O.mo6453a()).mo24824b((double) duration.toMillis(), this.f339106c, str, str2, valueOf2, str7, str5);
        } catch (Exception e2) {
            ((C58970a) ((C58970a) ((C58970a) f339104a.mo56226d()).mo56382g(e2)).mo56372aa(34729)).mo56386p("Error while requesting the account from AccountFetcher for logging.");
        }
    }
}
