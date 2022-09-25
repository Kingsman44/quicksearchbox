package p5304e.p5305a.p5306a.p5411p.p5416c.p5417a;

import android.util.Base64;
import com.google.android.apps.search.googleapp.discover.p10249z.C135337c;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.p.c.a.w */
/* compiled from: PG */
public final /* synthetic */ class C69102w implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C135337c cVar = (C135337c) C62942bv.parseFrom((C62942bv) C135337c.f368734c, Base64.decode("CAs", 3));
            C58838bb.m90866a(cVar, "use Optional.orNull() instead of Optional.or(null)");
            return cVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
