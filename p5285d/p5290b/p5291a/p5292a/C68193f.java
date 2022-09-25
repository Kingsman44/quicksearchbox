package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: d.b.a.a.f */
/* compiled from: PG */
public final class C68193f extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C68193f f184513i;

    /* renamed from: j */
    private static volatile C63010eb f184514j;

    /* renamed from: a */
    public String f184515a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f184516b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f184517c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f184518d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f184519e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f184520f = emptyProtobufList();

    /* renamed from: g */
    public C63088z f184521g = C63088z.f170246b;

    /* renamed from: h */
    public C62910ar f184522h;

    static {
        C68193f fVar = new C68193f();
        f184513i = fVar;
        C62942bv.registerDefaultInstance(C68193f.class, fVar);
    }

    private C68193f() {
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
                return newMessageInfo(f184513i, "\u0000\b\u0000\u0000\u0002\u000b\b\u0000\u0001\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0007Ȉ\b\u001b\t\n\u000b\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C68172bh.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C68193f();
            case 4:
                return new C68192e();
            case 5:
                return f184513i;
            case 6:
                C63010eb ebVar = f184514j;
                if (ebVar == null) {
                    synchronized (C68193f.class) {
                        ebVar = f184514j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184513i);
                            f184514j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
