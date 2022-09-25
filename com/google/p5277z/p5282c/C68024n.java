package com.google.p5277z.p5282c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5043v.p5044a.C65364f;

/* renamed from: com.google.z.c.n */
/* compiled from: PG */
public final class C68024n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68024n f184298b;

    /* renamed from: h */
    private static volatile C63010eb f184299h;

    /* renamed from: a */
    public C68032v f184300a;

    /* renamed from: c */
    private int f184301c;

    /* renamed from: d */
    private C68005ao f184302d;

    /* renamed from: e */
    private C65364f f184303e;

    /* renamed from: f */
    private C68028r f184304f;

    /* renamed from: g */
    private byte f184305g = 2;

    static {
        C68024n nVar = new C68024n();
        f184298b = nVar;
        C62942bv.registerDefaultInstance(C68024n.class, nVar);
    }

    private C68024n() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184305g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184305g = b;
                return null;
            case 2:
                return newMessageInfo(f184298b, "\u0001\u0004\u0000\u0001\u0001\u000f\u0004\u0000\u0000\u0003\u0001ᐉ\u0002\u0006ᐉ\u0001\u0007ᐉ\u0007\u000fဉ\u0004", new Object[]{C45240c.f118157a, "a", "d", C10662f.f35572a, "e"});
            case 3:
                return new C68024n();
            case 4:
                return new C68023m();
            case 5:
                return f184298b;
            case 6:
                C63010eb ebVar = f184299h;
                if (ebVar == null) {
                    synchronized (C68024n.class) {
                        ebVar = f184299h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184298b);
                            f184299h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
