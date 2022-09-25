package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64215f;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.e */
/* compiled from: PG */
public final class C134404e implements C21312s {

    /* renamed from: a */
    public final C133939b f366118a;

    public C134404e(C133939b bVar) {
        C69664n.m101061g(bVar, "actionApi");
        this.f366118a = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        C62940bt btVar = C64215f.f173628c;
        C69664n.m101060f(btVar, "channelCommand");
        return btVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64215f fVar = (C64215f) obj;
        C69664n.m101061g(fVar, "command");
        C69664n.m101061g(rVar, "eventData");
        return C69794a.m101256h(new C134403d(this, fVar));
    }
}
