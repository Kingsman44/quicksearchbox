package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8391b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6491a.C84347af;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90423d;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c;
import com.google.android.libraries.p11002ag.C147575e;
import com.google.android.libraries.p11002ag.C147576f;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

@Deprecated
/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b.e */
/* compiled from: PG */
public final class C109618e implements C14187c {

    /* renamed from: b */
    private static final C59071e f305267b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b.e");

    /* renamed from: a */
    public NotificationWrapper f305268a;

    /* renamed from: c */
    private BundledMessageNotification f305269c;

    /* renamed from: d */
    private final C84347af f305270d;

    /* renamed from: e */
    private final long f305271e;

    public C109618e(long j, BundledMessageNotification bundledMessageNotification, NotificationWrapper notificationWrapper, C84347af afVar) {
        this.f305269c = bundledMessageNotification;
        this.f305268a = notificationWrapper;
        this.f305271e = j;
        this.f305270d = afVar;
    }

    /* renamed from: a */
    public final int mo21513a() {
        return this.f305269c.mo84113d().size();
    }

    /* renamed from: b */
    public final long mo21514b() {
        return this.f305271e;
    }

    /* renamed from: c */
    public final long mo21515c() {
        if (mo21524l()) {
            return -1;
        }
        return ((MessageNotification) C58557jl.m90131l(this.f305269c.mo84113d())).f252593n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo21516d(android.content.Context r4) {
        /*
            r3 = this;
            com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper r0 = r3.f305268a
            android.service.notification.StatusBarNotification r0 = r0.f252550a
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.app.Notification r0 = r0.getNotification()
            android.graphics.drawable.Icon r0 = r0.getLargeIcon()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 != 0) goto L_0x0070
            com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper r0 = r3.f305268a
            android.service.notification.StatusBarNotification r0 = r0.f252550a
            if (r0 == 0) goto L_0x0023
            android.app.Notification r0 = r0.getNotification()
            androidx.core.app.ae r0 = androidx.core.app.C1788ae.m4919g(r0)     // Catch:{ IllegalArgumentException -> 0x0022 }
            goto L_0x0024
        L_0x0022:
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003b
            java.util.List r0 = r0.f5574a
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x003b
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            androidx.core.app.ad r0 = (androidx.core.app.C1787ad) r0
            androidx.core.app.at r0 = r0.f5570c
            if (r0 == 0) goto L_0x003b
            androidx.core.graphics.drawable.IconCompat r1 = r0.f5631b
        L_0x003b:
            if (r1 == 0) goto L_0x0057
            android.graphics.drawable.Drawable r4 = r1.mo5075d(r4)
            r4.getClass()
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r4 = r4.getBitmap()
            android.graphics.Bitmap r4 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.m31984b(r4)
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r4 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.m31985c(r4)
            j$.util.Optional r4 = p3186j$.util.Optional.ofNullable(r4)
            return r4
        L_0x0057:
            com.google.common.f.e r4 = f305267b
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "Morris.OpaMessageNotif"
            r4.mo56378ag(r0, r1)
            java.lang.String r0 = "No profile icon bitmap found"
            r1 = 24962(0x6182, float:3.4979E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            return r4
        L_0x0070:
            android.graphics.drawable.Drawable r4 = r0.loadDrawable(r4)
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r4 = r4.getBitmap()
            android.graphics.Bitmap r4 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.m31984b(r4)
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r4 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c.m31985c(r4)
            j$.util.Optional r4 = p3186j$.util.Optional.ofNullable(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8391b.C109618e.mo21516d(android.content.Context):j$.util.Optional");
    }

    /* renamed from: e */
    public final String mo21517e() {
        if (!this.f305269c.mo84123m()) {
            return mo97915g();
        }
        CharSequence e = this.f305269c.mo84115e();
        return e == null ? mo97915g() : e.toString();
    }

    /* renamed from: f */
    public final String mo21518f() {
        String i = this.f305269c.mo84119i();
        if (i != null) {
            return i;
        }
        C59104x c = f305267b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.OpaMessageNotif");
        ((C59052c) ((C59052c) c).mo56372aa(24963)).mo56386p("Missing notification key for the bundledMessageNotification.");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: g */
    public final String mo97915g() {
        return this.f305269c.mo84116f().toString();
    }

    /* renamed from: h */
    public final String mo21520h() {
        return this.f305269c.mo84120j();
    }

    /* renamed from: i */
    public final void mo21521i(long j) {
        C90423d dVar = new C90423d();
        C58485gu d = this.f305269c.mo84113d();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            MessageNotification messageNotification = (MessageNotification) d.get(i);
            if (messageNotification.f252593n > j) {
                dVar.mo84150b(messageNotification);
            }
        }
        this.f305269c = new BundledMessageNotification(dVar);
        this.f305268a.f252556g = j;
    }

    /* renamed from: j */
    public final void mo21522j(C14187c cVar) {
        if (cVar instanceof C109618e) {
            C109618e eVar = (C109618e) cVar;
            this.f305269c = eVar.f305269c;
            this.f305268a = eVar.f305268a;
        }
    }

    /* renamed from: k */
    public final boolean mo21523k() {
        try {
            C147576f.m240621c().mo124320f(mo21517e(), Locale.getDefault().getCountry());
            return true;
        } catch (C147575e unused) {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean mo21524l() {
        return this.f305269c.mo84113d().isEmpty();
    }

    /* renamed from: m */
    public final boolean mo21525m() {
        return this.f305269c.mo84123m();
    }

    /* renamed from: n */
    public final /* synthetic */ void mo21526n(C35608aa aaVar) {
        C60870cx cxVar = C60866ct.f164955a;
    }

    /* renamed from: o */
    public final C60870cx mo21527o(boolean z) {
        aco b = this.f305270d.mo77884b(this.f305269c, z);
        if (b == null) {
            b = aco.f134821t;
        }
        return C60856cj.m92900i(b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BundledMessageNotification:[\nMessage Id: ");
        sb.append(this.f305271e);
        C58485gu d = this.f305269c.mo84113d();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            MessageNotification messageNotification = (MessageNotification) d.get(i);
            sb.append(", messageNotification: [App Name: ");
            sb.append(messageNotification.f252581b);
            sb.append(", Package Name: ");
            sb.append(messageNotification.f252591l);
            sb.append(", Sender Name: ");
            sb.append(messageNotification.f252535E);
            sb.append(", Content Creation Time: ");
            sb.append(messageNotification.f252593n);
            sb.append(", Post Time: ");
            sb.append(messageNotification.f252592m);
            sb.append(", Group Name: ");
            sb.append(messageNotification.f252541r);
            sb.append(", Message: ");
            sb.append(messageNotification.f252543t);
            sb.append(", System Notification Key: ");
            sb.append(messageNotification.mo84145c());
            sb.append(", Category: ");
            sb.append(messageNotification.f252584e);
            sb.append(", Content Version Id: ");
            sb.append(messageNotification.f252586g);
            sb.append("],\n");
        }
        sb.append("]");
        return sb.toString();
    }
}
