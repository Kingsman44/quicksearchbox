package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.d */
/* compiled from: PG */
public final class C51009d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51009d f132801i;

    /* renamed from: k */
    private static volatile C63010eb f132802k;

    /* renamed from: a */
    public int f132803a;

    /* renamed from: b */
    public C52403ql f132804b;

    /* renamed from: c */
    public int f132805c = 1;

    /* renamed from: d */
    public C51165v f132806d;

    /* renamed from: e */
    public C51165v f132807e;

    /* renamed from: f */
    public C52397qf f132808f;

    /* renamed from: g */
    public String f132809g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C51098gh f132810h;

    /* renamed from: j */
    private byte f132811j = 2;

    static {
        C51009d dVar = new C51009d();
        f132801i = dVar;
        C62942bv.registerDefaultInstance(C51009d.class, dVar);
    }

    private C51009d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132811j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132811j = b;
                return null;
            case 2:
                return newMessageInfo(f132801i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, C50982c.m86001b(), "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C51009d();
            case 4:
                return new C50928a();
            case 5:
                return f132801i;
            case 6:
                C63010eb ebVar = f132802k;
                if (ebVar == null) {
                    synchronized (C51009d.class) {
                        ebVar = f132802k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132801i);
                            f132802k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
