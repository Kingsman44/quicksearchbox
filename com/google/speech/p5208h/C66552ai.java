package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.ai */
/* compiled from: PG */
public final class C66552ai extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66552ai f180997c;

    /* renamed from: d */
    public static final C62940bt f180998d;

    /* renamed from: e */
    private static volatile C63010eb f180999e;

    /* renamed from: a */
    public int f181000a;

    /* renamed from: b */
    public boolean f181001b;

    static {
        C66552ai aiVar = new C66552ai();
        f180997c = aiVar;
        C62942bv.registerDefaultInstance(C66552ai.class, aiVar);
        f180998d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, aiVar, aiVar, (C62958ce) null, 380619137, C63066gd.MESSAGE, C66552ai.class);
    }

    private C66552ai() {
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
                return newMessageInfo(f180997c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66552ai();
            case 4:
                return new C66551ah();
            case 5:
                return f180997c;
            case 6:
                C63010eb ebVar = f180999e;
                if (ebVar == null) {
                    synchronized (C66552ai.class) {
                        ebVar = f180999e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180997c);
                            f180999e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
