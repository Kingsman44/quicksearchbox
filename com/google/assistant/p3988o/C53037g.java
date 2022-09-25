package com.google.assistant.p3988o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.o.g */
/* compiled from: PG */
public final class C53037g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53037g f139008e;

    /* renamed from: g */
    private static volatile C63010eb f139009g;

    /* renamed from: a */
    public int f139010a;

    /* renamed from: b */
    public String f139011b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f139012c;

    /* renamed from: d */
    public boolean f139013d;

    /* renamed from: f */
    private byte f139014f = 2;

    static {
        C53037g gVar = new C53037g();
        f139008e = gVar;
        C62942bv.registerDefaultInstance(C53037g.class, gVar);
    }

    private C53037g() {
        C62942bv.emptyProtobufList();
        this.f139012c = emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139014f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139014f = b;
                return null;
            case 2:
                return newMessageInfo(f139008e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0003Л\u0004ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C53036f.class, "d"});
            case 3:
                return new C53037g();
            case 4:
                return new C53034d();
            case 5:
                return f139008e;
            case 6:
                C63010eb ebVar = f139009g;
                if (ebVar == null) {
                    synchronized (C53037g.class) {
                        ebVar = f139009g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139008e);
                            f139009g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
