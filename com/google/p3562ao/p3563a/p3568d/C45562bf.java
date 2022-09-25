package com.google.p3562ao.p3563a.p3568d;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.ao.a.d.bf */
/* compiled from: PG */
public final class C45562bf extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C45562bf f119067i;

    /* renamed from: j */
    private static volatile C63010eb f119068j;

    /* renamed from: a */
    public C45558bb f119069a;

    /* renamed from: b */
    public String f119070b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f119071c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62961ch f119072d;

    /* renamed from: e */
    public String f119073e;

    /* renamed from: f */
    public boolean f119074f;

    /* renamed from: g */
    public int f119075g;

    /* renamed from: h */
    public C45561be f119076h;

    static {
        C45562bf bfVar = new C45562bf();
        f119067i = bfVar;
        C62942bv.registerDefaultInstance(C45562bf.class, bfVar);
    }

    private C45562bf() {
        C62942bv.emptyProtobufList();
        this.f119072d = emptyIntList();
        this.f119073e = BuildConfig.FLAVOR;
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f119067i, "\u0000\b\u0000\u0000\u0001\u0011\b\u0000\u0002\u0000\u0001\t\u0002Ȉ\u0003Ț\u0004,\u0006Ȉ\b\u0007\t\f\u0011\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C45562bf();
            case 4:
                return new C45559bc();
            case 5:
                return f119067i;
            case 6:
                C63010eb ebVar = f119068j;
                if (ebVar == null) {
                    synchronized (C45562bf.class) {
                        ebVar = f119068j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119067i);
                            f119068j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
