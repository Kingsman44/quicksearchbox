package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e;

import com.google.nlp.p4730a.p4734b.C62774k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.i */
/* compiled from: PG */
public final class C80396i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80396i f220650b;

    /* renamed from: d */
    private static volatile C63010eb f220651d;

    /* renamed from: a */
    public C62774k f220652a;

    /* renamed from: c */
    private byte f220653c = 2;

    static {
        C80396i iVar = new C80396i();
        f220650b = iVar;
        C62942bv.registerDefaultInstance(C80396i.class, iVar);
    }

    private C80396i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220653c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f220653c = b;
                return null;
            case 2:
                return newMessageInfo(f220650b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ", new Object[]{"a"});
            case 3:
                return new C80396i();
            case 4:
                return new C80395h();
            case 5:
                return f220650b;
            case 6:
                C63010eb ebVar = f220651d;
                if (ebVar == null) {
                    synchronized (C80396i.class) {
                        ebVar = f220651d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220650b);
                            f220651d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
