package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.Context;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89143o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52370pf;
import com.google.assistant.p3897e.p3921j.ade;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.an */
/* compiled from: PG */
public final class C93003an extends C22538o {

    /* renamed from: a */
    public static final C59071e f259442a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.communication.an");

    /* renamed from: b */
    public final C68214a f259443b;

    /* renamed from: c */
    public final C22871g f259444c;

    /* renamed from: d */
    public final Context f259445d;

    /* renamed from: e */
    public final C68214a f259446e;

    /* renamed from: f */
    public final C37215b f259447f;

    /* renamed from: g */
    public final int f259448g;

    /* renamed from: h */
    public final C89143o f259449h;

    /* renamed from: i */
    private final ProxyIntentStarter f259450i;

    /* renamed from: j */
    private final C22871g f259451j;

    public C93003an(Context context, ProxyIntentStarter proxyIntentStarter, C68214a aVar, C22871g gVar, C22871g gVar2, C68214a aVar2, C37215b bVar, int i, C89143o oVar) {
        this.f259445d = context;
        this.f259450i = proxyIntentStarter;
        this.f259443b = aVar;
        this.f259444c = gVar;
        this.f259451j = gVar2;
        this.f259446e = aVar2;
        this.f259447f = bVar;
        this.f259448g = i;
        this.f259449h = oVar;
    }

    /* renamed from: b */
    public static C52070ec m153064b(ade ade, C52370pf pfVar) {
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b(m153065c("person_result", ade.toByteString(), "assistant.api.dialog_state.values.Person"));
        eaVar.mo53780b(m153065c("contact_query_args", pfVar.toByteString(), "assistant.api.client_op.ContactQueryArgs"));
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        C52069eb ebVar = (C52069eb) eaVar.build();
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: c */
    private static C52232kc m153065c(String str, C63088z zVar, String str2) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        zVar.getClass();
        kaVar.f137059a |= 2;
        kaVar.f137061c = zVar;
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = str2;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C60870cx cxVar;
        if (this.f259448g == 5) {
            this.f259447f.mo19974a(C37176a.f97088eu);
        }
        if (!"contact.LOOKUP".equals(dyVar.f135936b)) {
            if (this.f259448g == 5) {
                this.f259447f.mo19974a(C37176a.f97089ev.mo40805c(C62722b.INVALID_ARGUMENT));
            }
            throw new C22428d(dyVar);
        }
        if (C91077d.m148794e(this.f259445d, "android.permission.READ_CONTACTS")) {
            cxVar = C60856cj.m92900i(true);
        } else {
            SettableFuture settableFuture = new SettableFuture();
            new ProxyPermissionsRequester(this.f259450i, this.f259445d).mo81047ju(new String[]{"android.permission.READ_CONTACTS"}, 5, new C93000ak(settableFuture));
            cxVar = this.f259451j.mo28205e(C90877ak.m148471e(settableFuture, 10000, TimeUnit.MILLISECONDS, this.f259451j), "permission request timeout", TimeoutException.class, C93001al.f259434a);
        }
        C60870cx h = C60922j.m93045h(cxVar, new C92999aj(this, dyVar, eVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return h;
    }
}
