package com.google.assistant.p3886c.p3887a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.d */
/* compiled from: PG */
public final class C50668d extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C50668d f131800j;

    /* renamed from: k */
    private static volatile C63010eb f131801k;

    /* renamed from: a */
    public int f131802a;

    /* renamed from: b */
    public long f131803b;

    /* renamed from: c */
    public long f131804c;

    /* renamed from: d */
    public long f131805d;

    /* renamed from: e */
    public long f131806e;

    /* renamed from: f */
    public long f131807f;

    /* renamed from: g */
    public long f131808g;

    /* renamed from: h */
    public long f131809h;

    /* renamed from: i */
    public long f131810i;

    static {
        C50668d dVar = new C50668d();
        f131800j = dVar;
        C62942bv.registerDefaultInstance(C50668d.class, dVar);
    }

    private C50668d() {
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
                return newMessageInfo(f131800j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C50668d();
            case 4:
                return new C50667c();
            case 5:
                return f131800j;
            case 6:
                C63010eb ebVar = f131801k;
                if (ebVar == null) {
                    synchronized (C50668d.class) {
                        ebVar = f131801k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131800j);
                            f131801k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
