package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.app.Dialog;
import android.content.Context;
import com.google.android.apps.gsa.sidekick.shared.monet.p7245a.C91764a;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104303ae;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104442e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104466b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.dh */
/* compiled from: PG */
public final class C104779dh {

    /* renamed from: a */
    public final Context f291874a;

    /* renamed from: b */
    public final C22945j f291875b;

    /* renamed from: c */
    public final C104348l f291876c;

    /* renamed from: d */
    public final String f291877d;

    /* renamed from: e */
    public final C104303ae f291878e;

    /* renamed from: f */
    public final C58833ax f291879f;

    /* renamed from: g */
    public final C104442e f291880g;

    /* renamed from: h */
    public final C104466b f291881h;

    /* renamed from: i */
    public boolean f291882i;

    /* renamed from: j */
    public C9278v f291883j;

    /* renamed from: k */
    public Dialog f291884k;

    /* renamed from: l */
    public C91764a f291885l;

    public C104779dh(Context context, C22945j jVar, C104348l lVar, String str, C58833ax axVar, C104303ae aeVar, C104442e eVar, C104466b bVar) {
        this.f291874a = context;
        this.f291875b = jVar;
        this.f291876c = lVar;
        this.f291877d = str;
        this.f291878e = aeVar;
        this.f291879f = axVar;
        this.f291880g = eVar;
        this.f291881h = bVar;
    }

    /* renamed from: a */
    public final void mo94347a() {
        Dialog dialog = this.f291884k;
        if (dialog != null) {
            dialog.dismiss();
            this.f291884k = null;
        }
    }

    /* renamed from: b */
    public final void mo94348b(boolean z) {
        this.f291882i = z;
        this.f291875b.mo28327o("SHOW_CARD_ACTION_DIALOG", new C104777df(this));
    }

    /* renamed from: c */
    public final void mo94349c() {
        C91764a aVar = this.f291885l;
        C58833ax axVar = this.f291879f;
        if (axVar.mo56113h() && aVar != null) {
            ((C105419b) axVar.mo56107c()).mo94781c(aVar);
            this.f291885l = null;
        }
    }
}
