package p5304e.p5305a.p5306a.p5411p.p5416c.p5417a;

import android.util.Base64;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138475e;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.p.c.a.cn */
/* compiled from: PG */
public final /* synthetic */ class C69071cn implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C138475e eVar = (C138475e) C62942bv.parseFrom((C62942bv) C138475e.f376660b, Base64.decode("CgQIfRAA", 3));
            C58838bb.m90866a(eVar, "use Optional.orNull() instead of Optional.or(null)");
            return eVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
