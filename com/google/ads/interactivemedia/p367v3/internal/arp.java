package com.google.ads.interactivemedia.p367v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arp */
/* compiled from: PG */
public class arp extends arv implements asa {
    private static final long serialVersionUID = 0;

    public arp(ars ars, int i) {
        super(ars);
    }

    /* renamed from: b */
    public static aro m19420b() {
        return new aro();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            arq c = ars.m19429c();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    ark r = arn.m19409r();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        r.mo15288d(objectInputStream.readObject());
                    }
                    c.mo15311b(readObject, r.mo15287c());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                aru.f21465a.mo15357a(this, c.mo15310a());
                aru.f21466b.mo15358b(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(mo15176a().size());
        for (Map.Entry entry : mo15176a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    /* renamed from: c */
    public final arn mo15309c(Object obj) {
        arn arn = (arn) this.f21467b.get(obj);
        return arn == null ? arn.m19402i() : arn;
    }
}
