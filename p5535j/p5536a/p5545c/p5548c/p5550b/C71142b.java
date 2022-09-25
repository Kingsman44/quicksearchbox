package p5535j.p5536a.p5545c.p5548c.p5550b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.b.b */
/* compiled from: PG */
public final class C71142b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C71142b f189780d;

    /* renamed from: f */
    private static volatile C63010eb f189781f;

    /* renamed from: a */
    public int f189782a;

    /* renamed from: b */
    public C60220t f189783b;

    /* renamed from: c */
    public String f189784c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f189785e = 2;

    static {
        C71142b bVar = new C71142b();
        f189780d = bVar;
        C62942bv.registerDefaultInstance(C71142b.class, bVar);
    }

    private C71142b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f189785e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f189785e = b;
                return null;
            case 2:
                return newMessageInfo(f189780d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C71142b();
            case 4:
                return new C71141a();
            case 5:
                return f189780d;
            case 6:
                C63010eb ebVar = f189781f;
                if (ebVar == null) {
                    synchronized (C71142b.class) {
                        ebVar = f189781f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189780d);
                            f189781f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
