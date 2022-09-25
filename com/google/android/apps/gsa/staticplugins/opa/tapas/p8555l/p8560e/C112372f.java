package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112297a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112298b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112299c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.p8561a.C112300d;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.research.p5181a.p5185c.C66316g;
import com.google.research.p5181a.p5186d.C66340l;
import com.google.research.p5181a.p5186d.C66343o;
import com.google.research.p5181a.p5186d.C66344p;
import com.google.research.p5181a.p5186d.C66346r;
import com.google.research.p5181a.p5187e.C66359i;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Comparator;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.f */
/* compiled from: PG */
public final class C112372f extends C66359i {

    /* renamed from: a */
    public static final Comparator f311800a = Comparator.EL.reversed(Comparator.CC.comparing(C112371e.f311799a));

    /* renamed from: b */
    public C48668ac f311801b;

    public C112372f() {
        C48668ac acVar = C48668ac.UNSPECIFIED_REFLECTION_PREDICTOR;
        throw null;
    }

    /* renamed from: o */
    private static C112299c m186228o() {
        C112299c g = C112299c.m186142g();
        g.mo99489h(new C112300d());
        g.mo99489h(new C112297a());
        g.mo99489h(new C112298b());
        return g;
    }

    /* renamed from: e */
    public final String mo59575e() {
        return this.f311801b.name();
    }

    /* renamed from: g */
    public final void mo59580g(DataInputStream dataInputStream, C66376a aVar) {
        C112299c cVar = new C112299c();
        cVar.mo59514i(dataInputStream);
        int e = cVar.mo99487e();
        C112299c o = m186228o();
        for (int i = e; i < o.f311638a.size(); i++) {
            cVar.mo99489h((C66316g) o.f311638a.get(i));
        }
        int i2 = cVar.mo99487e() > e ? cVar.f311640c : -1;
        cVar.f311639b = this;
        this.f180442i = new C66344p(1);
        if (i2 != -1) {
            this.f180442i.mo59566e(dataInputStream, i2);
        } else {
            this.f180442i.mo59566e(dataInputStream, -1);
        }
        C58976aa aaVar = C58975e.f156826a;
        if (this.f180442i.mo59561a() == cVar.f311640c) {
            int i3 = this.f180442i.mo59562b().f180369j;
            this.f180426h = i3;
            this.f180444k = new C66343o(1, i3);
            this.f311801b = C48668ac.m85255a(dataInputStream.readUTF());
            return;
        }
        int a = this.f180442i.mo59561a();
        int i4 = cVar.f311640c;
        throw new IOException("Model to be loaded has an inconsistent input size:" + a + " != " + i4);
    }

    /* renamed from: h */
    public final void mo59581h(DataOutputStream dataOutputStream) {
        this.f180443j.mo59516k(dataOutputStream);
        this.f180442i.mo59567f(dataOutputStream);
        dataOutputStream.writeUTF(this.f311801b.name());
    }

    /* renamed from: i */
    public final boolean mo59582i(C66376a aVar) {
        return aVar.mo59463f() == 6;
    }

    public C112372f(C48668ac acVar, int i, int i2, float f) {
        super(m186228o());
        this.f311801b = acVar;
        this.f180444k = new C66343o(1, i);
        this.f180442i = new C66344p(1);
        this.f180442i.mo59565d(new C66340l(1, this.f180443j.mo59505a(), i2, f));
        this.f180442i.mo59565d(new C66346r(i2, i));
    }
}
