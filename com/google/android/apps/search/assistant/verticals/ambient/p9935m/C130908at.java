package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50827dx;
import com.google.assistant.p3886c.C50833ec;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.at */
/* compiled from: PG */
public final /* synthetic */ class C130908at implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f358202a;

    /* renamed from: b */
    public final /* synthetic */ int f358203b;

    public /* synthetic */ C130908at(int i, boolean z) {
        this.f358203b = i;
        this.f358202a = z;
    }

    public final Object apply(Object obj) {
        int i = this.f358203b;
        boolean z = this.f358202a;
        C50833ec ecVar = (C50833ec) obj;
        C50827dx dxVar = (C50827dx) ecVar.toBuilder();
        int i2 = i - 1;
        boolean z2 = true;
        if (!z) {
            C62995dn dnVar = ecVar.f132355d;
            Integer valueOf = Integer.valueOf(i2);
            if (!dnVar.containsKey(valueOf) || !((Boolean) dnVar.get(valueOf)).booleanValue()) {
                z2 = false;
            }
        }
        dxVar.copyOnWrite();
        ((C50833ec) dxVar.instance).mo53482c().put(Integer.valueOf(i2), Boolean.valueOf(z2));
        return (C50833ec) dxVar.build();
    }
}
