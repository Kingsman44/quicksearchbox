package com.google.protos.p4850an.p4851a.p4852a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.a.a.b */
/* compiled from: PG */
public final class C63318b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C63318b f171125i;

    /* renamed from: k */
    private static volatile C63010eb f171126k;

    /* renamed from: a */
    public int f171127a;

    /* renamed from: b */
    public C61748j f171128b;

    /* renamed from: c */
    public String f171129c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f171130d;

    /* renamed from: e */
    public int f171131e;

    /* renamed from: f */
    public float f171132f;

    /* renamed from: g */
    public String f171133g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C61762x f171134h;

    /* renamed from: j */
    private byte f171135j = 2;

    static {
        C63318b bVar = new C63318b();
        f171125i = bVar;
        C62942bv.registerDefaultInstance(C63318b.class, bVar);
    }

    private C63318b() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171135j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171135j = b;
                return null;
            case 2:
                return newMessageInfo(f171125i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ခ\u0004\u0006ဈ\u0005\u0007ᐉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C63318b();
            case 4:
                return new C63317a();
            case 5:
                return f171125i;
            case 6:
                C63010eb ebVar = f171126k;
                if (ebVar == null) {
                    synchronized (C63318b.class) {
                        ebVar = f171126k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171125i);
                            f171126k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
