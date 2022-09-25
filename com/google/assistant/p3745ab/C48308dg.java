package com.google.assistant.p3745ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.dg */
/* compiled from: PG */
public final class C48308dg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48308dg f124933d;

    /* renamed from: e */
    private static volatile C63010eb f124934e;

    /* renamed from: a */
    public int f124935a;

    /* renamed from: b */
    public String f124936b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f124937c;

    static {
        C48308dg dgVar = new C48308dg();
        f124933d = dgVar;
        C62942bv.registerDefaultInstance(C48308dg.class, dgVar);
    }

    private C48308dg() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f124933d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48308dg();
            case 4:
                return new C48307df();
            case 5:
                return f124933d;
            case 6:
                C63010eb ebVar = f124934e;
                if (ebVar == null) {
                    synchronized (C48308dg.class) {
                        ebVar = f124934e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124933d);
                            f124934e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
