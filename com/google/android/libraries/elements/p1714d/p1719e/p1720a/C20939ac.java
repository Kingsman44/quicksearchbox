package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66200dn;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import dagger.C68214a;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69866af;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69923ad;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69938as;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.e.a.ac */
/* compiled from: PG */
public final class C20939ac implements C21312s {

    /* renamed from: a */
    private final C68214a f58717a;

    /* renamed from: b */
    private final C70128t f58718b;

    public C20939ac(C68214a aVar, C70128t tVar) {
        this.f58717a = aVar;
        this.f58718b = tVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66200dn.f180015g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C69794a aVar;
        C66200dn dnVar = (C66200dn) obj;
        C21313t tVar = (C21313t) this.f58717a.mo27525b();
        if ((dnVar.f180017a & 1) != 0) {
            CommandOuterClass$Command commandOuterClass$Command = dnVar.f180018b;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.f179510a;
            }
            tVar.mo26124a(commandOuterClass$Command, rVar).mo61453k();
        }
        if ((dnVar.f180017a & 2) != 0) {
            CommandOuterClass$Command commandOuterClass$Command2 = dnVar.f180019c;
            if (commandOuterClass$Command2 == null) {
                commandOuterClass$Command2 = CommandOuterClass$Command.f179510a;
            }
            C69866af afVar = new C69866af(tVar.mo26125b(commandOuterClass$Command2, rVar, 1).mo61452j(this.f58718b));
            C69822d dVar = C70101a.f186843k;
            C69938as asVar = new C69938as(afVar);
            C69822d dVar2 = C70101a.f186843k;
            aVar = new C69923ad(asVar, new C20938ab(dnVar, tVar, rVar));
        } else {
            aVar = C69874i.f186267a;
        }
        C69822d dVar3 = C70101a.f186847o;
        return aVar;
    }
}
