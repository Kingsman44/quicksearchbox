package p5535j.p5536a.p5545c.p5548c.p5549a;

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

/* renamed from: j.a.c.c.a.ec */
/* compiled from: PG */
public final class C71084ec extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71084ec f189581d;

    /* renamed from: e */
    public static final C62940bt f189582e;

    /* renamed from: f */
    private static volatile C63010eb f189583f;

    /* renamed from: a */
    public int f189584a;

    /* renamed from: b */
    public int f189585b;

    /* renamed from: c */
    public String f189586c = BuildConfig.FLAVOR;

    static {
        C71084ec ecVar = new C71084ec();
        f189581d = ecVar;
        C62942bv.registerDefaultInstance(C71084ec.class, ecVar);
        f189582e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, ecVar, ecVar, (C62958ce) null, 355564834, C63066gd.MESSAGE, C71084ec.class);
    }

    private C71084ec() {
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
                return newMessageInfo(f189581d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71084ec();
            case 4:
                return new C71083eb();
            case 5:
                return f189581d;
            case 6:
                C63010eb ebVar = f189583f;
                if (ebVar == null) {
                    synchronized (C71084ec.class) {
                        ebVar = f189583f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189581d);
                            f189583f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
