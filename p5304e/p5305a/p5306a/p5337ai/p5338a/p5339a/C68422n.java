package p5304e.p5305a.p5306a.p5337ai.p5338a.p5339a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.ai.a.a.n */
/* compiled from: PG */
public final /* synthetic */ class C68422n implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C62910ar arVar = (C62910ar) C62942bv.parseFrom((C62942bv) C62910ar.f169858c, Base64.decode("CAo", 3));
            C58838bb.m90866a(arVar, "use Optional.orNull() instead of Optional.or(null)");
            return arVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
