package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ea */
/* compiled from: PG */
public final class C125154ea extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125154ea f345239c;

    /* renamed from: d */
    private static volatile C63010eb f345240d;

    /* renamed from: a */
    public boolean f345241a;

    /* renamed from: b */
    public boolean f345242b;

    static {
        C125154ea eaVar = new C125154ea();
        f345239c = eaVar;
        C62942bv.registerDefaultInstance(C125154ea.class, eaVar);
    }

    private C125154ea() {
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
                return newMessageInfo(f345239c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C125154ea();
            case 4:
                return new C125152dz();
            case 5:
                return f345239c;
            case 6:
                C63010eb ebVar = f345240d;
                if (ebVar == null) {
                    synchronized (C125154ea.class) {
                        ebVar = f345240d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345239c);
                            f345240d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
