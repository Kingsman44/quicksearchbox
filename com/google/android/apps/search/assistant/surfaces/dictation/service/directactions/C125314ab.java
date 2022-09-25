package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import android.app.DirectAction;
import android.os.Bundle;
import androidx.p104d.p105a.C2169h;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9236j.p9237a.p9238a.p9240b.C121544b;
import com.google.android.apps.search.assistant.surfaces.dictation.crossprofile.C125181d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.C125338p;
import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.C125343u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.C125347y;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126308aq;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9484v.C126370c;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142586k;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33885c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.ab */
/* compiled from: PG */
public final class C125314ab implements C33885c {

    /* renamed from: b */
    private static final C59071e f345687b = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.ab");

    /* renamed from: a */
    public final C125181d f345688a;

    /* renamed from: c */
    private final boolean f345689c;

    /* renamed from: d */
    private final C33885c f345690d;

    /* renamed from: e */
    private final C126370c f345691e;

    /* renamed from: f */
    private final Executor f345692f;

    /* renamed from: g */
    private final C125347y f345693g;

    public C125314ab(boolean z, C121544b bVar, C125347y yVar, C125181d dVar, C126370c cVar, Executor executor) {
        this.f345689c = z;
        this.f345690d = bVar.mo105246a(C34037b.CLIENT_DICTATION);
        this.f345693g = yVar;
        this.f345688a = dVar;
        this.f345691e = cVar;
        this.f345692f = executor;
    }

    /* renamed from: g */
    private final boolean m205256g() {
        return this.f345689c && this.f345691e.f348068c.get();
    }

    /* renamed from: a */
    public final C60870cx mo39113a() {
        if (!m205256g()) {
            return this.f345690d.mo39113a();
        }
        C125338p a = this.f345693g.mo106932a().mo106927a();
        C125343u uVar = C125343u.f345716a;
        C142568e eVar = new C142568e(C125343u.f345717b, BundlerType.m231188a("java.lang.String"));
        C142568e.m231170f(a.f345715a.mo106928b(), new C142586k(eVar, BuildConfig.FLAVOR));
        return eVar.f386859a;
    }

    /* renamed from: b */
    public final C60870cx mo39114b(C33883a aVar) {
        if (!m205256g()) {
            return this.f345690d.mo39114b(aVar);
        }
        AtomicReference atomicReference = new AtomicReference(Optional.empty());
        C60870cx a = C2169h.m6027a(new C125367v(atomicReference));
        C125313aa aaVar = new C125313aa(aVar, (Optional) atomicReference.get());
        this.f345688a.mo117179c(aaVar);
        this.f345693g.mo106932a().mo106931e(aaVar);
        C126308aq aqVar = new C126308aq(new C125368w(this, aaVar), new C125369x(this, aaVar));
        C60856cj.m92911t(a, C47810es.m84974n(aqVar), this.f345692f);
        return a;
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo39115c(C33884b bVar) {
        return C60856cj.m92899h(new UnsupportedOperationException());
    }

    /* renamed from: d */
    public final C60870cx mo39116d(DirectAction directAction, Bundle bundle) {
        if (!m205256g()) {
            return this.f345690d.mo39116d(directAction, bundle);
        }
        C125338p a = this.f345693g.mo106932a().mo106927a();
        Bundle bundle2 = new Bundle();
        C125343u uVar = C125343u.f345716a;
        C142568e eVar = new C142568e(C125343u.f345717b, BundlerType.m231188a("android.os.Bundle"));
        C142568e.m231170f(a.f345715a.mo106929c(directAction, bundle), new C142586k(eVar, bundle2));
        return eVar.f386859a;
    }

    /* renamed from: e */
    public final C60870cx mo39117e(String str) {
        if (!m205256g()) {
            return this.f345690d.mo39117e(str);
        }
        C125338p a = this.f345693g.mo106932a().mo106927a();
        C58485gu m = C58485gu.m89845m();
        C125343u uVar = C125343u.f345716a;
        C142568e eVar = new C142568e(C125343u.f345717b, BundlerType.m231189b("java.util.List", BundlerType.m231188a("android.app.DirectAction")));
        C142568e.m231170f(a.f345715a.mo106930d(str), new C142586k(eVar, m));
        SettableFuture settableFuture = eVar.f386859a;
        C125366u uVar2 = C125366u.f345774a;
        return C60922j.m93044g(settableFuture, C47810es.m84963c(uVar2), C60826bg.f164896a);
    }
}
