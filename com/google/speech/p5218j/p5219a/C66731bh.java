package com.google.speech.p5218j.p5219a;

import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.j.a.bh */
/* compiled from: PG */
public final class C66731bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66731bh f181515c;

    /* renamed from: d */
    public static final C62940bt f181516d;

    /* renamed from: e */
    private static volatile C63010eb f181517e;

    /* renamed from: a */
    public int f181518a;

    /* renamed from: b */
    public C52081en f181519b;

    static {
        C66731bh bhVar = new C66731bh();
        f181515c = bhVar;
        C62942bv.registerDefaultInstance(C66731bh.class, bhVar);
        f181516d = C62942bv.newSingularGeneratedExtension(C66722az.f181493f, bhVar, bhVar, (C62958ce) null, 276558456, C63066gd.MESSAGE, C66731bh.class);
    }

    private C66731bh() {
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
                return newMessageInfo(f181515c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66731bh();
            case 4:
                return new C66730bg();
            case 5:
                return f181515c;
            case 6:
                C63010eb ebVar = f181517e;
                if (ebVar == null) {
                    synchronized (C66731bh.class) {
                        ebVar = f181517e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181515c);
                            f181517e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
