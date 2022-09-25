package p5462h.p5463a.p5464a;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.a.p */
/* compiled from: PG */
final class C69482p implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private Map f185912a;

    public C69482p() {
        throw null;
    }

    public C69482p(Map map) {
        this.f185912a = map;
    }

    private final Object readResolve() {
        return this.f185912a;
    }

    public final void readExternal(ObjectInput objectInput) {
        C69664n.m101061g(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                C69477k kVar = new C69477k(readInt);
                for (int i = 0; i < readInt; i++) {
                    kVar.put(objectInput.readObject(), objectInput.readObject());
                }
                this.f185912a = C69505av.m100861c(kVar);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        C69664n.m101061g(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f185912a.size());
        for (Map.Entry entry : this.f185912a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
