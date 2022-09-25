package com.google.p4242bp.p4243a.p4247d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.d.d */
/* compiled from: PG */
public final class C56164d extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C56164d f149637d;

    /* renamed from: f */
    private static volatile C63010eb f149638f;

    /* renamed from: a */
    public int f149639a;

    /* renamed from: b */
    public String f149640b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f149641c;

    /* renamed from: e */
    private byte f149642e = 2;

    static {
        C56164d dVar = new C56164d();
        f149637d = dVar;
        C62942bv.registerDefaultInstance(C56164d.class, dVar);
    }

    private C56164d() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149642e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149642e = b;
                return null;
            case 2:
                return newMessageInfo(f149637d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56164d();
            case 4:
                return new C56163c();
            case 5:
                return f149637d;
            case 6:
                C63010eb ebVar = f149638f;
                if (ebVar == null) {
                    synchronized (C56164d.class) {
                        ebVar = f149638f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149637d);
                            f149638f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
