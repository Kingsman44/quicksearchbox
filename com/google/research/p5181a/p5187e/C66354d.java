package com.google.research.p5181a.p5187e;

import com.google.common.base.C58832aw;
import com.google.research.p5181a.p5182a.C66291n;
import com.google.research.p5181a.p5183b.p5184a.C66307h;
import com.google.research.p5181a.p5185c.C66313d;
import com.google.research.p5181a.p5185c.C66315f;
import com.google.research.p5181a.p5185c.C66316g;
import com.google.research.p5181a.p5185c.C66318i;
import com.google.research.p5181a.p5185c.C66319j;
import com.google.research.p5181a.p5185c.C66320k;
import com.google.research.p5181a.p5185c.C66326q;
import com.google.research.p5181a.p5185c.C66327r;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.research.a.e.d */
/* compiled from: PG */
public final class C66354d extends C66374x {

    /* renamed from: a */
    protected final C66326q f180428a = new C66326q();

    /* renamed from: b */
    protected final C66316g f180429b;

    /* renamed from: c */
    protected final C66372v f180430c;

    /* renamed from: d */
    private final Set f180431d;

    public C66354d() {
        HashSet hashSet = new HashSet();
        this.f180431d = hashSet;
        hashSet.add("directShare");
        C66315f fVar = new C66315f();
        fVar.mo59522g(new C66319j());
        fVar.mo59522g(new C66313d());
        fVar.mo59522g(new C66320k());
        fVar.mo59522g(new C66318i());
        fVar.mo59522g(new C66327r());
        this.f180429b = fVar;
        C66315f fVar2 = fVar;
        this.f180430c = new C66358h(fVar.f180327a + 9);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59576a(C66376a aVar) {
        List c = aVar.mo59466i().mo59480c();
        for (int i = 0; i < c.size(); i++) {
            if (C58832aw.m90831a(aVar.mo59460c(), C66291n.m96856b((C66307h) c.get(i), aVar.mo59466i().mo59478a()))) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C66343o mo59577b(C66376a aVar) {
        return C66291n.m96857c(this.f180428a.mo59530b(this.f180447l.f180433a, aVar), this.f180429b.mo59527p(this.f180447l.f180433a, aVar));
    }

    /* renamed from: d */
    public final C66372v mo59578d() {
        return this.f180430c;
    }

    /* renamed from: e */
    public final String mo59575e() {
        return "sharesheet_directshare_logistic_predictor";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final ArrayList mo59579f(C66376a aVar, float[] fArr) {
        List c = aVar.mo59466i().mo59480c();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c.size(); i++) {
            arrayList.add(new C66366p(C66291n.m96856b((C66307h) aVar.mo59466i().mo59480c().get(i), aVar.mo59466i().mo59478a()), fArr[i], this.f180431d));
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo59580g(DataInputStream dataInputStream, C66376a aVar) {
        this.f180430c.mo59585a(dataInputStream);
        String readUTF = dataInputStream.readUTF();
        if (!readUTF.equals("sharesheet_directshare_logistic_predictor")) {
            throw new IOException("Inconsistent ending: [" + readUTF + "] expected: [sharesheet_directshare_logistic_predictor]");
        }
    }

    /* renamed from: h */
    public final void mo59581h(DataOutputStream dataOutputStream) {
        this.f180430c.mo59587c(dataOutputStream);
        dataOutputStream.writeUTF("sharesheet_directshare_logistic_predictor");
    }

    /* renamed from: i */
    public final boolean mo59582i(C66376a aVar) {
        return aVar.mo59463f() == 10 && aVar.mo59466i().mo59478a().equals("direct_share");
    }
}
