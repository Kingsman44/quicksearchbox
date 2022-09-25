package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ib */
/* compiled from: PG */
public final class C51146ib extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51146ib f133130h;

    /* renamed from: j */
    private static volatile C63010eb f133131j;

    /* renamed from: a */
    public int f133132a;

    /* renamed from: b */
    public String f133133b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52403ql f133134c;

    /* renamed from: d */
    public boolean f133135d;

    /* renamed from: e */
    public C51016dg f133136e;

    /* renamed from: f */
    public String f133137f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f133138g;

    /* renamed from: i */
    private byte f133139i = 2;

    static {
        C51146ib ibVar = new C51146ib();
        f133130h = ibVar;
        C62942bv.registerDefaultInstance(C51146ib.class, ibVar);
    }

    private C51146ib() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133139i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133139i = b;
                return null;
            case 2:
                return newMessageInfo(f133130h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဉ\u0001\u0002ဈ\u0000\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ဌ\u0005", new Object[]{"a", C45240c.f118157a, "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C51143hz.f133129a});
            case 3:
                return new C51146ib();
            case 4:
                return new C51142hy();
            case 5:
                return f133130h;
            case 6:
                C63010eb ebVar = f133131j;
                if (ebVar == null) {
                    synchronized (C51146ib.class) {
                        ebVar = f133131j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133130h);
                            f133131j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
