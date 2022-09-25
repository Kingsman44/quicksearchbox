package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.p1105a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.b.a.b */
/* compiled from: PG */
public final class C15473b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C15473b f46401a;

    /* renamed from: b */
    public static final C62940bt f46402b;

    /* renamed from: c */
    private static volatile C63010eb f46403c;

    static {
        C15473b bVar = new C15473b();
        f46401a = bVar;
        C62942bv.registerDefaultInstance(C15473b.class, bVar);
        f46402b = C62942bv.newSingularGeneratedExtension(C15474b.f46404j, bVar, bVar, (C62958ce) null, 460816606, C63066gd.MESSAGE, C15473b.class);
    }

    private C15473b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f46401a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C15473b();
            case 4:
                return new C15472a();
            case 5:
                return f46401a;
            case 6:
                C63010eb ebVar = f46403c;
                if (ebVar == null) {
                    synchronized (C15473b.class) {
                        ebVar = f46403c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f46401a);
                            f46403c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
