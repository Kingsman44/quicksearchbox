package com.google.android.apps.gsa.staticplugins.p7714cv.p7724h;

import com.google.android.apps.gsa.shared.speech.C90532c;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.C90604l;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66582bh;
import com.google.speech.p5208h.C66584bj;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66624cv;
import com.google.speech.p5224k.p5225a.C67186ad;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67464l;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.h.d */
/* compiled from: PG */
public abstract class C98777d implements C98784k {

    /* renamed from: a */
    private static final C59071e f275929a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.h.d");

    /* renamed from: a */
    public abstract C90603k mo91298a(C66611ci ciVar);

    /* renamed from: b */
    public final C90603k mo91299b(C66611ci ciVar, C90536a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C62940bt r0 = C62942bv.checkIsLite(C67238p.f182737f);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C67238p.f182737f);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj5 = r02.f169969b;
            } else {
                obj5 = r02.mo58889c(l);
            }
            C67238p pVar = (C67238p) obj5;
            int i = pVar.f182740b;
            boolean z = false;
            boolean z2 = i == 1;
            if (i == 2) {
                z = true;
            }
            if (z2 == z) {
                ((C59052c) ((C59052c) f275929a.mo56226d()).mo56372aa(31123)).mo56354G("Invalid response. Expecting exactly one recognition or %s %s ", "endpointer event:", ciVar);
            }
            if (pVar.f182740b == 2) {
                C67464l lVar = (C67464l) pVar.f182741c;
                return new C90532c(lVar, new C90607o(2, (byte[]) null, lVar.f183360c / 1000));
            }
        }
        C62940bt r03 = C62942bv.checkIsLite(C66624cv.f181248e);
        ciVar.mo58887l(r03);
        if (ciVar.f169962ag.mo58857o(r03.f169971d)) {
            C62940bt r8 = C62942bv.checkIsLite(C66624cv.f181248e);
            ciVar.mo58887l(r8);
            Object l2 = ciVar.f169962ag.mo58854l(r8.f169971d);
            if (l2 == null) {
                obj4 = r8.f169969b;
            } else {
                obj4 = r8.mo58889c(l2);
            }
            return new C98779f((C66624cv) obj4);
        }
        C62940bt r04 = C62942bv.checkIsLite(C67186ad.f182611f);
        ciVar.mo58887l(r04);
        Object l3 = ciVar.f169962ag.mo58854l(r04.f169971d);
        if (l3 == null) {
            obj = r04.f169969b;
        } else {
            obj = r04.mo58889c(l3);
        }
        C67186ad adVar = (C67186ad) obj;
        if (aVar == C90536a.PRONUNCIATION_LEARNING) {
            C62940bt r82 = C62942bv.checkIsLite(C66584bj.f181116d);
            ciVar.mo58887l(r82);
            if (ciVar.f169962ag.mo58857o(r82.f169971d)) {
                C62940bt r83 = C62942bv.checkIsLite(C66584bj.f181116d);
                ciVar.mo58887l(r83);
                Object l4 = ciVar.f169962ag.mo58854l(r83.f169971d);
                if (l4 == null) {
                    obj3 = r83.f169969b;
                } else {
                    obj3 = r83.mo58889c(l4);
                }
                return new C98783j((C66584bj) obj3);
            }
            C62940bt r84 = C62942bv.checkIsLite(C67186ad.f182611f);
            ciVar.mo58887l(r84);
            if (ciVar.f169962ag.mo58857o(r84.f169971d)) {
                return new C98783j(adVar);
            }
            C62940bt r85 = C62942bv.checkIsLite(C66582bh.f181110d);
            ciVar.mo58887l(r85);
            if (ciVar.f169962ag.mo58857o(r85.f169971d)) {
                C62940bt r86 = C62942bv.checkIsLite(C66582bh.f181110d);
                ciVar.mo58887l(r86);
                Object l5 = ciVar.f169962ag.mo58854l(r86.f169971d);
                if (l5 == null) {
                    obj2 = r86.f169969b;
                } else {
                    obj2 = r86.mo58889c(l5);
                }
                return new C98783j((C66582bh) obj2);
            }
        } else {
            C62940bt r87 = C62942bv.checkIsLite(C67186ad.f182611f);
            ciVar.mo58887l(r87);
            if (ciVar.f169962ag.mo58857o(r87.f169971d)) {
                return new C98785l(adVar);
            }
        }
        C90603k a = mo91298a(ciVar);
        return a != null ? a : new C90604l(2, ciVar);
    }
}
