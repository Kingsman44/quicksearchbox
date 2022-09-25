package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.common.base.C58832aw;
import com.google.p4152bb.p4153a.C55213ka;

/* compiled from: PG */
public abstract class SingleValueArgument extends Argument {

    /* renamed from: n */
    public Object f236203n;

    protected SingleValueArgument(SingleValueArgument singleValueArgument, Object obj, int i) {
        super((Argument) singleValueArgument, i);
        mo81261hz(obj);
    }

    /* renamed from: C */
    public boolean mo81263C() {
        return this.f236203n != null;
    }

    /* renamed from: P */
    public final void mo81334P(Object obj) {
        boolean C = mo81263C();
        int j = mo81275j();
        SingleValueArgument singleValueArgument = (SingleValueArgument) mo81278m(this.f236140a);
        ModularAction modularAction = this.f236144e;
        if (modularAction != null) {
            singleValueArgument.mo81290y(modularAction);
        }
        mo81261hz(obj);
        boolean z = !Argument.m141690A(this, singleValueArgument);
        if (C != mo81263C()) {
            for (C87439c b : super.mo81285t()) {
                b.mo81351b();
            }
        } else if (j != mo81275j()) {
            mo81289x();
        } else if (z) {
            mo81287v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hA */
    public boolean mo81259hA(Argument argument) {
        if (!(argument instanceof SingleValueArgument)) {
            return false;
        }
        SingleValueArgument singleValueArgument = (SingleValueArgument) argument;
        if (!super.mo81259hA(argument) || !C58832aw.m90831a(this.f236203n, singleValueArgument.f236203n)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hz */
    public void mo81261hz(Object obj) {
        this.f236203n = obj;
    }

    protected SingleValueArgument(C55213ka kaVar, Object obj) {
        super(kaVar);
        mo81261hz(obj);
    }
}
