package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.p516d.C9525a;
import com.google.android.apps.gsa.assistant.shared.appactions.g.a;
import com.google.android.apps.gsa.assistant.shared.appactions.g.f;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C49860br;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.function.Predicate;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.al */
/* compiled from: PG */
public final class C10325al implements C10326am {

    /* renamed from: a */
    public static final C59071e f34986a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.appactions.data.al");

    /* renamed from: b */
    public final C9525a f34987b;

    /* renamed from: c */
    public final f f34988c;

    /* renamed from: d */
    public final a f34989d;

    /* renamed from: e */
    public final C73812a f34990e;

    /* renamed from: f */
    public final Context f34991f;

    /* renamed from: g */
    public final C22871g f34992g;

    /* renamed from: h */
    public final C22871g f34993h;

    /* renamed from: i */
    public final long f34994i;

    /* renamed from: j */
    public final long f34995j;

    /* renamed from: k */
    public final AtomicReference f34996k = new AtomicReference(Optional.empty());

    /* renamed from: l */
    public final ConcurrentMap f34997l = new ConcurrentHashMap();

    /* renamed from: m */
    public final AtomicLong f34998m = new AtomicLong(0);

    /* renamed from: n */
    public final AtomicBoolean f34999n = new AtomicBoolean(false);

    /* renamed from: o */
    private final AtomicReference f35000o = new AtomicReference(Optional.empty());

    public C10325al(C9525a aVar, f fVar, a aVar2, C73812a aVar3, Context context, C90021c cVar, C22871g gVar, C22871g gVar2) {
        this.f34987b = aVar;
        this.f34988c = fVar;
        this.f34989d = aVar2;
        this.f34990e = aVar3;
        this.f34991f = context;
        this.f34992g = gVar;
        this.f34993h = gVar2;
        this.f34994i = cVar.mo79743a(C90019by.f248070d);
        this.f34995j = cVar.mo79743a(C90019by.f248066P);
    }

    /* renamed from: a */
    public static C10339az m25260a(C10341ba baVar, Predicate predicate) {
        Optional findFirst = Collection.EL.stream(baVar.mo18438a()).filter(predicate).findFirst();
        if (findFirst.isPresent()) {
            return (C10339az) findFirst.get();
        }
        return new C10335av(C49838aw.f129504g, C58485gu.m89845m(), C58485gu.m89845m(), 2);
    }

    /* renamed from: j */
    public static boolean m25261j(C49826ak akVar) {
        return akVar.f129465b.size() > 0;
    }

    /* renamed from: k */
    private final C60870cx m25262k(String str) {
        return this.f34992g.mo28209i(mo18420b(), "Get android app info", new C10315ab(str));
    }

    /* renamed from: l */
    private final C60870cx m25263l(AtomicReference atomicReference, C69464a aVar) {
        C60870cx cxVar = (C60870cx) ((Optional) DesugarAtomicReference.updateAndGet(atomicReference, new C10347e(aVar))).get();
        new C90873ag(cxVar, this.f34992g, "maybe invalidate", C10348f.f35030a).mo85223a(new C10349g(atomicReference));
        return cxVar;
    }

    /* renamed from: b */
    public final C60870cx mo18420b() {
        return m25263l(this.f35000o, new C10346d(this));
    }

    /* renamed from: c */
    public final C60870cx mo18421c(Predicate predicate) {
        return this.f34992g.mo28209i(mo18423e(), "FullPageData -> AppSpecificPageData", new C10350h(predicate));
    }

    /* renamed from: d */
    public final C60870cx mo18422d(String str) {
        return mo18421c(new C10366x(str));
    }

    /* renamed from: e */
    public final C60870cx mo18423e() {
        return m25263l(this.f34996k, new C10357o(this));
    }

    /* renamed from: f */
    public final C60870cx mo18424f(String str, C49860br brVar) {
        return this.f34992g.mo28210j(m25262k(str), "Use android app info and routine workflow ID/opaque token to fetch shortcut detailed page response", new C10340b(this, brVar));
    }

    /* renamed from: g */
    public final C60870cx mo18425g(String str, long j) {
        Optional optional = (Optional) this.f34996k.get();
        if (!optional.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        return this.f34992g.mo28209i((C60870cx) optional.get(), "Fetch AppShortcutUi by shortcutId", new C10319af(str, j));
    }

    /* renamed from: h */
    public final C60870cx mo18426h(C60870cx cxVar) {
        return this.f34992g.mo28205e(cxVar, "catching timeout", TimeoutException.class, C10317ad.f34964a);
    }

    /* renamed from: i */
    public final C60870cx mo18427i(String str, C49826ak akVar, Optional optional) {
        SettableFuture settableFuture = new SettableFuture();
        SettableFuture settableFuture2 = settableFuture;
        this.f34992g.mo28211k(m25262k(str), "sendShortcutUiUpdateRequest w/ AndroidAppInfoOptional", new C10323aj(this, akVar, optional, new C10321ah(this, optional, str, akVar, settableFuture2), settableFuture2));
        return mo18426h(C90877ak.m148471e(settableFuture, 5, TimeUnit.SECONDS, this.f34992g));
    }
}
