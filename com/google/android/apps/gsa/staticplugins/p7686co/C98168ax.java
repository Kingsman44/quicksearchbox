package com.google.android.apps.gsa.staticplugins.p7686co;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7634eg;
import com.google.p375ai.p378b.C7635eh;
import com.google.p375ai.p378b.C7798ki;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.ax */
/* compiled from: PG */
public final /* synthetic */ class C98168ax implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98237bb f274127a;

    public /* synthetic */ C98168ax(C98237bb bbVar) {
        this.f274127a = bbVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C86338r a = this.f274127a.f274299j.f232790a.mo79722a();
        if (!a.contains("latency_event_id")) {
            return C58836b.f156633a;
        }
        Math.random();
        byte[] e = a.mo80079e("latency_event_id", (byte[]) null);
        C7634eg egVar = (C7634eg) C7635eh.f26379f.createBuilder();
        int i = 0;
        int i2 = a.getInt("total_network_latency", 0);
        egVar.copyOnWrite();
        C7635eh ehVar = (C7635eh) egVar.instance;
        ehVar.f26381a |= 2;
        ehVar.f26383c = i2;
        int i3 = a.getInt("deserialization_latency", 0);
        egVar.copyOnWrite();
        C7635eh ehVar2 = (C7635eh) egVar.instance;
        ehVar2.f26381a |= 4;
        ehVar2.f26384d = i3;
        if (e != null) {
            C63088z A = C63088z.m96139A(e);
            egVar.copyOnWrite();
            C7635eh ehVar3 = (C7635eh) egVar.instance;
            ehVar3.f26381a |= 1;
            ehVar3.f26382b = A;
        }
        int i4 = a.getInt("target_display", -1);
        if (i4 != -1) {
            i = C7798ki.m22853a(i4);
        }
        if (i != 0) {
            egVar.copyOnWrite();
            C7635eh ehVar4 = (C7635eh) egVar.instance;
            ehVar4.f26385e = i;
            ehVar4.f26381a |= 8;
        }
        return C58833ax.m90834k((C7635eh) egVar.build());
    }
}
