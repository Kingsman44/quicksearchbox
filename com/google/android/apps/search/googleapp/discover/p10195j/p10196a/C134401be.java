package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.rendering.xuikit.p3144e.C40489g;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64211bf;
import com.google.protos.youtube.elements.C66059au;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.be */
/* compiled from: PG */
public final class C134401be implements C21312s {

    /* renamed from: a */
    public final C133939b f366112a;

    /* renamed from: b */
    private final Executor f366113b;

    public C134401be(C133939b bVar, Executor executor) {
        C69664n.m101061g(bVar, "actionApi");
        C69664n.m101061g(executor, "executor");
        this.f366112a = bVar;
        this.f366113b = executor;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        C62940bt btVar = C64211bf.f173617c;
        C69664n.m101060f(btVar, "updateDiscoverLanguageCommand");
        return btVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64211bf bfVar = (C64211bf) obj;
        if (bfVar != null) {
            return C40489g.m70205a(new C134400bd(this, bfVar), this.f366113b);
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
