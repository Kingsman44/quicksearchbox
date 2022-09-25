package p5682q.p5683a.p5684a.p5685a.p5686a.p5687a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: q.a.a.a.a.a.i */
/* compiled from: PG */
public final class C72761i extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C72761i f193441h;

    /* renamed from: i */
    private static volatile C63010eb f193442i;

    /* renamed from: a */
    public C62995dn f193443a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f193444b = C62995dn.f170057a;

    /* renamed from: c */
    public C62971cq f193445c = emptyProtobufList();

    /* renamed from: d */
    public C62964ck f193446d = emptyLongList();

    /* renamed from: e */
    public C62961ch f193447e = emptyIntList();

    /* renamed from: f */
    public C62961ch f193448f = emptyIntList();

    /* renamed from: g */
    public C62964ck f193449g = emptyLongList();

    static {
        C72761i iVar = new C72761i();
        f193441h = iVar;
        C62942bv.registerDefaultInstance(C72761i.class, iVar);
    }

    private C72761i() {
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
                return newMessageInfo(f193441h, "\u0001\u0007\u0000\u0000\u0002\n\u0007\u0002\u0005\u0000\u00022\u00032\u0006\u001b\u0007%\b'\t'\n%", new Object[]{"a", C72759g.f193439a, "b", C72760h.f193440a, C45240c.f118157a, C72755c.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C72761i();
            case 4:
                return new C72758f();
            case 5:
                return f193441h;
            case 6:
                C63010eb ebVar = f193442i;
                if (ebVar == null) {
                    synchronized (C72761i.class) {
                        ebVar = f193442i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f193441h);
                            f193442i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
