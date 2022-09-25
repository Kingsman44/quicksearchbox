package com.google.common.p4552o.p4566l;

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

/* renamed from: com.google.common.o.l.ab */
/* compiled from: PG */
public final class C60110ab extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60110ab f162553j;

    /* renamed from: l */
    private static volatile C63010eb f162554l;

    /* renamed from: a */
    public int f162555a;

    /* renamed from: b */
    public C60220t f162556b;

    /* renamed from: c */
    public String f162557c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f162558d;

    /* renamed from: e */
    public String f162559e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f162560f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f162561g;

    /* renamed from: h */
    public String f162562h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C60120al f162563i;

    /* renamed from: k */
    private byte f162564k = 2;

    static {
        C60110ab abVar = new C60110ab();
        f162553j = abVar;
        C62942bv.registerDefaultInstance(C60110ab.class, abVar);
    }

    private C60110ab() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162564k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162564k = b;
                return null;
            case 2:
                return newMessageInfo(f162553j, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C19618h.f54585a, "i", C30325g.f82003a});
            case 3:
                return new C60110ab();
            case 4:
                return new C60109aa();
            case 5:
                return f162553j;
            case 6:
                C63010eb ebVar = f162554l;
                if (ebVar == null) {
                    synchronized (C60110ab.class) {
                        ebVar = f162554l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162553j);
                            f162554l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
