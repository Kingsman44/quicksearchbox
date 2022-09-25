package p001a.p014d.p015a.p016a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: a.d.a.a.c */
/* compiled from: PG */
public final class C0058c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C0058c f152c;

    /* renamed from: d */
    private static volatile C63010eb f153d;

    /* renamed from: a */
    public String f154a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f155b = BuildConfig.FLAVOR;

    static {
        C0058c cVar = new C0058c();
        f152c = cVar;
        C62942bv.registerDefaultInstance(C0058c.class, cVar);
    }

    private C0058c() {
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
                return newMessageInfo(f152c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C0058c();
            case 4:
                return new C0057b();
            case 5:
                return f152c;
            case 6:
                C63010eb ebVar = f153d;
                if (ebVar == null) {
                    synchronized (C0058c.class) {
                        ebVar = f153d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152c);
                            f153d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
