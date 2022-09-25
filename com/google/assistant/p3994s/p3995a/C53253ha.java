package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3927k.p3928a.C52664d;
import com.google.assistant.p3897e.p3929l.p3930a.C52792t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;

/* renamed from: com.google.assistant.s.a.ha */
/* compiled from: PG */
public final class C53253ha extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53253ha f139593f;

    /* renamed from: k */
    private static volatile C63010eb f139594k;

    /* renamed from: a */
    public int f139595a;

    /* renamed from: b */
    public String f139596b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139597c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C51270bm f139598d;

    /* renamed from: e */
    public C51334dw f139599e;

    /* renamed from: g */
    private C63171d f139600g;

    /* renamed from: h */
    private C52792t f139601h;

    /* renamed from: i */
    private C52664d f139602i;

    /* renamed from: j */
    private byte f139603j = 2;

    static {
        C53253ha haVar = new C53253ha();
        f139593f = haVar;
        C62942bv.registerDefaultInstance(C53253ha.class, haVar);
    }

    private C53253ha() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139603j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139603j = b;
                return null;
            case 2:
                return newMessageInfo(f139593f, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ᐉ\u0005\bᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, C30325g.f82003a, C19618h.f54585a, "d", "e", "i"});
            case 3:
                return new C53253ha();
            case 4:
                return new C53251gz();
            case 5:
                return f139593f;
            case 6:
                C63010eb ebVar = f139594k;
                if (ebVar == null) {
                    synchronized (C53253ha.class) {
                        ebVar = f139594k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139593f);
                            f139594k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
