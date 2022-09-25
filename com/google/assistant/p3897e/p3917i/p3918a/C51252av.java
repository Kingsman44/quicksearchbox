package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.assistant.p3897e.p3921j.apn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.e.i.a.av */
/* compiled from: PG */
public final class C51252av extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51252av f133426e;

    /* renamed from: f */
    public static final C62940bt f133427f;

    /* renamed from: h */
    private static volatile C63010eb f133428h;

    /* renamed from: a */
    public int f133429a;

    /* renamed from: b */
    public C52289mf f133430b;

    /* renamed from: c */
    public apn f133431c;

    /* renamed from: d */
    public ada f133432d;

    /* renamed from: g */
    private byte f133433g = 2;

    static {
        C51252av avVar = new C51252av();
        f133426e = avVar;
        C62942bv.registerDefaultInstance(C51252av.class, avVar);
        f133427f = C62942bv.newSingularGeneratedExtension(C51406gn.f133887s, avVar, avVar, (C62958ce) null, 224388882, C63066gd.MESSAGE, C51252av.class);
    }

    private C51252av() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133433g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133433g = b;
                return null;
            case 2:
                return newMessageInfo(f133426e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51252av();
            case 4:
                return new C51251au();
            case 5:
                return f133426e;
            case 6:
                C63010eb ebVar = f133428h;
                if (ebVar == null) {
                    synchronized (C51252av.class) {
                        ebVar = f133428h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133426e);
                            f133428h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
