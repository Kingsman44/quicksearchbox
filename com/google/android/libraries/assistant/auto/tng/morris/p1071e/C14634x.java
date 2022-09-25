package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.x */
/* compiled from: PG */
public final class C14634x extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C14634x f44218k;

    /* renamed from: l */
    private static volatile C63010eb f44219l;

    /* renamed from: a */
    public String f44220a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f44221b;

    /* renamed from: c */
    public int f44222c;

    /* renamed from: d */
    public long f44223d;

    /* renamed from: e */
    public boolean f44224e;

    /* renamed from: f */
    public boolean f44225f;

    /* renamed from: g */
    public int f44226g;

    /* renamed from: h */
    public boolean f44227h;

    /* renamed from: i */
    public C62971cq f44228i = emptyProtobufList();

    /* renamed from: j */
    public C14361gj f44229j;

    static {
        C14634x xVar = new C14634x();
        f44218k = xVar;
        C62942bv.registerDefaultInstance(C14634x.class, xVar);
    }

    private C14634x() {
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
                return newMessageInfo(f44218k, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\f\u0005\u0007\u0006\f\u0007\u0004\b\u0002\t\u001b\n\t", new Object[]{"a", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "b", C45240c.f118157a, "d", "i", C14270d.class, "j"});
            case 3:
                return new C14634x();
            case 4:
                return new C14633w();
            case 5:
                return f44218k;
            case 6:
                C63010eb ebVar = f44219l;
                if (ebVar == null) {
                    synchronized (C14634x.class) {
                        ebVar = f44219l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44218k);
                            f44219l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
