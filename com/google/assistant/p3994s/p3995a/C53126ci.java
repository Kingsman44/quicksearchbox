package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.s.a.ci */
/* compiled from: PG */
public final class C53126ci extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53126ci f139229g;

    /* renamed from: i */
    private static volatile C63010eb f139230i;

    /* renamed from: a */
    public int f139231a;

    /* renamed from: b */
    public String f139232b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f139233c;

    /* renamed from: d */
    public C53153di f139234d;

    /* renamed from: e */
    public C62971cq f139235e = emptyProtobufList();

    /* renamed from: f */
    public C63088z f139236f = C63088z.f170246b;

    /* renamed from: h */
    private byte f139237h = 2;

    static {
        C53126ci ciVar = new C53126ci();
        f139229g = ciVar;
        C62942bv.registerDefaultInstance(C53126ci.class, ciVar);
    }

    private C53126ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139237h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139237h = b;
                return null;
            case 2:
                return newMessageInfo(f139229g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002\u0004Л\u0005ည\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C53132co.class, C10662f.f35572a});
            case 3:
                return new C53126ci();
            case 4:
                return new C53125ch();
            case 5:
                return f139229g;
            case 6:
                C63010eb ebVar = f139230i;
                if (ebVar == null) {
                    synchronized (C53126ci.class) {
                        ebVar = f139230i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139229g);
                            f139230i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
