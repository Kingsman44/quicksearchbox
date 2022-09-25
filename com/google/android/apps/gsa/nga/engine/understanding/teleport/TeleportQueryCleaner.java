package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.au.an;
import com.google.android.apps.gsa.nga.engine.au.ao;
import com.google.android.apps.gsa.nga.engine.au.av;
import com.google.android.apps.gsa.nga.engine.au.bz;
import com.google.android.apps.gsa.nga.engine.au.c;
import com.google.android.apps.gsa.nga.engine.au.d;
import com.google.android.apps.gsa.nga.engine.au.e;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p001a.p014d.p015a.p016a.C0039ab;
import p001a.p014d.p015a.p016a.C0048ak;
import p001a.p014d.p015a.p016a.C0049al;
import p001a.p014d.p015a.p016a.C0051an;
import p001a.p014d.p015a.p016a.C0060e;
import p001a.p014d.p015a.p016a.C0061f;
import p001a.p014d.p015a.p016a.C0063h;
import p001a.p014d.p015a.p016a.C0065j;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* compiled from: PG */
public class TeleportQueryCleaner extends C79360j {

    /* renamed from: a */
    public static final C58974d f217615a = C58974d.m91136j();

    /* renamed from: b */
    public d f217616b;

    /* renamed from: c */
    private final C76092h f217617c;

    /* renamed from: d */
    private final e f217618d;

    /* renamed from: e */
    private final bz f217619e;

    /* renamed from: f */
    private final C78007b f217620f;

    /* renamed from: g */
    private final C22871g f217621g;

    /* renamed from: h */
    private av f217622h;

    public TeleportQueryCleaner(C79359i iVar, C78007b bVar, C76092h hVar, e eVar, bz bzVar, C22871g gVar) {
        super(iVar, hVar);
        this.f217620f = bVar;
        this.f217617c = hVar;
        this.f217618d = eVar;
        this.f217616b = eVar.a();
        this.f217619e = bzVar;
        this.f217622h = bzVar.a();
        this.f217621g = gVar;
    }

    /* renamed from: e */
    private final String m127107e() {
        return this.f217617c.mo72021b().mo72039e().toLanguageTag();
    }

    public static native void nativeClearResources();

    private static native byte[] nativeQueryCleanup(byte[] bArr);

    private static native void nativeUpdateResources(byte[] bArr);

    /* renamed from: b */
    public final String mo73824b(String str, C79298f fVar) {
        Optional optional;
        this.f217616b = this.f217618d.a();
        av a = this.f217619e.a();
        this.f217622h = a;
        C58528ij F = C58528ij.m90006F(((C0039ab) Collection.EL.stream(a.b(str, this.f217616b).f113b).map(new an(a)).reduce(C0039ab.f104e, ao.a)).f109d);
        C58485gu guVar = (C58485gu) Collection.EL.stream((C58485gu) Collection.EL.stream(fVar.mo73862h()).filter(C79190b.f217654a).collect(C58370cn.f155946a)).map(new C79225ch(this, fVar)).collect(C58370cn.f155946a);
        Optional findFirst = Collection.EL.stream(guVar).filter(new C79226ci(str, c.a(str, this.f217616b.b))).findFirst();
        C0060e eVar = (C0060e) C0061f.f159h.createBuilder();
        String j = fVar.mo73864j();
        eVar.copyOnWrite();
        C0061f fVar2 = (C0061f) eVar.instance;
        j.getClass();
        fVar2.f161a |= 1;
        fVar2.f162b = j;
        eVar.copyOnWrite();
        C0061f fVar3 = (C0061f) eVar.instance;
        str.getClass();
        fVar3.f161a |= 2;
        fVar3.f163c = str;
        String e = m127107e();
        eVar.copyOnWrite();
        C0061f fVar4 = (C0061f) eVar.instance;
        e.getClass();
        fVar4.f161a |= 4;
        fVar4.f164d = e;
        eVar.mo25a(guVar);
        C0065j jVar = (C0065j) findFirst.orElse(C0065j.f172g);
        eVar.copyOnWrite();
        C0061f fVar5 = (C0061f) eVar.instance;
        jVar.getClass();
        fVar5.f166f = jVar;
        fVar5.f161a |= 8;
        eVar.mo26b((C58528ij) Collection.EL.stream(fVar.mo73863i()).filter(new C79223cf(F)).map(new C79224cg(fVar)).collect(C58370cn.f155947b));
        try {
            optional = Optional.m71637of((C0063h) C62942bv.parseFrom((C62942bv) C0063h.f168c, nativeQueryCleanup(((C0061f) eVar.build()).toByteArray()), C62921ba.m95368a()));
        } catch (C62974ct e2) {
            ((C58970a) ((C58970a) ((C58970a) f217615a.mo56225c()).mo56382g(e2)).mo56372aa(5505)).mo56386p("Failed to parse protobuf from native code");
            optional = Optional.empty();
        }
        return (String) optional.map(C79227cj.f217698a).orElse(BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public final void mo73825d(C0048ak akVar) {
        C0049al alVar = (C0049al) C0051an.f137b.createBuilder();
        alVar.mo24a(m127107e(), akVar);
        nativeUpdateResources(((C0051an) alVar.build()).toByteArray());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        C22871g gVar = this.f217621g;
        C78007b bVar = this.f217620f;
        Objects.requireNonNull(bVar);
        return C118826c.m197213c(gVar.mo28207g("[NGA] TeleportQueryCleaner.initialize", new C79222ce(bVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return C118826c.m197213c(this.f217621g.mo28207g("[NGA] TeleportQueryCleaner.uninitialize", C79220cc.f217689a));
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "TeleportQueryCleaner";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 57;
    }
}
