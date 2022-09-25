package p5535j.p5536a.p5545c.p5546a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.a.b */
/* compiled from: PG */
public final class C70969b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C70969b f189242e;

    /* renamed from: f */
    public static final C62940bt f189243f;

    /* renamed from: g */
    private static volatile C63010eb f189244g;

    /* renamed from: a */
    public int f189245a;

    /* renamed from: b */
    public String f189246b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f189247c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f189248d;

    static {
        C70969b bVar = new C70969b();
        f189242e = bVar;
        C62942bv.registerDefaultInstance(C70969b.class, bVar);
        f189243f = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, bVar, bVar, (C62958ce) null, 420164014, C63066gd.MESSAGE, C70969b.class);
    }

    private C70969b() {
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
                return newMessageInfo(f189242e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C70969b();
            case 4:
                return new C70968a();
            case 5:
                return f189242e;
            case 6:
                C63010eb ebVar = f189244g;
                if (ebVar == null) {
                    synchronized (C70969b.class) {
                        ebVar = f189244g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189242e);
                            f189244g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
