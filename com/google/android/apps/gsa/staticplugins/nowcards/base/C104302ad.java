package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.shared.p7148ui.C90667d;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91671j;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a.C91728l;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104442e;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8140x;
import com.google.p375ai.p378b.C8194z;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.ad */
/* compiled from: PG */
public final class C104302ad {

    /* renamed from: a */
    public static final C59071e f290091a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.base.ad");

    /* renamed from: b */
    public final Context f290092b;

    /* renamed from: c */
    public final C89291a f290093c;

    /* renamed from: d */
    public final C91728l f290094d;

    /* renamed from: e */
    public final C104357u f290095e;

    /* renamed from: f */
    public final C104318at f290096f;

    /* renamed from: g */
    public final C104323ay f290097g;

    /* renamed from: h */
    public final C91671j f290098h;

    /* renamed from: i */
    public final C104348l f290099i;

    /* renamed from: j */
    public final boolean f290100j;

    /* renamed from: k */
    public final C91857e f290101k;

    /* renamed from: l */
    public C104317as f290102l;

    /* renamed from: m */
    public boolean f290103m;

    /* renamed from: n */
    public boolean f290104n;

    /* renamed from: o */
    public C7718hj f290105o;

    /* renamed from: p */
    public C104356t f290106p;

    /* renamed from: q */
    public List f290107q;

    /* renamed from: r */
    public C90667d f290108r;

    /* renamed from: s */
    public C104320av f290109s;

    /* renamed from: t */
    public View f290110t;

    /* renamed from: u */
    public final C104442e f290111u;

    /* renamed from: v */
    public boolean f290112v;

    public C104302ad(Context context, C91671j jVar, C104348l lVar, C91857e eVar, C104442e eVar2, boolean z, C89291a aVar, C91728l lVar2, C104357u uVar, C104318at atVar, C104323ay ayVar, boolean z2, C58881cr crVar) {
        this.f290092b = context;
        this.f290093c = aVar;
        this.f290094d = lVar2;
        this.f290095e = uVar;
        this.f290096f = atVar;
        this.f290097g = ayVar;
        this.f290098h = jVar;
        this.f290099i = lVar;
        this.f290101k = eVar;
        this.f290100j = z2;
        this.f290111u = eVar2;
        this.f290112v = z;
        CardRenderingContext cardRenderingContext = (CardRenderingContext) crVar.mo6453a();
    }

    /* renamed from: a */
    public final C8194z mo94042a(boolean z) {
        C7718hj hjVar = this.f290105o;
        if (hjVar == null || (hjVar.f26955a & 8388608) == 0) {
            return null;
        }
        C8140x xVar = hjVar.f26931C;
        if (xVar == null) {
            xVar = C8140x.f28619f;
        }
        if (z) {
            if ((xVar.f28621a & 8) == 0) {
                return null;
            }
            C8194z zVar = xVar.f28625e;
            if (zVar == null) {
                return C8194z.f28777k;
            }
            return zVar;
        } else if ((xVar.f28621a & 4) == 0) {
            return null;
        } else {
            C8194z zVar2 = xVar.f28624d;
            return zVar2 == null ? C8194z.f28777k : zVar2;
        }
    }

    /* renamed from: b */
    public final void mo94043b(C8194z zVar) {
        C91857e eVar = this.f290101k;
        if (eVar != null) {
            eVar.mo86359a("EVENT_CARD_ACTION", "EVENT_SOURCE_DONE_WITH_CARD", C23245b.m43556a(zVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo94044c(C8194z zVar, boolean z) {
        if (z) {
            mo94043b(zVar);
        }
    }
}
