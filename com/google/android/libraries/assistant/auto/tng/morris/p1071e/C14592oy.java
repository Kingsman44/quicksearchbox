package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.oy */
/* compiled from: PG */
public final class C14592oy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14592oy f44108c;

    /* renamed from: d */
    private static volatile C63010eb f44109d;

    /* renamed from: a */
    public C16754d f44110a;

    /* renamed from: b */
    public boolean f44111b;

    static {
        C14592oy oyVar = new C14592oy();
        f44108c = oyVar;
        C62942bv.registerDefaultInstance(C14592oy.class, oyVar);
    }

    private C14592oy() {
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
                return newMessageInfo(f44108c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14592oy();
            case 4:
                return new C14591ox();
            case 5:
                return f44108c;
            case 6:
                C63010eb ebVar = f44109d;
                if (ebVar == null) {
                    synchronized (C14592oy.class) {
                        ebVar = f44109d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44108c);
                            f44109d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
