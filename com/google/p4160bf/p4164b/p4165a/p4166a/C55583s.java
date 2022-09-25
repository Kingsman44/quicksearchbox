package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.s */
/* compiled from: PG */
public final class C55583s extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55583s f146644f;

    /* renamed from: h */
    private static volatile C63010eb f146645h;

    /* renamed from: a */
    public boolean f146646a;

    /* renamed from: b */
    public boolean f146647b;

    /* renamed from: c */
    public boolean f146648c;

    /* renamed from: d */
    public boolean f146649d;

    /* renamed from: e */
    public boolean f146650e;

    /* renamed from: g */
    private int f146651g;

    static {
        C55583s sVar = new C55583s();
        f146644f = sVar;
        C62942bv.registerDefaultInstance(C55583s.class, sVar);
    }

    private C55583s() {
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
                return newMessageInfo(f146644f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55583s();
            case 4:
                return new C55582r();
            case 5:
                return f146644f;
            case 6:
                C63010eb ebVar = f146645h;
                if (ebVar == null) {
                    synchronized (C55583s.class) {
                        ebVar = f146645h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146644f);
                            f146645h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
