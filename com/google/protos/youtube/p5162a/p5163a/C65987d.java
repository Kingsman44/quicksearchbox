package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

@Deprecated
/* renamed from: com.google.protos.youtube.a.a.d */
/* compiled from: PG */
public final class C65987d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65987d f179467c;

    /* renamed from: d */
    public static final C62940bt f179468d;

    /* renamed from: f */
    private static volatile C63010eb f179469f;

    /* renamed from: a */
    public int f179470a;

    /* renamed from: b */
    public C66166ck f179471b;

    /* renamed from: e */
    private byte f179472e = 2;

    static {
        C65987d dVar = new C65987d();
        f179467c = dVar;
        C62942bv.registerDefaultInstance(C65987d.class, dVar);
        f179468d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 202698262, C63066gd.MESSAGE, C65987d.class);
    }

    private C65987d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179472e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179472e = b;
                return null;
            case 2:
                return newMessageInfo(f179467c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65987d();
            case 4:
                return new C65986c();
            case 5:
                return f179467c;
            case 6:
                C63010eb ebVar = f179469f;
                if (ebVar == null) {
                    synchronized (C65987d.class) {
                        ebVar = f179469f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179467c);
                            f179469f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
