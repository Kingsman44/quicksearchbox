package com.google.android.libraries.home.p1958f.p1959a;

import android.os.Bundle;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18511b;
import com.google.android.libraries.assistant.p1535p.p1536a.p1537a.C18512c;
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
import com.google.common.android.concurrent.C58285j;
import com.google.common.android.concurrent.FutureCallbackRegistry;
import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.contrib.android.ProtoParsers;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.home.f.a.ab */
/* compiled from: PG */
final class C23776ab extends C69665o implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C23782ah f65155a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23776ab(C23782ah ahVar) {
        super(2);
        this.f65155a = ahVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        Bundle bundle = (Bundle) obj2;
        C69664n.m101061g((String) obj, "<anonymous parameter 0>");
        C69664n.m101061g(bundle, "result");
        C50181no a = C23787b.m44306a(bundle);
        C18512c cVar = null;
        if (bundle.getInt("dialogWhich", -2) == -1) {
            C23782ah ahVar = this.f65155a;
            String string = ahVar.getString(R.string.unlinking_progress_dialog_body, a.f130447b);
            C69664n.m101060f(string, "getString(R.string.unlin…, provider.localizedName)");
            ahVar.mo29137w(string);
            aeq aeq = (aeq) aer.f129124d.createBuilder();
            C69664n.m101060f(aeq, "newBuilder()");
            aev a2 = C69664n.m101061g(aeq, "builder");
            acw acw = (acw) acx.f128971H.createBuilder();
            C69664n.m101060f(acw, "newBuilder()");
            adb a3 = C69664n.m101061g(acw, "builder");
            C50192nz nzVar = (C50192nz) C50194oa.f130485d.createBuilder();
            C69664n.m101060f(nzVar, "newBuilder()");
            C50198oe a4 = C69664n.m101061g(nzVar, "builder");
            a4.mo53385c();
            C50182np npVar = (C50182np) C50183nq.f130455e.createBuilder();
            C69664n.m101060f(npVar, "newBuilder()");
            C50168nb a5 = C69664n.m101061g(npVar, "builder");
            String str = a.f130446a;
            C69664n.m101060f(str, "provider.id");
            C69664n.m101061g(str, "value");
            C50182np npVar2 = a5.f130415a;
            npVar2.copyOnWrite();
            C50183nq nqVar = (C50183nq) npVar2.instance;
            str.getClass();
            nqVar.f130457a |= 8;
            nqVar.f130460d = str;
            a4.mo53384b(a5.mo53380a());
            a3.mo53351b(a4.mo53383a());
            a2.mo53357b(a3.mo53350a());
            C60870cx o = ahVar.mo29129o(a2.mo53356a());
            FutureCallbackRegistry futureCallbackRegistry = ahVar.f65165h;
            if (futureCallbackRegistry == null) {
                C69664n.m101065k("futureCallbackRegistry");
                futureCallbackRegistry = null;
            }
            futureCallbackRegistry.mo54846a(new C58285j(C60922j.m93044g(o, new C58819aj((Object) null), C60826bg.f164896a)), ahVar.f65167j, new ProtoParsers.InternalDontUse((byte[]) null, a));
        } else {
            C18512c cVar2 = this.f65155a.f65164g;
            if (cVar2 == null) {
                C69664n.m101065k("accountLinkingFlow");
            } else {
                cVar = cVar2;
            }
            if (C18511b.m35979a(cVar.f52466a) == 4) {
                this.f65155a.mo29134t(0, a);
            }
        }
        return C69788q.f186170a;
    }
}
