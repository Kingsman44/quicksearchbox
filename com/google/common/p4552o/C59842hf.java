package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.hf */
/* compiled from: PG */
public final class C59842hf extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C59842hf f161717k;

    /* renamed from: l */
    private static volatile C63010eb f161718l;

    /* renamed from: a */
    public int f161719a;

    /* renamed from: b */
    public C60333oq f161720b;

    /* renamed from: c */
    public boolean f161721c;

    /* renamed from: d */
    public boolean f161722d;

    /* renamed from: e */
    public int f161723e;

    /* renamed from: f */
    public int f161724f;

    /* renamed from: g */
    public int f161725g;

    /* renamed from: h */
    public int f161726h;

    /* renamed from: i */
    public String f161727i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C62971cq f161728j = emptyProtobufList();

    static {
        C59842hf hfVar = new C59842hf();
        f161717k = hfVar;
        C62942bv.registerDefaultInstance(C59842hf.class, hfVar);
    }

    private C59842hf() {
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
                return newMessageInfo(f161717k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0001\u0000\u0001ဉ\u0000\u0005ဇ\u0004\u0007ဇ\u0006\bင\u0007\tင\b\nင\n\u000bဈ\u000b\f\u001b\rင\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, "i", "j", C59841he.class, C30325g.f82003a});
            case 3:
                return new C59842hf();
            case 4:
                return new C59839hc();
            case 5:
                return f161717k;
            case 6:
                C63010eb ebVar = f161718l;
                if (ebVar == null) {
                    synchronized (C59842hf.class) {
                        ebVar = f161718l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161717k);
                            f161718l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
