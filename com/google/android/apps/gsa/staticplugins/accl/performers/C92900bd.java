package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bd */
/* compiled from: PG */
public final class C92900bd extends C22538o {

    /* renamed from: i */
    public static final /* synthetic */ int f259164i = 0;

    /* renamed from: a */
    public final Context f259165a;

    /* renamed from: b */
    public final C86124t f259166b;

    /* renamed from: c */
    public final C22871g f259167c;

    /* renamed from: d */
    public final C22871g f259168d;

    /* renamed from: e */
    public final C22695ah f259169e;

    /* renamed from: f */
    public final int f259170f;

    /* renamed from: g */
    final C87594r f259171g;

    /* renamed from: h */
    public C22862b f259172h;

    public C92900bd(Context context, C86124t tVar, C22871g gVar, C22871g gVar2, C22695ah ahVar) {
        this.f259165a = context;
        this.f259167c = gVar;
        this.f259168d = gVar2;
        this.f259166b = tVar;
        this.f259169e = ahVar;
        this.f259170f = (int) tVar.mo79743a(C90014bt.f247132bQ);
        this.f259171g = new C87594r(context, gVar, gVar2);
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (this.f259172h != null) {
            return f62144n;
        }
        C92899bc bcVar = new C92899bc(this);
        this.f259172h = bcVar;
        return this.f259168d.mo28202b("Check active media session", bcVar);
    }
}
