package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ax */
/* compiled from: PG */
public final class C51254ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51254ax f133434c;

    /* renamed from: e */
    private static volatile C63010eb f133435e;

    /* renamed from: a */
    public int f133436a;

    /* renamed from: b */
    public C51406gn f133437b;

    /* renamed from: d */
    private byte f133438d = 2;

    static {
        C51254ax axVar = new C51254ax();
        f133434c = axVar;
        C62942bv.registerDefaultInstance(C51254ax.class, axVar);
    }

    private C51254ax() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133438d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133438d = b;
                return null;
            case 2:
                return newMessageInfo(f133434c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51254ax();
            case 4:
                return new C51253aw();
            case 5:
                return f133434c;
            case 6:
                C63010eb ebVar = f133435e;
                if (ebVar == null) {
                    synchronized (C51254ax.class) {
                        ebVar = f133435e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133434c);
                            f133435e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
