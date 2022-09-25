package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.eb */
/* compiled from: PG */
public final class C59745eb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59745eb f161422d;

    /* renamed from: e */
    private static volatile C63010eb f161423e;

    /* renamed from: a */
    public int f161424a;

    /* renamed from: b */
    public int f161425b;

    /* renamed from: c */
    public String f161426c = BuildConfig.FLAVOR;

    static {
        C59745eb ebVar = new C59745eb();
        f161422d = ebVar;
        C62942bv.registerDefaultInstance(C59745eb.class, ebVar);
    }

    private C59745eb() {
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
                return newMessageInfo(f161422d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59745eb();
            case 4:
                return new C59744ea();
            case 5:
                return f161422d;
            case 6:
                C63010eb ebVar = f161423e;
                if (ebVar == null) {
                    synchronized (C59745eb.class) {
                        ebVar = f161423e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161422d);
                            f161423e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
