package com.google.research.p5181a.p5187e;

import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.research.a.e.s */
/* compiled from: PG */
public final class C66369s extends C66370t {

    /* renamed from: e */
    private final Set f180460e;

    public C66369s() {
        HashSet hashSet = new HashSet();
        this.f180460e = hashSet;
        hashSet.add("softmaxAppShare");
        this.f180464d = new C66356f(this.f180461a);
    }

    /* renamed from: d */
    public final C66372v mo59578d() {
        return this.f180464d;
    }

    /* renamed from: e */
    public final String mo59575e() {
        return "sharesheet_shareapp_ltr_softmax_predictor";
    }

    /* renamed from: g */
    public final void mo59580g(DataInputStream dataInputStream, C66376a aVar) {
        this.f180464d.mo59585a(dataInputStream);
        String readUTF = dataInputStream.readUTF();
        if (!readUTF.equals("sharesheet_shareapp_ltr_softmax_predictor")) {
            throw new IOException("Inconsistent ending: [" + readUTF + "] expected: [sharesheet_shareapp_ltr_softmax_predictor]");
        }
    }

    /* renamed from: h */
    public final void mo59581h(DataOutputStream dataOutputStream) {
        this.f180464d.mo59587c(dataOutputStream);
        dataOutputStream.writeUTF("sharesheet_shareapp_ltr_softmax_predictor");
    }
}
