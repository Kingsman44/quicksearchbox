package com.google.android.apps.gsa.shared.notificationlistening.p7120a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p6974ae.C89097f;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aam;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47887u;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.a.a */
/* compiled from: PG */
public final class C90359a {

    /* renamed from: a */
    private static final C59071e f252354a = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.a.a");

    /* renamed from: a */
    public static aas m146922a(Context context, C89097f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        Intent b = C36619a.m65146b(context);
        if (b == null) {
            C59104x c = f252354a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotifArgsHlpr");
            ((C59052c) ((C59052c) c).mo56372aa(10948)).mo56386p("createNotifArgsForGsaNotifListenerPerm, no intent");
            return null;
        }
        String uri = b.toUri(0);
        C47872f fVar2 = (C47872f) C47887u.f123976l.createBuilder();
        String string = context.getString(fVar.mo83065b());
        fVar2.copyOnWrite();
        C47887u uVar = (C47887u) fVar2.instance;
        string.getClass();
        uVar.f123978a = 1;
        uVar.f123979b = string;
        String string2 = context.getString(fVar.mo83064a());
        fVar2.copyOnWrite();
        C47887u uVar2 = (C47887u) fVar2.instance;
        string2.getClass();
        uVar2.f123980c = 7;
        uVar2.f123981d = string2;
        fVar2.copyOnWrite();
        ((C47887u) fVar2.instance).f123985h = 1;
        C47873g gVar = (C47873g) C47875i.f123945g.createBuilder();
        String string3 = context.getString(R.string.notification_settings);
        gVar.copyOnWrite();
        C47875i iVar = (C47875i) gVar.instance;
        string3.getClass();
        iVar.f123947a = 1;
        iVar.f123948b = string3;
        C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
        aVar.mo51701a(uri);
        C47868b bVar = (C47868b) aVar.build();
        gVar.copyOnWrite();
        bVar.getClass();
        ((C47875i) gVar.instance).f123950d = bVar;
        fVar2.mo51702a(gVar);
        C47867a aVar2 = (C47867a) C47868b.f123936f.createBuilder();
        aVar2.mo51701a(uri);
        C47868b bVar2 = (C47868b) aVar2.build();
        fVar2.copyOnWrite();
        bVar2.getClass();
        ((C47887u) fVar2.instance).f123984g = bVar2;
        C47887u uVar3 = (C47887u) fVar2.build();
        aam aam = (aam) aap.f134650h.createBuilder();
        aam.copyOnWrite();
        aap aap = (aap) aam.instance;
        aap.f134652a |= 1;
        aap.f134653b = 22;
        aam.copyOnWrite();
        aap aap2 = (aap) aam.instance;
        aap2.f134652a |= 4;
        aap2.f134655d = 222;
        aap aap3 = (aap) aam.build();
        aax aax = (aax) abc.f134691o.createBuilder();
        aax.copyOnWrite();
        abc abc = (abc) aax.instance;
        abc.f134699f = 1;
        abc.f134694a |= 16;
        aax.copyOnWrite();
        abc abc2 = (abc) aax.instance;
        uVar3.getClass();
        abc2.f134698e = uVar3;
        abc2.f134694a |= 2;
        aax.copyOnWrite();
        abc abc3 = (abc) aax.instance;
        abc3.f134694a |= 32;
        abc3.f134700g = 2;
        aaj aaj = (aaj) aas.f134661u.createBuilder();
        String l = Long.toString(C90719ac.f253778a.f253779b.nextLong());
        aaj.copyOnWrite();
        aas aas = (aas) aaj.instance;
        l.getClass();
        aas.f134663a |= 16;
        aas.f134668f = l;
        aaj.copyOnWrite();
        aas aas2 = (aas) aaj.instance;
        aas2.f134664b = 1;
        aas2.f134663a |= 1;
        aaj.copyOnWrite();
        aas aas3 = (aas) aaj.instance;
        aap3.getClass();
        aas3.f134676n = aap3;
        aas3.f134663a |= 8192;
        aaj.mo58885m(abc.f134692p, (abc) aax.build());
        aaj.copyOnWrite();
        aas aas4 = (aas) aaj.instance;
        aas4.f134663a |= 256;
        aas4.f134670h = "OPA_ANDROID_AUTO";
        return (aas) aaj.build();
    }
}
