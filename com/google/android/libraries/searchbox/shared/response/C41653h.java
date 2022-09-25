package com.google.android.libraries.searchbox.shared.response;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.response.h */
/* compiled from: PG */
public final class C41653h extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C41653h f108877k;

    /* renamed from: n */
    private static volatile C63010eb f108878n;

    /* renamed from: a */
    public int f108879a;

    /* renamed from: b */
    public C54231at f108880b;

    /* renamed from: c */
    public boolean f108881c;

    /* renamed from: d */
    public boolean f108882d;

    /* renamed from: e */
    public boolean f108883e;

    /* renamed from: f */
    public boolean f108884f;

    /* renamed from: g */
    public boolean f108885g;

    /* renamed from: h */
    public C41651f f108886h;

    /* renamed from: i */
    public int f108887i;

    /* renamed from: j */
    public C41648c f108888j;

    /* renamed from: l */
    private C62995dn f108889l = C62995dn.f170057a;

    /* renamed from: m */
    private byte f108890m = 2;

    static {
        C41653h hVar = new C41653h();
        f108877k = hVar;
        C62942bv.registerDefaultInstance(C41653h.class, hVar);
    }

    private C41653h() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f108890m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f108890m = b;
                return null;
            case 2:
                return newMessageInfo(f108877k, "\u0001\n\u0000\u0001\u0001\f\n\u0001\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u00052\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\tဉ\u0006\u000bင\b\fᐉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "l", C41652g.f108876a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C41653h();
            case 4:
                return new C41649d();
            case 5:
                return f108877k;
            case 6:
                C63010eb ebVar = f108878n;
                if (ebVar == null) {
                    synchronized (C41653h.class) {
                        ebVar = f108878n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108877k);
                            f108878n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
