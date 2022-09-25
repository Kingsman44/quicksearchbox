package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Context;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52370pf;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bo */
/* compiled from: PG */
public final class C35556bo implements C35472h {

    /* renamed from: a */
    public static final C59071e f93364a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.bo");

    /* renamed from: b */
    public final C35558bq f93365b;

    /* renamed from: c */
    public final C60888db f93366c;

    /* renamed from: d */
    public final C37215b f93367d;

    /* renamed from: e */
    private final C35470f f93368e;

    /* renamed from: f */
    private final C36197b f93369f;

    /* renamed from: g */
    private final Context f93370g;

    public C35556bo(Context context, C60888db dbVar, C35470f fVar, C35558bq bqVar, C36197b bVar, C37215b bVar2) {
        this.f93370g = context;
        this.f93366c = dbVar;
        this.f93368e = fVar;
        this.f93365b = bqVar;
        this.f93369f = bVar;
        this.f93367d = bVar2;
    }

    /* renamed from: b */
    public static C52232kc m63911b(String str, C63088z zVar, String str2) {
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
    public final C60870cx mo20766a(C51809dy dyVar) {
        this.f93367d.mo19974a(C37176a.f97088eu);
        if (dyVar.f135936b.equals("contact.LOOKUP")) {
            return C36183e.m64583a(dyVar, "contact_query_args", C52370pf.f137425e.getParserForType(), new C35555bn(this));
        }
        this.f93367d.mo19974a(C37176a.f97089ev.mo40805c(C62722b.INVALID_ARGUMENT));
        throw new C35471g(String.format("Unexpected ClientOpName. Expected %1$s, but got %2$s", new Object[]{"contact.LOOKUP", dyVar.f135936b}));
    }

    /* renamed from: c */
    public final C60870cx mo39699c(C52370pf pfVar) {
        C60870cx cxVar;
        if (!C36196a.m64596a("android.permission.READ_CONTACTS", this.f93370g)) {
            cxVar = this.f93369f.mo20788a(this.f93368e, new String[]{"android.permission.READ_CONTACTS"});
        } else {
            cxVar = C60856cj.m92900i(true);
        }
        C35554bm bmVar = new C35554bm(this, pfVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(bmVar), this.f93366c);
    }
}
