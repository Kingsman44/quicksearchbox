package com.google.android.apps.gsa.search.core.p6884y;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.apps.gsa.search.core.p6884y.p6888d.C87294b;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88031mp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88032mq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88035mt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88036mu;
import com.google.android.apps.gsa.shared.util.p7184t.C91094d;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.y.h */
/* compiled from: PG */
public final class C87379h implements C91097g {

    /* renamed from: e */
    private static final C59071e f235952e = C59071e.m91332i("com.google.android.apps.gsa.search.core.y.h");

    /* renamed from: a */
    public final Context f235953a;

    /* renamed from: b */
    public final C23084ao f235954b;

    /* renamed from: c */
    public final SparseArray f235955c = new SparseArray();

    /* renamed from: d */
    public final SparseArray f235956d = new SparseArray();

    /* renamed from: f */
    private final C91097g f235957f;

    /* renamed from: g */
    private final C87294b f235958g;

    public C87379h(Context context, C91097g gVar, C87294b bVar, C23084ao aoVar) {
        this.f235953a = context;
        this.f235957f = gVar;
        this.f235958g = bVar;
        this.f235954b = aoVar;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        return this.f235957f.mo65089a(intent);
    }

    @Deprecated
    /* renamed from: b */
    public final boolean mo65090b(Intent intent, C91096f fVar) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: c */
    public final boolean mo65091c(IntentSender intentSender, C91096f fVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final boolean mo65092d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo65093e() {
        return this.f235957f.mo65093e();
    }

    /* renamed from: f */
    public final /* synthetic */ void mo65094f(Intent intent, Bundle bundle) {
        C91094d.m148838a(this, intent, bundle);
    }

    /* renamed from: g */
    public final void mo81039g(C23052c cVar, int i, C91096f fVar) {
        this.f235954b.mo28328a();
        if (fVar == null) {
            this.f235955c.remove(i);
            this.f235956d.remove(i);
            return;
        }
        String l = cVar.mo28342l();
        this.f235956d.put(i, new C87377g(fVar, l));
        C87370f fVar2 = (C87370f) this.f235955c.get(i);
        if (fVar2 != null) {
            fVar.mo17703hg(fVar2.f235929a, fVar2.f235930b, this.f235953a);
            this.f235955c.remove(i);
        }
        cVar.mo28427o(new C87296e(this, l));
    }

    /* renamed from: h */
    public final void mo81040h(Intent intent, int i) {
        this.f235954b.mo28328a();
        if ((-65536 & i) == 0) {
            C88035mt mtVar = (C88035mt) C88036mu.f238057c.createBuilder();
            C88031mp mpVar = (C88031mp) C88032mq.f238048c.createBuilder();
            mpVar.copyOnWrite();
            C88032mq mqVar = (C88032mq) mpVar.instance;
            mqVar.f238050a |= 1;
            mqVar.f238051b = i;
            C88032mq mqVar2 = (C88032mq) mpVar.build();
            mtVar.copyOnWrite();
            C88036mu muVar = (C88036mu) mtVar.instance;
            mqVar2.getClass();
            muVar.f238060b = mqVar2;
            muVar.f238059a = 8;
            this.f235958g.mo80939a((C88036mu) mtVar.build(), C58833ax.m90834k(intent));
            return;
        }
        ((C59052c) ((C59052c) f235952e.mo56226d()).mo56372aa(8234)).mo56386p("Can only use lower 16 bits for requestCode");
        throw new AssertionError("Can only use lower 16 bits for requestCode");
    }
}
