package com.google.android.libraries.silk.p3240c.p3252l;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.android.libraries.search.rendering.xuikit.p3144e.C40489g;
import com.google.common.util.concurrent.C60826bg;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4335l.C56910b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5499b.C69840i;

/* renamed from: com.google.android.libraries.silk.c.l.f */
/* compiled from: PG */
final class C41845f implements C21312s {

    /* renamed from: a */
    public final C40335z f109227a;

    /* renamed from: b */
    final /* synthetic */ C41846g f109228b;

    public C41845f(C41846g gVar, C40335z zVar) {
        this.f109228b = gVar;
        this.f109227a = zVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C56910b.f151879d;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C56910b bVar = (C56910b) obj;
        if (rVar == null) {
            return C69794a.m101254f(new IllegalStateException("No command EventData was provided"));
        }
        if ((bVar.f151881a & 1) == 0) {
            return C69794a.m101254f(new C21260bc("Subscribe command is called without on_event callback"));
        }
        View b = rVar.mo26732b();
        if (b == null) {
            return C69794a.m101254f(new IllegalStateException("No view is available, command is called outside of lifecycle"));
        }
        C69794a a = C40489g.m70205a(new C41842c(this, bVar), C60826bg.f164896a);
        C70128t tVar = C69797b.f186184a;
        C69795a.m101266a(tVar);
        C69794a i = a.mo61451i(tVar);
        C41843d dVar = new C41843d(this, b);
        C69821c cVar = C69840i.f186211d;
        return i.mo61455m(cVar, cVar, dVar);
    }
}
