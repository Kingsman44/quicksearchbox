package p001a.p014d.p015a.p016a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.af */
/* compiled from: PG */
public final class C0043af extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C0043af f114m;

    /* renamed from: n */
    private static volatile C63010eb f115n;

    /* renamed from: a */
    public int f116a;

    /* renamed from: b */
    public C49192d f117b;

    /* renamed from: c */
    public C62971cq f118c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f119d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f120e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f121f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f122g = emptyProtobufList();

    /* renamed from: h */
    public C62971cq f123h = emptyProtobufList();

    /* renamed from: i */
    public C62971cq f124i = emptyProtobufList();

    /* renamed from: j */
    public C62971cq f125j = emptyProtobufList();

    /* renamed from: k */
    public float f126k;

    /* renamed from: l */
    public float f127l;

    static {
        C0043af afVar = new C0043af();
        f114m = afVar;
        C62942bv.registerDefaultInstance(C0043af.class, afVar);
    }

    private C0043af() {
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
                return newMessageInfo(f114m, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\b\u0000\u0001\t\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\t\u001b\nခ\u0000\u000bခ\u0001", new Object[]{"a", "b", C45240c.f118157a, C0081z.class, "d", C0081z.class, "e", C0081z.class, C10662f.f35572a, C0081z.class, "i", C0081z.class, C30325g.f82003a, C0081z.class, C19618h.f54585a, C0081z.class, "j", C0081z.class, C19621k.f54601a, "l"});
            case 3:
                return new C0043af();
            case 4:
                return new C0042ae();
            case 5:
                return f114m;
            case 6:
                C63010eb ebVar = f115n;
                if (ebVar == null) {
                    synchronized (C0043af.class) {
                        ebVar = f115n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f114m);
                            f115n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
