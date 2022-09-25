package p5535j.p5536a.p5545c.p5548c.p5549a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.a.d */
/* compiled from: PG */
public final class C71054d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C71054d f189493g;

    /* renamed from: h */
    private static volatile C63010eb f189494h;

    /* renamed from: a */
    public int f189495a;

    /* renamed from: b */
    public String f189496b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f189497c;

    /* renamed from: d */
    public int f189498d;

    /* renamed from: e */
    public long f189499e;

    /* renamed from: f */
    public long f189500f;

    static {
        C71054d dVar = new C71054d();
        f189493g = dVar;
        C62942bv.registerDefaultInstance(C71054d.class, dVar);
    }

    private C71054d() {
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
                return newMessageInfo(f189493g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C71027c.f189424a, "e", C10662f.f35572a});
            case 3:
                return new C71054d();
            case 4:
                return new C71000b();
            case 5:
                return f189493g;
            case 6:
                C63010eb ebVar = f189494h;
                if (ebVar == null) {
                    synchronized (C71054d.class) {
                        ebVar = f189494h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189493g);
                            f189494h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
