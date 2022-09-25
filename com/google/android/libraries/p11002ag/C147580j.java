package com.google.android.libraries.p11002ag;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.ag.j */
/* compiled from: PG */
public final class C147580j implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final List f398362a = new ArrayList();

    public final void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            C147579i iVar = new C147579i();
            iVar.readExternal(objectInput);
            this.f398362a.add(iVar);
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        int size = this.f398362a.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((C147579i) this.f398362a.get(i)).writeExternal(objectOutput);
        }
    }
}
