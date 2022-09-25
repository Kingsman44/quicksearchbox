package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.p4605f.p4607b.C61087i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.h */
/* compiled from: PG */
public final class C66674h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66674h f181371a;

    /* renamed from: b */
    public static final C62940bt f181372b;

    /* renamed from: g */
    private static volatile C63010eb f181373g;

    /* renamed from: c */
    private int f181374c;

    /* renamed from: d */
    private C52081en f181375d;

    /* renamed from: e */
    private C61087i f181376e;

    /* renamed from: f */
    private byte f181377f = 2;

    static {
        C66674h hVar = new C66674h();
        f181371a = hVar;
        C62942bv.registerDefaultInstance(C66674h.class, hVar);
        f181372b = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, hVar, hVar, (C62958ce) null, 116159443, C63066gd.MESSAGE, C66674h.class);
    }

    private C66674h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181377f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181377f = b;
                return null;
            case 2:
                return newMessageInfo(f181371a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0001\u0002ဉ\u0000", new Object[]{C45240c.f118157a, "e", "d"});
            case 3:
                return new C66674h();
            case 4:
                return new C66673g();
            case 5:
                return f181371a;
            case 6:
                C63010eb ebVar = f181373g;
                if (ebVar == null) {
                    synchronized (C66674h.class) {
                        ebVar = f181373g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181371a);
                            f181373g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
