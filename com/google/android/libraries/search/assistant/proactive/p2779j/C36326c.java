package com.google.android.libraries.search.assistant.proactive.p2779j;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.TreeNodeRef;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.assistant.p3803ag.p3804a.C48800ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4541l.C59326i;
import com.google.common.p4552o.ajz;
import com.google.p3717aq.p3718a.p3719a.C47874h;
import java.util.ArrayList;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.assistant.proactive.j.c */
/* compiled from: PG */
public final class C36326c {

    /* renamed from: a */
    public byte[] f94841a = null;

    /* renamed from: b */
    public Instant f94842b = Instant.MIN;

    /* renamed from: c */
    public Intent f94843c = null;

    /* renamed from: d */
    public String f94844d = null;

    /* renamed from: e */
    public String f94845e = null;

    /* renamed from: f */
    public String f94846f;

    /* renamed from: g */
    public ajz f94847g = null;

    /* renamed from: h */
    public boolean f94848h = false;

    /* renamed from: i */
    public boolean f94849i = false;

    /* renamed from: j */
    public boolean f94850j = false;

    /* renamed from: k */
    public int f94851k = -1;

    /* renamed from: l */
    public int f94852l = -1;

    /* renamed from: m */
    public boolean f94853m = false;

    /* renamed from: n */
    public int f94854n = 2;

    /* renamed from: o */
    private final Context f94855o;

    /* renamed from: p */
    private String f94856p = null;

    /* renamed from: q */
    private C48800ah f94857q = null;

    public C36326c(Context context) {
        this.f94855o = context;
    }

    /* renamed from: a */
    public final PendingIntent mo40105a() {
        if (this.f94853m) {
            return PendingIntent.getActivity(this.f94855o, 0, C147798a.m240896b(mo40106b(), 201326592, 0), 201326592);
        }
        return C147798a.m240897c(this.f94855o, 0, mo40106b(), 201326592);
    }

    /* renamed from: b */
    public final Intent mo40106b() {
        Intent className = new Intent().setAction("com.google.android.search.core.action.OPA_PROACTIVE_NOTIFICATION_TAPPED").setClassName(this.f94855o, true != this.f94853m ? "com.google.android.apps.gsa.search.core.service.SearchService" : "com.google.android.apps.gsa.staticplugins.opa.worker.proactive.NotificationTapActivity");
        ArrayList arrayList = new ArrayList();
        byte[] bArr = this.f94841a;
        if (bArr != null && bArr.length > 0) {
            className.putExtra("com.google.android.search.core.extra.EXTRA_OPA_PROACTIVE_OPAQUE_TOKEN", bArr);
            C59326i iVar = C59326i.f157517e;
            byte[] bArr2 = this.f94841a;
            arrayList.add(iVar.mo56837l(bArr2, bArr2.length));
        }
        int i = this.f94852l;
        if (i == -1) {
            className.putExtra("gil-tree-ref", TreeNodeRef.m53228b(1));
        } else {
            className.putExtra("gil-tree-ref", TreeNodeRef.m53228b(i + 2));
        }
        Intent intent = this.f94843c;
        if (intent != null) {
            className.putExtra("target-intent", intent);
        }
        int i2 = this.f94851k;
        if (i2 != -1) {
            className.putExtra("android-notification-id", i2);
            arrayList.add(Integer.valueOf(this.f94851k));
        }
        int i3 = this.f94852l;
        if (i3 != -1) {
            className.putExtra("button-index", i3);
            arrayList.add(Integer.valueOf(this.f94852l));
        }
        if (!C58837ba.m90859h(this.f94844d)) {
            className.putExtra("grouping-key", this.f94844d);
            arrayList.add(this.f94844d);
        }
        if (!C58837ba.m90859h(this.f94845e)) {
            className.putExtra("ved", this.f94845e);
        }
        className.setData(Uri.parse("assistant-notifications://").buildUpon().appendQueryParameter("action", C36325b.CLICK.f94840c).appendQueryParameter("data", TextUtils.join(":", arrayList)).build());
        int i4 = this.f94854n;
        if (!(i4 == 2 || i4 == 1)) {
            className.putExtra("button-type", C47874h.m85091a(i4));
        }
        ajz ajz = this.f94847g;
        if (ajz != null) {
            className.putExtra("notification-logging-metadata", ajz.toByteArray());
        }
        C48800ah ahVar = this.f94857q;
        if (ahVar != null) {
            className.putExtra("proactive_api_metadata", ahVar.toByteArray());
        }
        className.putExtra("explicit-dismiss-on-tap", this.f94848h);
        if (!C58837ba.m90859h(this.f94846f)) {
            className.putExtra("survey-trigger-id", this.f94846f);
        }
        if (!C58837ba.m90859h(this.f94856p)) {
            className.putExtra("bundle-id", this.f94856p);
        }
        className.putExtra("disable-auto-dismiss", this.f94849i);
        if (!this.f94842b.equals(Instant.MIN)) {
            className.putExtra("expiry-time-ms", this.f94842b.toEpochMilli());
        }
        className.putExtra("log-pseudonymously", this.f94850j);
        if (this.f94853m) {
            className.setFlags(268484608);
            className.toURI();
        }
        return className;
    }

    /* renamed from: c */
    public final void mo40107c(C58833ax axVar) {
        if (axVar.mo56113h()) {
            this.f94857q = (C48800ah) axVar.mo56107c();
        }
    }

    /* renamed from: d */
    public final void mo40108d(String str) {
        if (!C58837ba.m90859h(str)) {
            this.f94856p = str;
        }
    }
}
