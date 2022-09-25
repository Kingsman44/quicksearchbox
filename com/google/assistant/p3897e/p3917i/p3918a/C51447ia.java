package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ia */
/* compiled from: PG */
public final class C51447ia extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51447ia f133979i;

    /* renamed from: k */
    private static volatile C63010eb f133980k;

    /* renamed from: a */
    public int f133981a;

    /* renamed from: b */
    public C51098gh f133982b;

    /* renamed from: c */
    public C52568wo f133983c;

    /* renamed from: d */
    public C62961ch f133984d = emptyIntList();

    /* renamed from: e */
    public int f133985e;

    /* renamed from: f */
    public long f133986f;

    /* renamed from: g */
    public long f133987g;

    /* renamed from: h */
    public long f133988h;

    /* renamed from: j */
    private byte f133989j = 2;

    static {
        C51447ia iaVar = new C51447ia();
        f133979i = iaVar;
        C62942bv.registerDefaultInstance(C51447ia.class, iaVar);
    }

    private C51447ia() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133989j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133989j = b;
                return null;
            case 2:
                return newMessageInfo(f133979i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0001\u0001ဉ\u0000\u0003ᐉ\u0002\u0004\u001e\u0005ဌ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\tဂ\b", new Object[]{"a", "b", C45240c.f118157a, "d", C51454ih.m86193b(), "e", C51452if.m86191b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C51447ia();
            case 4:
                return new C51445hz();
            case 5:
                return f133979i;
            case 6:
                C63010eb ebVar = f133980k;
                if (ebVar == null) {
                    synchronized (C51447ia.class) {
                        ebVar = f133980k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133979i);
                            f133980k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
