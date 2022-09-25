package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.fq */
/* compiled from: PG */
public final class C80796fq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80796fq f221715c;

    /* renamed from: d */
    private static volatile C63010eb f221716d;

    /* renamed from: a */
    public int f221717a;

    /* renamed from: b */
    public boolean f221718b;

    static {
        C80796fq fqVar = new C80796fq();
        f221715c = fqVar;
        C62942bv.registerDefaultInstance(C80796fq.class, fqVar);
    }

    private C80796fq() {
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
                return newMessageInfo(f221715c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80796fq();
            case 4:
                return new C80795fp();
            case 5:
                return f221715c;
            case 6:
                C63010eb ebVar = f221716d;
                if (ebVar == null) {
                    synchronized (C80796fq.class) {
                        ebVar = f221716d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221715c);
                            f221716d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
