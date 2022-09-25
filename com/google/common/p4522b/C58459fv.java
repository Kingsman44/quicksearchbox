package com.google.common.p4522b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* renamed from: com.google.common.b.fv */
/* compiled from: PG */
public final class C58459fv extends C58460fw {
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    transient int f156087d = 2;

    public C58459fv() {
        super(new C58384da(12));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f156087d = 2;
        int readInt = objectInputStream.readInt();
        mo54918v(new C58384da(12));
        C58742qh.m90624c(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C58742qh.m90627f(this, objectOutputStream);
    }

    /* renamed from: a */
    public final /* synthetic */ Collection mo54900a() {
        return new C58386dc(this.f156087d);
    }

    public C58459fv(C58671nr nrVar) {
        super(new C58384da(nrVar.mo54951D().size()));
        mo54955H(nrVar);
    }
}
