package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hg */
/* compiled from: PG */
public final class C14385hg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14385hg f43516f;

    /* renamed from: h */
    private static volatile C63010eb f43517h;

    /* renamed from: a */
    public int f43518a;

    /* renamed from: b */
    public int f43519b = 0;

    /* renamed from: c */
    public Object f43520c;

    /* renamed from: d */
    public C60214n f43521d;

    /* renamed from: e */
    public long f43522e;

    /* renamed from: g */
    private byte f43523g = 2;

    static {
        C14385hg hgVar = new C14385hg();
        f43516f = hgVar;
        C62942bv.registerDefaultInstance(C14385hg.class, hgVar);
    }

    private C14385hg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43523g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43523g = b;
                return null;
            case 2:
                return newMessageInfo(f43516f, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005Љ\u0006တ\u0000\u0007<\u0000", new Object[]{C45240c.f118157a, "b", "a", C14377gz.class, C14384hf.class, C14375gx.class, C14380hb.class, "d", "e", C14382hd.class});
            case 3:
                return new C14385hg();
            case 4:
                return new C14372gu();
            case 5:
                return f43516f;
            case 6:
                C63010eb ebVar = f43517h;
                if (ebVar == null) {
                    synchronized (C14385hg.class) {
                        ebVar = f43517h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43516f);
                            f43517h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
