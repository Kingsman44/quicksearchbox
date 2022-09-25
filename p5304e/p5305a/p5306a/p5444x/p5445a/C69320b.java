package p5304e.p5305a.p5306a.p5444x.p5445a;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;

/* renamed from: e.a.a.x.a.b */
/* compiled from: PG */
public final class C69320b {

    /* renamed from: a */
    public static final C31718bj f185475a;

    /* renamed from: b */
    public static final C31718bj f185476b;

    /* renamed from: c */
    public static final C31718bj f185477c;

    /* renamed from: d */
    public static final C31718bj f185478d;

    /* renamed from: e */
    public static final C31718bj f185479e;

    /* renamed from: f */
    public final Context f185480f;

    static {
        C31728bt e = new C31728bt("com.google.android.libraries.appactions.serviceengine.api").mo37343e();
        f185475a = e.mo37341c("45369951", false);
        f185476b = e.mo37340b("45369950", "Example String Param");
        f185477c = e.mo37339a("45378497", 100);
        try {
            f185478d = e.mo37342d("45378498", (C62910ar) C62942bv.parseFrom((C62942bv) C62910ar.f169858c, Base64.decode("CJAc", 3)), C69319a.f185474a);
            f185479e = e.mo37339a("45372962", 3600000);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    public C69320b(Context context) {
        this.f185480f = context;
    }
}
