package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.y */
/* compiled from: PG */
public final class C52066y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52066y f136641b;

    /* renamed from: g */
    private static volatile C63010eb f136642g;

    /* renamed from: a */
    public C51012dc f136643a;

    /* renamed from: c */
    private int f136644c;

    /* renamed from: d */
    private C52065x f136645d;

    /* renamed from: e */
    private C52063v f136646e;

    /* renamed from: f */
    private byte f136647f = 2;

    static {
        C52066y yVar = new C52066y();
        f136641b = yVar;
        C62942bv.registerDefaultInstance(C52066y.class, yVar);
    }

    private C52066y() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136647f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136647f = b;
                return null;
            case 2:
                return newMessageInfo(f136641b, "\u0001\u0003\u0000\u0001\u0001\f\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\nᐉ\b\fᐉ\t", new Object[]{C45240c.f118157a, "a", "d", "e"});
            case 3:
                return new C52066y();
            case 4:
                return new C52061t();
            case 5:
                return f136641b;
            case 6:
                C63010eb ebVar = f136642g;
                if (ebVar == null) {
                    synchronized (C52066y.class) {
                        ebVar = f136642g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136641b);
                            f136642g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
