package com.google.research.p5181a.p5183b.p5184a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62942bv;
import com.google.research.p5181a.C66298ac;
import com.google.research.p5181a.C66299b;
import com.google.research.p5181a.C66350e;
import com.google.research.p5181a.C66378g;
import com.google.research.p5181a.C66380i;
import com.google.research.p5181a.C66384m;
import com.google.research.p5181a.C66393v;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.research.a.b.a.c */
/* compiled from: PG */
public final class C66302c implements C66376a {

    /* renamed from: b */
    private static final C59071e f180310b = C59071e.m91332i("com.google.research.a.b.a.c");

    /* renamed from: a */
    public final C66350e f180311a;

    public C66302c() {
        this.f180311a = (C66350e) C66380i.f180482l.createBuilder();
    }

    /* renamed from: a */
    public final long mo59458a() {
        return ((C66380i) this.f180311a.instance).f180487d;
    }

    /* renamed from: b */
    public final String mo59459b() {
        return ((C66380i) this.f180311a.instance).f180491h;
    }

    /* renamed from: c */
    public final String mo59460c() {
        return ((C66380i) this.f180311a.instance).f180485b;
    }

    /* renamed from: d */
    public final List mo59461d() {
        return new ArrayList(Collections.unmodifiableList(((C66380i) this.f180311a.instance).f180492i));
    }

    /* renamed from: e */
    public final byte[] mo59462e() {
        return ((C66380i) this.f180311a.build()).toByteArray();
    }

    /* renamed from: f */
    public final int mo59463f() {
        int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int a = C66378g.m97183a(((C66380i) this.f180311a.instance).f180486c);
        if (a == 0) {
            a = 1;
        }
        return iArr[a - 1];
    }

    /* renamed from: g */
    public final C66300a mo59464g() {
        C66299b bVar = ((C66380i) this.f180311a.instance).f180494k;
        if (bVar == null) {
            bVar = C66299b.f180304d;
        }
        return new C66300a(bVar);
    }

    /* renamed from: h */
    public final C66303d mo59465h() {
        C66384m mVar = ((C66380i) this.f180311a.instance).f180489f;
        if (mVar == null) {
            mVar = C66384m.f180499e;
        }
        return new C66303d(mVar);
    }

    /* renamed from: i */
    public final C66306g mo59466i() {
        C66393v vVar = ((C66380i) this.f180311a.instance).f180493j;
        if (vVar == null) {
            vVar = C66393v.f180531f;
        }
        return new C66306g(vVar);
    }

    /* renamed from: j */
    public final C66308i mo59467j() {
        C66298ac acVar = ((C66380i) this.f180311a.instance).f180488e;
        if (acVar == null) {
            acVar = C66298ac.f180295h;
        }
        return new C66308i(acVar);
    }

    /* renamed from: k */
    public final C66376a mo59468k(byte[] bArr, int i) {
        try {
            return new C66302c((C66380i) C62942bv.parseFrom((C62942bv) C66380i.f180482l, C62897ae.m95112O(bArr, 0, i)));
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f180310b.mo56224b()).mo56382g(e)).mo56372aa(54907)).mo56386p("IO exception for reflectionEvent");
            return null;
        }
    }

    /* renamed from: l */
    public final void mo59469l(String str) {
        C66350e eVar = this.f180311a;
        eVar.copyOnWrite();
        C66380i iVar = (C66380i) eVar.instance;
        C66380i iVar2 = C66380i.f180482l;
        str.getClass();
        iVar.f180484a |= 1;
        iVar.f180485b = str;
    }

    /* renamed from: m */
    public final void mo59470m(C66306g gVar) {
        C66350e eVar = this.f180311a;
        C66393v vVar = (C66393v) gVar.f180315a.build();
        eVar.copyOnWrite();
        C66380i iVar = (C66380i) eVar.instance;
        C66380i iVar2 = C66380i.f180482l;
        vVar.getClass();
        iVar.f180493j = vVar;
        iVar.f180484a |= 512;
    }

    /* renamed from: n */
    public final void mo59471n(C66308i iVar) {
        C66350e eVar = this.f180311a;
        C66298ac acVar = (C66298ac) iVar.f180317a.build();
        eVar.copyOnWrite();
        C66380i iVar2 = (C66380i) eVar.instance;
        C66380i iVar3 = C66380i.f180482l;
        acVar.getClass();
        iVar2.f180488e = acVar;
        iVar2.f180484a |= 16;
    }

    /* renamed from: o */
    public final void mo59472o(int i) {
        C66350e eVar = this.f180311a;
        int i2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}[i - 1];
        eVar.copyOnWrite();
        C66380i iVar = (C66380i) eVar.instance;
        int i3 = i2 - 1;
        C66380i iVar2 = C66380i.f180482l;
        if (i2 != 0) {
            iVar.f180486c = i3;
            iVar.f180484a |= 2;
            return;
        }
        throw null;
    }

    public C66302c(C66380i iVar) {
        this.f180311a = (C66350e) iVar.toBuilder();
    }
}
