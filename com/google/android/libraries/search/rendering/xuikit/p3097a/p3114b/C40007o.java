package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b.C64251h;
import com.google.protos.youtube.elements.C66059au;
import dagger.C68214a;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.o */
/* compiled from: PG */
public final class C40007o implements C21312s {

    /* renamed from: a */
    public final Context f105155a;

    /* renamed from: b */
    public final View f105156b;

    /* renamed from: c */
    public final C68214a f105157c;

    public C40007o(Context context, View view, C68214a aVar) {
        this.f105155a = context;
        this.f105156b = view;
        this.f105157c = aVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64251h.f173722h;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: d */
    public final C69794a mo25804c(C64251h hVar, C21311r rVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new C40006n(this).mo42116a(hVar, rVar).mo48343h();
            C69794a aVar = C69874i.f186267a;
            C69822d dVar = C70101a.f186847o;
            return aVar;
        }
        C69794a g = C69794a.m101255g(new C40003k(this, hVar, rVar));
        C70128t tVar = C69797b.f186184a;
        C69795a.m101266a(tVar);
        return g.mo61452j(tVar);
    }
}
