package com.google.assistant.p3858ar.p3859a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.assistant.ar.a.z */
/* compiled from: PG */
public final class C49736z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49736z f128420e;

    /* renamed from: h */
    private static volatile C63010eb f128421h;

    /* renamed from: a */
    public int f128422a;

    /* renamed from: b */
    public long f128423b;

    /* renamed from: c */
    public C49728r f128424c;

    /* renamed from: d */
    public boolean f128425d;

    /* renamed from: f */
    private C63771b f128426f;

    /* renamed from: g */
    private byte f128427g = 2;

    static {
        C49736z zVar = new C49736z();
        f128420e = zVar;
        C62942bv.registerDefaultInstance(C49736z.class, zVar);
    }

    private C49736z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128427g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128427g = b;
                return null;
            case 2:
                return newMessageInfo(f128420e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0002\u0001ဂ\u0000\u0002ᐉ\u0001\u0004ဇ\u0003\u0007ᐉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a});
            case 3:
                return new C49736z();
            case 4:
                return new C49735y();
            case 5:
                return f128420e;
            case 6:
                C63010eb ebVar = f128421h;
                if (ebVar == null) {
                    synchronized (C49736z.class) {
                        ebVar = f128421h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128420e);
                            f128421h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
