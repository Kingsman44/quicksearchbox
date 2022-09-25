package com.google.assistant.p3897e.p3921j;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.aju */
/* compiled from: PG */
public final class aju extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final aju f135238i;

    /* renamed from: j */
    private static volatile C63010eb f135239j;

    /* renamed from: a */
    public int f135240a;

    /* renamed from: b */
    public String f135241b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135242c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f135243d;

    /* renamed from: e */
    public C63088z f135244e = C63088z.f170246b;

    /* renamed from: f */
    public String f135245f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f135246g;

    /* renamed from: h */
    public ajo f135247h;

    static {
        aju aju = new aju();
        f135238i = aju;
        C62942bv.registerDefaultInstance(aju.class, aju);
    }

    private aju() {
    }

    /* renamed from: b */
    public static C63010eb m86311b() {
        return f135238i.getParserForType();
    }

    /* renamed from: a */
    public final boolean mo53688a() {
        return (this.f135240a & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f135238i, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဌ\u0002\u0005ည\u0003\u0006ဈ\u0004\u0007ဌ\u0005\bဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", ajs.f135237a, "e", C10662f.f35572a, C30325g.f82003a, ajq.f135236a, C19618h.f54585a});
            case 3:
                return new aju();
            case 4:
                return new ajp();
            case 5:
                return f135238i;
            case 6:
                C63010eb ebVar = f135239j;
                if (ebVar == null) {
                    synchronized (aju.class) {
                        ebVar = f135239j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135238i);
                            f135239j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
