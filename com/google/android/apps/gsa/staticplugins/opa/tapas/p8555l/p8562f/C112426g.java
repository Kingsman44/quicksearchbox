package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8562f;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111029bz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113291bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl;
import java.util.Comparator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.f.g */
/* compiled from: PG */
public final /* synthetic */ class C112426g implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ C112427h f311909a;

    /* renamed from: b */
    public final /* synthetic */ Function f311910b;

    public /* synthetic */ C112426g(C112427h hVar, Function function) {
        this.f311909a = hVar;
        this.f311910b = function;
    }

    public final int compare(Object obj, Object obj2) {
        C112427h hVar = this.f311909a;
        Function function = this.f311910b;
        C113291bp bpVar = (C113291bp) obj;
        C113291bp bpVar2 = (C113291bp) obj2;
        if (((C111029bz) hVar.f311911a.mo27525b()).mo99020c().contains(bpVar.f313753a) && ((C111029bz) hVar.f311911a.mo27525b()).mo99020c().contains(bpVar2.f313753a)) {
            return Double.compare(((Double) function.apply(bpVar2)).doubleValue(), ((Double) function.apply(bpVar)).doubleValue());
        }
        int a = C113371dl.m187571a(bpVar2.f313753a);
        int a2 = C113371dl.m187571a(bpVar.f313753a);
        if (a == a2) {
            return 0;
        }
        return a < a2 ? -1 : 1;
    }
}
