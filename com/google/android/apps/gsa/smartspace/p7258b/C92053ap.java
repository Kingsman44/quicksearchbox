package com.google.android.apps.gsa.smartspace.p7258b;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.C73912w;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.smartspace.C92032ab;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4552o.akq;
import com.google.common.p4552o.aks;
import com.google.common.p4552o.akt;
import com.google.common.p4552o.akv;
import com.google.common.p4552o.aky;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.smartspace.b.ap */
/* compiled from: PG */
public final class C92053ap implements C92032ab {

    /* renamed from: a */
    private final Context f256644a;

    /* renamed from: b */
    private final C86127w f256645b;

    /* renamed from: c */
    private final C73912w f256646c;

    /* renamed from: d */
    private final C86124t f256647d;

    /* renamed from: e */
    private final C92122r f256648e;

    /* renamed from: f */
    private final C110402b f256649f;

    public C92053ap(Context context, C86127w wVar, C73912w wVar2, C110402b bVar, C86124t tVar, C92122r rVar) {
        this.f256644a = context;
        this.f256645b = wVar;
        this.f256646c = wVar2;
        this.f256649f = bVar;
        this.f256647d = tVar;
        this.f256648e = rVar;
    }

    /* renamed from: a */
    public final C58485gu mo86684a() {
        C58480gp e = C58485gu.m89837e();
        C86338r a = this.f256645b.f232790a.mo79722a();
        Set stringSet = a.getStringSet("smartspace_listeners", C58733pz.f156496a);
        if (this.f256648e.f256848d.mo86747c()) {
            if (this.f256644a.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.OEM_SMARTSPACE_WIDGET")) {
                akq akq = (akq) aky.f158997e.createBuilder();
                akv akv = akv.OEM_PREINSTALLED_WIDGET;
                akq.copyOnWrite();
                aky aky = (aky) akq.instance;
                aky.f159002d = akv.f158995g;
                aky.f158999a |= 1;
                e.mo55395g((aky) akq.build());
            } else {
                akq akq2 = (akq) aky.f158997e.createBuilder();
                akv akv2 = akv.WIDGET;
                akq2.copyOnWrite();
                aky aky2 = (aky) akq2.instance;
                aky2.f159002d = akv2.f158995g;
                aky2.f158999a |= 1;
                e.mo55395g((aky) akq2.build());
            }
        }
        if (this.f256649f.mo98629a() && this.f256646c.mo65445a() == 2) {
            akq akq3 = (akq) aky.f158997e.createBuilder();
            akv akv3 = akv.AMBIENT;
            akq3.copyOnWrite();
            aky aky3 = (aky) akq3.instance;
            aky3.f159002d = akv3.f158995g;
            aky3.f158999a |= 1;
            e.mo55395g((aky) akq3.build());
        }
        if (this.f256644a.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE") && this.f256647d.mo79746e(C90014bt.f247453hT)) {
            akq akq4 = (akq) aky.f158997e.createBuilder();
            akv akv4 = akv.OEM_SYSTEM_UI;
            akq4.copyOnWrite();
            aky aky4 = (aky) akq4.instance;
            aky4.f159002d = akv4.f158995g;
            aky4.f158999a |= 1;
            aks aks = (aks) akt.f158984b.createBuilder();
            aks.mo57017a(2);
            if (this.f256644a.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.OEM_AOD_SMARTSPACE") || a.getBoolean("smartspace_oem_aod_enabled", false)) {
                aks.mo57017a(4);
            }
            akt akt = (akt) aks.build();
            akq4.copyOnWrite();
            aky aky5 = (aky) akq4.instance;
            akt.getClass();
            aky5.f159001c = akt;
            aky5.f159000b = 4;
            e.mo55395g((aky) akq4.build());
        } else if (stringSet.contains("smartspace_generic_intent_listener")) {
            akq akq5 = (akq) aky.f158997e.createBuilder();
            akv akv5 = akv.SYSTEM_UI;
            akq5.copyOnWrite();
            aky aky6 = (aky) akq5.instance;
            aky6.f159002d = akv5.f158995g;
            aky6.f158999a |= 1;
            e.mo55395g((aky) akq5.build());
        }
        return e.mo55394f();
    }

    /* renamed from: b */
    public final String mo86685b() {
        return (String) Collection.EL.stream(mo86684a()).map(C92051an.f256642a).map(C92052ao.f256643a).sorted().collect(Collectors.joining(","));
    }
}
