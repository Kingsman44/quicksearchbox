package p5602o.p5604b.p5605a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: o.b.a.e */
/* compiled from: PG */
public final class C71879e extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C71879e f191433k;

    /* renamed from: l */
    private static volatile C63010eb f191434l;

    /* renamed from: a */
    public int f191435a;

    /* renamed from: b */
    public int f191436b;

    /* renamed from: c */
    public int f191437c;

    /* renamed from: d */
    public long f191438d;

    /* renamed from: e */
    public int f191439e;

    /* renamed from: f */
    public int f191440f;

    /* renamed from: g */
    public int f191441g;

    /* renamed from: h */
    public int f191442h;

    /* renamed from: i */
    public int f191443i;

    /* renamed from: j */
    public int f191444j;

    static {
        C71879e eVar = new C71879e();
        f191433k = eVar;
        C62942bv.registerDefaultInstance(C71879e.class, eVar);
    }

    private C71879e() {
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
                Object[] objArr = new Object[15];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C71895u.f191494a;
                objArr[3] = C45240c.f118157a;
                objArr[4] = C71896v.f191495a;
                objArr[5] = "d";
                objArr[6] = "e";
                objArr[7] = C10662f.f35572a;
                C62959cf cfVar = C71897w.f191496a;
                objArr[10] = cfVar;
                objArr[8] = cfVar;
                objArr[9] = C30325g.f82003a;
                objArr[11] = C19618h.f54585a;
                objArr[12] = C71899y.f191498a;
                objArr[13] = "i";
                objArr[14] = "j";
                return newMessageInfo(f191433k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bင\u0007\rင\f", objArr);
            case 3:
                return new C71879e();
            case 4:
                return new C71878d();
            case 5:
                return f191433k;
            case 6:
                C63010eb ebVar = f191434l;
                if (ebVar == null) {
                    synchronized (C71879e.class) {
                        ebVar = f191434l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f191433k);
                            f191434l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
