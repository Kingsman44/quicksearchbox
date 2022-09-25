package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.g */
/* compiled from: PG */
public final class C80394g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80394g f220645c;

    /* renamed from: e */
    private static volatile C63010eb f220646e;

    /* renamed from: a */
    public int f220647a = 0;

    /* renamed from: b */
    public Object f220648b;

    /* renamed from: d */
    private byte f220649d = 2;

    static {
        C80394g gVar = new C80394g();
        f220645c = gVar;
        C62942bv.registerDefaultInstance(C80394g.class, gVar);
    }

    private C80394g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220649d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220649d = b;
                return null;
            case 2:
                return newMessageInfo(f220645c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000", new Object[]{"b", "a", C51809dy.class, C80295aq.class});
            case 3:
                return new C80394g();
            case 4:
                return new C80392e();
            case 5:
                return f220645c;
            case 6:
                C63010eb ebVar = f220646e;
                if (ebVar == null) {
                    synchronized (C80394g.class) {
                        ebVar = f220646e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220645c);
                            f220646e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
