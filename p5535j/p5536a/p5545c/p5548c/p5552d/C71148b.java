package p5535j.p5536a.p5545c.p5548c.p5552d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: j.a.c.c.d.b */
/* compiled from: PG */
public final class C71148b extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C71148b f189792e;

    /* renamed from: g */
    private static volatile C63010eb f189793g;

    /* renamed from: a */
    public int f189794a;

    /* renamed from: b */
    public int f189795b;

    /* renamed from: c */
    public int f189796c;

    /* renamed from: d */
    public String f189797d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f189798f = 2;

    static {
        C71148b bVar = new C71148b();
        f189792e = bVar;
        C62942bv.registerDefaultInstance(C71148b.class, bVar);
    }

    private C71148b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f189798f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f189798f = b;
                return null;
            case 2:
                return newMessageInfo(f189792e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C71148b();
            case 4:
                return new C71147a();
            case 5:
                return f189792e;
            case 6:
                C63010eb ebVar = f189793g;
                if (ebVar == null) {
                    synchronized (C71148b.class) {
                        ebVar = f189793g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f189792e);
                            f189793g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
