package com.google.android.libraries.assistant.auto.tng.assistant.p885e.p886a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a.C11953b;
import com.google.android.libraries.assistant.auto.tng.assistant.p718a.p719a.C11954c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13081a;
import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13099c;
import com.google.android.libraries.assistant.auto.tng.assistant.p885e.C13101e;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16758h;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32441ah;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32459r;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32462u;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32463v;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.assistant.p3897e.p3921j.ady;
import com.google.assistant.p3897e.p3921j.aei;
import com.google.assistant.p3931f.p3940d.p3941a.C52858ah;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.a.p */
/* compiled from: PG */
public final class C13097p implements C13099c {

    /* renamed from: g */
    public static final /* synthetic */ int f40615g = 0;

    /* renamed from: h */
    private static final C13101e f40616h = new C13081a().mo20879a();

    /* renamed from: i */
    private static final C16758h f40617i;

    /* renamed from: j */
    private static final C46690ah f40618j = new C46885y("RemoteActionsDataService#remoteActionsUiResponseDataSource");

    /* renamed from: k */
    private static final C46690ah f40619k = new C46885y("RemoteActionsDataService#voiceResponseDataSource");

    /* renamed from: a */
    public final C32459r f40620a;

    /* renamed from: b */
    public final C11953b f40621b;

    /* renamed from: c */
    public final C11953b f40622c;

    /* renamed from: d */
    public final AtomicReference f40623d = new AtomicReference(C12991i.f40380k);

    /* renamed from: e */
    public final AtomicReference f40624e = new AtomicReference(BuildConfig.FLAVOR);

    /* renamed from: f */
    public final AtomicReference f40625f = new AtomicReference(new C13081a().mo20879a());

    /* renamed from: l */
    private final C71422aw f40626l;

    /* renamed from: m */
    private final C69613f f40627m = new C69747m(new C13082a(this));

    /* renamed from: n */
    private C71643cp f40628n;

    static {
        C16758h hVar = C16758h.f49035i;
        C69664n.m101060f(hVar, "getDefaultInstance()");
        f40617i = hVar;
    }

    public C13097p(C11954c cVar, C71422aw awVar, C32459r rVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(rVar, "sessionManager");
        this.f40626l = awVar;
        this.f40620a = rVar;
        this.f40621b = cVar.mo20334a(f40618j, f40616h);
        this.f40622c = cVar.mo20334a(f40619k, f40617i);
    }

    /* renamed from: a */
    public final C46851e mo20884a() {
        return this.f40621b;
    }

    /* renamed from: b */
    public final C46851e mo20885b() {
        return this.f40622c;
    }

    /* renamed from: c */
    public final void mo20886c(ady ady, C52858ah ahVar, C12991i iVar) {
        C69664n.m101061g(ady, "providerBindAppActionsServiceArgs");
        C69664n.m101061g(ahVar, "hostProperties");
        C69664n.m101061g(iVar, "assistantRequestConfig");
        this.f40623d.set(iVar);
        this.f40624e.set(ady.f134916c);
        C71643cp d = C71803m.m105043d(this.f40626l, (C69585o) null, (C71424ay) null, new C13095n(this.f40620a.mo38078a("session_key", this.f40626l), this, (C69577g) null), 3);
        d.mo62873s(new C13096o(this));
        this.f40628n = d;
        mo20888e(new C32462u(ady, ahVar));
    }

    /* renamed from: d */
    public final void mo20887d() {
        C71643cp cpVar = this.f40628n;
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        this.f40628n = null;
        C32433a aVar = (C32433a) this.f40620a.f86990a.remove("session_key");
        if (aVar != null) {
            aVar.mo38063e();
        }
    }

    /* renamed from: e */
    public final void mo20888e(C32463v vVar) {
        C32433a aVar = (C32433a) this.f40627m.mo5768a();
        if (aVar != null) {
            aVar.mo38064f(vVar);
        }
    }

    /* renamed from: f */
    public final void mo20889f() {
        mo20887d();
    }

    /* renamed from: g */
    public final void mo20890g(aei aei, C12991i iVar) {
        C69664n.m101061g(aei, "providerUpdateAppActionsServiceArgs");
        C69664n.m101061g(iVar, "assistantRequestConfig");
        this.f40623d.set(iVar);
        mo20888e(new C32441ah(aei));
    }
}
