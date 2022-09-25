package com.google.p4433bz.p4437b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.b.f */
/* compiled from: PG */
public final class C57901f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57901f f154874c;

    /* renamed from: e */
    private static volatile C63010eb f154875e;

    /* renamed from: a */
    public String f154876a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f154877b = emptyProtobufList();

    /* renamed from: d */
    private int f154878d;

    static {
        C57901f fVar = new C57901f();
        f154874c = fVar;
        C62942bv.registerDefaultInstance(C57901f.class, fVar);
    }

    private C57901f() {
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
                return newMessageInfo(f154874c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C57900e.class});
            case 3:
                return new C57901f();
            case 4:
                return new C57898c();
            case 5:
                return f154874c;
            case 6:
                C63010eb ebVar = f154875e;
                if (ebVar == null) {
                    synchronized (C57901f.class) {
                        ebVar = f154875e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154874c);
                            f154875e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
