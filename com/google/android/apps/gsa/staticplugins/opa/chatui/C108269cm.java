package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.support.p033v7.widget.C0640fb;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114109an;
import com.google.assistant.p3980n.p3981a.p3982a.C52998a;
import com.google.assistant.p3980n.p3981a.p3982a.C52999b;
import com.google.assistant.p3980n.p3981a.p3982a.C53000c;
import com.google.assistant.p3980n.p3981a.p3982a.C53001d;
import com.google.protobuf.C62940bt;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cm */
/* compiled from: PG */
public final class C108269cm {

    /* renamed from: a */
    public final C108264ch f301214a;

    /* renamed from: b */
    public C108303dt f301215b;

    /* renamed from: c */
    private final C107698i f301216c;

    public C108269cm(C108264ch chVar, C107698i iVar) {
        this.f301214a = chVar;
        this.f301216c = iVar;
    }

    /* renamed from: c */
    private final int m179970c() {
        C108303dt dtVar = this.f301215b;
        if (dtVar == null) {
            return 0;
        }
        return dtVar.mo96741b();
    }

    /* renamed from: a */
    public final void mo96722a(String str) {
        String[] strArr = {str};
        C108303dt dtVar = this.f301215b;
        if (dtVar != null) {
            dtVar.mo96758u(strArr);
        }
        mo96723b(Arrays.asList(strArr));
        C107698i iVar = this.f301216c;
        C88489j jVar = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
        C62940bt btVar = C87694ac.f237131a;
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        C53000c cVar = (C53000c) C53001d.f138931d.createBuilder();
        C52998a aVar = (C52998a) C52999b.f138927c.createBuilder();
        aVar.copyOnWrite();
        C52999b bVar = (C52999b) aVar.instance;
        bVar.f138929a |= 1;
        bVar.f138930b = str;
        cVar.mo53955a(aVar);
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        C53001d dVar = (C53001d) cVar.build();
        dVar.getClass();
        aeVar.f237135b = dVar;
        aeVar.f237134a = 1 | aeVar.f237134a;
        jVar.mo82014b(btVar, (C87696ae) adVar.build());
        iVar.mo96219b(jVar.mo82013a());
    }

    /* renamed from: b */
    public final void mo96723b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C108308dy dyVar = ((C114109an) this.f301214a).f316252a;
            dyVar.f301304a.size();
            int a = dyVar.mo95351a();
            while (true) {
                a--;
                if (a >= 0) {
                    C108232bc b = dyVar.mo95352b(a);
                    if (b != null && TextUtils.equals(str, b.f301037s)) {
                        dyVar.f301304a.remove(a);
                        m179970c();
                        ((C0640fb) this.f301214a).notifyItemRemoved(m179970c() + a);
                    }
                }
            }
        }
    }
}
