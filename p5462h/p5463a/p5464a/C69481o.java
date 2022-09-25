package p5462h.p5463a.p5464a;

import java.io.Externalizable;
import java.io.ObjectOutput;
import java.util.Collection;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.a.o */
/* compiled from: PG */
public final class C69481o implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private Collection f185910a;

    /* renamed from: b */
    private final int f185911b;

    public C69481o() {
        throw null;
    }

    public C69481o(Collection collection, int i) {
        this.f185910a = collection;
        this.f185911b = i;
    }

    private final Object readResolve() {
        return this.f185910a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: h.a.a.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void readExternal(java.io.ObjectInput r5) {
        /*
            r4 = this;
            java.lang.String r0 = "input"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            byte r0 = r5.readByte()
            r1 = r0 & 1
            r2 = r0 & -2
            r3 = 46
            if (r2 != 0) goto L_0x0060
            int r0 = r5.readInt()
            if (r0 < 0) goto L_0x0049
            r2 = 0
            if (r1 == 0) goto L_0x0031
            h.a.a.q r1 = new h.a.a.q
            r1.<init>(r0)
        L_0x001f:
            if (r2 >= r0) goto L_0x002b
            java.lang.Object r3 = r5.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L_0x001f
        L_0x002b:
            h.a.a.k r5 = r1.f185913a
            r5.mo61117j()
            goto L_0x0046
        L_0x0031:
            h.a.a.c r1 = new h.a.a.c
            r1.<init>(r0)
        L_0x0036:
            if (r2 >= r0) goto L_0x0042
            java.lang.Object r3 = r5.readObject()
            r1.add(r3)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0042:
            java.util.List r1 = p5462h.p5463a.C69540x.m100943a(r1)
        L_0x0046:
            r4.f185910a = r1
            return
        L_0x0049:
            java.io.InvalidObjectException r5 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal size value: "
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L_0x0060:
            java.io.InvalidObjectException r5 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported flags value: "
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            goto L_0x0078
        L_0x0077:
            throw r5
        L_0x0078:
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: p5462h.p5463a.p5464a.C69481o.readExternal(java.io.ObjectInput):void");
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        C69664n.m101061g(objectOutput, "output");
        objectOutput.writeByte(this.f185911b);
        objectOutput.writeInt(this.f185910a.size());
        for (Object writeObject : this.f185910a) {
            objectOutput.writeObject(writeObject);
        }
    }
}
