package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.afw */
/* compiled from: PG */
public final class afw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final afw f129184c;

    /* renamed from: d */
    private static volatile C63010eb f129185d;

    /* renamed from: a */
    public int f129186a;

    /* renamed from: b */
    public String f129187b = BuildConfig.FLAVOR;

    static {
        afw afw = new afw();
        f129184c = afw;
        C62942bv.registerDefaultInstance(afw.class, afw);
    }

    private afw() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f129184c, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new afw();
            case 4:
                return new afv();
            case 5:
                return f129184c;
            case 6:
                C63010eb ebVar = f129185d;
                if (ebVar == null) {
                    synchronized (afw.class) {
                        ebVar = f129185d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129184c);
                            f129185d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
