package com.google.android.apps.search.googleapp.accounts.p10126ui.features.p10135b;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.credential.manager.p10787b.C144089a;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.b.c */
/* compiled from: PG */
public final class C133295c {

    /* renamed from: a */
    public static final C59071e f363219a = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.features.b.c");

    /* renamed from: b */
    public final C144089a f363220b;

    /* renamed from: c */
    public final boolean f363221c;

    /* renamed from: d */
    public final C30306o f363222d;

    /* renamed from: e */
    private final Context f363223e;

    /* renamed from: f */
    private final C143876h f363224f;

    public C133295c(Context context, C143876h hVar, C144089a aVar, boolean z, C30306o oVar) {
        this.f363223e = context;
        this.f363224f = hVar;
        this.f363220b = aVar;
        this.f363221c = z;
        this.f363222d = oVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m216344a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            ((C59052c) ((C59052c) ((C59052c) f363219a.mo56226d()).mo56382g(e)).mo56372aa(40032)).mo56386p("Error sending pending intent to Password Manager.");
        }
    }

    /* renamed from: b */
    public final boolean mo111064b() {
        return this.f363224f.mo119362j(this.f363223e, 214800000) == 0;
    }
}
