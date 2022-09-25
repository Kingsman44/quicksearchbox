package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import com.google.common.p4552o.C60303np;
import com.google.common.p4552o.C60305nr;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bl */
/* compiled from: PG */
public final class C95102bl extends C94650n {

    /* renamed from: e */
    public final C95101bk f266065e;

    public C95102bl(Context context, Uri uri, C95101bk bkVar, C95307m mVar, C21370a aVar) {
        super(context, mVar, aVar, (CharSequence) null, uri);
        this.f266065e = bkVar;
    }

    /* renamed from: c */
    public final C60237lk mo88569c() {
        C60237lk lkVar = this.f264731d;
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 128;
        loVar.f162988g = "bisto_voice_query";
        lkVar.copyOnWrite();
        C60241lo loVar3 = (C60241lo) lkVar.instance;
        loVar3.f162982a |= 2;
        loVar3.f162984c = true;
        C60303np npVar = (C60303np) C60305nr.f163179e.createBuilder();
        npVar.copyOnWrite();
        C60305nr nrVar = (C60305nr) npVar.instance;
        nrVar.f163182b = 5;
        nrVar.f163181a = 1 | nrVar.f163181a;
        lkVar.mo57078b((C60305nr) npVar.build());
        return lkVar;
    }

    /* renamed from: l */
    public final boolean mo88578l(C94647k kVar, C94637a aVar) {
        return false;
    }

    /* renamed from: n */
    public final void mo88581n(C95285o oVar, C95284n nVar) {
        super.mo88581n(oVar, new C95100bj(this, nVar));
    }

    public C95102bl(Context context, CharSequence charSequence, C95101bk bkVar, C95307m mVar, C21370a aVar) {
        super(context, mVar, aVar, charSequence, (Uri) null);
        this.f266065e = bkVar;
    }
}
