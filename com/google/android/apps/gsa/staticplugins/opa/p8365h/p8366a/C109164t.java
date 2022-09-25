package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8215b.C106522a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107061a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.t */
/* compiled from: PG */
public final /* synthetic */ class C109164t implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C109144ac f303975a;

    /* renamed from: b */
    public final /* synthetic */ Context f303976b;

    public /* synthetic */ C109164t(C109144ac acVar, Context context) {
        this.f303975a = acVar;
        this.f303976b = context;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C109144ac acVar = this.f303975a;
        Context context = this.f303976b;
        C60870cx cxVar = C118826c.f331423b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        ((C58970a) ((C58970a) acVar.f303932a.mo56224b()).mo56372aa(23891)).mo56386p("connecting to AmbBroadcastReceiver");
        boolean b = C107061a.m177777b(acVar.f303938g);
        boolean J = C83794j.m133429J(context, acVar.f303942k);
        boolean j = acVar.f303938g.mo85405j(C90017bw.f247969be);
        ((C58970a) ((C58970a) acVar.f303932a.mo56224b()).mo56372aa(23892)).mo56359L("enable ambient assistant: %b, isWidgetInstalled: %b, BlueChipSmartspaceEnabled: %b", Boolean.valueOf(b), Boolean.valueOf(J), Boolean.valueOf(j));
        if (b) {
            if (acVar.f303938g.mo85405j(C90017bw.f247868J)) {
                ((C58970a) ((C58970a) acVar.f303932a.mo56224b()).mo56372aa(23894)).mo56386p("connect(): listening to headphone on broadcast.");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
                intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            }
            if (acVar.f303938g.mo85405j(C90017bw.f247872N) && (!acVar.f303938g.mo85405j(C90017bw.f247897aL) || j || J)) {
                ((C58970a) ((C58970a) acVar.f303932a.mo56224b()).mo56372aa(23893)).mo56387q("connect(): setting up trigger sources of size: %d", ((C58528ij) acVar.f303936e.mo6453a()).size());
                cxVar = C47638k.m84750a((Iterable) Collection.EL.stream((C58528ij) acVar.f303936e.mo6453a()).peek(new C109151g(acVar)).map(C109152h.f303958a).collect(C58370cn.f155946a)).mo51520a(C109153i.f303959a, acVar.f303939h);
                if (acVar.f303937f.isPresent()) {
                    ((C106522a) acVar.f303937f.get()).mo95564a();
                }
            }
        }
        context.registerReceiver(acVar, intentFilter);
        C46459k.m82829b(acVar.f303935d.mo97656a(new Intent("pss_action_startup")), "connect(): failed ACTION_INITIAL_STARTUP", new Object[0]);
        return cxVar;
    }
}
