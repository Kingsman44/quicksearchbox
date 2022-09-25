package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.b */
/* compiled from: PG */
public final class C17897b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C17897b f51274j;

    /* renamed from: k */
    private static volatile C63010eb f51275k;

    /* renamed from: a */
    public int f51276a;

    /* renamed from: b */
    public C62961ch f51277b = emptyIntList();

    /* renamed from: c */
    public C62971cq f51278c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f51279d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f51280e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f51281f;

    /* renamed from: g */
    public C62961ch f51282g = emptyIntList();

    /* renamed from: h */
    public boolean f51283h;

    /* renamed from: i */
    public boolean f51284i;

    static {
        C17897b bVar = new C17897b();
        f51274j = bVar;
        C62942bv.registerDefaultInstance(C17897b.class, bVar);
    }

    private C17897b() {
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
                return newMessageInfo(f51274j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0016\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဇ\u0002\u0005\u001a\u0006\u0016\u0007ဇ\u0003\bဇ\u0004", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C45240c.f118157a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C17897b();
            case 4:
                return new C17870a();
            case 5:
                return f51274j;
            case 6:
                C63010eb ebVar = f51275k;
                if (ebVar == null) {
                    synchronized (C17897b.class) {
                        ebVar = f51275k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51274j);
                            f51275k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
