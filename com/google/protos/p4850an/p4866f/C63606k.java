package com.google.protos.p4850an.p4866f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.k */
/* compiled from: PG */
public final class C63606k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63606k f172036e;

    /* renamed from: f */
    private static volatile C63010eb f172037f;

    /* renamed from: a */
    public int f172038a;

    /* renamed from: b */
    public C62971cq f172039b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f172040c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63611p f172041d;

    static {
        C63606k kVar = new C63606k();
        f172036e = kVar;
        C62942bv.registerDefaultInstance(C63606k.class, kVar);
    }

    private C63606k() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f172036e, "\u0001\u0003\u0000\u0001\u0001\u0013\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0013ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63606k();
            case 4:
                return new C63605j();
            case 5:
                return f172036e;
            case 6:
                C63010eb ebVar = f172037f;
                if (ebVar == null) {
                    synchronized (C63606k.class) {
                        ebVar = f172037f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172036e);
                            f172037f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
