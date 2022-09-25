package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.ans */
/* compiled from: PG */
public final class ans extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ans f135455c;

    /* renamed from: d */
    private static volatile C63010eb f135456d;

    /* renamed from: a */
    public int f135457a;

    /* renamed from: b */
    public C63088z f135458b = C63088z.f170246b;

    static {
        ans ans = new ans();
        f135455c = ans;
        C62942bv.registerDefaultInstance(ans.class, ans);
    }

    private ans() {
    }

    /* renamed from: a */
    public static C63010eb m86351a() {
        return f135455c.getParserForType();
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
                return newMessageInfo(f135455c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new ans();
            case 4:
                return new anr();
            case 5:
                return f135455c;
            case 6:
                C63010eb ebVar = f135456d;
                if (ebVar == null) {
                    synchronized (ans.class) {
                        ebVar = f135456d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135455c);
                            f135456d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
