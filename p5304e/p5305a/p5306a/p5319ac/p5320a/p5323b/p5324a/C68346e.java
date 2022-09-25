package p5304e.p5305a.p5306a.p5319ac.p5320a.p5323b.p5324a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.p5261vr.p5266c9.p5267a.C67942d;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.ac.a.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C68346e implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C67942d dVar = (C67942d) C62942bv.parseFrom((C62942bv) C67942d.f184139a, Base64.decode("CAE", 3));
            C58838bb.m90866a(dVar, "use Optional.orNull() instead of Optional.or(null)");
            return dVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
