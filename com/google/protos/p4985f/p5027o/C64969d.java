package com.google.protos.p4985f.p5027o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.o.d */
/* compiled from: PG */
public final class C64969d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64969d f175948d;

    /* renamed from: f */
    private static volatile C63010eb f175949f;

    /* renamed from: a */
    public int f175950a;

    /* renamed from: b */
    public String f175951b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f175952c;

    /* renamed from: e */
    private byte f175953e = 2;

    static {
        C64969d dVar = new C64969d();
        f175948d = dVar;
        C62942bv.registerDefaultInstance(C64969d.class, dVar);
    }

    private C64969d() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175953e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175953e = b;
                return null;
            case 2:
                return newMessageInfo(f175948d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C64967b.f175947a});
            case 3:
                return new C64969d();
            case 4:
                return new C64966a();
            case 5:
                return f175948d;
            case 6:
                C63010eb ebVar = f175949f;
                if (ebVar == null) {
                    synchronized (C64969d.class) {
                        ebVar = f175949f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175948d);
                            f175949f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
