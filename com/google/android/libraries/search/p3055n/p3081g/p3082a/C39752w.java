package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.search.p3055n.p3086i.C39779a;
import com.google.android.libraries.search.p3055n.p3086i.C39780b;
import com.google.android.libraries.search.p3055n.p3086i.C39784f;
import com.google.android.libraries.search.p3055n.p3086i.C39785g;
import com.google.android.libraries.search.p3055n.p3086i.C39791m;
import com.google.android.libraries.search.p3055n.p3086i.C39792n;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62940bt;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.n.g.a.w */
/* compiled from: PG */
public final /* synthetic */ class C39752w implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C39718aa f104579a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f104580b;

    /* renamed from: c */
    public final /* synthetic */ Locale f104581c;

    public /* synthetic */ C39752w(C39718aa aaVar, AtomicReference atomicReference, Locale locale) {
        this.f104579a = aaVar;
        this.f104580b = atomicReference;
        this.f104581c = locale;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C39718aa aaVar = this.f104579a;
        AtomicReference atomicReference = this.f104580b;
        Locale locale = this.f104581c;
        C39755z zVar = new C39755z(cVar);
        C39791m mVar = aaVar.f104525b;
        C70862aj b = C70876o.m103761b(mVar.f189039a.mo39510a(C39792n.m69207a(), mVar.f189040b), C47686k.m84827a(zVar), true);
        zVar.f104585a = C58833ax.m90834k(b);
        atomicReference.set(C58833ax.m90834k(b));
        C39784f fVar = (C39784f) C39785g.f104642a.createBuilder();
        C62940bt btVar = C39780b.f104633d;
        C39779a aVar = (C39779a) C39780b.f104632c.createBuilder();
        String languageTag = locale.toLanguageTag();
        aVar.copyOnWrite();
        C39780b bVar = (C39780b) aVar.instance;
        languageTag.getClass();
        bVar.f104635a = 1 | bVar.f104635a;
        bVar.f104636b = languageTag;
        fVar.mo58885m(btVar, (C39780b) aVar.build());
        b.mo20123c((C39785g) fVar.build());
        return "SodaResourceManager.updateResourceCache.resourceObserver operation";
    }
}
