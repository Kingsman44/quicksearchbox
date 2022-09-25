package p5304e.p5305a.p5306a.p5369g.p5370a.p5371a.p5372a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.protos.p5124m.p5125a.C65603f;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.g.a.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C68601a implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C65603f fVar = (C65603f) C62942bv.parseFrom((C62942bv) C65603f.f178305b, Base64.decode("Cg1hcHBsZXQuSU5WT0tFChl1aS5TSE9XX1RUU19UUkFOU0NSSVBUSU9OChN1aS5FWElUX05BVElWRV9GT1JNChN1aS5TSE9XX1NVR0dFU1RJT05T", 3));
            C58838bb.m90866a(fVar, "use Optional.orNull() instead of Optional.or(null)");
            return fVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
