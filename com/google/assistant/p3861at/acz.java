package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.acz */
/* compiled from: PG */
public final class acz extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final acz f129010n;

    /* renamed from: o */
    private static volatile C63010eb f129011o;

    /* renamed from: a */
    public int f129012a;

    /* renamed from: b */
    public C50077js f129013b;

    /* renamed from: c */
    public C50445xi f129014c;

    /* renamed from: d */
    public C50004h f129015d;

    /* renamed from: e */
    public C50196oc f129016e;

    /* renamed from: f */
    public aep f129017f;

    /* renamed from: g */
    public C50468ye f129018g;

    /* renamed from: h */
    public C50372uq f129019h;

    /* renamed from: i */
    public C50025hu f129020i;

    /* renamed from: j */
    public ajb f129021j;

    /* renamed from: k */
    public C50238pr f129022k;

    /* renamed from: l */
    public C49814aa f129023l;

    /* renamed from: m */
    public C50380uy f129024m;

    static {
        acz acz = new acz();
        f129010n = acz;
        C62942bv.registerDefaultInstance(acz.class, acz);
    }

    private acz() {
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
                return newMessageInfo(f129010n, "\u0001\f\u0000\u0001\u0001\u001c\f\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\bဉ\b\nဉ\u0007\u000bဉ\n\fဉ\u000b\u0011ဉ\r\u0014ဉ\u0013\u0019ဉ\u0018\u001cဉ\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C10662f.f35572a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new acz();
            case 4:
                return new acy();
            case 5:
                return f129010n;
            case 6:
                C63010eb ebVar = f129011o;
                if (ebVar == null) {
                    synchronized (acz.class) {
                        ebVar = f129011o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129010n);
                            f129011o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
