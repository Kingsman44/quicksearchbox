package com.google.research.p5181a.p5185c;

import com.google.research.p5181a.p5182a.C66278a;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.research.a.c.f */
/* compiled from: PG */
public final class C66315f extends C66316g implements C66323n {

    /* renamed from: a */
    public int f180327a = 0;

    /* renamed from: b */
    private final List f180328b = new ArrayList();

    public C66315f() {
        this.f180330k.clear();
    }

    /* renamed from: a */
    public final int mo59505a() {
        return this.f180327a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C66343o mo59507c(C66278a aVar, C66376a aVar2) {
        C66343o oVar = new C66343o(1, this.f180327a);
        int i = 0;
        for (C66316g gVar : this.f180328b) {
            double[] dArr = gVar.mo59527p(aVar, aVar2).f180409c;
            for (int i2 = 0; i2 < dArr.length; i2++) {
                oVar.f180409c[i2 + i] = dArr[i2];
            }
            i += gVar.mo59505a();
        }
        return oVar;
    }

    /* renamed from: d */
    public final String mo59509d() {
        return "aggregator";
    }

    /* renamed from: e */
    public final int mo59520e() {
        return this.f180328b.size();
    }

    /* renamed from: f */
    public final C66315f clone() {
        C66315f fVar = new C66315f();
        for (C66316g b : this.f180328b) {
            fVar.mo59522g(b.clone());
        }
        return fVar;
    }

    /* renamed from: g */
    public final void mo59522g(C66316g gVar) {
        this.f180328b.add(gVar);
        gVar.mo59526l(this);
        this.f180327a += gVar.mo59505a();
    }

    /* renamed from: i */
    public final void mo59514i(DataInputStream dataInputStream) {
        this.f180328b.clear();
        int i = 0;
        this.f180327a = 0;
        int readInt = dataInputStream.readInt();
        while (i < readInt) {
            String readUTF = dataInputStream.readUTF();
            C66316g o = C66316g.m96951o(readUTF);
            if (o == null) {
                o = null;
            }
            if (o != null) {
                o.mo59514i(dataInputStream);
                mo59522g(o);
                i++;
            } else {
                throw new IOException("Cannot find extractor with ".concat(String.valueOf(readUTF)));
            }
        }
    }

    /* renamed from: j */
    public final void mo59523j(C66316g gVar, int i) {
        C66316g gVar2;
        Iterator it = this.f180328b.iterator();
        int i2 = 0;
        while (it.hasNext() && (gVar2 = (C66316g) it.next()) != gVar) {
            i2 += gVar2.mo59505a();
        }
        int i3 = i + i2;
        C66323n nVar = this.f180329j;
        if (nVar != null) {
            nVar.mo59523j(this, i3);
        }
    }

    /* renamed from: k */
    public final void mo59516k(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f180328b.size());
        for (C66316g gVar : this.f180328b) {
            dataOutputStream.writeUTF(C66316g.m96953s(gVar));
            gVar.mo59516k(dataOutputStream);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo59524m(boolean z) {
        for (C66316g gVar : this.f180328b) {
            this.f180330k.putAll(gVar.f180330k);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f180328b.size(); i++) {
            sb.append(((C66316g) this.f180328b.get(i)).toString());
        }
        return sb.toString();
    }
}
