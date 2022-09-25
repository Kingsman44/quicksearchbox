package p5304e.p5305a.p5306a.p5411p.p5416c.p5417a;

import android.util.Base64;
import com.google.android.apps.search.googleapp.discover.p10214s.C134593k;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.p.c.a.x */
/* compiled from: PG */
public final /* synthetic */ class C69103x implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C134593k kVar = (C134593k) C62942bv.parseFrom((C62942bv) C134593k.f366540a, Base64.decode("CgQIARABEgQIARAB", 3));
            C58838bb.m90866a(kVar, "use Optional.orNull() instead of Optional.or(null)");
            return kVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
