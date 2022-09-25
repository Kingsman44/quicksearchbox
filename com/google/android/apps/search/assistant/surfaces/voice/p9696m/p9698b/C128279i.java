package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9698b;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.libraries.search.assistant.p2782r.C36379e;
import com.google.android.libraries.search.assistant.performer.communication.C35666da;
import com.google.android.libraries.search.assistant.performer.communication.C35761g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.permissions.impl.DirectPermissionsRequesterImpl;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.b.i */
/* compiled from: PG */
public final class C128279i implements C35472h {

    /* renamed from: a */
    private final Context f352832a;

    /* renamed from: b */
    private final C60888db f352833b;

    /* renamed from: c */
    private final C46428ao f352834c;

    /* renamed from: d */
    private final C36379e f352835d;

    /* renamed from: e */
    private final C35666da f352836e;

    /* renamed from: f */
    private final C126879a f352837f;

    public C128279i(Context context, C60888db dbVar, C46428ao aoVar, C36379e eVar, C35666da daVar, C126879a aVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        C69664n.m101061g(aoVar, "handler");
        this.f352832a = context;
        this.f352833b = dbVar;
        this.f352834c = aoVar;
        this.f352835d = eVar;
        this.f352836e = daVar;
        this.f352837f = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        DirectPermissionsRequesterImpl directPermissionsRequesterImpl = new DirectPermissionsRequesterImpl(this.f352832a, this.f352833b, this.f352834c);
        C35666da daVar = this.f352836e;
        C35761g gVar = new C35761g();
        gVar.f93687b = this.f352837f;
        gVar.f93686a = directPermissionsRequesterImpl;
        gVar.f93688c = this.f352835d;
        return daVar.mo39784a(gVar.mo39726a());
    }
}
