package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.by */
/* compiled from: PG */
public final class C49867by extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49867by f129584c;

    /* renamed from: d */
    private static volatile C63010eb f129585d;

    /* renamed from: a */
    public int f129586a;

    /* renamed from: b */
    public String f129587b = BuildConfig.FLAVOR;

    static {
        C49867by byVar = new C49867by();
        f129584c = byVar;
        C62942bv.registerDefaultInstance(C49867by.class, byVar);
    }

    private C49867by() {
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
                return newMessageInfo(f129584c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49867by();
            case 4:
                return new C49866bx();
            case 5:
                return f129584c;
            case 6:
                C63010eb ebVar = f129585d;
                if (ebVar == null) {
                    synchronized (C49867by.class) {
                        ebVar = f129585d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129584c);
                            f129585d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
