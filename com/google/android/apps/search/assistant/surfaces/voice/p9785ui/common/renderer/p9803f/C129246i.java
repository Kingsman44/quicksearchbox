package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51387fv;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.i */
/* compiled from: PG */
public final class C129246i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C129246i f355015d;

    /* renamed from: e */
    private static volatile C63010eb f355016e;

    /* renamed from: a */
    public int f355017a;

    /* renamed from: b */
    public C52003hb f355018b;

    /* renamed from: c */
    public C51387fv f355019c;

    static {
        C129246i iVar = new C129246i();
        f355015d = iVar;
        C62942bv.registerDefaultInstance(C129246i.class, iVar);
    }

    private C129246i() {
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
                return newMessageInfo(f355015d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C129246i();
            case 4:
                return new C129245h();
            case 5:
                return f355015d;
            case 6:
                C63010eb ebVar = f355016e;
                if (ebVar == null) {
                    synchronized (C129246i.class) {
                        ebVar = f355016e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355015d);
                            f355016e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
