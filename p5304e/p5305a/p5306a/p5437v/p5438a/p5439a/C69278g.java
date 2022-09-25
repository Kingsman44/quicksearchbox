package p5304e.p5305a.p5306a.p5437v.p5438a.p5439a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.protos.p5124m.p5125a.C65599b;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.v.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C69278g implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C65599b bVar = (C65599b) C62942bv.parseFrom((C62942bv) C65599b.f178299b, Base64.decode("CgavDqMJrQw", 3));
            C58838bb.m90866a(bVar, "use Optional.orNull() instead of Optional.or(null)");
            return bVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
