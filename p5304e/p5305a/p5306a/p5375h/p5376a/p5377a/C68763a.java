package p5304e.p5305a.p5306a.p5375h.p5376a.p5377a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import com.google.protos.p4985f.p4986a.C64710t;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.h.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C68763a implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C64710t tVar = (C64710t) C62942bv.parseFrom((C62942bv) C64710t.f175414b, Base64.decode("CgsIARIFYXVtdjEYARIGCAYYASgB", 3));
            C58838bb.m90866a(tVar, "use Optional.orNull() instead of Optional.or(null)");
            return tVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
