package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p3055n.p3081g.C39756b;
import com.google.android.libraries.search.p3055n.p3081g.C39766c;
import com.google.android.libraries.search.p3055n.p3086i.C39791m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.n.g.a.aa */
/* compiled from: PG */
public final class C39718aa implements C39756b {

    /* renamed from: a */
    public static final C59071e f104523a = C59071e.m91332i("com.google.android.libraries.search.n.g.a.aa");

    /* renamed from: d */
    private static final Duration f104524d = Duration.ofSeconds(5);

    /* renamed from: b */
    public final C39791m f104525b;

    /* renamed from: c */
    public final C39766c f104526c;

    /* renamed from: e */
    private final C60888db f104527e;

    public C39718aa(C39791m mVar, C39766c cVar, C60888db dbVar) {
        this.f104525b = mVar;
        this.f104526c = cVar;
        this.f104527e = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo42006a(Locale locale) {
        C59104x b = f104523a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaResourceMgrClient");
        ((C59052c) ((C59052c) b).mo56372aa(53843)).mo56386p("#updateAndGetSnapshot");
        AtomicReference atomicReference = new AtomicReference(C58836b.f156633a);
        return C47633f.m84733g(C60856cj.m92908q(C2169h.m6027a(new C39752w(this, atomicReference, locale)), f104524d.toSeconds(), TimeUnit.SECONDS, this.f104527e)).mo51516i(new C39753x(this), this.f104527e).mo51514f(TimeoutException.class, new C39754y(this, atomicReference), this.f104527e);
    }
}
