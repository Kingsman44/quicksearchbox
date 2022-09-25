package com.google.lens.p4702h.p4703a.p4704a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
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

/* renamed from: com.google.lens.h.a.a.b */
/* compiled from: PG */
public final class C62365b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62365b f168358d;

    /* renamed from: e */
    public static final C62940bt f168359e;

    /* renamed from: g */
    private static volatile C63010eb f168360g;

    /* renamed from: a */
    public int f168361a;

    /* renamed from: b */
    public String f168362b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C66166ck f168363c;

    /* renamed from: f */
    private byte f168364f = 2;

    static {
        C62365b bVar = new C62365b();
        f168358d = bVar;
        C62942bv.registerDefaultInstance(C62365b.class, bVar);
        f168359e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 303403914, C63066gd.MESSAGE, C62365b.class);
    }

    private C62365b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168364f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168364f = b;
                return null;
            case 2:
                return newMessageInfo(f168358d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62365b();
            case 4:
                return new C62364a();
            case 5:
                return f168358d;
            case 6:
                C63010eb ebVar = f168360g;
                if (ebVar == null) {
                    synchronized (C62365b.class) {
                        ebVar = f168360g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168358d);
                            f168360g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
