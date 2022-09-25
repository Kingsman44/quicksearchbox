package p5304e.p5305a.p5306a.p5369g.p5373b.p5374a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.protos.p5127o.C65676bd;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.g.b.a.ak */
/* compiled from: PG */
public final /* synthetic */ class C68722ak implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C65676bd bdVar = (C65676bd) C62942bv.parseFrom((C62942bv) C65676bd.f178447a, Base64.decode("CgZjdXN0b20QCw", 3));
            C58838bb.m90866a(bdVar, "use Optional.orNull() instead of Optional.or(null)");
            return bdVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
