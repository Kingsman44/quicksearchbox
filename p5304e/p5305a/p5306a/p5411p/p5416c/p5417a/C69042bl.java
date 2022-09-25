package p5304e.p5305a.p5306a.p5411p.p5416c.p5417a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.protos.p4880aq.C63728aq;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.p.c.a.bl */
/* compiled from: PG */
public final /* synthetic */ class C69042bl implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C63728aq aqVar = (C63728aq) C62942bv.parseFrom((C62942bv) C63728aq.f172294e, Base64.decode("EICY/80B", 3));
            C58838bb.m90866a(aqVar, "use Optional.orNull() instead of Optional.or(null)");
            return aqVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
