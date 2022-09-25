package p5304e.p5305a.p5306a.p5411p.p5416c.p5417a;

import android.util.Base64;
import com.google.android.libraries.assistant.p1594s.p1597b.C19149aj;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.p.c.a.aw */
/* compiled from: PG */
public final /* synthetic */ class C69026aw implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C19149aj ajVar = (C19149aj) C62942bv.parseFrom((C62942bv) C19149aj.f53636b, Base64.decode("CgQIIBAF", 3));
            C58838bb.m90866a(ajVar, "use Optional.orNull() instead of Optional.or(null)");
            return ajVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
