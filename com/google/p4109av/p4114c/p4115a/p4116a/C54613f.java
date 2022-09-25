package com.google.p4109av.p4114c.p4115a.p4116a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.av.c.a.a.f */
/* compiled from: PG */
public final class C54613f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54613f f143382f;

    /* renamed from: g */
    private static volatile C63010eb f143383g;

    /* renamed from: a */
    public int f143384a;

    /* renamed from: b */
    public int f143385b;

    /* renamed from: c */
    public String f143386c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f143387d;

    /* renamed from: e */
    public boolean f143388e;

    static {
        C54613f fVar = new C54613f();
        f143382f = fVar;
        C62942bv.registerDefaultInstance(C54613f.class, fVar);
    }

    private C54613f() {
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
                return newMessageInfo(f143382f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C54612e.m87501b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C54613f();
            case 4:
                return new C54610c();
            case 5:
                return f143382f;
            case 6:
                C63010eb ebVar = f143383g;
                if (ebVar == null) {
                    synchronized (C54613f.class) {
                        ebVar = f143383g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143382f);
                            f143383g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
