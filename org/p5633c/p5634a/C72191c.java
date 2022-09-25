package org.p5633c.p5634a;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.p5633c.p5634a.p5638d.C72211a;

/* renamed from: org.c.a.c */
/* compiled from: PG */
public final class C72191c extends C72211a {
    private static final long serialVersionUID = -6983323811635733510L;

    /* renamed from: a */
    private C72210d f192155a;

    /* renamed from: b */
    private C72233e f192156b;

    public C72191c(C72210d dVar, C72233e eVar) {
        this.f192155a = dVar;
        this.f192156b = eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f192155a = (C72210d) objectInputStream.readObject();
        this.f192156b = ((C72283g) objectInputStream.readObject()).mo63646a(this.f192155a.f191963b);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.f192155a);
        objectOutputStream.writeObject(this.f192156b.mo63563z());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo63525a() {
        return this.f192155a.f191962a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C72132a mo63526b() {
        return this.f192155a.f191963b;
    }

    /* renamed from: c */
    public final C72210d mo63527c() {
        C72210d dVar = this.f192155a;
        return dVar.mo63546d(this.f192156b.mo63453p(dVar.f191962a));
    }

    /* renamed from: d */
    public final C72233e mo63528d() {
        return this.f192156b;
    }
}
