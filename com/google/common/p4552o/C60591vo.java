package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.vo */
/* compiled from: PG */
public final class C60591vo extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60591vo f164368h;

    /* renamed from: i */
    private static volatile C63010eb f164369i;

    /* renamed from: a */
    public int f164370a;

    /* renamed from: b */
    public boolean f164371b;

    /* renamed from: c */
    public boolean f164372c;

    /* renamed from: d */
    public boolean f164373d = true;

    /* renamed from: e */
    public int f164374e;

    /* renamed from: f */
    public boolean f164375f;

    /* renamed from: g */
    public int f164376g;

    static {
        C60591vo voVar = new C60591vo();
        f164368h = voVar;
        C62942bv.registerDefaultInstance(C60591vo.class, voVar);
    }

    private C60591vo() {
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
                return newMessageInfo(f164368h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0007င\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C60591vo();
            case 4:
                return new C60590vn();
            case 5:
                return f164368h;
            case 6:
                C63010eb ebVar = f164369i;
                if (ebVar == null) {
                    synchronized (C60591vo.class) {
                        ebVar = f164369i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164368h);
                            f164369i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
