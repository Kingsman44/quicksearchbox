package com.google.research.p5181a.p5186d;

import com.google.research.p5181a.p5182a.C66278a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.research.a.d.p */
/* compiled from: PG */
public final class C66344p {

    /* renamed from: a */
    public final C66278a f180410a;

    /* renamed from: b */
    public final C66278a f180411b;

    /* renamed from: c */
    public final List f180412c = new ArrayList();

    public C66344p(int i) {
        this.f180410a = new C66278a(i, true);
        this.f180411b = new C66278a(i, true);
    }

    /* renamed from: a */
    public final int mo59561a() {
        return ((C66333e) this.f180412c.get(0)).f180368i;
    }

    /* renamed from: b */
    public final C66333e mo59562b() {
        List list = this.f180412c;
        return (C66333e) list.get(list.size() - 1);
    }

    /* renamed from: c */
    public final C66344p clone() {
        C66344p pVar = new C66344p(this.f180410a.f180249c.length);
        for (C66333e a : this.f180412c) {
            pVar.f180412c.add(a.clone());
        }
        return pVar;
    }

    /* renamed from: d */
    public final void mo59565d(C66333e eVar) {
        if (eVar.f180361b.f180249c.length != this.f180410a.f180249c.length) {
            throw new RuntimeException("Inconsistent framebuffer size with the added layer: targetsize=" + this.f180410a.f180249c.length + " layerbuffersize=" + eVar.f180361b.f180249c.length);
        } else if (((C66340l) eVar).f180397u != this.f180412c.size()) {
            this.f180412c.add(eVar);
        } else {
            throw new RuntimeException();
        }
    }

    /* renamed from: e */
    public final void mo59566e(DataInputStream dataInputStream, int i) {
        C66333e eVar;
        this.f180412c.clear();
        int readInt = dataInputStream.readInt();
        int i2 = 0;
        while (i2 < readInt) {
            String readUTF = dataInputStream.readUTF();
            if (readUTF.equals("LinearLayer")) {
                eVar = new C66340l();
            } else if (readUTF.equals("OutputLayer")) {
                eVar = new C66346r();
            } else if (readUTF.equals("LSTMLayer")) {
                eVar = new C66332d();
            } else {
                throw new IOException("Unsupported layer type: ".concat(String.valueOf(readUTF)));
            }
            if (i2 == 0) {
                if (i != -1) {
                    eVar.mo59543k(dataInputStream, i);
                    i2 = 0;
                    this.f180412c.add(eVar);
                    i2++;
                } else {
                    i2 = 0;
                }
            }
            eVar.mo59542j(dataInputStream);
            this.f180412c.add(eVar);
            i2++;
        }
        String readUTF2 = dataInputStream.readUTF();
        if (!readUTF2.equals("NeuralNet")) {
            throw new IOException("Inconsistent ending: [" + readUTF2 + "] expected: [NeuralNet]");
        }
    }

    /* renamed from: f */
    public final void mo59567f(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f180412c.size());
        for (C66333e eVar : this.f180412c) {
            dataOutputStream.writeUTF(eVar.mo59533b());
            eVar.mo59545m(dataOutputStream);
        }
        dataOutputStream.writeUTF("NeuralNet");
    }

    /* renamed from: g */
    public final C66343o mo59568g(boolean z, C66343o oVar) {
        List list = this.f180412c;
        if (list.get(list.size() - 1) instanceof C66346r) {
            C66343o oVar2 = null;
            int i = 0;
            while (i < this.f180412c.size()) {
                oVar2 = ((C66333e) this.f180412c.get(i)).mo59539g(z, this, oVar);
                i++;
                oVar = oVar2;
            }
            return oVar2;
        }
        throw new RuntimeException("Lacks outputlayer");
    }
}
