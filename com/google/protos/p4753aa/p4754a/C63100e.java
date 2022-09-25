package com.google.protos.p4753aa.p4754a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aa.a.e */
/* compiled from: PG */
public final class C63100e extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C63100e f170276k;

    /* renamed from: l */
    private static volatile C63010eb f170277l;

    /* renamed from: a */
    public int f170278a;

    /* renamed from: b */
    public int f170279b;

    /* renamed from: c */
    public int f170280c;

    /* renamed from: d */
    public int f170281d;

    /* renamed from: e */
    public int f170282e;

    /* renamed from: f */
    public C62961ch f170283f = emptyIntList();

    /* renamed from: g */
    public C62961ch f170284g = emptyIntList();

    /* renamed from: h */
    public boolean f170285h;

    /* renamed from: i */
    public int f170286i;

    /* renamed from: j */
    public int f170287j;

    static {
        C63100e eVar = new C63100e();
        f170276k = eVar;
        C62942bv.registerDefaultInstance(C63100e.class, eVar);
    }

    private C63100e() {
        emptyProtobufList();
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
                return newMessageInfo(f170276k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001ဋ\u0000\u0003ဋ\u0003\u0004ဌ\u0004\u0005ဋ\u0005\u0007\u001d\b\u001d\tဇ\u0006\nင\u0007\fဋ\t", new Object[]{"a", "b", C45240c.f118157a, "d", C63096a.f170262a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C63100e();
            case 4:
                return new C63099d();
            case 5:
                return f170276k;
            case 6:
                C63010eb ebVar = f170277l;
                if (ebVar == null) {
                    synchronized (C63100e.class) {
                        ebVar = f170277l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170276k);
                            f170277l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
