package com.google.android.libraries.gsa.p1864f.p1865a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C59687cb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.gsa.f.a.d */
/* compiled from: PG */
public final class C22811d extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C22811d f62806j;

    /* renamed from: l */
    private static volatile C63010eb f62807l;

    /* renamed from: a */
    public int f62808a;

    /* renamed from: b */
    public int f62809b;

    /* renamed from: c */
    public long f62810c;

    /* renamed from: d */
    public long f62811d;

    /* renamed from: e */
    public C62961ch f62812e = emptyIntList();

    /* renamed from: f */
    public C62995dn f62813f = C62995dn.f170057a;

    /* renamed from: g */
    public C59687cb f62814g;

    /* renamed from: h */
    public String f62815h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f62816i = BuildConfig.FLAVOR;

    /* renamed from: k */
    private byte f62817k = 2;

    static {
        C22811d dVar = new C22811d();
        f62806j = dVar;
        C62942bv.registerDefaultInstance(C22811d.class, dVar);
    }

    private C22811d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f62817k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f62817k = b;
                return null;
            case 2:
                return newMessageInfo(f62806j, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0001\u0001င\u0000\u0002ဂ\u0001\u0003\u0016\u00042\u0005ᐉ\u0003\u0006ဂ\u0002\u0007ဈ\u0004\bဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C22810c.f62805a, C30325g.f82003a, "d", C19618h.f54585a, "i"});
            case 3:
                return new C22811d();
            case 4:
                return new C22809b();
            case 5:
                return f62806j;
            case 6:
                C63010eb ebVar = f62807l;
                if (ebVar == null) {
                    synchronized (C22811d.class) {
                        ebVar = f62807l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f62806j);
                            f62807l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
