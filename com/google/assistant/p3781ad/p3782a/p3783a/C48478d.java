package com.google.assistant.p3781ad.p3782a.p3783a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p4016z.C53691ap;
import com.google.assistant.p4016z.C53708bf;
import com.google.assistant.p4016z.C53738w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.a.a.d */
/* compiled from: PG */
public final class C48478d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48478d f125226f;

    /* renamed from: h */
    private static volatile C63010eb f125227h;

    /* renamed from: a */
    public int f125228a;

    /* renamed from: b */
    public C53738w f125229b;

    /* renamed from: c */
    public C62971cq f125230c = emptyProtobufList();

    /* renamed from: d */
    public int f125231d;

    /* renamed from: e */
    public C48477c f125232e;

    /* renamed from: g */
    private byte f125233g = 2;

    static {
        C48478d dVar = new C48478d();
        f125226f = dVar;
        C62942bv.registerDefaultInstance(C48478d.class, dVar);
    }

    private C48478d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125233g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125233g = b;
                return null;
            case 2:
                return newMessageInfo(f125226f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ဉ\u0000\u0002Л\u0003ဌ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C53708bf.class, "d", C53691ap.m86885b(), "e"});
            case 3:
                return new C48478d();
            case 4:
                return new C48475a();
            case 5:
                return f125226f;
            case 6:
                C63010eb ebVar = f125227h;
                if (ebVar == null) {
                    synchronized (C48478d.class) {
                        ebVar = f125227h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125226f);
                            f125227h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
