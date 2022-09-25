package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.bn */
/* compiled from: PG */
public final class C50969bn extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C50969bn f132678i;

    /* renamed from: k */
    private static volatile C63010eb f132679k;

    /* renamed from: a */
    public int f132680a;

    /* renamed from: b */
    public String f132681b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C50965bj f132682c;

    /* renamed from: d */
    public C51030du f132683d;

    /* renamed from: e */
    public C50936ah f132684e;

    /* renamed from: f */
    public int f132685f;

    /* renamed from: g */
    public int f132686g;

    /* renamed from: h */
    public int f132687h;

    /* renamed from: j */
    private byte f132688j = 2;

    static {
        C50969bn bnVar = new C50969bn();
        f132678i = bnVar;
        C62942bv.registerDefaultInstance(C50969bn.class, bnVar);
    }

    private C50969bn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132688j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132688j = b;
                return null;
            case 2:
                return newMessageInfo(f132678i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006င\u0005\u0007ဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C50967bl.f132677a});
            case 3:
                return new C50969bn();
            case 4:
                return new C50966bk();
            case 5:
                return f132678i;
            case 6:
                C63010eb ebVar = f132679k;
                if (ebVar == null) {
                    synchronized (C50969bn.class) {
                        ebVar = f132679k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132678i);
                            f132679k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
