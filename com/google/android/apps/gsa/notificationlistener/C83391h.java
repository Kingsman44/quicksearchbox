package com.google.android.apps.gsa.notificationlistener;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36599b;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.notificationlistener.h */
/* compiled from: PG */
public final class C83391h extends C83393i {

    /* renamed from: a */
    public static final C59071e f227273a = C59071e.m91332i("com.google.android.apps.gsa.notificationlistener.h");

    /* renamed from: b */
    public static final AtomicReference f227274b = new AtomicReference();

    /* renamed from: c */
    static final Set f227275c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    public static final AtomicReference f227276d = new AtomicReference((Object) null);

    /* renamed from: e */
    public final Set f227277e = Collections.synchronizedSet(new HashSet());

    /* renamed from: f */
    public final AtomicBoolean f227278f = new AtomicBoolean(false);

    /* renamed from: g */
    public final GsaNotificationListenerService f227279g;

    /* renamed from: h */
    public final Optional f227280h;

    /* renamed from: com.google.android.apps.gsa.notificationlistener.h$a */
    /* compiled from: PG */
    public interface C83392a {
        /* renamed from: av */
        C83384ad mo76693av();
    }

    public C83391h(GsaNotificationListenerService gsaNotificationListenerService, Optional optional) {
        this.f227279g = gsaNotificationListenerService;
        this.f227280h = optional;
    }

    /* renamed from: a */
    public static GsaNotificationListenerService m132722a() {
        C83391h hVar = (C83391h) f227274b.get();
        if (hVar == null || !hVar.f227278f.get()) {
            return null;
        }
        return hVar.f227279g;
    }

    /* renamed from: b */
    public static C83384ad m132723b() {
        C58881cr crVar = (C58881cr) f227276d.get();
        if (crVar != null) {
            return (C83384ad) crVar.mo6453a();
        }
        return null;
    }

    /* renamed from: c */
    static String m132724c(Context context) {
        C83384ad b;
        C83391h hVar = (C83391h) f227274b.get();
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[5];
        boolean z = false;
        objArr[0] = Integer.valueOf(hVar != null ? hVar.f227277e.size() : 0);
        objArr[1] = Boolean.valueOf(C36619a.m65148d(context));
        boolean z2 = hVar == null;
        if (!(hVar == null || (b = m132723b()) == null || !b.mo76684b())) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = Boolean.valueOf(m132726f());
        objArr[4] = Boolean.valueOf(!z2);
        return String.format(locale, "%d subscribers, hasAccess=%b, isReviving=%b, isConnected=%b, isBound=%b", objArr);
    }

    /* renamed from: d */
    public static void m132725d() {
        C58881cr crVar = (C58881cr) f227276d.getAndSet((Object) null);
        if (crVar != null) {
            ((C83384ad) crVar.mo6453a()).mo76683a();
        }
    }

    /* renamed from: f */
    static boolean m132726f() {
        return m132722a() != null;
    }

    /* renamed from: g */
    static StatusBarNotification[] m132727g(Optional optional) {
        C58976aa aaVar = C58975e.f156826a;
        m132726f();
        GsaNotificationListenerService a = m132722a();
        if (a == null) {
            return null;
        }
        if (optional.isPresent()) {
            return a.getActiveNotifications((String[]) ((List) optional.get()).toArray(new String[0]));
        }
        return a.getActiveNotifications();
    }

    /* renamed from: e */
    public final void mo76692e() {
        if (!this.f227278f.get()) {
            C59104x d = f227273a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GsaNotiListenerService");
            ((C59052c) ((C59052c) d).mo56372aa(6591)).mo56386p("onListenerDisconnected() called while disconnected");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        this.f227278f.set(false);
        boolean d2 = C36619a.m65148d(this.f227279g);
        synchronized (this.f227277e) {
            for (C36599b b : this.f227277e) {
                b.mo21530b(d2);
            }
            this.f227277e.clear();
        }
    }
}
