package com.google.android.p10712d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.dh */
/* compiled from: PG */
public final class C142383dh extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C142383dh f386354m;

    /* renamed from: o */
    private static volatile C63010eb f386355o;

    /* renamed from: a */
    public int f386356a;

    /* renamed from: b */
    public int f386357b;

    /* renamed from: c */
    public int f386358c = 1;

    /* renamed from: d */
    public boolean f386359d;

    /* renamed from: e */
    public int f386360e;

    /* renamed from: f */
    public int f386361f;

    /* renamed from: g */
    public int f386362g;

    /* renamed from: h */
    public int f386363h;

    /* renamed from: i */
    public int f386364i;

    /* renamed from: j */
    public int f386365j;

    /* renamed from: k */
    public boolean f386366k;

    /* renamed from: l */
    public boolean f386367l;

    /* renamed from: n */
    private byte f386368n = 2;

    static {
        C142383dh dhVar = new C142383dh();
        f386354m = dhVar;
        C62942bv.registerDefaultInstance(C142383dh.class, dhVar);
    }

    private C142383dh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f386368n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f386368n = b;
                return null;
            case 2:
                return newMessageInfo(f386354m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0001\u0001ᔄ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bဌ\u0007\tဋ\b\nဇ\t\u000bဇ\n", new Object[]{"a", "b", C45240c.f118157a, C142361cm.f386308a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C142367cs.f386315a, "j", C19621k.f54601a, "l"});
            case 3:
                return new C142383dh();
            case 4:
                return new C142382dg();
            case 5:
                return f386354m;
            case 6:
                C63010eb ebVar = f386355o;
                if (ebVar == null) {
                    synchronized (C142383dh.class) {
                        ebVar = f386355o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386354m);
                            f386355o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
