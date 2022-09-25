package com.google.research.p5181a.p5186d;

import com.google.common.p4535g.C59203do;
import com.google.research.p5181a.p5182a.C66278a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Arrays;

/* renamed from: com.google.research.a.d.e */
/* compiled from: PG */
public abstract class C66333e {

    /* renamed from: a */
    public static double f180360a = 0.1d;

    /* renamed from: b */
    C66278a f180361b;

    /* renamed from: c */
    public C66278a f180362c;

    /* renamed from: d */
    public C66278a f180363d;

    /* renamed from: e */
    C66343o f180364e;

    /* renamed from: f */
    public C66343o f180365f;

    /* renamed from: g */
    public C66343o f180366g;

    /* renamed from: h */
    public boolean f180367h;

    /* renamed from: i */
    int f180368i;

    /* renamed from: j */
    public int f180369j;

    /* renamed from: k */
    int f180370k;

    /* renamed from: l */
    boolean f180371l;

    public C66333e() {
    }

    public C66333e(int i, int i2) {
        this.f180361b = new C66278a(1, true);
        this.f180362c = new C66278a(1, true);
        this.f180363d = new C66278a(1, true);
        this.f180370k = 1;
        this.f180368i = i;
        this.f180369j = i2;
        this.f180371l = false;
        this.f180364e = new C66343o(1, i2);
        this.f180365f = new C66343o(1, i);
        this.f180366g = new C66343o(1, i2);
        Arrays.fill(this.f180365f.f180409c, C59203do.f157270a);
        Arrays.fill(this.f180366g.f180409c, C59203do.f157270a);
        Arrays.fill(this.f180364e.f180409c, C59203do.f157270a);
    }

    /* renamed from: a */
    public abstract C66333e clone();

    /* renamed from: b */
    public abstract String mo59533b();

    /* renamed from: c */
    public abstract void mo59534c(C66344p pVar, int i, C66343o oVar, C66343o oVar2, C66343o oVar3);

    /* renamed from: d */
    public void mo59536d() {
        this.f180361b.mo59450c();
        this.f180362c.mo59450c();
        this.f180363d.mo59450c();
    }

    /* renamed from: e */
    public void mo59537e() {
        Arrays.fill(this.f180365f.f180409c, C59203do.f157270a);
        Arrays.fill(this.f180366g.f180409c, C59203do.f157270a);
        Arrays.fill(this.f180364e.f180409c, C59203do.f157270a);
    }

    /* renamed from: f */
    public abstract void mo59538f();

    /* renamed from: g */
    public abstract C66343o mo59539g(boolean z, C66344p pVar, C66343o oVar);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo59540h(DataInputStream dataInputStream) {
        String readUTF = dataInputStream.readUTF();
        if (!readUTF.equals(mo59533b())) {
            throw new RuntimeException("Expected " + mo59533b() + " acquired " + readUTF);
        }
    }

    /* renamed from: i */
    public final void mo59541i(C66333e eVar) {
        int length = this.f180361b.f180249c.length;
        eVar.f180361b = new C66278a(length, true);
        eVar.f180362c = new C66278a(length, true);
        eVar.f180363d = new C66278a(length, true);
        eVar.f180368i = this.f180368i;
        eVar.f180369j = this.f180369j;
        eVar.f180370k = this.f180370k;
        eVar.f180371l = this.f180371l;
        eVar.f180364e = new C66343o(this.f180370k, this.f180369j);
        eVar.f180365f = new C66343o(this.f180370k, this.f180368i);
        eVar.f180366g = new C66343o(this.f180370k, this.f180369j);
        Arrays.fill(eVar.f180365f.f180409c, C59203do.f157270a);
        Arrays.fill(eVar.f180366g.f180409c, C59203do.f157270a);
        Arrays.fill(eVar.f180364e.f180409c, C59203do.f157270a);
    }

    /* renamed from: j */
    public void mo59542j(DataInputStream dataInputStream) {
        mo59544l(dataInputStream, -1);
    }

    /* renamed from: k */
    public void mo59543k(DataInputStream dataInputStream, int i) {
        mo59544l(dataInputStream, i);
    }

    /* renamed from: l */
    public final void mo59544l(DataInputStream dataInputStream, int i) {
        this.f180370k = dataInputStream.readInt();
        this.f180369j = dataInputStream.readInt();
        this.f180368i = dataInputStream.readInt();
        if (i != -1) {
            this.f180368i = i;
        }
        int readInt = dataInputStream.readInt();
        this.f180371l = dataInputStream.readBoolean();
        this.f180361b = new C66278a(readInt, true);
        this.f180362c = new C66278a(readInt, true);
        this.f180363d = new C66278a(readInt, true);
        this.f180364e = new C66343o(this.f180370k, this.f180369j);
        this.f180365f = new C66343o(this.f180370k, this.f180368i);
        this.f180366g = new C66343o(this.f180370k, this.f180369j);
        Arrays.fill(this.f180365f.f180409c, C59203do.f157270a);
        Arrays.fill(this.f180366g.f180409c, C59203do.f157270a);
        Arrays.fill(this.f180364e.f180409c, C59203do.f157270a);
    }

    /* renamed from: m */
    public void mo59545m(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f180370k);
        dataOutputStream.writeInt(this.f180369j);
        dataOutputStream.writeInt(this.f180368i);
        dataOutputStream.writeInt(this.f180361b.f180249c.length);
        dataOutputStream.writeBoolean(this.f180371l);
    }
}
