package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8487k;

import android.text.TextUtils;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.k.c */
/* compiled from: PG */
public final class C111221c extends C112473ar {

    /* renamed from: a */
    public static final C59071e f309522a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.b.k.c");

    /* renamed from: b */
    public final C22871g f309523b;

    /* renamed from: c */
    public final i f309524c;

    /* renamed from: d */
    public final C21370a f309525d;

    /* renamed from: e */
    private final C86054o f309526e;

    public C111221c(C22871g gVar, i iVar, C86054o oVar, C21370a aVar) {
        this.f309523b = gVar;
        this.f309524c = iVar;
        this.f309526e = oVar;
        this.f309525d = aVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return Duration.ofSeconds(30).toMillis();
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        String F = this.f309526e.mo79659F();
        if (!TextUtils.isEmpty(F)) {
            return this.f309523b.mo28202b("get habit profile from geller", new C111219a(this, F));
        }
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = this.f309525d.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }
}
