package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.af */
/* compiled from: PG */
public final class C121552af extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121552af f337295b;

    /* renamed from: d */
    private static volatile C63010eb f337296d;

    /* renamed from: a */
    public C34053bp f337297a;

    /* renamed from: c */
    private byte f337298c = 2;

    static {
        C121552af afVar = new C121552af();
        f337295b = afVar;
        C62942bv.registerDefaultInstance(C121552af.class, afVar);
    }

    private C121552af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f337298c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f337298c = b;
                return null;
            case 2:
                return newMessageInfo(f337295b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C121552af();
            case 4:
                return new C121551ae();
            case 5:
                return f337295b;
            case 6:
                C63010eb ebVar = f337296d;
                if (ebVar == null) {
                    synchronized (C121552af.class) {
                        ebVar = f337296d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337295b);
                            f337296d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
