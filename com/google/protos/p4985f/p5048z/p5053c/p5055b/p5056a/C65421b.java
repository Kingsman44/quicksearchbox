package com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.a.b */
/* compiled from: PG */
public final class C65421b extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C65421b f177850c;

    /* renamed from: e */
    private static volatile C63010eb f177851e;

    /* renamed from: a */
    public int f177852a;

    /* renamed from: b */
    public String f177853b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f177854d = 2;

    static {
        C65421b bVar = new C65421b();
        f177850c = bVar;
        C62942bv.registerDefaultInstance(C65421b.class, bVar);
    }

    private C65421b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177854d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177854d = b;
                return null;
            case 2:
                return newMessageInfo(f177850c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65421b();
            case 4:
                return new C65410a();
            case 5:
                return f177850c;
            case 6:
                C63010eb ebVar = f177851e;
                if (ebVar == null) {
                    synchronized (C65421b.class) {
                        ebVar = f177851e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177850c);
                            f177851e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
