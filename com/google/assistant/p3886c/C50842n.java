package com.google.assistant.p3886c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3860as.C49744ag;
import com.google.assistant.p3860as.C49752ao;
import com.google.assistant.p3860as.C49788bx;
import com.google.assistant.p3860as.C49802p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.n */
/* compiled from: PG */
public final class C50842n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50842n f132378f;

    /* renamed from: i */
    private static volatile C63010eb f132379i;

    /* renamed from: a */
    public int f132380a;

    /* renamed from: b */
    public C49802p f132381b;

    /* renamed from: c */
    public C49752ao f132382c;

    /* renamed from: d */
    public C49744ag f132383d;

    /* renamed from: e */
    public long f132384e;

    /* renamed from: g */
    private C49788bx f132385g;

    /* renamed from: h */
    private byte f132386h = 2;

    static {
        C50842n nVar = new C50842n();
        f132378f = nVar;
        C62942bv.registerDefaultInstance(C50842n.class, nVar);
    }

    private C50842n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132386h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132386h = b;
                return null;
            case 2:
                return newMessageInfo(f132378f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0005ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C30325g.f82003a, "e", "d"});
            case 3:
                return new C50842n();
            case 4:
                return new C50841m();
            case 5:
                return f132378f;
            case 6:
                C63010eb ebVar = f132379i;
                if (ebVar == null) {
                    synchronized (C50842n.class) {
                        ebVar = f132379i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132378f);
                            f132379i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
