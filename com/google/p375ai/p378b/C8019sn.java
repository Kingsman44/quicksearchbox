package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.sn */
/* compiled from: PG */
public final class C8019sn extends C62937bq implements C62938br {

    /* renamed from: l */
    public static final C8019sn f28154l;

    /* renamed from: n */
    private static volatile C63010eb f28155n;

    /* renamed from: a */
    public int f28156a;

    /* renamed from: b */
    public int f28157b = 0;

    /* renamed from: c */
    public Object f28158c;

    /* renamed from: d */
    public C8021sp f28159d;

    /* renamed from: e */
    public int f28160e;

    /* renamed from: f */
    public int f28161f;

    /* renamed from: g */
    public C8013sh f28162g;

    /* renamed from: h */
    public C8013sh f28163h;

    /* renamed from: i */
    public C8013sh f28164i;

    /* renamed from: j */
    public C8013sh f28165j;

    /* renamed from: k */
    public C8034tb f28166k;

    /* renamed from: m */
    private byte f28167m = 2;

    static {
        C8019sn snVar = new C8019sn();
        f28154l = snVar;
        C62942bv.registerDefaultInstance(C8019sn.class, snVar);
    }

    private C8019sn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28167m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28167m = b;
                return null;
            case 2:
                return newMessageInfo(f28154l, "\u0001\u000b\u0001\u0001\u0001\f\u000b\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ဉ\u0003\u0006ဌ\u0004\u0007င\u0005\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{C45240c.f118157a, "b", "a", C8011sf.class, C8018sm.class, C8016sk.class, "d", "e", C8008sc.f28128a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C8019sn();
            case 4:
                return new C8014si();
            case 5:
                return f28154l;
            case 6:
                C63010eb ebVar = f28155n;
                if (ebVar == null) {
                    synchronized (C8019sn.class) {
                        ebVar = f28155n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28154l);
                            f28155n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
