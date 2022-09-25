package p5535j.p5536a.p5545c.p5548c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60420po;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.p5223d.C66883b;

/* renamed from: j.a.c.c.f */
/* compiled from: PG */
public final class C71152f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71152f f189813f;

    /* renamed from: g */
    public static final C62940bt f189814g;

    /* renamed from: h */
    private static volatile C63010eb f189815h;

    /* renamed from: a */
    public int f189816a;

    /* renamed from: b */
    public int f189817b;

    /* renamed from: c */
    public String f189818c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C66883b f189819d;

    /* renamed from: e */
    public int f189820e;

    static {
        C71152f fVar = new C71152f();
        f189813f = fVar;
        C62942bv.registerDefaultInstance(C71152f.class, fVar);
        f189814g = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, fVar, fVar, (C62958ce) null, 374492841, C63066gd.MESSAGE, C71152f.class);
    }

    private C71152f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f189813f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C60420po.m92579b(), C45240c.f118157a, "d", "e", C71151e.m103900b()});
            case 3:
                return new C71152f();
            case 4:
                return new C71143c();
            case 5:
                return f189813f;
            case 6:
                C63010eb ebVar = f189815h;
                if (ebVar == null) {
                    synchronized (C71152f.class) {
                        ebVar = f189815h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189813f);
                            f189815h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
