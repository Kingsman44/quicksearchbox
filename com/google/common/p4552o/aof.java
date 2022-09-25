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

/* renamed from: com.google.common.o.aof */
/* compiled from: PG */
public final class aof extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final aof f159472j;

    /* renamed from: k */
    private static volatile C63010eb f159473k;

    /* renamed from: a */
    public int f159474a;

    /* renamed from: b */
    public String f159475b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f159476c;

    /* renamed from: d */
    public int f159477d;

    /* renamed from: e */
    public int f159478e;

    /* renamed from: f */
    public int f159479f;

    /* renamed from: g */
    public int f159480g;

    /* renamed from: h */
    public String f159481h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f159482i = BuildConfig.FLAVOR;

    static {
        aof aof = new aof();
        f159472j = aof;
        C62942bv.registerDefaultInstance(aof.class, aof);
    }

    private aof() {
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
                return newMessageInfo(f159472j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006\tဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new aof();
            case 4:
                return new aoe();
            case 5:
                return f159472j;
            case 6:
                C63010eb ebVar = f159473k;
                if (ebVar == null) {
                    synchronized (aof.class) {
                        ebVar = f159473k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159472j);
                            f159473k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
