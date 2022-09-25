package com.google.android.libraries.gsa.conversation.clientop.p1847g;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22535l;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51807dw;
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
import com.google.assistant.p3897e.p3921j.aea;
import com.google.assistant.p3897e.p3921j.aeb;
import com.google.assistant.p3897e.p3921j.aec;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import dagger.C68214a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.g.f */
/* compiled from: PG */
public final class C22501f extends C22538o {

    /* renamed from: a */
    private final C22500e f62096a;

    public C22501f(C22500e eVar) {
        this.f62096a = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("provider.LOOKUP")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            aea aea = (aea) m41992m(dwVar, "provider_lookup_args", aea.f134921c.getParserForType());
            C22500e eVar2 = this.f62096a;
            if ((aea.f134923a & 1) == 0) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unable to look up providers: no supported_client_op provided."));
            }
            C68214a aVar = (C68214a) eVar2.f62094a.get(aea.f134924b);
            if (aVar == null) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unable to look up providers: unknown supported_client_op does not map to any Performers."));
            }
            C22538o oVar = (C22538o) aVar.mo27525b();
            List<C51098gh> emptyList = Collections.emptyList();
            if (aea.f134924b.equals("provider.OPEN")) {
                Intent action = new Intent().setAction("android.intent.action.MAIN");
                action.addCategory("android.intent.category.LAUNCHER");
                PackageManager packageManager = (PackageManager) eVar2.f62095b.mo27525b();
                emptyList = C22535l.m41989a(C22535l.m41990b(action, packageManager), packageManager);
            }
            if (emptyList.isEmpty()) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.NOT_FOUND, (String) null));
            }
            aeb aeb = (aeb) aec.f134925b.createBuilder();
            for (C51098gh ghVar : emptyList) {
                aeb.copyOnWrite();
                aec aec = (aec) aeb.instance;
                ghVar.getClass();
                C62971cq cqVar = aec.f134927a;
                if (!cqVar.mo58948c()) {
                    aec.f134927a = C62942bv.mutableCopy(cqVar);
                }
                aec.f134927a.add(ghVar);
            }
            C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
            kbVar.copyOnWrite();
            C52232kc kcVar = (C52232kc) kbVar.instance;
            kcVar.f137064a |= 1;
            kcVar.f137065b = "provider_lookup_result";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            C63088z byteString = ((aec) aeb.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar.f137059a |= 2;
            kaVar.f137061c = byteString;
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            kaVar2.f137059a |= 1;
            kaVar2.f137060b = "assistant.api.client_op.ProviderLookupResult";
            C52230ka kaVar3 = (C52230ka) jzVar.build();
            kbVar.copyOnWrite();
            C52232kc kcVar2 = (C52232kc) kbVar.instance;
            kaVar3.getClass();
            kcVar2.f137066c = kaVar3;
            kcVar2.f137064a |= 2;
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
            eaVar.mo53780b((C52232kc) kbVar.build());
            C52069eb ebVar = (C52069eb) eaVar.build();
            dzVar.copyOnWrite();
            C52070ec ecVar2 = (C52070ec) dzVar.instance;
            ebVar.getClass();
            ecVar2.f136655c = ebVar;
            ecVar2.f136653a |= 2;
            return C60856cj.m92900i((C52070ec) dzVar.build());
        }
        throw new C22428d(dyVar);
    }
}
