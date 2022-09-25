package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.bk */
/* compiled from: PG */
public final class C55628bk extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55628bk f146780f;

    /* renamed from: g */
    private static volatile C63010eb f146781g;

    /* renamed from: a */
    public int f146782a;

    /* renamed from: b */
    public C55657cm f146783b;

    /* renamed from: c */
    public String f146784c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f146785d;

    /* renamed from: e */
    public String f146786e = BuildConfig.FLAVOR;

    static {
        C55628bk bkVar = new C55628bk();
        f146780f = bkVar;
        C62942bv.registerDefaultInstance(C55628bk.class, bkVar);
    }

    private C55628bk() {
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
                return newMessageInfo(f146780f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဉ\u0001\u0006ဈ\u0002\u0007ဂ\u0003\bဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55628bk();
            case 4:
                return new C55627bj();
            case 5:
                return f146780f;
            case 6:
                C63010eb ebVar = f146781g;
                if (ebVar == null) {
                    synchronized (C55628bk.class) {
                        ebVar = f146781g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146780f);
                            f146781g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
