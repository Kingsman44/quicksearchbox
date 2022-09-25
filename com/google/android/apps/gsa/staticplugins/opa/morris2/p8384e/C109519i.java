package com.google.android.apps.gsa.staticplugins.opa.morris2.p8384e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8391b.C109616c;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14188d;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14170k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

@Deprecated
/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.e.i */
/* compiled from: PG */
public final class C109519i implements C14188d {

    /* renamed from: a */
    private final Context f305038a;

    /* renamed from: b */
    private final C109616c f305039b;

    /* renamed from: c */
    private final C14170k f305040c;

    public C109519i(Context context, C109616c cVar, C14170k kVar) {
        this.f305038a = context;
        this.f305039b = cVar;
        this.f305040c = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final void mo21502b() {
        this.f305039b.f305265c = Optional.m71637of(this.f305040c);
        C58976aa aaVar = C58975e.f156826a;
        this.f305038a.sendBroadcast(new Intent("com.google.android.googlequicksearchbox.REGISTER_MORRIS_NOTIFICATION_LISTENER").setPackage("com.google.android.googlequicksearchbox").setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver")).setFlags(268435456));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f305038a.sendBroadcast(new Intent("com.google.android.googlequicksearchbox.UNREGISTER_MORRIS_NOTIFICATION_LISTENER").setPackage("com.google.android.googlequicksearchbox").setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.notificationlistener.NotificationListenerBroadcastReceiver")).setFlags(268435456));
        this.f305039b.f305265c = Optional.empty();
        C109616c cVar = this.f305039b;
        cVar.f305263a.set(0);
        cVar.f305264b.clear();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }
}
