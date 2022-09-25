package com.google.protos.youtube.elements;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.p5164b.C66011b;

/* renamed from: com.google.protos.youtube.elements.ce */
/* compiled from: PG */
public final class C66160ce extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66160ce f179900c;

    /* renamed from: d */
    public static final C62940bt f179901d;

    /* renamed from: g */
    private static volatile C63010eb f179902g;

    /* renamed from: a */
    public C66063ay f179903a;

    /* renamed from: b */
    public C66011b f179904b;

    /* renamed from: e */
    private int f179905e;

    /* renamed from: f */
    private byte f179906f = 2;

    static {
        C66160ce ceVar = new C66160ce();
        f179900c = ceVar;
        C62942bv.registerDefaultInstance(C66160ce.class, ceVar);
        f179901d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, ceVar, ceVar, (C62958ce) null, 206181248, C63066gd.MESSAGE, C66160ce.class);
    }

    private C66160ce() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179906f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179906f = b;
                return null;
            case 2:
                return newMessageInfo(f179900c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C66160ce();
            case 4:
                return new C66159cd();
            case 5:
                return f179900c;
            case 6:
                C63010eb ebVar = f179902g;
                if (ebVar == null) {
                    synchronized (C66160ce.class) {
                        ebVar = f179902g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179900c);
                            f179902g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
