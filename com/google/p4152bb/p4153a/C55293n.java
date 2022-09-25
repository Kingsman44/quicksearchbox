package com.google.p4152bb.p4153a;

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

/* renamed from: com.google.bb.a.n */
/* compiled from: PG */
public final class C55293n extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C55293n f145650k;

    /* renamed from: m */
    private static volatile C63010eb f145651m;

    /* renamed from: a */
    public int f145652a;

    /* renamed from: b */
    public String f145653b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f145654c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f145655d;

    /* renamed from: e */
    public C55136he f145656e;

    /* renamed from: f */
    public C55136he f145657f;

    /* renamed from: g */
    public C55136he f145658g;

    /* renamed from: h */
    public C62971cq f145659h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public C62971cq f145660i = emptyProtobufList();

    /* renamed from: j */
    public C55239l f145661j;

    /* renamed from: l */
    private byte f145662l = 2;

    static {
        C55293n nVar = new C55293n();
        f145650k = nVar;
        C62942bv.registerDefaultInstance(C55293n.class, nVar);
    }

    private C55293n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145662l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145662l = b;
                return null;
            case 2:
                return newMessageInfo(f145650k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0005\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007\u001a\bЛ\tᐉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C55077f.class, "j"});
            case 3:
                return new C55293n();
            case 4:
                return new C55266m();
            case 5:
                return f145650k;
            case 6:
                C63010eb ebVar = f145651m;
                if (ebVar == null) {
                    synchronized (C55293n.class) {
                        ebVar = f145651m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145650k);
                            f145651m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
