package com.google.android.apps.gsa.nga.engine.geniefm;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80410ab;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80430j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80435o;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80436p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80442v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80446z;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82846cp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82847cq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4887at.C63815b;

/* compiled from: PG */
public class GenieFmWrapper extends C79360j implements C76095a {

    /* renamed from: a */
    public static final C58974d f210977a = C58974d.m91136j();

    /* renamed from: b */
    public final C78007b f210978b;

    /* renamed from: c */
    private final C83334w f210979c;

    /* renamed from: d */
    private final C91142g f210980d;

    public GenieFmWrapper(C78007b bVar, C83334w wVar, C91142g gVar, C76092h hVar, C79359i iVar) {
        super(iVar, hVar);
        this.f210978b = bVar;
        this.f210979c = wVar;
        this.f210980d = gVar;
    }

    private native byte[] nativeCallGenie(byte[] bArr);

    private native byte[] nativeMarkStopwords(byte[] bArr);

    /* renamed from: a */
    public final C80436p mo72046a(C80434n nVar) {
        if (!mo71201gC()) {
            return null;
        }
        try {
            C80436p pVar = (C80436p) C62942bv.parseFrom((C62942bv) C80436p.f220766g, nativeCallGenie(nVar.toByteArray()), C62921ba.m95368a());
            C82846cp cpVar = (C82846cp) C82847cq.f225903d.createBuilder();
            cpVar.copyOnWrite();
            C82847cq cqVar = (C82847cq) cpVar.instance;
            nVar.getClass();
            cqVar.f225906b = nVar;
            cqVar.f225905a |= 1;
            if (pVar != null) {
                C80435o oVar = (C80435o) C80436p.f220766g.createBuilder();
                oVar.mo74328a(pVar.f220769b);
                C80430j jVar = pVar.f220771d;
                if (jVar == null) {
                    jVar = C80430j.f220746b;
                }
                oVar.copyOnWrite();
                C80436p pVar2 = (C80436p) oVar.instance;
                jVar.getClass();
                pVar2.f220771d = jVar;
                pVar2.f220768a |= 8;
                C80442v vVar = pVar.f220772e;
                if (vVar == null) {
                    vVar = C80442v.f220789e;
                }
                oVar.copyOnWrite();
                C80436p pVar3 = (C80436p) oVar.instance;
                vVar.getClass();
                pVar3.f220772e = vVar;
                pVar3.f220768a |= 16;
                if (this.f210980d.mo85405j(C90126fx.f251540kj)) {
                    C63815b bVar = pVar.f220770c;
                    if (bVar == null) {
                        bVar = C63815b.f172592a;
                    }
                    oVar.copyOnWrite();
                    C80436p pVar4 = (C80436p) oVar.instance;
                    bVar.getClass();
                    pVar4.f220770c = bVar;
                    pVar4.f220768a |= 2;
                }
                C80436p pVar5 = (C80436p) oVar.build();
                cpVar.copyOnWrite();
                C82847cq cqVar2 = (C82847cq) cpVar.instance;
                pVar5.getClass();
                cqVar2.f225907c = pVar5;
                cqVar2.f225905a |= 2;
            }
            C83334w wVar = this.f210979c;
            C82887ec ecVar = C82887ec.GENIE_REWRITE_SENSITIVE;
            C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
            dzVar.copyOnWrite();
            C82885ea eaVar = (C82885ea) dzVar.instance;
            C82847cq cqVar3 = (C82847cq) cpVar.build();
            cqVar3.getClass();
            eaVar.f225980b = cqVar3;
            eaVar.f225979a = 11;
            C82885ea eaVar2 = (C82885ea) dzVar.build();
            C83320io ioVar = nVar.f220764g;
            if (ioVar == null) {
                ioVar = C83320io.f227132d;
            }
            wVar.mo75545c(ecVar, eaVar2, ioVar);
            return pVar;
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f210977a.mo56225c()).mo56382g(e)).mo56372aa(3895)).mo56386p("Failed to parse protobuf from native code");
            return null;
        }
    }

    /* renamed from: b */
    public final C80410ab mo72047b(C80446z zVar) {
        try {
            return (C80410ab) C62942bv.parseFrom((C62942bv) C80410ab.f220683c, nativeMarkStopwords(zVar.toByteArray()), C62921ba.m95368a());
        } catch (C62974ct e) {
            ((C58970a) ((C58970a) ((C58970a) f210977a.mo56225c()).mo56382g(e)).mo56372aa(3896)).mo56386p("Failed to parse protobuf from native code");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "GenieFmWrapper";
    }

    public native void nativeFinishLoadingResources();

    public native void nativeLoadGpatRuleMap(byte[] bArr);

    public native void nativeLoadI18nResources(byte[] bArr);

    public native void nativeLoadPosTagsCounts(byte[] bArr);

    public native void nativeLoadTpatPatterns(byte[] bArr);

    public native void nativeLoadVerticalResources(byte[] bArr);

    public native void nativeStartLoadingResources();

    public native void nativeUnloadGenieFmResources();

    /* renamed from: o */
    public final int mo71205o() {
        return 22;
    }
}
