package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.fg */
/* compiled from: PG */
public final class C7661fg extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C7661fg f26585n;

    /* renamed from: p */
    private static volatile C63010eb f26586p;

    /* renamed from: a */
    public int f26587a;

    /* renamed from: b */
    public boolean f26588b;

    /* renamed from: c */
    public boolean f26589c;

    /* renamed from: d */
    public boolean f26590d;

    /* renamed from: e */
    public C8098vl f26591e;

    /* renamed from: f */
    public C7904og f26592f;

    /* renamed from: g */
    public C8209zo f26593g;

    /* renamed from: h */
    public C7671fq f26594h;

    /* renamed from: i */
    public C7803kn f26595i;

    /* renamed from: j */
    public C7686ge f26596j;

    /* renamed from: k */
    public C63088z f26597k = C63088z.f170246b;

    /* renamed from: l */
    public C7700gs f26598l;

    /* renamed from: m */
    public C62961ch f26599m = emptyIntList();

    /* renamed from: o */
    private byte f26600o = 2;

    static {
        C7661fg fgVar = new C7661fg();
        f26585n = fgVar;
        C62942bv.registerDefaultInstance(C7661fg.class, fgVar);
    }

    private C7661fg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26600o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26600o = b;
                return null;
            case 2:
                return newMessageInfo(f26585n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0001\u0001ᐉ\u0003\u0002ဉ\u0004\u0003ဉ\u0005\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဇ\u0001\u0007ဇ\u0000\bဇ\u0002\tဉ\b\u000b\u0016\fည\t\rဉ\n", new Object[]{"a", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C45240c.f118157a, "b", "d", "j", "m", C19621k.f54601a, "l"});
            case 3:
                return new C7661fg();
            case 4:
                return new C7660ff();
            case 5:
                return f26585n;
            case 6:
                C63010eb ebVar = f26586p;
                if (ebVar == null) {
                    synchronized (C7661fg.class) {
                        ebVar = f26586p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26585n);
                            f26586p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
