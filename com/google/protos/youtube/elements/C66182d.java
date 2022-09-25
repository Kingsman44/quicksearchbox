package com.google.protos.youtube.elements;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.d */
/* compiled from: PG */
public final class C66182d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66182d f179960e;

    /* renamed from: g */
    private static volatile C63010eb f179961g;

    /* renamed from: a */
    public int f179962a;

    /* renamed from: b */
    public String f179963b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f179964c;

    /* renamed from: d */
    public C62971cq f179965d;

    /* renamed from: f */
    private byte f179966f = 2;

    static {
        C66182d dVar = new C66182d();
        f179960e = dVar;
        C62942bv.registerDefaultInstance(C66182d.class, dVar);
    }

    private C66182d() {
        emptyProtobufList();
        this.f179965d = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179966f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179966f = b;
                return null;
            case 2:
                return newMessageInfo(f179960e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002ခ\u0001\u0006Л", new Object[]{"a", "b", C45240c.f118157a, "d", C66256n.class});
            case 3:
                return new C66182d();
            case 4:
                return new C66148c();
            case 5:
                return f179960e;
            case 6:
                C63010eb ebVar = f179961g;
                if (ebVar == null) {
                    synchronized (C66182d.class) {
                        ebVar = f179961g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179960e);
                            f179961g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
