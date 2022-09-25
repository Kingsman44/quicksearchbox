package p211b.p212a.p219g;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import p211b.p212a.p216d.C4665l;
import p211b.p212a.p216d.C4666m;

/* renamed from: b.a.g.b */
/* compiled from: PG */
public final class C4673b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C4673b f14647g;

    /* renamed from: h */
    public static final C62940bt f14648h;

    /* renamed from: j */
    private static volatile C63010eb f14649j;

    /* renamed from: a */
    public int f14650a;

    /* renamed from: b */
    public C62971cq f14651b = emptyProtobufList();

    /* renamed from: c */
    public C4665l f14652c;

    /* renamed from: d */
    public int f14653d;

    /* renamed from: e */
    public int f14654e;

    /* renamed from: f */
    public int f14655f;

    /* renamed from: i */
    private byte f14656i = 2;

    static {
        C4673b bVar = new C4673b();
        f14647g = bVar;
        C62942bv.registerDefaultInstance(C4673b.class, bVar);
        f14648h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 194540650, C63066gd.MESSAGE, C4673b.class);
    }

    private C4673b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f14656i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f14656i = b;
                return null;
            case 2:
                Object[] objArr = new Object[9];
                objArr[0] = "a";
                objArr[1] = "b";
                objArr[2] = C56425d.class;
                objArr[3] = C45240c.f118157a;
                objArr[4] = "d";
                C62959cf cfVar = C4666m.f14631a;
                objArr[7] = cfVar;
                objArr[5] = cfVar;
                objArr[6] = "e";
                objArr[8] = C10662f.f35572a;
                return newMessageInfo(f14647g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဌ\u0001\u0004ဌ\u0002\u0005င\u0003", objArr);
            case 3:
                return new C4673b();
            case 4:
                return new C4672a();
            case 5:
                return f14647g;
            case 6:
                C63010eb ebVar = f14649j;
                if (ebVar == null) {
                    synchronized (C4673b.class) {
                        ebVar = f14649j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f14647g);
                            f14649j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
