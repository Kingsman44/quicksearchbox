package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131690b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.am */
/* compiled from: PG */
public final class C131773am implements C131690b {

    /* renamed from: a */
    private static final C58974d f359953a = C58974d.m91136j();

    /* renamed from: b */
    private final Context f359954b;

    public C131773am(Context context) {
        this.f359954b = context;
    }

    /* renamed from: a */
    public final C60870cx mo110264a(Intent intent) {
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final C60870cx mo110265b(boolean z) {
        Context context = this.f359954b;
        context.sendBroadcast(new Intent(context, LocationUpdateReceiver_Receiver.class).setAction("com.google.android.search.assistant.ambient.REGISTER_UPDATES").putExtra("USER ACTION", z));
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo110266c() {
        ((C58970a) ((C58970a) f359953a.mo56224b()).mo56372aa(39365)).mo56386p("LocationUpdate subscription stop.");
        Context context = this.f359954b;
        context.sendBroadcast(new Intent(context, LocationUpdateReceiver_Receiver.class).setAction("com.google.android.search.assistant.ambient.UNREGISTER_UPDATES"));
        return C60866ct.f164955a;
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo110267d(String str) {
        return false;
    }
}
