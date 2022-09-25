package com.google.common.p4520a;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.Callable;

/* renamed from: com.google.common.a.am */
/* compiled from: PG */
public class C58206am implements Serializable, C58247c {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final C58234bn f155647a;

    public C58206am(C58234bn bnVar) {
        this.f155647a = bnVar;
    }

    public C58206am(C58254i iVar) {
        this.f155647a = new C58234bn(iVar, (C58257l) null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    /* renamed from: c */
    public final void mo54713c() {
        for (C58210aq k : this.f155647a.f155737f) {
            k.mo54747k();
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58207an(this.f155647a);
    }

    /* renamed from: b */
    public final Object mo54712b(Object obj, Callable callable) {
        callable.getClass();
        return this.f155647a.mo54791e(obj, new C58205al(callable));
    }

    /* renamed from: d */
    public final void mo54714d(Object obj) {
        obj.getClass();
        this.f155647a.remove(obj);
    }
}
