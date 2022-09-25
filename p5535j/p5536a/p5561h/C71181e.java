package p5535j.p5536a.p5561h;

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

/* renamed from: j.a.h.e */
/* compiled from: PG */
public final class C71181e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C71181e f189914f;

    /* renamed from: g */
    public static final C62940bt f189915g;

    /* renamed from: h */
    private static volatile C63010eb f189916h;

    /* renamed from: a */
    public int f189917a;

    /* renamed from: b */
    public boolean f189918b;

    /* renamed from: c */
    public boolean f189919c;

    /* renamed from: d */
    public String f189920d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f189921e = BuildConfig.FLAVOR;

    static {
        C71181e eVar = new C71181e();
        f189914f = eVar;
        C62942bv.registerDefaultInstance(C71181e.class, eVar);
        f189915g = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, eVar, eVar, (C62958ce) null, 351390154, C63066gd.MESSAGE, C71181e.class);
    }

    private C71181e() {
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
                return newMessageInfo(f189914f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C71181e();
            case 4:
                return new C71180d();
            case 5:
                return f189914f;
            case 6:
                C63010eb ebVar = f189916h;
                if (ebVar == null) {
                    synchronized (C71181e.class) {
                        ebVar = f189916h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189914f);
                            f189916h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
