package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bx */
/* compiled from: PG */
public final class C64490bx extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64490bx f174920f;

    /* renamed from: g */
    private static volatile C63010eb f174921g;

    /* renamed from: a */
    public int f174922a;

    /* renamed from: b */
    public int f174923b;

    /* renamed from: c */
    public C62961ch f174924c = emptyIntList();

    /* renamed from: d */
    public String f174925d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f174926e = BuildConfig.FLAVOR;

    static {
        C64490bx bxVar = new C64490bx();
        f174920f = bxVar;
        C62942bv.registerDefaultInstance(C64490bx.class, bxVar);
    }

    private C64490bx() {
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
                return newMessageInfo(f174920f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64490bx();
            case 4:
                return new C64489bw();
            case 5:
                return f174920f;
            case 6:
                C63010eb ebVar = f174921g;
                if (ebVar == null) {
                    synchronized (C64490bx.class) {
                        ebVar = f174921g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174920f);
                            f174921g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
