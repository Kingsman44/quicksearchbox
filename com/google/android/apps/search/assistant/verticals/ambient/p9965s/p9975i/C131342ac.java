package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9975i;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9956c.C131193k;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131252u;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m.C131428a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m.C131432e;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.i.ac */
/* compiled from: PG */
public final class C131342ac implements C131258a {

    /* renamed from: a */
    public final C58974d f359056a;

    /* renamed from: b */
    public final C131358q f359057b;

    /* renamed from: c */
    public final C60887da f359058c;

    /* renamed from: d */
    public final C60887da f359059d;

    /* renamed from: e */
    public final Context f359060e;

    /* renamed from: f */
    public final C131432e f359061f;

    /* renamed from: g */
    public final C131428a f359062g;

    /* renamed from: h */
    public final boolean f359063h;

    /* renamed from: i */
    public final boolean f359064i;

    /* renamed from: j */
    public final long f359065j;

    /* renamed from: k */
    public final C58881cr f359066k;

    /* renamed from: l */
    private final C131193k f359067l;

    /* renamed from: m */
    private final boolean f359068m;

    /* renamed from: n */
    private final boolean f359069n;

    public C131342ac(C130603a aVar, C131358q qVar, C60887da daVar, C60887da daVar2, Context context, C131432e eVar, C131428a aVar2, C131193k kVar, C131252u uVar, boolean z, boolean z2, boolean z3, boolean z4, long j, String str) {
        C130603a aVar3 = aVar;
        this.f359056a = aVar.mo109740b(this);
        this.f359057b = qVar;
        this.f359058c = daVar;
        this.f359059d = daVar2;
        this.f359060e = context;
        this.f359061f = eVar;
        this.f359062g = aVar2;
        this.f359067l = kVar;
        this.f359068m = z;
        this.f359064i = z3;
        this.f359063h = z2;
        this.f359069n = z4;
        this.f359065j = j;
        C131252u uVar2 = uVar;
        this.f359066k = C58886cw.m90973a(new C131359r(uVar, str));
    }

    /* renamed from: b */
    public static Optional m213813b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        return Optional.m71637of(str);
    }

    /* renamed from: a */
    public final Optional mo110150a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).addCategory("android.intent.category.DEFAULT").addCategory("android.intent.category.BROWSABLE").setPackage("com.google.android.gms");
        if (intent.resolveActivity(this.f359060e.getPackageManager()) != null) {
            return Optional.m71637of(intent.toUri(1));
        }
        return Optional.empty();
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89846n(C50794cr.LOYALTY_CARD);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        Optional optional = (Optional) obj;
        if (this.f359068m) {
            return this.f359067l.mo110114a(C50794cr.LOYALTY_CARD, this.f359069n, false, hVar.f297214i, (Object) null, new C131341ab(this), new C131360s(this));
        }
        ((C58970a) ((C58970a) this.f359056a.mo56224b()).mo56372aa(39221)).mo56386p("Loyalty card feature disabled.");
        return C60856cj.m92900i(Optional.empty());
    }
}
