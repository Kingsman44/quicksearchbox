package p5304e.p5305a.p5306a.p5337ai.p5338a.p5339a;

import android.util.Base64;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import p5304e.p5305a.p5306a.p5340aj.p5341a.p5342a.C68435b;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.ai.a.a.x */
/* compiled from: PG */
public final /* synthetic */ class C68432x implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C68435b bVar = (C68435b) C62942bv.parseFrom((C62942bv) C68435b.f184757a, Base64.decode("CjsKCmdvb2dsZS5jb20KDWdvb2dsZS5jb20uaGsSBnNlYXJjaBIIbS9zZWFyY2gSBXdlYmhwEgVpbWdocA", 3));
            C58838bb.m90866a(bVar, "use Optional.orNull() instead of Optional.or(null)");
            return bVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
