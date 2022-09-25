package com.google.android.libraries.home.p1958f.p1959a;

import android.content.Intent;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2877e.C37185a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3861at.C50168nb;
import com.google.assistant.p3861at.C50181no;
import com.google.assistant.p3861at.C50182np;
import com.google.assistant.p3861at.C50183nq;
import com.google.assistant.p3861at.C50192nz;
import com.google.assistant.p3861at.C50194oa;
import com.google.assistant.p3861at.C50198oe;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3861at.adb;
import com.google.assistant.p3861at.aeq;
import com.google.assistant.p3861at.aer;
import com.google.assistant.p3861at.aev;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.w */
/* compiled from: PG */
final class C23808w implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C23782ah f65223a;

    /* renamed from: b */
    final /* synthetic */ C50181no f65224b;

    public C23808w(C23782ah ahVar, C50181no noVar) {
        this.f65223a = ahVar;
        this.f65224b = noVar;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C69664n.m101061g((Intent) obj, "it");
        C37215b n = this.f65223a.mo29128n();
        C37252a i = C37185a.f98333d.mo40815i(C62722b.OK);
        C23774a.m44277a(i, this.f65224b);
        n.mo19974a(i);
        C23782ah ahVar = this.f65223a;
        String string = ahVar.getString(R.string.linking_progress_dialog_body, this.f65224b.f130447b);
        C69664n.m101060f(string, "getString(R.string.linki…, provider.localizedName)");
        ahVar.mo29137w(string);
        C23782ah ahVar2 = this.f65223a;
        C50181no noVar = this.f65224b;
        aeq aeq = (aeq) aer.f129124d.createBuilder();
        C69664n.m101060f(aeq, "newBuilder()");
        aev a = C69664n.m101061g(aeq, "builder");
        acw acw = (acw) acx.f128971H.createBuilder();
        C69664n.m101060f(acw, "newBuilder()");
        adb a2 = C69664n.m101061g(acw, "builder");
        C50192nz nzVar = (C50192nz) C50194oa.f130485d.createBuilder();
        C69664n.m101060f(nzVar, "newBuilder()");
        C50198oe a3 = C69664n.m101061g(nzVar, "builder");
        a3.mo53385c();
        C50182np npVar = (C50182np) C50183nq.f130455e.createBuilder();
        C69664n.m101060f(npVar, "newBuilder()");
        C50168nb a4 = C69664n.m101061g(npVar, "builder");
        String str = noVar.f130446a;
        C69664n.m101060f(str, "provider.id");
        C69664n.m101061g(str, "value");
        C50182np npVar2 = a4.f130415a;
        npVar2.copyOnWrite();
        C50183nq nqVar = (C50183nq) npVar2.instance;
        str.getClass();
        nqVar.f130457a |= 4;
        nqVar.f130459c = str;
        a3.mo53384b(a4.mo53380a());
        a2.mo53351b(a3.mo53383a());
        a.mo53357b(a2.mo53350a());
        return ahVar2.mo29129o(a.mo53356a());
    }
}
