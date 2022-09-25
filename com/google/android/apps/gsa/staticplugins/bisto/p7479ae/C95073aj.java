package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.C1806aw;
import androidx.core.app.C1811ba;
import androidx.core.app.C1832s;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89631b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94638b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94642f;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95293ae;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60237lk;
import com.google.common.p4552o.C60241lo;
import com.google.common.p4552o.C60303np;
import com.google.common.p4552o.C60305nr;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.aj */
/* compiled from: PG */
public final class C95073aj extends C94650n {

    /* renamed from: l */
    private static final C59071e f265970l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.aj");

    /* renamed from: e */
    public final Runnable f265971e = new C95072ai(this);

    /* renamed from: f */
    public final Context f265972f;

    /* renamed from: g */
    public final C95293ae f265973g;

    /* renamed from: h */
    public final String f265974h;

    /* renamed from: i */
    public final boolean f265975i;

    /* renamed from: j */
    public final C1832s f265976j;

    /* renamed from: k */
    public final C89631b f265977k;

    /* renamed from: m */
    private final C95307m f265978m;

    /* renamed from: n */
    private final C21370a f265979n;

    /* renamed from: o */
    private final C95075al f265980o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95073aj(Context context, C95293ae aeVar, C95307m mVar, C21370a aVar, CharSequence charSequence, String str, boolean z, C1832s sVar, C89631b bVar, C95075al alVar) {
        super(context, mVar, aVar, charSequence, (Uri) null);
        this.f265972f = context;
        this.f265973g = aeVar;
        this.f265978m = mVar;
        this.f265979n = aVar;
        this.f265974h = str;
        this.f265975i = z;
        this.f265976j = sVar;
        this.f265977k = bVar;
        this.f265980o = alVar;
    }

    /* renamed from: a */
    public final C94638b mo88567a() {
        C59104x b = f265970l.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QpuConfirmTranscript");
        ((C59052c) ((C59052c) b).mo56372aa(17983)).mo56386p("onActionTaken");
        if (!mo88576j() || this.f265974h == null) {
            return new C94638b(false, false, false);
        }
        this.f265973g.mo89219l(14);
        mo89002o(this.f265974h, this.f265976j);
        return new C94638b(false, true, true);
    }

    /* renamed from: c */
    public final C60237lk mo88569c() {
        C60237lk lkVar = this.f264731d;
        C60303np npVar = (C60303np) C60305nr.f163179e.createBuilder();
        npVar.copyOnWrite();
        C60305nr nrVar = (C60305nr) npVar.instance;
        nrVar.f163182b = 5;
        nrVar.f163181a |= 1;
        lkVar.mo57078b((C60305nr) npVar.build());
        lkVar.copyOnWrite();
        C60241lo loVar = (C60241lo) lkVar.instance;
        C60241lo loVar2 = C60241lo.f162980w;
        loVar.f162982a |= 2;
        loVar.f162984c = true;
        lkVar.copyOnWrite();
        C60241lo loVar3 = (C60241lo) lkVar.instance;
        loVar3.f162982a |= 128;
        loVar3.f162988g = "bisto_voice_transcript_confirmation";
        return lkVar;
    }

    /* renamed from: e */
    public final String mo88571e() {
        return C58837ba.m90858g(this.f265973g.mo89217j(this.f265972f, 1, 1));
    }

    /* renamed from: h */
    public final void mo88574h(String str, Runnable runnable) {
        String str2;
        C59104x b = f265970l.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QpuConfirmTranscript");
        ((C59052c) ((C59052c) b).mo56372aa(17989)).mo56386p("onTranscriptionResult");
        if (C58837ba.m90859h(str)) {
            str2 = this.f265972f.getString(R.string.transcript_failure);
        } else {
            Integer g = this.f265973g.mo89215g(14);
            if (g != null) {
                String i = this.f265973g.mo89216i(this.f265972f, 21);
                str2 = this.f265972f.getString(g.intValue(), new Object[]{str, C58837ba.m90858g(i)});
            } else {
                C89655j.m145957a("No education prompt");
                str2 = BuildConfig.FLAVOR;
            }
        }
        this.f265980o.f265981a.mo89170r(new C95074ak(new C95073aj(this.f265972f, this.f265973g, this.f265978m, this.f265979n, str2, str, this.f265980o.f265982b.mo89024c(), this.f265976j, this.f265977k, this.f265980o)));
    }

    /* renamed from: j */
    public final boolean mo88576j() {
        return this.f265974h != null;
    }

    /* renamed from: k */
    public final boolean mo88577k() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo88578l(C94647k kVar, C94637a aVar) {
        return false;
    }

    /* renamed from: m */
    public final boolean mo88579m() {
        return true;
    }

    /* renamed from: n */
    public final void mo88581n(C95285o oVar, C95284n nVar) {
        C58976aa aaVar = C58975e.f156826a;
        super.mo88581n(oVar, new C94642f(oVar, new C95067ad(this, oVar, nVar, new C95069af(this, oVar, new C95068ae(this, oVar, nVar)))));
    }

    /* renamed from: o */
    public final void mo89002o(String str, C1832s sVar) {
        C95066ac acVar = new C95066ac(this);
        if (sVar != null) {
            try {
                PendingIntent pendingIntent = sVar.f5662i;
                Context context = this.f265972f;
                Intent intent = new Intent();
                ArrayList arrayList = new ArrayList();
                C1811ba[] baVarArr = sVar.f5655b;
                if (baVarArr != null) {
                    Collections.addAll(arrayList, baVarArr);
                }
                Bundle bundle = new Bundle();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C1811ba baVar = (C1811ba) arrayList.get(i);
                    if (baVar.f5639d && str != null) {
                        bundle.putCharSequence(baVar.f5636a, str);
                    }
                }
                C1806aw.m4969c(C1811ba.m4980a((C1811ba[]) arrayList.toArray(new C1811ba[arrayList.size()])), intent, bundle);
                pendingIntent.send(context, 0, intent, acVar, (Handler) null);
            } catch (PendingIntent.CanceledException e) {
                C59104x c = f265970l.mo56225c();
                c.mo56378ag(C58975e.f156826a, "QpuConfirmTranscript");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17991)).mo56386p("Exception executing action");
                this.f265977k.mo76702b();
            }
        }
    }
}
