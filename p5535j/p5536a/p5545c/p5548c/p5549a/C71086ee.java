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
import p5535j.p5536a.p5537a.p5539b.p5540a.C70929n;

/* renamed from: j.a.c.c.a.ee */
/* compiled from: PG */
public final class C71086ee extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71086ee f189587d;

    /* renamed from: e */
    public static final C62940bt f189588e;

    /* renamed from: f */
    private static volatile C63010eb f189589f;

    /* renamed from: a */
    public int f189590a;

    /* renamed from: b */
    public String f189591b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C70929n f189592c;

    static {
        C71086ee eeVar = new C71086ee();
        f189587d = eeVar;
        C62942bv.registerDefaultInstance(C71086ee.class, eeVar);
        f189588e = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, eeVar, eeVar, (C62958ce) null, 441459448, C63066gd.MESSAGE, C71086ee.class);
    }

    private C71086ee() {
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
                return newMessageInfo(f189587d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71086ee();
            case 4:
                return new C71085ed();
            case 5:
                return f189587d;
            case 6:
                C63010eb ebVar = f189589f;
                if (ebVar == null) {
                    synchronized (C71086ee.class) {
                        ebVar = f189589f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189587d);
                            f189589f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
