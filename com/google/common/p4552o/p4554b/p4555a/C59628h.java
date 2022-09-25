package com.google.common.p4552o.p4554b.p4555a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.h */
/* compiled from: PG */
public final class C59628h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59628h f159873h;

    /* renamed from: i */
    private static volatile C63010eb f159874i;

    /* renamed from: a */
    public int f159875a;

    /* renamed from: b */
    public C59630j f159876b;

    /* renamed from: c */
    public C59619ao f159877c;

    /* renamed from: d */
    public C59634n f159878d;

    /* renamed from: e */
    public C59621aq f159879e;

    /* renamed from: f */
    public C59632l f159880f;

    /* renamed from: g */
    public C59610af f159881g;

    static {
        C59628h hVar = new C59628h();
        f159873h = hVar;
        C62942bv.registerDefaultInstance(C59628h.class, hVar);
    }

    private C59628h() {
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
                return newMessageInfo(f159873h, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0007ဉ\u0006\u000bဉ\n\u000eဉ\f\u000fဉ\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C59628h();
            case 4:
                return new C59627g();
            case 5:
                return f159873h;
            case 6:
                C63010eb ebVar = f159874i;
                if (ebVar == null) {
                    synchronized (C59628h.class) {
                        ebVar = f159874i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159873h);
                            f159874i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
