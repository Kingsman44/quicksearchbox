package org.p5633c.p5634a.p5636b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.b.aa */
/* compiled from: PG */
final class C72155aa implements Serializable {
    private static final long serialVersionUID = -6212696554273812441L;

    /* renamed from: a */
    private transient C72288l f192016a;

    public C72155aa(C72288l lVar) {
        this.f192016a = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f192016a = (C72288l) objectInputStream.readObject();
    }

    private Object readResolve() {
        return C72156ab.m105789X(this.f192016a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.f192016a);
    }
}
