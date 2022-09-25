package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14430iy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14452jt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14453ju;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ah */
/* compiled from: PG */
public final /* synthetic */ class C15171ah implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15174ak f45526a;

    public /* synthetic */ C15171ah(C15174ak akVar) {
        this.f45526a = akVar;
    }

    public final void onClick(View view) {
        C15174ak akVar = this.f45526a;
        if (akVar.f45534f != null) {
            akVar.f45531c.mo21433a(C37182a.f97830bI.mo40805c(C62722b.OK));
            C14986h hVar = akVar.f45530b;
            C14565ny nyVar = akVar.f45534f;
            nyVar.getClass();
            int i = nyVar.f44037b;
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14430iy iyVar = (C14430iy) C14477kr.f43756c.createBuilder();
            C14452jt jtVar = (C14452jt) C14453ju.f43719b.createBuilder();
            jtVar.copyOnWrite();
            ((C14453ju) jtVar.instance).f43721a = i;
            iyVar.copyOnWrite();
            C14477kr krVar = (C14477kr) iyVar.instance;
            C14453ju juVar = (C14453ju) jtVar.build();
            juVar.getClass();
            krVar.f43759b = juVar;
            krVar.f43758a = 4;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14477kr krVar2 = (C14477kr) iyVar.build();
            krVar2.getClass();
            lfVar.f43801d = krVar2;
            lfVar.f43800c = 4;
            hVar.mo21875g((C14492lf) gtVar.build());
            return;
        }
        C59104x c = C15174ak.f45529a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.IncomingCallRndr");
        ((C59052c) ((C59052c) c).mo56372aa(46011)).mo56386p("Unable to decline call, unknown current task!");
    }
}
