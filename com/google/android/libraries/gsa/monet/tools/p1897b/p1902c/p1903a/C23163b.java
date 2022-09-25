package com.google.android.libraries.gsa.monet.tools.p1897b.p1902c.p1903a;

import com.google.android.libraries.gsa.monet.tools.p1897b.p1898a.p1899a.p1900a.C23139b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.c.a.b */
/* compiled from: PG */
public final class C23163b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C23163b f63524a;

    /* renamed from: b */
    public static final C62940bt f63525b;

    /* renamed from: d */
    private static volatile C63010eb f63526d;

    /* renamed from: c */
    private byte f63527c = 2;

    static {
        C23163b bVar = new C23163b();
        f63524a = bVar;
        C62942bv.registerDefaultInstance(C23163b.class, bVar);
        f63525b = C62942bv.newSingularGeneratedExtension(C23139b.f63486a, bVar, bVar, (C62958ce) null, 10001, C63066gd.MESSAGE, C23163b.class);
    }

    private C23163b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f63527c);
            case 1:
                this.f63527c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f63524a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C23163b();
            case 4:
                return new C23162a();
            case 5:
                return f63524a;
            case 6:
                C63010eb ebVar = f63526d;
                if (ebVar == null) {
                    synchronized (C23163b.class) {
                        ebVar = f63526d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63524a);
                            f63526d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
