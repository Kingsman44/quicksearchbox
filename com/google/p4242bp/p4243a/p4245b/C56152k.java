package com.google.p4242bp.p4243a.p4245b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p440an.C8844b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.a.b.k */
/* compiled from: PG */
public final class C56152k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56152k f149611f;

    /* renamed from: h */
    private static volatile C63010eb f149612h;

    /* renamed from: a */
    public int f149613a;

    /* renamed from: b */
    public String f149614b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f149615c;

    /* renamed from: d */
    public String f149616d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f149617e = C62942bv.emptyProtobufList();

    /* renamed from: g */
    private byte f149618g = 2;

    static {
        C56152k kVar = new C56152k();
        f149611f = kVar;
        C62942bv.registerDefaultInstance(C56152k.class, kVar);
    }

    private C56152k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149618g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149618g = b;
                return null;
            case 2:
                return newMessageInfo(f149611f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0005\u001a", new Object[]{"a", "b", C45240c.f118157a, C8844b.m23486b(), "d", "e"});
            case 3:
                return new C56152k();
            case 4:
                return new C56151j();
            case 5:
                return f149611f;
            case 6:
                C63010eb ebVar = f149612h;
                if (ebVar == null) {
                    synchronized (C56152k.class) {
                        ebVar = f149612h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149611f);
                            f149612h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
