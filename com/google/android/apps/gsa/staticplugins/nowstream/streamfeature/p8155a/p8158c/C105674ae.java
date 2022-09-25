package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.C105664b;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.NowCardsScopeDataParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.p375ai.p378b.C8142xb;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ae */
/* compiled from: PG */
public final /* synthetic */ class C105674ae implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C105681al f294806a;

    public /* synthetic */ C105674ae(C105681al alVar) {
        this.f294806a = alVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C105681al alVar = this.f294806a;
        Void voidR = (Void) obj;
        C105687ar arVar = alVar.f294819e;
        if (arVar.f294840K) {
            return C60866ct.f164955a;
        }
        if (arVar.f294842M) {
            arVar.f294843N = true;
            return C60866ct.f164955a;
        }
        C105664b bVar = arVar.f294883v;
        bVar.mo94950e();
        bVar.f294785c = null;
        bVar.f294786d = null;
        bVar.f294784b.mo95040d();
        arVar.f294873l.f63752b.f63757a.mo28643h("SIGN_IN_ERROR");
        arVar.f294873l.f63752b.f63757a.mo28643h("CHILDREN");
        arVar.f294873l.f63752b.f63757a.mo28643h("NO_CARDS_CARD");
        arVar.f294873l.f63752b.f63757a.mo28643h("OFFLINE_WARNING_CARD");
        arVar.f294873l.f63752b.f63757a.mo28643h("NAME_PUBLICATION_JUDICIAIRE_FOOTER");
        arVar.f294873l.f63752b.f63757a.mo28643h("SPACER");
        arVar.mo94985w();
        arVar.mo94972j();
        C105687ar arVar2 = alVar.f294819e;
        arVar2.f294832C = null;
        arVar2.f294833D = null;
        C58833ax axVar = (C58833ax) arVar2.f294863b.mo95010w().f63720e;
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = "nowcards";
        objArr[1] = Integer.valueOf(axVar.mo56113h() ? ((C8142xb) axVar.mo56107c()).f28649u : 0);
        objArr[2] = Long.valueOf(arVar2.f294884w.mo26871c());
        objArr[3] = Long.valueOf(C90719ac.f253778a.f253779b.nextLong() & 65535);
        String format = String.format(locale, "%s-%d-%x-%04x", objArr);
        ((C23251a) alVar.f294819e.f294863b.mo94995h()).mo28730f(C58833ax.m90834k(new NowCardsScopeDataParcelable(format, alVar.f294815a)), false);
        C105687ar arVar3 = alVar.f294819e;
        return alVar.f294819e.f294865d.mo28209i(arVar3.f294865d.mo28201a("create scope ".concat(String.valueOf(format)), new C105704q(arVar3, alVar.f294815a)), "register scope", new C105680ak(alVar, format));
    }
}
