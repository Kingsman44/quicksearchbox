package com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a;
import com.google.android.libraries.assistant.p1531n.p1532a.C18434a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2828y.p2853n.C37004a;
import com.google.android.libraries.search.assistant.p2828y.p2853n.C37015l;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2757g.C36087e;
import com.google.android.libraries.search.assistant.performer.p2757g.C36089g;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36081e;
import com.google.android.libraries.search.assistant.performer.p2757g.p2761b.C36082f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5369g.p5373b.p5374a.C68724am;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b.a.q */
/* compiled from: PG */
public final class C36075q implements C36082f {

    /* renamed from: a */
    public static final C59071e f94370a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.g.b.a.q");

    /* renamed from: b */
    public final C21370a f94371b;

    /* renamed from: c */
    public final C68214a f94372c;

    /* renamed from: d */
    public final C36087e f94373d;

    /* renamed from: e */
    public final ScheduledExecutorService f94374e;

    /* renamed from: f */
    public final Optional f94375f;

    /* renamed from: g */
    public boolean f94376g;

    /* renamed from: h */
    public long f94377h = 0;

    /* renamed from: i */
    public final C68724am f94378i;

    /* renamed from: j */
    private final Context f94379j;

    /* renamed from: k */
    private final C68214a f94380k;

    /* renamed from: l */
    private final C37015l f94381l;

    public C36075q(C37015l lVar, Context context, ScheduledExecutorService scheduledExecutorService, C36087e eVar, C68214a aVar, C68214a aVar2, C21370a aVar3, Optional optional, C68724am amVar) {
        this.f94379j = context;
        this.f94374e = scheduledExecutorService;
        this.f94373d = eVar;
        this.f94372c = aVar;
        this.f94381l = lVar;
        this.f94380k = aVar2;
        this.f94371b = aVar3;
        this.f94375f = optional;
        this.f94378i = amVar;
    }

    /* renamed from: a */
    public final C60870cx mo39960a(String str, C36081e eVar, C0320v vVar) {
        return mo39961b(str, eVar, vVar, false, Optional.empty(), (C35470f) null);
    }

    /* renamed from: b */
    public final C60870cx mo39961b(String str, C36081e eVar, C0320v vVar, Boolean bool, Optional optional, C35470f fVar) {
        C0320v vVar2 = vVar;
        this.f94377h = this.f94371b.mo26870b();
        C60870cx a = C2169h.m6027a(new C36068j(this, str, vVar, bool, optional, fVar, eVar));
        C60856cj.m92911t(a, C47810es.m84974n(C47810es.m84974n(new C36071m(this, vVar))), this.f94374e);
        String str2 = str;
        return C60846c.m92879h(C47633f.m84733g(a).mo51517j(true != optional.isPresent() ? 1000 : 5000, TimeUnit.MILLISECONDS, this.f94374e), TimeoutException.class, C47810es.m84966f(new C36069k(this, str, vVar, optional)), this.f94374e);
    }

    /* renamed from: c */
    public final C52070ec mo39962c(C0320v vVar, Optional optional, PlaybackStateCompat playbackStateCompat, String str) {
        C52179id idVar = (C52179id) C18434a.f52325a.getOrDefault(Integer.valueOf(playbackStateCompat.f999f), C52179id.UNKNOWN_MEDIA_ERROR);
        if (this.f94375f.isPresent()) {
            ((C13923a) this.f94375f.get()).mo21355b(str, idVar);
        }
        Optional of = Optional.m71637of(C36089g.m64502e(idVar, (Duration) null));
        Optional empty = Optional.empty();
        String g = vVar.mo1039g();
        String valueOf = String.valueOf(playbackStateCompat.f1000g);
        return C36089g.m64499b(of, optional, empty, Optional.m71637of("Got error " + valueOf + " from media app " + g));
    }

    /* renamed from: d */
    public final C60870cx mo39963d(C0320v vVar, Optional optional, String str) {
        if (this.f94375f.isPresent()) {
            ((C13923a) this.f94375f.get()).mo21354a(str);
        }
        C60870cx a = this.f94381l.mo40535a(Optional.m71637of(vVar), C37004a.m65697a());
        C36061c cVar = new C36061c(this, optional);
        return C60922j.m93044g(a, C47810es.m84963c(cVar), this.f94374e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ C60870cx mo39964e(PendingIntent pendingIntent, Intent intent, String str, C35470f fVar, Boolean bool) {
        try {
            if (bool.booleanValue()) {
                pendingIntent.send(this.f94379j, 0, intent);
            } else {
                pendingIntent.send();
            }
            return C60866ct.f164955a;
        } catch (PendingIntent.CanceledException e) {
            C59104x c = f94370a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52174)).mo56389s("Failed to send session activity. Fallback to intent with: %s", str);
            return mo39965f(str, fVar);
        }
    }

    /* renamed from: f */
    public final C60870cx mo39965f(String str, C35470f fVar) {
        Intent launchIntentForPackage = ((PackageManager) this.f94380k.mo27525b()).getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null || fVar == null) {
            C59104x d = f94370a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
            ((C59052c) ((C59052c) d).mo56372aa(52176)).mo56389s("Failed to get launch-intent from package: %s", str);
            return C60856cj.m92899h(new IllegalArgumentException(String.format("No launch intents available for package: %s", new Object[]{str})));
        }
        C60870cx a = this.f94373d.mo39967a(launchIntentForPackage);
        C36065g gVar = new C36065g(launchIntentForPackage, fVar);
        return C60922j.m93045h(a, C47810es.m84966f(gVar), this.f94374e);
    }
}
