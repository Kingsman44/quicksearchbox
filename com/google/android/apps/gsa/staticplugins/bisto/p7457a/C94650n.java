package com.google.android.apps.gsa.staticplugins.bisto.p7457a;

import android.content.Context;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89641l;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95209x;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95311q;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import com.google.common.p4552o.C60303np;
import com.google.common.p4552o.C60305nr;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.a.n */
/* compiled from: PG */
public class C94650n extends C94636a {

    /* renamed from: c */
    public final CharSequence f264730c;

    /* renamed from: d */
    public final C60237lk f264731d;

    /* renamed from: e */
    private final Uri f264732e;

    public C94650n(Context context, C95307m mVar, C21370a aVar, CharSequence charSequence, Uri uri) {
        super(mVar, aVar);
        if (charSequence == null && uri == null) {
            C89655j.m145957a("Either a message or a URI must be provided.");
            this.f264730c = BuildConfig.FLAVOR;
        } else {
            this.f264730c = charSequence;
        }
        this.f264732e = uri;
        C60237lk c = super.mo88569c();
        this.f264731d = c;
        C60305nr nrVar = ((C60241lo) c.instance).f162987f;
        C60303np npVar = (C60303np) C60305nr.f163179e.createBuilder(nrVar == null ? C60305nr.f163179e : nrVar);
        String packageName = context.getPackageName();
        npVar.copyOnWrite();
        C60305nr nrVar2 = (C60305nr) npVar.instance;
        packageName.getClass();
        nrVar2.f163181a |= 4;
        nrVar2.f163184d = packageName;
        String b = C89641l.m145913b(context, context.getPackageName(), (String) null);
        if (b != null) {
            npVar.copyOnWrite();
            C60305nr nrVar3 = (C60305nr) npVar.instance;
            nrVar3.f163181a |= 2;
            nrVar3.f163183c = b;
        }
        c.copyOnWrite();
        C60241lo loVar = (C60241lo) c.instance;
        C60305nr nrVar4 = (C60305nr) npVar.build();
        nrVar4.getClass();
        loVar.f162987f = nrVar4;
        loVar.f162982a |= 64;
    }

    /* renamed from: c */
    public C60237lk mo88569c() {
        return this.f264731d;
    }

    /* renamed from: f */
    public final void mo88572f(boolean z) {
        C60237lk lkVar = this.f264731d;
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 4194304;
        loVar.f162999r = z;
    }

    /* renamed from: g */
    public final void mo88573g(boolean z) {
        C60237lk lkVar = this.f264731d;
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 4194304;
        loVar.f162999r = z;
    }

    /* renamed from: l */
    public boolean mo88578l(C94647k kVar, C94637a aVar) {
        return false;
    }

    /* renamed from: n */
    public void mo88581n(C95285o oVar, C95284n nVar) {
        int i;
        C94649m mVar = new C94649m(this, this.f264705a.mo89241d(), nVar);
        CharSequence charSequence = this.f264730c;
        if (charSequence != null) {
            C60237lk lkVar = this.f264731d;
            int length = charSequence.length();
            lkVar.copyOnWrite();
            C60241lo loVar = (C60241lo) lkVar.instance;
            C60241lo loVar2 = C60241lo.f162980w;
            loVar.f162982a |= C89885b.S3REQUEST_VALUE;
            loVar.f162995n = length;
            i = oVar.mo89203c(new C95209x(this.f264730c), mVar);
        } else {
            Uri uri = this.f264732e;
            uri.getClass();
            i = oVar.mo89204d(uri, mVar);
        }
        C95311q.m157570d(this.f264731d, i);
    }

    public final String toString() {
        CharSequence charSequence = this.f264730c;
        if (charSequence != null) {
            return charSequence.toString();
        }
        Uri uri = this.f264732e;
        uri.getClass();
        return uri.toString();
    }
}
