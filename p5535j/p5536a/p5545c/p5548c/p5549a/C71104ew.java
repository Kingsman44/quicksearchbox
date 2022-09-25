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

/* renamed from: j.a.c.c.a.ew */
/* compiled from: PG */
public final class C71104ew extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71104ew f189639f;

    /* renamed from: g */
    public static final C62940bt f189640g;

    /* renamed from: h */
    private static volatile C63010eb f189641h;

    /* renamed from: a */
    public int f189642a;

    /* renamed from: b */
    public String f189643b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C71103ev f189644c;

    /* renamed from: d */
    public C71099er f189645d;

    /* renamed from: e */
    public C71093el f189646e;

    static {
        C71104ew ewVar = new C71104ew();
        f189639f = ewVar;
        C62942bv.registerDefaultInstance(C71104ew.class, ewVar);
        f189640g = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, ewVar, ewVar, (C62958ce) null, 421311631, C63066gd.MESSAGE, C71104ew.class);
    }

    private C71104ew() {
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
                return newMessageInfo(f189639f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C71104ew();
            case 4:
                return new C71091ej();
            case 5:
                return f189639f;
            case 6:
                C63010eb ebVar = f189641h;
                if (ebVar == null) {
                    synchronized (C71104ew.class) {
                        ebVar = f189641h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189639f);
                            f189641h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
