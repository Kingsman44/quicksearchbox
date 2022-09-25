package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.io.InputStream;
import p5488io.grpc.C70910y;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.j */
/* compiled from: PG */
public abstract class C70600j implements C70671lq {
    /* renamed from: d */
    public final void mo61758d() {
        if (!mo62156v().mo62174d()) {
            mo62156v().mo62172b();
        }
    }

    /* renamed from: f */
    public final void mo61760f() {
        mo61926s().mo62325n();
    }

    /* renamed from: g */
    public final void mo61761g(int i) {
        C70573i s = mo61926s();
        C70391bg bgVar = s.f188140o;
        int i2 = C69792b.f186180a;
        s.mo61922e(new C70546h(s, i));
    }

    /* renamed from: h */
    public final void mo61762h(C70910y yVar) {
        C70451dm v = mo62156v();
        C58838bb.m90866a(yVar, "compressor");
        v.mo62175e(yVar);
    }

    /* renamed from: n */
    public final void mo61768n(InputStream inputStream) {
        C58838bb.m90866a(inputStream, "message");
        try {
            if (!mo62156v().mo62174d()) {
                mo62156v().mo62173c(inputStream);
            }
        } finally {
            C70460dv.m102881i(inputStream);
        }
    }

    /* renamed from: o */
    public boolean mo61769o() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract C70573i mo61926s();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract C70451dm mo62156v();
}
