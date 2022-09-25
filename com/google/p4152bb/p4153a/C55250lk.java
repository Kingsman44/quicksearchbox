package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.lk */
/* compiled from: PG */
public final class C55250lk extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C55250lk f145489h;

    /* renamed from: j */
    private static volatile C63010eb f145490j;

    /* renamed from: a */
    public int f145491a;

    /* renamed from: b */
    public String f145492b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55136he f145493c;

    /* renamed from: d */
    public C62961ch f145494d = emptyIntList();

    /* renamed from: e */
    public C62961ch f145495e = emptyIntList();

    /* renamed from: f */
    public int f145496f;

    /* renamed from: g */
    public C55186ja f145497g;

    /* renamed from: i */
    private byte f145498i = 2;

    static {
        C55250lk lkVar = new C55250lk();
        f145489h = lkVar;
        C62942bv.registerDefaultInstance(C55250lk.class, lkVar);
    }

    private C55250lk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145498i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145498i = b;
                return null;
            case 2:
                return newMessageInfo(f145489h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0002\u0001\u0001ဈ\u0000\u0003\u0016\u0004င\u0004\u0007\u0016\bᐉ\u0002\tဉ\u0006", new Object[]{"a", "b", "d", C10662f.f35572a, "e", C45240c.f118157a, C30325g.f82003a});
            case 3:
                return new C55250lk();
            case 4:
                return new C55249lj();
            case 5:
                return f145489h;
            case 6:
                C63010eb ebVar = f145490j;
                if (ebVar == null) {
                    synchronized (C55250lk.class) {
                        ebVar = f145490j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145489h);
                            f145490j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
