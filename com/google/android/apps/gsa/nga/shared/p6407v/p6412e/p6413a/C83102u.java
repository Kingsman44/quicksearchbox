package com.google.android.apps.gsa.nga.shared.p6407v.p6412e.p6413a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82840cj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.e.a.u */
/* compiled from: PG */
public final class C83102u implements Function {

    /* renamed from: a */
    private final C83103v f226711a;

    /* renamed from: b */
    private final C83059am f226712b;

    /* renamed from: c */
    private final C83083bj f226713c;

    public C83102u(C83103v vVar, C83059am amVar, C83083bj bjVar) {
        this.f226711a = vVar;
        this.f226712b = amVar;
        this.f226713c = bjVar;
    }

    /* renamed from: a */
    public final C82843cm apply(C82843cm cmVar) {
        int i;
        C82841ck ckVar = (C82841ck) C82843cm.f225889f.createBuilder();
        boolean z = false;
        switch (cmVar.f225894d) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            i = 1;
        }
        ckVar.copyOnWrite();
        ((C82843cm) ckVar.instance).f225894d = C82840cj.m132412a(i);
        boolean z2 = cmVar.f225891a != null;
        Objects.requireNonNull(cmVar);
        C83096o oVar = new C83096o(cmVar);
        Objects.requireNonNull(ckVar);
        C83080bg.m132479c(z2, oVar, new C83097p(ckVar), this.f226711a);
        boolean z3 = cmVar.f225892b != null;
        Objects.requireNonNull(cmVar);
        C83098q qVar = new C83098q(cmVar);
        Objects.requireNonNull(ckVar);
        C83080bg.m132479c(z3, qVar, new C83099r(ckVar), this.f226712b);
        if (cmVar.f225895e != null) {
            z = true;
        }
        Objects.requireNonNull(cmVar);
        C83100s sVar = new C83100s(cmVar);
        Objects.requireNonNull(ckVar);
        C83080bg.m132479c(z, sVar, new C83101t(ckVar), this.f226713c);
        return (C82843cm) ckVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
