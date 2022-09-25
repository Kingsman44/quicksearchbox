package com.google.android.apps.search.googleapp.compliance.p10145b;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.compliance.b.e */
/* compiled from: PG */
public final /* synthetic */ class C133607e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C133607e f363968a = new C133607e();

    private /* synthetic */ C133607e() {
    }

    public final Object apply(Object obj) {
        C133614l lVar;
        C133604b bVar = (C133604b) obj;
        C59071e eVar = C133612j.f363974b;
        C133603a aVar = (C133603a) bVar.toBuilder();
        C133614l a = C133614l.m216828a(bVar.f363967b);
        if (a == null) {
            a = C133614l.HINT_UNSPECIFIED;
        }
        switch (a.ordinal()) {
            case 0:
            case 5:
                lVar = C133614l.HINT_ROTATION_INTERMEDIATE_1;
                break;
            case 1:
                lVar = C133614l.HINT_ROTATION_INTERMEDIATE_2;
                break;
            case 2:
                lVar = C133614l.HINT_ROTATION_1;
                break;
            case 3:
                lVar = C133614l.HINT_ROTATION_INTERMEDIATE_3;
                break;
            case 4:
                lVar = C133614l.HINT_ROTATION_2;
                break;
            case 6:
                lVar = C133614l.HINT_ROTATION_3;
                break;
            default:
                throw new AssertionError("Improper Encrypted Search Enum state");
        }
        aVar.copyOnWrite();
        C133604b bVar2 = (C133604b) aVar.instance;
        bVar2.f363967b = lVar.f363987h;
        bVar2.f363966a |= 1;
        return (C133604b) aVar.build();
    }
}
