package com.google.protos.p4850an;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.an.bg */
/* compiled from: PG */
public final class C63389bg extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C63389bg f171305d;

    /* renamed from: h */
    private static volatile C63010eb f171306h;

    /* renamed from: a */
    public int f171307a;

    /* renamed from: b */
    public String f171308b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C8213ab f171309c;

    /* renamed from: e */
    private C8242v f171310e;

    /* renamed from: f */
    private C63771b f171311f;

    /* renamed from: g */
    private byte f171312g = 2;

    static {
        C63389bg bgVar = new C63389bg();
        f171305d = bgVar;
        C62942bv.registerDefaultInstance(C63389bg.class, bgVar);
    }

    private C63389bg() {
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyLongList();
        emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171312g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171312g = b;
                return null;
            case 2:
                return newMessageInfo(f171305d, "\u0001\u0004\u0000\u0001\u0001\u0018\u0004\u0000\u0000\u0003\u0001ဈ\u0000\bᐉ\b\tᐉ\t\u0018ᐉ\u0010", new Object[]{"a", "b", "e", C45240c.f118157a, C10662f.f35572a});
            case 3:
                return new C63389bg();
            case 4:
                return new C63388bf();
            case 5:
                return f171305d;
            case 6:
                C63010eb ebVar = f171306h;
                if (ebVar == null) {
                    synchronized (C63389bg.class) {
                        ebVar = f171306h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171305d);
                            f171306h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
