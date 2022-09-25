package p5285d.p5290b.p5291a.p5292a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: d.b.a.a.bq */
/* compiled from: PG */
public final class C68181bq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68181bq f184490b;

    /* renamed from: c */
    private static volatile C63010eb f184491c;

    /* renamed from: a */
    public String f184492a = BuildConfig.FLAVOR;

    static {
        C68181bq bqVar = new C68181bq();
        f184490b = bqVar;
        C62942bv.registerDefaultInstance(C68181bq.class, bqVar);
    }

    private C68181bq() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f184490b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C68181bq();
            case 4:
                return new C68180bp();
            case 5:
                return f184490b;
            case 6:
                C63010eb ebVar = f184491c;
                if (ebVar == null) {
                    synchronized (C68181bq.class) {
                        ebVar = f184491c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184490b);
                            f184491c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
