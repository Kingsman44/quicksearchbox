package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.af */
/* compiled from: PG */
public final class C7518af extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C7518af f26025j;

    /* renamed from: m */
    private static volatile C63010eb f26026m;

    /* renamed from: a */
    public int f26027a;

    /* renamed from: b */
    public C7838lv f26028b;

    /* renamed from: c */
    public C62971cq f26029c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f26030d = emptyProtobufList();

    /* renamed from: e */
    public int f26031e;

    /* renamed from: f */
    public C7536ax f26032f;

    /* renamed from: g */
    public int f26033g;

    /* renamed from: h */
    public int f26034h;

    /* renamed from: i */
    public boolean f26035i;

    /* renamed from: k */
    private boolean f26036k;

    /* renamed from: l */
    private byte f26037l = 2;

    static {
        C7518af afVar = new C7518af();
        f26025j = afVar;
        C62942bv.registerDefaultInstance(C7518af.class, afVar);
    }

    private C7518af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26037l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26037l = b;
                return null;
            case 2:
                return newMessageInfo(f26025j, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0001\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ᐉ\u0002\u0005ဇ\u0003\u0006ဆ\u0004\u0007ဌ\u0005\bဇ\u0006\n\u001b", new Object[]{"a", "b", C45240c.f118157a, C7818lb.class, "e", C7514ab.f26023a, C10662f.f35572a, C19621k.f54601a, C30325g.f82003a, C19618h.f54585a, C7516ad.f26024a, "i", "d", C7818lb.class});
            case 3:
                return new C7518af();
            case 4:
                return new C7513aa();
            case 5:
                return f26025j;
            case 6:
                C63010eb ebVar = f26026m;
                if (ebVar == null) {
                    synchronized (C7518af.class) {
                        ebVar = f26026m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26025j);
                            f26026m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
