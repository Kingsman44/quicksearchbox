package org.p5633c.p5634a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.p5633c.p5634a.p5638d.C72211a;

/* renamed from: org.c.a.z */
/* compiled from: PG */
public final class C72302z extends C72211a {
    private static final long serialVersionUID = -4481126543819298617L;

    /* renamed from: a */
    public C72143aa f192466a;

    /* renamed from: b */
    public C72233e f192467b;

    public C72302z(C72143aa aaVar, C72233e eVar) {
        this.f192466a = aaVar;
        this.f192467b = eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f192466a = (C72143aa) objectInputStream.readObject();
        this.f192467b = ((C72283g) objectInputStream.readObject()).mo63646a(this.f192466a.f191963b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.f192466a);
        objectOutputStream.writeObject(this.f192467b.mo63563z());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo63525a() {
        return this.f192466a.f191962a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C72132a mo63526b() {
        return this.f192466a.f191963b;
    }

    /* renamed from: d */
    public final C72233e mo63528d() {
        return this.f192467b;
    }
}
