package com.google.android.libraries.p11002ag;

import com.evernote.android.state.BuildConfig;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.ag.k */
/* compiled from: PG */
public final class C147581k implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public String f398363a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public final List f398364b = new ArrayList();

    /* renamed from: c */
    public final List f398365c = new ArrayList();

    /* renamed from: d */
    private boolean f398366d;

    /* renamed from: e */
    private boolean f398367e;

    /* renamed from: f */
    private String f398368f = BuildConfig.FLAVOR;

    /* renamed from: a */
    public final int mo124343a() {
        return this.f398364b.size();
    }

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f398366d = true;
            this.f398363a = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f398364b.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f398365c.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f398367e = true;
            this.f398368f = readUTF2;
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f398366d);
        if (this.f398366d) {
            objectOutput.writeUTF(this.f398363a);
        }
        int a = mo124343a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutput.writeInt(((Integer) this.f398364b.get(i)).intValue());
        }
        int size = this.f398365c.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            objectOutput.writeInt(((Integer) this.f398365c.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.f398367e);
        if (this.f398367e) {
            objectOutput.writeUTF(this.f398368f);
        }
    }
}
