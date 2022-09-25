package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: j.a.c.c.a.ey */
/* compiled from: PG */
public final class C71106ey extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C71106ey f189647c;

    /* renamed from: d */
    public static final C62940bt f189648d;

    /* renamed from: e */
    private static volatile C63010eb f189649e;

    /* renamed from: a */
    public int f189650a;

    /* renamed from: b */
    public String f189651b = BuildConfig.FLAVOR;

    static {
        C71106ey eyVar = new C71106ey();
        f189647c = eyVar;
        C62942bv.registerDefaultInstance(C71106ey.class, eyVar);
        f189648d = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, eyVar, eyVar, (C62958ce) null, 461152018, C63066gd.MESSAGE, C71106ey.class);
    }

    private C71106ey() {
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
                return newMessageInfo(f189647c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C71106ey();
            case 4:
                return new C71105ex();
            case 5:
                return f189647c;
            case 6:
                C63010eb ebVar = f189649e;
                if (ebVar == null) {
                    synchronized (C71106ey.class) {
                        ebVar = f189649e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189647c);
                            f189649e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
