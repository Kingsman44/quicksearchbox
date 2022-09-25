package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.fz */
/* compiled from: PG */
public final class C49976fz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49976fz f129915c;

    /* renamed from: d */
    private static volatile C63010eb f129916d;

    /* renamed from: a */
    public int f129917a = 0;

    /* renamed from: b */
    public Object f129918b;

    static {
        C49976fz fzVar = new C49976fz();
        f129915c = fzVar;
        C62942bv.registerDefaultInstance(C49976fz.class, fzVar);
    }

    private C49976fz() {
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
                return newMessageInfo(f129915c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C49975fy.class, C49973fw.class});
            case 3:
                return new C49976fz();
            case 4:
                return new C49971fu();
            case 5:
                return f129915c;
            case 6:
                C63010eb ebVar = f129916d;
                if (ebVar == null) {
                    synchronized (C49976fz.class) {
                        ebVar = f129916d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129915c);
                            f129916d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
