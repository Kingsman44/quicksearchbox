package p5304e.p5305a.p5306a.p5431u.p5432a.p5433a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.protos.p5124m.p5125a.C65603f;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.u.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C69231w implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C65603f fVar = (C65603f) C62942bv.parseFrom((C62942bv) C65603f.f178305b, Base64.decode("CiVjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy55b3V0dWJlLm11c2ljChFjb20uc3BvdGlmeS5tdXNpYwoTY29tLnBhbmRvcmEuYW5kcm9pZA", 3));
            C58838bb.m90866a(fVar, "use Optional.orNull() instead of Optional.or(null)");
            return fVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
