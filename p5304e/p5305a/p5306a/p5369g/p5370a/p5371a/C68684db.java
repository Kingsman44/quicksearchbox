package p5304e.p5305a.p5306a.p5369g.p5370a.p5371a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66859ce;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.g.a.a.db */
/* compiled from: PG */
public final /* synthetic */ class C68684db implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C66859ce ceVar = (C66859ce) C62942bv.parseFrom((C62942bv) C66859ce.f181780b, Base64.decode("ChoIARIWCgxhbGFybS1zdGF0dXMSBkZJUklORwoaCAISFgoMdGltZXItc3RhdHVzEgZGSVJJTkcKHwgDEhsKCmNhbGwtc3RhdGUSDUNBTExfSU5DT01JTkc", 3));
            C58838bb.m90866a(ceVar, "use Optional.orNull() instead of Optional.or(null)");
            return ceVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
