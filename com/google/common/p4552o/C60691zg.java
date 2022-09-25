package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.zg */
/* compiled from: PG */
public final class C60691zg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60691zg f164662f;

    /* renamed from: g */
    private static volatile C63010eb f164663g;

    /* renamed from: a */
    public int f164664a;

    /* renamed from: b */
    public String f164665b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f164666c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f164667d;

    /* renamed from: e */
    public int f164668e;

    static {
        C60691zg zgVar = new C60691zg();
        f164662f = zgVar;
        C62942bv.registerDefaultInstance(C60691zg.class, zgVar);
    }

    private C60691zg() {
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
                return newMessageInfo(f164662f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C60691zg();
            case 4:
                return new C60690zf();
            case 5:
                return f164662f;
            case 6:
                C63010eb ebVar = f164663g;
                if (ebVar == null) {
                    synchronized (C60691zg.class) {
                        ebVar = f164663g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164662f);
                            f164663g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
