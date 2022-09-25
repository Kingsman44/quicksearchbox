package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.dn */
/* compiled from: PG */
public final class C66200dn extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66200dn f180014f;

    /* renamed from: g */
    public static final C62940bt f180015g;

    /* renamed from: i */
    private static volatile C63010eb f180016i;

    /* renamed from: a */
    public int f180017a;

    /* renamed from: b */
    public CommandOuterClass$Command f180018b;

    /* renamed from: c */
    public CommandOuterClass$Command f180019c;

    /* renamed from: d */
    public CommandOuterClass$Command f180020d;

    /* renamed from: e */
    public CommandOuterClass$Command f180021e;

    /* renamed from: h */
    private byte f180022h = 2;

    static {
        C66200dn dnVar = new C66200dn();
        f180014f = dnVar;
        C62942bv.registerDefaultInstance(C66200dn.class, dnVar);
        f180015g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dnVar, dnVar, (C62958ce) null, 170382629, C63066gd.MESSAGE, C66200dn.class);
    }

    private C66200dn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180022h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180022h = b;
                return null;
            case 2:
                return newMessageInfo(f180014f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66200dn();
            case 4:
                return new C66199dm();
            case 5:
                return f180014f;
            case 6:
                C63010eb ebVar = f180016i;
                if (ebVar == null) {
                    synchronized (C66200dn.class) {
                        ebVar = f180016i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180014f);
                            f180016i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
