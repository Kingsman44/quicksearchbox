package com.google.common.p4520a;

import com.google.common.util.concurrent.C60916ec;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.common.a.ak */
/* compiled from: PG */
public final class C58204ak extends C58206am implements C58259n {
    private static final long serialVersionUID = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58204ak(C58254i iVar, C58257l lVar) {
        super(new C58234bn(iVar, lVar));
        lVar.getClass();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    /* renamed from: a */
    public final Object mo54699a(Object obj) {
        try {
            C58234bn bnVar = this.f155647a;
            return bnVar.mo54791e(obj, bnVar.f155752u);
        } catch (ExecutionException e) {
            throw new C60916ec(e.getCause());
        }
    }

    public final Object apply(Object obj) {
        return mo54699a(obj);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58201ah(this.f155647a);
    }
}
