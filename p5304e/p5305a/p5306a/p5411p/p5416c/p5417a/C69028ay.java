package p5304e.p5305a.p5306a.p5411p.p5416c.p5417a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.protos.p5124m.p5125a.C65603f;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.p.c.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C69028ay implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C65603f fVar = (C65603f) C62942bv.parseFrom((C62942bv) C65603f.f178305b, Base64.decode("ChJORzNfU0NPUkVfQURKVVNURVIKFlRGX1RSSUdHRVJJTkdfQURKVVNURVIKG1RBUEFTX1NVR0dFU1RJT05TX1RSVU5DQVRPUg", 3));
            C58838bb.m90866a(fVar, "use Optional.orNull() instead of Optional.or(null)");
            return fVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
