package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.bi */
/* compiled from: PG */
public final class C54978bi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54978bi f144658b;

    /* renamed from: d */
    private static volatile C63010eb f144659d;

    /* renamed from: a */
    public String f144660a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f144661c;

    static {
        C54978bi biVar = new C54978bi();
        f144658b = biVar;
        C62942bv.registerDefaultInstance(C54978bi.class, biVar);
    }

    private C54978bi() {
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
                return newMessageInfo(f144658b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54978bi();
            case 4:
                return new C54977bh();
            case 5:
                return f144658b;
            case 6:
                C63010eb ebVar = f144659d;
                if (ebVar == null) {
                    synchronized (C54978bi.class) {
                        ebVar = f144659d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144658b);
                            f144659d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
