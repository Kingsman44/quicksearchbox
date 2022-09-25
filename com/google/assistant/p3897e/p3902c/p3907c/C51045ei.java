package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ei */
/* compiled from: PG */
public final class C51045ei extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51045ei f132912g;

    /* renamed from: i */
    private static volatile C63010eb f132913i;

    /* renamed from: a */
    public int f132914a;

    /* renamed from: b */
    public int f132915b = 0;

    /* renamed from: c */
    public Object f132916c;

    /* renamed from: d */
    public int f132917d;

    /* renamed from: e */
    public aco f132918e;

    /* renamed from: f */
    public C51098gh f132919f;

    /* renamed from: h */
    private byte f132920h = 2;

    static {
        C51045ei eiVar = new C51045ei();
        f132912g = eiVar;
        C62942bv.registerDefaultInstance(C51045ei.class, eiVar);
    }

    private C51045ei() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132920h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132920h = b;
                return null;
            case 2:
                return newMessageInfo(f132912g, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C51042ef.class, C51044eh.class, C51040ed.class});
            case 3:
                return new C51045ei();
            case 4:
                return new C51038eb();
            case 5:
                return f132912g;
            case 6:
                C63010eb ebVar = f132913i;
                if (ebVar == null) {
                    synchronized (C51045ei.class) {
                        ebVar = f132913i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132912g);
                            f132913i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
