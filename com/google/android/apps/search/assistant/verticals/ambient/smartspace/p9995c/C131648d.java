package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.p471d.p472a.p473a.p474a.C9021c;
import com.google.android.apps.p471d.p472a.p473a.p474a.C9023e;
import com.google.android.apps.p471d.p472a.p473a.p474a.C9025g;
import com.google.android.apps.p471d.p472a.p473a.p474a.C9026h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.proactive.p2770b.C36232a;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aam;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58743qi;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47874h;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47877k;
import com.google.p3717aq.p3718a.p3719a.C47879m;
import com.google.p3717aq.p3718a.p3719a.C47882p;
import com.google.p3717aq.p3718a.p3719a.C47883q;
import com.google.p3717aq.p3718a.p3719a.C47884r;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C63042fg;
import com.google.protos.p5129p.p5131b.C65755am;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.d */
/* compiled from: PG */
public final class C131648d {

    /* renamed from: a */
    private static final C59071e f359703a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.d");

    /* renamed from: b */
    private final Context f359704b;

    /* renamed from: c */
    private final boolean f359705c;

    /* renamed from: d */
    private final C58743qi f359706d = new C58459fv();

    public C131648d(Context context, boolean z) {
        this.f359704b = context;
        this.f359705c = z;
    }

    /* renamed from: a */
    public final synchronized void mo110241a(C65755am amVar) {
        C65755am amVar2 = amVar;
        synchronized (this) {
            if (this.f359705c) {
                ((C59052c) ((C59052c) f359703a.mo56224b()).mo56372aa(39120)).mo56389s("#updateClientNotifications for timer %s", amVar2);
                C52428rj rjVar = amVar2.f178764d;
                if (rjVar == null) {
                    rjVar = C52428rj.f137558m;
                }
                Set h = this.f359706d.mo54986h(rjVar);
                HashSet hashSet = new HashSet();
                C9026h hVar = amVar2.f178762b;
                if (hVar == null) {
                    hVar = C9026h.f31165b;
                }
                C9025g gVar = hVar.f31167a;
                if (gVar == null) {
                    gVar = C9025g.f31162b;
                }
                for (C9023e eVar : gVar.f31164a) {
                    C9021c cVar = eVar.f31161e;
                    if (cVar == null) {
                        cVar = C9021c.f31152b;
                    }
                    String str = cVar.f31154a;
                    int i = eVar.f31157a;
                    char c = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? (char) 0 : 6 : 5 : 4 : 3 : 2;
                    if (c != 0 && c == 4) {
                        hashSet.add(str);
                        if (!h.contains(str)) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            C63042fg fgVar = eVar.f31158b;
                            if (fgVar == null) {
                                fgVar = C63042fg.f170152c;
                            }
                            long millis = timeUnit.toMillis(fgVar.f170154a);
                            String str2 = amVar2.f178763c;
                            ((C59052c) ((C59052c) f359703a.mo56224b()).mo56372aa(39118)).mo56354G("#createNotification for timer id %s with device name %s", str, str2);
                            C47872f fVar = (C47872f) C47887u.f123976l.createBuilder();
                            String string = this.f359704b.getResources().getString(R.string.assistant_notification_zero_time);
                            fVar.copyOnWrite();
                            C47887u uVar = (C47887u) fVar.instance;
                            string.getClass();
                            uVar.f123978a = 1;
                            uVar.f123979b = string;
                            if (TextUtils.isEmpty(str2)) {
                                str2 = this.f359704b.getResources().getString(R.string.assistant_notification_device_name_placeholder);
                            }
                            String format = String.format("%s %s %s", new Object[]{this.f359704b.getResources().getString(R.string.assistant_notification_state_text_expired), this.f359704b.getResources().getString(R.string.assistant_notification_text_divider), str2});
                            fVar.copyOnWrite();
                            C47887u uVar2 = (C47887u) fVar.instance;
                            format.getClass();
                            uVar2.f123980c = 7;
                            uVar2.f123981d = format;
                            fVar.copyOnWrite();
                            ((C47887u) fVar.instance).f123987j = C47877k.m85093a(2);
                            fVar.copyOnWrite();
                            ((C47887u) fVar.instance).f123985h = 4;
                            C47879m mVar = (C47879m) C47884r.f123965g.createBuilder();
                            C47882p pVar = (C47882p) C47883q.f123958f.createBuilder();
                            pVar.copyOnWrite();
                            ((C47883q) pVar.instance).f123962c = millis;
                            mVar.copyOnWrite();
                            C47883q qVar = (C47883q) pVar.build();
                            qVar.getClass();
                            ((C47884r) mVar.instance).f123971e = qVar;
                            fVar.copyOnWrite();
                            C47884r rVar = (C47884r) mVar.build();
                            rVar.getClass();
                            ((C47887u) fVar.instance).f123988k = rVar;
                            C47873g gVar2 = (C47873g) C47875i.f123945g.createBuilder();
                            gVar2.copyOnWrite();
                            ((C47875i) gVar2.instance).f123949c = 0;
                            gVar2.copyOnWrite();
                            ((C47875i) gVar2.instance).f123951e = C47874h.m85091a(2);
                            String string2 = this.f359704b.getResources().getString(R.string.assistant_notification_stop_action_text);
                            gVar2.copyOnWrite();
                            C47875i iVar = (C47875i) gVar2.instance;
                            string2.getClass();
                            iVar.f123947a = 1;
                            iVar.f123948b = string2;
                            C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
                            aVar.mo51701a(new Uri.Builder().scheme("assistant-x-device-timer").authority("android").appendQueryParameter("actionType", "stopAction").appendQueryParameter("timerId", str).build().toString());
                            gVar2.copyOnWrite();
                            C47868b bVar = (C47868b) aVar.build();
                            bVar.getClass();
                            ((C47875i) gVar2.instance).f123950d = bVar;
                            fVar.mo51702a(gVar2);
                            C47873g gVar3 = (C47873g) C47875i.f123945g.createBuilder();
                            gVar3.copyOnWrite();
                            ((C47875i) gVar3.instance).f123949c = 1;
                            gVar3.copyOnWrite();
                            ((C47875i) gVar3.instance).f123951e = C47874h.m85091a(2);
                            String string3 = this.f359704b.getResources().getString(R.string.assistant_notification_add_action_text);
                            gVar3.copyOnWrite();
                            C47875i iVar2 = (C47875i) gVar3.instance;
                            string3.getClass();
                            iVar2.f123947a = 1;
                            iVar2.f123948b = string3;
                            C47867a aVar2 = (C47867a) C47868b.f123936f.createBuilder();
                            aVar2.mo51701a(new Uri.Builder().scheme("assistant-x-device-timer").authority("android").appendQueryParameter("actionType", "addOneMinuteAction").appendQueryParameter("timerId", str).build().toString());
                            gVar3.copyOnWrite();
                            C47868b bVar2 = (C47868b) aVar2.build();
                            bVar2.getClass();
                            ((C47875i) gVar3.instance).f123950d = bVar2;
                            fVar.mo51702a(gVar3);
                            aax aax = (aax) abc.f134691o.createBuilder();
                            aax.copyOnWrite();
                            abc abc = (abc) aax.instance;
                            abc.f134699f = 2;
                            abc.f134694a |= 16;
                            aax.copyOnWrite();
                            abc abc2 = (abc) aax.instance;
                            C47887u uVar3 = (C47887u) fVar.build();
                            uVar3.getClass();
                            abc2.f134698e = uVar3;
                            abc2.f134694a |= 2;
                            aax.copyOnWrite();
                            abc abc3 = (abc) aax.instance;
                            abc3.f134694a |= 32;
                            abc3.f134700g = 43;
                            aaj aaj = (aaj) aas.f134661u.createBuilder();
                            aaj.copyOnWrite();
                            aas aas = (aas) aaj.instance;
                            str.getClass();
                            aas.f134663a |= 16;
                            aas.f134668f = str;
                            aaj.copyOnWrite();
                            aas aas2 = (aas) aaj.instance;
                            str.getClass();
                            aas2.f134663a |= 256;
                            aas2.f134670h = str;
                            aaj.copyOnWrite();
                            aas aas3 = (aas) aaj.instance;
                            aas3.f134664b = 1;
                            aas3.f134663a |= 1;
                            aam aam = (aam) aap.f134650h.createBuilder();
                            aam.copyOnWrite();
                            aap aap = (aap) aam.instance;
                            aap.f134652a |= 1;
                            aap.f134653b = 116;
                            aam.copyOnWrite();
                            aap aap2 = (aap) aam.instance;
                            aap2.f134652a |= 4;
                            aap2.f134655d = 380;
                            aam.copyOnWrite();
                            aap aap3 = (aap) aam.instance;
                            aap3.f134658g = 0;
                            aap3.f134652a |= 16;
                            aap aap4 = (aap) aam.build();
                            aaj.copyOnWrite();
                            aas aas4 = (aas) aaj.instance;
                            aap4.getClass();
                            aas4.f134676n = aap4;
                            aas4.f134663a |= 8192;
                            aaj.mo58885m(abc.f134692p, (abc) aax.build());
                            C36232a.m64676c(this.f359704b, (aas) aaj.build(), 4);
                            h.add(str);
                        }
                    }
                }
                C58800sl lA = C58528ij.m90006F(C58758qx.m90645c(h, hashSet)).iterator();
                while (lA.hasNext()) {
                    String str3 = (String) lA.next();
                    ((C59052c) ((C59052c) f359703a.mo56224b()).mo56372aa(39119)).mo56389s("#dismissNotification for timer id %s", str3);
                    C36232a.m64675b(this.f359704b, str3);
                    h.remove(str3);
                }
            }
        }
    }
}
