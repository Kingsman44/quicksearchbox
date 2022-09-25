package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79946au;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79974bv;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54864cc;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54893de;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54894df;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.u */
/* compiled from: PG */
class C112655u implements Function {
    /* renamed from: a */
    public final C54894df apply(C79974bv bvVar) {
        C54893de deVar = (C54893de) C54894df.f144233h.createBuilder();
        if ((bvVar.f219351a & 1) != 0) {
            boolean z = bvVar.f219352b;
            deVar.copyOnWrite();
            C54894df dfVar = (C54894df) deVar.instance;
            dfVar.f144235a |= 1;
            dfVar.f144236b = z;
        }
        if ((bvVar.f219351a & 2) != 0) {
            boolean z2 = bvVar.f219353c;
            deVar.copyOnWrite();
            C54894df dfVar2 = (C54894df) deVar.instance;
            dfVar2.f144235a |= 2;
            dfVar2.f144237c = z2;
        }
        if ((bvVar.f219351a & 4) != 0) {
            boolean z3 = bvVar.f219354d;
            deVar.copyOnWrite();
            C54894df dfVar3 = (C54894df) deVar.instance;
            dfVar3.f144235a |= 4;
            dfVar3.f144238d = z3;
        }
        if ((bvVar.f219351a & 8) != 0) {
            float f = bvVar.f219355e;
            deVar.copyOnWrite();
            C54894df dfVar4 = (C54894df) deVar.instance;
            dfVar4.f144235a |= 8;
            dfVar4.f144239e = f;
        }
        if ((bvVar.f219351a & 16) != 0) {
            float f2 = bvVar.f219356f;
            deVar.copyOnWrite();
            C54894df dfVar5 = (C54894df) deVar.instance;
            dfVar5.f144235a |= 16;
            dfVar5.f144240f = f2;
        }
        if ((bvVar.f219351a & 32) != 0) {
            Function function = C112237co.f311532a;
            C79946au auVar = bvVar.f219357g;
            if (auVar == null) {
                auVar = C79946au.f219229p;
            }
            C54864cc a = ((C112648n) function).apply(auVar);
            deVar.copyOnWrite();
            C54894df dfVar6 = (C54894df) deVar.instance;
            a.getClass();
            dfVar6.f144241g = a;
            dfVar6.f144235a |= 32;
        }
        return (C54894df) deVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
