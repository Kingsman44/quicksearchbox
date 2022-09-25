package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.eg */
/* compiled from: PG */
public final class C52074eg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52074eg f136658e;

    /* renamed from: f */
    private static volatile C63010eb f136659f;

    /* renamed from: a */
    public int f136660a;

    /* renamed from: b */
    public C62961ch f136661b = emptyIntList();

    /* renamed from: c */
    public C62961ch f136662c;

    /* renamed from: d */
    public C52462sq f136663d;

    static {
        C52074eg egVar = new C52074eg();
        f136658e = egVar;
        C62942bv.registerDefaultInstance(C52074eg.class, egVar);
    }

    private C52074eg() {
        emptyIntList();
        this.f136662c = emptyIntList();
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
                return newMessageInfo(f136658e, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0002\u0000\u0003\u001e\u0004\u001e\u0006ဉ\u0002", new Object[]{"a", "b", C52073ef.f136657a, C45240c.f118157a, C52072ee.f136656a, "d"});
            case 3:
                return new C52074eg();
            case 4:
                return new C52071ed();
            case 5:
                return f136658e;
            case 6:
                C63010eb ebVar = f136659f;
                if (ebVar == null) {
                    synchronized (C52074eg.class) {
                        ebVar = f136659f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136658e);
                            f136659f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
