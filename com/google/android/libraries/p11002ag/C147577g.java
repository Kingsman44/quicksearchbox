package com.google.android.libraries.p11002ag;

import com.evernote.android.state.BuildConfig;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.ag.g */
/* compiled from: PG */
public final class C147577g implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public String f398299a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f398300b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f398301c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f398302d = false;

    /* renamed from: e */
    public boolean f398303e;

    /* renamed from: f */
    private final List f398304f = new ArrayList();

    /* renamed from: g */
    private boolean f398305g;

    /* renamed from: h */
    private String f398306h = BuildConfig.FLAVOR;

    /* renamed from: a */
    public final int mo124332a() {
        return this.f398304f.size();
    }

    /* renamed from: b */
    public final String mo124333b(int i) {
        return (String) this.f398304f.get(i);
    }

    public final void readExternal(ObjectInput objectInput) {
        this.f398299a = objectInput.readUTF();
        this.f398300b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f398304f.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f398305g = true;
            this.f398301c = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f398303e = true;
            this.f398306h = readUTF2;
        }
        this.f398302d = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f398299a);
        objectOutput.writeUTF(this.f398300b);
        int a = mo124332a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutput.writeUTF((String) this.f398304f.get(i));
        }
        objectOutput.writeBoolean(this.f398305g);
        if (this.f398305g) {
            objectOutput.writeUTF(this.f398301c);
        }
        objectOutput.writeBoolean(this.f398303e);
        if (this.f398303e) {
            objectOutput.writeUTF(this.f398306h);
        }
        objectOutput.writeBoolean(this.f398302d);
    }
}
