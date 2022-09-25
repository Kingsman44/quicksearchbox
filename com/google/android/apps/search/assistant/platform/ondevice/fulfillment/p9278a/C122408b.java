package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.b */
/* compiled from: PG */
public final class C122408b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C122408b f339356h;

    /* renamed from: i */
    private static volatile C63010eb f339357i;

    /* renamed from: a */
    public int f339358a;

    /* renamed from: b */
    public String f339359b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f339360c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f339361d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63179l f339362e;

    /* renamed from: f */
    public long f339363f;

    /* renamed from: g */
    public C122452g f339364g;

    static {
        C122408b bVar = new C122408b();
        f339356h = bVar;
        C62942bv.registerDefaultInstance(C122408b.class, bVar);
    }

    private C122408b() {
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
                return newMessageInfo(f339356h, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t\u0005ဂ\u0000\u0006\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C122408b();
            case 4:
                return new C122381a();
            case 5:
                return f339356h;
            case 6:
                C63010eb ebVar = f339357i;
                if (ebVar == null) {
                    synchronized (C122408b.class) {
                        ebVar = f339357i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339356h);
                            f339357i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
