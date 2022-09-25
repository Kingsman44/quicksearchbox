package p5304e.p5305a.p5306a.p5369g.p5373b.p5374a;

import android.util.Base64;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a.C131841b;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;

/* renamed from: e.a.a.g.b.a.m */
/* compiled from: PG */
public final /* synthetic */ class C68749m implements C69615a {
    /* renamed from: a */
    public final Object mo5672a() {
        try {
            C131841b bVar = (C131841b) C62942bv.parseFrom((C62942bv) C131841b.f360050b, Base64.decode("CAM", 3));
            C58838bb.m90866a(bVar, "use Optional.orNull() instead of Optional.or(null)");
            return bVar;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
