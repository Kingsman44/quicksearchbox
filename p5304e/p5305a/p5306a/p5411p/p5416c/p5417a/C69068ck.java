package p5304e.p5305a.p5306a.p5411p.p5416c.p5417a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.protos.p4948ba.C64388r;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.p.c.a.ck */
/* compiled from: PG */
public final /* synthetic */ class C69068ck implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C64388r rVar = (C64388r) C62942bv.parseFrom((C62942bv) C64388r.f174632b, Base64.decode("CgYIARD2vQYKBggCEPa9BgocCAcaGHNpZ25lZC1vdXQtY3VzdG9taXphdGlvbgoGCAoQ9r0GCgYICxD2vQY", 3));
            C58838bb.m90866a(rVar, "use Optional.orNull() instead of Optional.or(null)");
            return rVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
