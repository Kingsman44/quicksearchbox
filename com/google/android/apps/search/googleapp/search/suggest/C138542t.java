package com.google.android.apps.search.googleapp.search.suggest;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.t */
/* compiled from: PG */
public final class C138542t extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C138542t f376811i;

    /* renamed from: k */
    private static volatile C63010eb f376812k;

    /* renamed from: a */
    public int f376813a;

    /* renamed from: b */
    public C54231at f376814b;

    /* renamed from: c */
    public boolean f376815c;

    /* renamed from: d */
    public C62971cq f376816d = emptyProtobufList();

    /* renamed from: e */
    public long f376817e;

    /* renamed from: f */
    public long f376818f;

    /* renamed from: g */
    public long f376819g;

    /* renamed from: h */
    public String f376820h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private byte f376821j = 2;

    static {
        C138542t tVar = new C138542t();
        f376811i = tVar;
        C62942bv.registerDefaultInstance(C138542t.class, tVar);
    }

    private C138542t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f376821j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f376821j = b;
                return null;
            case 2:
                return newMessageInfo(f376811i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003\u001b\u0004ဂ\u0002\u0006ဃ\u0004\u0007ဃ\u0005\bဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C138344s.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C138542t();
            case 4:
                return new C138134p();
            case 5:
                return f376811i;
            case 6:
                C63010eb ebVar = f376812k;
                if (ebVar == null) {
                    synchronized (C138542t.class) {
                        ebVar = f376812k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376811i);
                            f376812k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
