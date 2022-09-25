package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113385dz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113391eb;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113393ed;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113397eh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113399ej;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54846bl;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54847bm;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54851bq;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54918i;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54922m;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54932w;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.az */
/* compiled from: PG */
class C112173az implements Function {

    /* renamed from: a */
    private final Function f311429a;

    public C112173az(Function function) {
        this.f311429a = function;
    }

    /* renamed from: a */
    public final C54847bm apply(C113397eh ehVar) {
        C54846bl blVar = (C54846bl) C54847bm.f144016f.createBuilder();
        if ((ehVar.f314002a & 1) != 0) {
            Function function = C112289du.f311625a;
            C113391eb ebVar = ehVar.f314003b;
            if (ebVar == null) {
                ebVar = C113391eb.f313979e;
            }
            C54922m a = ((C112645k) function).apply(ebVar);
            blVar.copyOnWrite();
            C54847bm bmVar = (C54847bm) blVar.instance;
            a.getClass();
            bmVar.f144019b = a;
            bmVar.f144018a |= 1;
        }
        if ((ehVar.f314002a & 2) != 0) {
            Function function2 = this.f311429a;
            C113385dz dzVar = ehVar.f314004c;
            if (dzVar == null) {
                dzVar = C113385dz.f313932h;
            }
            C54918i a2 = ((C112221c) function2).apply(dzVar);
            blVar.copyOnWrite();
            C54847bm bmVar2 = (C54847bm) blVar.instance;
            a2.getClass();
            bmVar2.f144020c = a2;
            bmVar2.f144018a |= 2;
        }
        if ((ehVar.f314002a & 4) != 0) {
            Function function3 = C112289du.f311627c;
            C113399ej ejVar = ehVar.f314005d;
            if (ejVar == null) {
                ejVar = C113399ej.f314007x;
            }
            C54851bq a3 = ((C112195ba) function3).apply(ejVar);
            blVar.copyOnWrite();
            C54847bm bmVar3 = (C54847bm) blVar.instance;
            a3.getClass();
            bmVar3.f144021d = a3;
            bmVar3.f144018a |= 4;
        }
        if ((ehVar.f314002a & 8) != 0) {
            Function function4 = C112289du.f311626b;
            C113393ed edVar = ehVar.f314006e;
            if (edVar == null) {
                edVar = C113393ed.f313985i;
            }
            C54932w a4 = ((C112654t) function4).apply(edVar);
            blVar.copyOnWrite();
            C54847bm bmVar4 = (C54847bm) blVar.instance;
            a4.getClass();
            bmVar4.f144022e = a4;
            bmVar4.f144018a |= 8;
        }
        return (C54847bm) blVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
