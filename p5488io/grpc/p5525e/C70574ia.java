package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p5488io.grpc.C70137aa;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70272ca;
import p5488io.grpc.C70275cd;
import p5488io.grpc.C70276ce;
import p5488io.grpc.C70278cg;
import p5488io.grpc.C70279ch;
import p5488io.grpc.C70282ck;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ia */
/* compiled from: PG */
final class C70574ia extends C70282ck {

    /* renamed from: b */
    public final C70275cd f188145b;

    /* renamed from: c */
    private C70279ch f188146c;

    public C70574ia(C70275cd cdVar) {
        this.f188145b = cdVar;
    }

    /* renamed from: a */
    public final void mo61959a(Status status) {
        C70279ch chVar = this.f188146c;
        if (chVar != null) {
            chVar.mo61954e();
            this.f188146c = null;
        }
        this.f188145b.mo61943c(C70137aa.TRANSIENT_FAILURE, new C70570hx(C70276ce.m102450b(status)));
    }

    /* renamed from: b */
    public final void mo61960b(C70278cg cgVar) {
        List list = cgVar.f187351a;
        C70279ch chVar = this.f188146c;
        if (chVar == null) {
            C58838bb.m90869d(!list.isEmpty(), "addrs is empty");
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            C70279ch a = this.f188145b.mo61941a(C70272ca.m102444a(unmodifiableList, C70256c.f187254a, (Object[][]) Array.newInstance(Object.class, new int[]{0, 2})));
            a.mo61955f(new C70569hw(this, a));
            this.f188146c = a;
            this.f188145b.mo61943c(C70137aa.CONNECTING, new C70570hx(C70276ce.m102451c(a)));
            a.mo61953d();
            return;
        }
        chVar.mo61956g(list);
    }

    /* renamed from: c */
    public final void mo61961c() {
        C70279ch chVar = this.f188146c;
        if (chVar != null) {
            chVar.mo61954e();
        }
    }
}
