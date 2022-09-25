package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.sz */
/* compiled from: PG */
public final class C8031sz extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C8031sz f28202k;

    /* renamed from: n */
    private static volatile C63010eb f28203n;

    /* renamed from: a */
    public int f28204a;

    /* renamed from: b */
    public C8042tj f28205b;

    /* renamed from: c */
    public int f28206c;

    /* renamed from: d */
    public boolean f28207d;

    /* renamed from: e */
    public String f28208e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f28209f;

    /* renamed from: g */
    public int f28210g;

    /* renamed from: h */
    public int f28211h;

    /* renamed from: i */
    public int f28212i;

    /* renamed from: j */
    public int f28213j;

    /* renamed from: l */
    private int f28214l;

    /* renamed from: m */
    private byte f28215m = 2;

    static {
        C8031sz szVar = new C8031sz();
        f28202k = szVar;
        C62942bv.registerDefaultInstance(C8031sz.class, szVar);
    }

    private C8031sz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28215m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28215m = b;
                return null;
            case 2:
                return newMessageInfo(f28202k, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "l", C19618h.f54585a, "i", "j"});
            case 3:
                return new C8031sz();
            case 4:
                return new C8030sy();
            case 5:
                return f28202k;
            case 6:
                C63010eb ebVar = f28203n;
                if (ebVar == null) {
                    synchronized (C8031sz.class) {
                        ebVar = f28203n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28202k);
                            f28203n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
