package com.google.android.libraries.elements.p1714d;

import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21294cj;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21329ai;
import com.google.android.libraries.elements.p1727f.C21168q;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.youtube.elements.C66061aw;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.elements.C66232es;
import com.google.protos.youtube.elements.C66244fd;
import com.google.protos.youtube.elements.C66248fh;
import com.youtube.p5283a.p5284a.C68045ah;
import com.youtube.p5283a.p5284a.C68098t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Objects;
import p5488io.p5490b.C70092f;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69840i;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69920aa;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69929aj;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69934ao;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69962bp;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69991u;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.aa */
/* compiled from: PG */
public final /* synthetic */ class C20788aa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C20794ag f58154a;

    /* renamed from: b */
    public final /* synthetic */ C6411u f58155b;

    /* renamed from: c */
    public final /* synthetic */ C21319z f58156c;

    /* renamed from: d */
    public final /* synthetic */ C68098t f58157d;

    /* renamed from: e */
    public final /* synthetic */ String f58158e;

    /* renamed from: f */
    public final /* synthetic */ C68045ah f58159f;

    /* renamed from: g */
    public final /* synthetic */ C21292ch f58160g;

    public /* synthetic */ C20788aa(C20794ag agVar, C6411u uVar, C21319z zVar, C68098t tVar, String str, C68045ah ahVar, C21292ch chVar) {
        this.f58154a = agVar;
        this.f58155b = uVar;
        this.f58156c = zVar;
        this.f58157d = tVar;
        this.f58158e = str;
        this.f58159f = ahVar;
        this.f58160g = chVar;
    }

    public final Object call() {
        C70120l lVar;
        byte[] bArr;
        List list;
        String str;
        C69929aj ajVar;
        Object obj;
        Object obj2;
        C20794ag agVar = this.f58154a;
        C6411u uVar = this.f58155b;
        C21319z zVar = this.f58156c;
        C68098t tVar = this.f58157d;
        String str2 = this.f58158e;
        C68045ah ahVar = this.f58159f;
        C21292ch chVar = this.f58160g;
        boolean z = agVar.f58186h;
        String g = agVar.f58191m.mo26164a() ? C21168q.m39753g(ahVar) : null;
        if (!z || (agVar.f58187i && !agVar.f58189k)) {
            if (!z || !agVar.f58187i) {
                ByteBuffer f = tVar.mo16918f(6);
                if (f != null) {
                    int a = tVar.mo16913a(6);
                    bArr = new byte[(a != 0 ? tVar.mo16915c(a) : 0)];
                    f.get(bArr);
                } else {
                    throw new C21260bc("Invalid ComponentType: null templateConfig");
                }
            } else {
                C62921ba baVar = new C62921ba();
                baVar.mo58832e(C66061aw.f179649f);
                try {
                    C66166ck ckVar = (C66166ck) C62942bv.parseFrom((C62942bv) C66166ck.f179921e, tVar.mo16918f(14), baVar);
                    C66244fd fdVar = ckVar.f179924b;
                    if (fdVar == null) {
                        fdVar = C66244fd.f180131a;
                    }
                    C62940bt r5 = C62942bv.checkIsLite(C66061aw.f179649f);
                    fdVar.mo58887l(r5);
                    if (fdVar.f169962ag.mo58857o(r5.f169971d)) {
                        C66244fd fdVar2 = ckVar.f179924b;
                        if (fdVar2 == null) {
                            fdVar2 = C66244fd.f180131a;
                        }
                        C62940bt r4 = C62942bv.checkIsLite(C66061aw.f179649f);
                        fdVar2.mo58887l(r4);
                        Object l = fdVar2.f169962ag.mo58854l(r4.f169971d);
                        if (l == null) {
                            obj2 = r4.f169969b;
                        } else {
                            obj2 = r4.mo58889c(l);
                        }
                        C66061aw awVar = (C66061aw) obj2;
                        if ((awVar.f179651a & 2) != 0) {
                            C66232es esVar = awVar.f179652b;
                            if (esVar == null) {
                                esVar = C66232es.f180105a;
                            }
                            bArr = esVar.toByteArray();
                        } else {
                            throw new C21260bc("Invalid ComponentType: null templateConfig");
                        }
                    } else {
                        throw new C21260bc("No ComponentType extension on Element");
                    }
                } catch (C62974ct e) {
                    throw new C21260bc("Error parsing element proto", e);
                }
            }
            byte[] bArr2 = bArr;
            List m = C58485gu.m89845m();
            if (agVar.f58187i) {
                try {
                    C66232es esVar2 = (C66232es) C62942bv.parseFrom((C62942bv) C66232es.f180105a, bArr2, C62921ba.m95368a());
                    List arrayList = new ArrayList();
                    C62940bt r42 = C62942bv.checkIsLite(C66248fh.f180141d);
                    esVar2.mo58887l(r42);
                    Object l2 = esVar2.f169962ag.mo58854l(r42.f169971d);
                    if (l2 == null) {
                        obj = r42.f169969b;
                    } else {
                        obj = r42.mo58889c(l2);
                    }
                    String str3 = ((C66248fh) obj).f180144b;
                    if (!str3.isEmpty()) {
                        arrayList.add(str3);
                    }
                    list = arrayList;
                } catch (C62974ct e2) {
                    throw new C21260bc("Failed to parse a TemplateConfig", e2);
                }
            } else {
                list = m;
            }
            C21294cj cjVar = agVar.f58181c;
            if (list.isEmpty()) {
                C69929aj ajVar2 = new C69929aj(new C21129s(chVar, cjVar, bArr2, ahVar, str2));
                C69822d dVar = C70101a.f186843k;
                ajVar = ajVar2;
                str = g;
            } else {
                str = g;
                C69920aa aaVar = new C69920aa(C70120l.m102049j(list).mo61652l(new C21133w(agVar)), C69840i.f186208a, Integer.MAX_VALUE, C70092f.f186825a);
                C69822d dVar2 = C70101a.f186843k;
                ajVar = aaVar.mo61652l(new C21134x(agVar, list, chVar, cjVar, bArr2, ahVar, str2));
            }
            C21132v vVar = new C21132v(agVar, uVar, tVar, z, zVar, chVar, str);
            int i = C70092f.f186825a;
            C69841j.m101338c(i, "bufferSize");
            if (ajVar instanceof C69991u) {
                C69991u uVar2 = (C69991u) ajVar;
                lVar = C69991u.f186550a;
                C69822d dVar3 = C70101a.f186843k;
            } else {
                C69962bp bpVar = new C69962bp(ajVar, vVar, i);
                C69822d dVar4 = C70101a.f186843k;
                lVar = bpVar;
            }
        } else {
            lVar = agVar.mo25877b(uVar, tVar.mo16918f(14), zVar, chVar, g, tVar.mo60253j());
        }
        C69934ao aoVar = new C69934ao(lVar.mo61650h(new C20789ab(chVar), C69840i.f186210c), new C21329ai(new C20790ac(chVar)));
        C69822d dVar5 = C70101a.f186843k;
        C69822d dVar6 = C70101a.f186843k;
        Objects.requireNonNull(chVar);
        return aoVar.mo61650h(C69840i.f186211d, new C20791ad(chVar));
    }
}
