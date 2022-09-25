package p5304e.p5305a.p5306a.p5411p.p5416c.p5417a;

import android.util.Base64;
import com.google.android.libraries.assistant.p1594s.p1597b.C19153an;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.p.c.a.az */
/* compiled from: PG */
public final /* synthetic */ class C69029az implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C19153an anVar = (C19153an) C62942bv.parseFrom((C62942bv) C19153an.f53644b, Base64.decode("CgQIARAFCgQIEhAF", 3));
            C58838bb.m90866a(anVar, "use Optional.orNull() instead of Optional.or(null)");
            return anVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
