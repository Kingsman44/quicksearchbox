package com.google.p4242bp.p4267h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55136he;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.i */
/* compiled from: PG */
public final class C56402i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56402i f150417d;

    /* renamed from: g */
    private static volatile C63010eb f150418g;

    /* renamed from: a */
    public C62971cq f150419a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f150420b = emptyProtobufList();

    /* renamed from: c */
    public boolean f150421c;

    /* renamed from: e */
    private int f150422e;

    /* renamed from: f */
    private byte f150423f = 2;

    static {
        C56402i iVar = new C56402i();
        f150417d = iVar;
        C62942bv.registerDefaultInstance(C56402i.class, iVar);
    }

    private C56402i() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150423f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150423f = b;
                return null;
            case 2:
                return newMessageInfo(f150417d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u001a\u0002Л\u0003ဇ\u0000", new Object[]{"e", "a", "b", C55136he.class, C45240c.f118157a});
            case 3:
                return new C56402i();
            case 4:
                return new C56401h();
            case 5:
                return f150417d;
            case 6:
                C63010eb ebVar = f150418g;
                if (ebVar == null) {
                    synchronized (C56402i.class) {
                        ebVar = f150418g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150417d);
                            f150418g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
