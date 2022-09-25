package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.aob */
/* compiled from: PG */
public final class aob extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final aob f159424i;

    /* renamed from: j */
    private static volatile C63010eb f159425j;

    /* renamed from: a */
    public int f159426a;

    /* renamed from: b */
    public int f159427b;

    /* renamed from: c */
    public int f159428c;

    /* renamed from: d */
    public int f159429d;

    /* renamed from: e */
    public String f159430e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f159431f;

    /* renamed from: g */
    public int f159432g;

    /* renamed from: h */
    public int f159433h;

    static {
        aob aob = new aob();
        f159424i = aob;
        C62942bv.registerDefaultInstance(aob.class, aob);
    }

    private aob() {
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
                return newMessageInfo(f159424i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new aob();
            case 4:
                return new aoa();
            case 5:
                return f159424i;
            case 6:
                C63010eb ebVar = f159425j;
                if (ebVar == null) {
                    synchronized (aob.class) {
                        ebVar = f159425j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159424i);
                            f159425j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
