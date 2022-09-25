package p5602o.p5607c;

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

/* renamed from: o.c.u */
/* compiled from: PG */
public final class C71950u extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C71950u f191635i;

    /* renamed from: j */
    private static volatile C63010eb f191636j;

    /* renamed from: a */
    public int f191637a;

    /* renamed from: b */
    public C71952w f191638b;

    /* renamed from: c */
    public C71954y f191639c;

    /* renamed from: d */
    public C62961ch f191640d = emptyIntList();

    /* renamed from: e */
    public boolean f191641e;

    /* renamed from: f */
    public boolean f191642f;

    /* renamed from: g */
    public boolean f191643g;

    /* renamed from: h */
    public C71942m f191644h;

    static {
        C71950u uVar = new C71950u();
        f191635i = uVar;
        C62942bv.registerDefaultInstance(C71950u.class, uVar);
    }

    private C71950u() {
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
                return newMessageInfo(f191635i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001e\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C71924aa.m105228b(), "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C71950u();
            case 4:
                return new C71949t();
            case 5:
                return f191635i;
            case 6:
                C63010eb ebVar = f191636j;
                if (ebVar == null) {
                    synchronized (C71950u.class) {
                        ebVar = f191636j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191635i);
                            f191636j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
