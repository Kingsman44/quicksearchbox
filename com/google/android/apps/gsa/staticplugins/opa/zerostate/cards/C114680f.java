package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28293k;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.f */
/* compiled from: PG */
public final /* synthetic */ class C114680f implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114681g f318193a;

    public /* synthetic */ C114680f(C114681g gVar) {
        this.f318193a = gVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C114681g gVar = this.f318193a;
        ViewGroup viewGroup = (ViewGroup) gVar.f318196c.inflate(R.layout.zero_state_ambient_agenda, (ViewGroup) null);
        gVar.f318201h = C114874f.m190403c(gVar.f318194a.f139994b, false);
        if (gVar.f318201h.mo56113h()) {
            C114874f.m190411k(viewGroup, (C53354ku) gVar.f318201h.mo56107c(), gVar.f318197d, gVar.f318198e, gVar.f318199f, gVar.f318200g, C53306j.AMBIENT);
            if (!gVar.f318200g.isEmpty()) {
                gVar.f318202i = (C28293k) gVar.f318200g.get(0);
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.amb_calendar_description);
            C52282lz lzVar = ((C53354ku) gVar.f318201h.mo56107c()).f140002b;
            if (lzVar == null) {
                lzVar = C52282lz.f137236h;
            }
            textView.setText(lzVar.f137239b);
            C52282lz lzVar2 = ((C53354ku) gVar.f318201h.mo56107c()).f140002b;
            if (lzVar2 == null) {
                lzVar2 = C52282lz.f137236h;
            }
            String g = C114874f.m190407g(gVar.f318195b, lzVar2, false, true, false);
            if (!g.isEmpty()) {
                if (C114874f.m190416p(lzVar2)) {
                    g = gVar.f318195b.getResources().getString(R.string.ambient_agenda_today, new Object[]{g});
                } else {
                    g = gVar.f318195b.getResources().getString(R.string.ambient_agenda_tomorrow, new Object[]{g});
                }
            }
            ((TextView) viewGroup.findViewById(R.id.amb_calendar_time)).setText(g);
        }
        viewGroup.getClass();
        return viewGroup;
    }
}
