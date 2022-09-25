package com.google.android.libraries.mdi.p2213d.p2219c.p2222c;

import com.google.p4017at.p4078i.p4079a.C54290d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.d.c.c.aj */
/* compiled from: PG */
public final class C28638aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28638aj f77881c;

    /* renamed from: f */
    private static volatile C63010eb f77882f;

    /* renamed from: a */
    public C54290d f77883a;

    /* renamed from: b */
    public C28637ai f77884b;

    /* renamed from: d */
    private int f77885d;

    /* renamed from: e */
    private byte f77886e = 2;

    static {
        C28638aj ajVar = new C28638aj();
        f77881c = ajVar;
        C62942bv.registerDefaultInstance(C28638aj.class, ajVar);
    }

    private C28638aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f77886e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f77886e = b;
                return null;
            case 2:
                return newMessageInfo(f77881c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C28638aj();
            case 4:
                return new C28635ag();
            case 5:
                return f77881c;
            case 6:
                C63010eb ebVar = f77882f;
                if (ebVar == null) {
                    synchronized (C28638aj.class) {
                        ebVar = f77882f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77881c);
                            f77882f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
