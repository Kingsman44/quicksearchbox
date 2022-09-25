package com.google.assistant.p3886c.p3889c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.c.h */
/* compiled from: PG */
public final class C50770h extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C50770h f132124g;

    /* renamed from: i */
    private static volatile C63010eb f132125i;

    /* renamed from: a */
    public int f132126a;

    /* renamed from: b */
    public int f132127b;

    /* renamed from: c */
    public C50765c f132128c;

    /* renamed from: d */
    public C50765c f132129d;

    /* renamed from: e */
    public C50765c f132130e;

    /* renamed from: f */
    public C50765c f132131f;

    /* renamed from: h */
    private byte f132132h = 2;

    static {
        C50770h hVar = new C50770h();
        f132124g = hVar;
        C62942bv.registerDefaultInstance(C50770h.class, hVar);
    }

    private C50770h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132132h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132132h = b;
                return null;
            case 2:
                return newMessageInfo(f132124g, "\u0001\u0005\u0000\u0001\b\u0011\u0005\u0000\u0000\u0000\bဌ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003\u0011ဉ\u0004", new Object[]{"a", "b", C50769g.m85916b(), C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C50770h();
            case 4:
                return new C50763a();
            case 5:
                return f132124g;
            case 6:
                C63010eb ebVar = f132125i;
                if (ebVar == null) {
                    synchronized (C50770h.class) {
                        ebVar = f132125i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132124g);
                            f132125i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
