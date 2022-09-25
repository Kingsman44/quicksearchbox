package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.ax */
/* compiled from: PG */
public final class C121841ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121841ax f338079c;

    /* renamed from: d */
    private static volatile C63010eb f338080d;

    /* renamed from: a */
    public int f338081a = 0;

    /* renamed from: b */
    public Object f338082b;

    static {
        C121841ax axVar = new C121841ax();
        f338079c = axVar;
        C62942bv.registerDefaultInstance(C121841ax.class, axVar);
    }

    private C121841ax() {
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
                return newMessageInfo(f338079c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C121843az.class, C121831an.class});
            case 3:
                return new C121841ax();
            case 4:
                return new C121840aw();
            case 5:
                return f338079c;
            case 6:
                C63010eb ebVar = f338080d;
                if (ebVar == null) {
                    synchronized (C121841ax.class) {
                        ebVar = f338080d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338079c);
                            f338080d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
