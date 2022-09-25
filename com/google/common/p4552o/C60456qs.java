package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qs */
/* compiled from: PG */
public final class C60456qs extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60456qs f163602g;

    /* renamed from: k */
    private static volatile C63010eb f163603k;

    /* renamed from: a */
    public int f163604a;

    /* renamed from: b */
    public C62971cq f163605b = emptyProtobufList();

    /* renamed from: c */
    public String f163606c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public apd f163607d;

    /* renamed from: e */
    public C60318ob f163608e;

    /* renamed from: f */
    public C59745eb f163609f;

    /* renamed from: h */
    private C60321oe f163610h;

    /* renamed from: i */
    private C60321oe f163611i;

    /* renamed from: j */
    private byte f163612j = 2;

    static {
        C60456qs qsVar = new C60456qs();
        f163602g = qsVar;
        C62942bv.registerDefaultInstance(C60456qs.class, qsVar);
    }

    private C60456qs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163612j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163612j = b;
                return null;
            case 2:
                return newMessageInfo(f163602g, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0001\u0002\u0002\u001b\u0003ဈ\u0001\u0004ဉ\u0002\u0006ဉ\u0004\bᐉ\u0006\tᐉ\u0007\nဉ\b", new Object[]{"a", "b", C60647xq.class, C45240c.f118157a, "d", "e", C19618h.f54585a, "i", C10662f.f35572a});
            case 3:
                return new C60456qs();
            case 4:
                return new C60455qr();
            case 5:
                return f163602g;
            case 6:
                C63010eb ebVar = f163603k;
                if (ebVar == null) {
                    synchronized (C60456qs.class) {
                        ebVar = f163603k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163602g);
                            f163603k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
