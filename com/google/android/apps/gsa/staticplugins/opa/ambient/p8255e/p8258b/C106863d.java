package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8258b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106595g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106864c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8272f.C107060a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14643c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50702an;
import com.google.assistant.p3886c.C50705aq;
import com.google.assistant.p3886c.C50706ar;
import com.google.assistant.p3886c.C50710av;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50839k;
import com.google.assistant.p3886c.C50840l;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C62940bt;
import java.util.Locale;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.b.d */
/* compiled from: PG */
public final class C106863d implements C106864c {

    /* renamed from: a */
    public final C58974d f297751a;

    /* renamed from: b */
    private final C90021c f297752b;

    /* renamed from: c */
    private final Context f297753c;

    /* renamed from: d */
    private final C60888db f297754d;

    /* renamed from: e */
    private final C22871g f297755e;

    /* renamed from: f */
    private final C107060a f297756f;

    /* renamed from: g */
    private final C60950i f297757g;

    /* renamed from: h */
    private final C14643c f297758h;

    public C106863d(C83564a aVar, C90021c cVar, C60888db dbVar, C22871g gVar, Context context, C107060a aVar2, C60950i iVar, C14643c cVar2) {
        this.f297752b = cVar;
        this.f297753c = context;
        this.f297754d = dbVar;
        this.f297755e = gVar;
        this.f297751a = aVar.mo76900a("DriveModeProducer");
        this.f297756f = aVar2;
        this.f297757g = iVar;
        this.f297758h = cVar2;
    }

    /* renamed from: a */
    public final boolean mo95696a(C106596h hVar) {
        ((C58970a) ((C58970a) this.f297751a.mo56224b()).mo56372aa(23332)).mo56386p("#shouldHandleContext: Called");
        if (!this.f297752b.mo79746e(C90017bw.f247879U)) {
            ((C58970a) ((C58970a) this.f297751a.mo56224b()).mo56372aa(23336)).mo56386p("#shouldHandleContext: Drive mode is not enabled. Not handling...");
            return false;
        } else if (!hVar.f297208c) {
            ((C58970a) ((C58970a) this.f297751a.mo56224b()).mo56372aa(23335)).mo56386p("#shouldHandleContext: Headset is not connected. Not handling...");
            return false;
        } else {
            C106595g gVar = C106595g.HEADSET_STATE;
            C106595g a = C106595g.m177369a(hVar.f297218m);
            if (a == null) {
                a = C106595g.UNSPECIFIED;
            }
            if (gVar.equals(a)) {
                C106531e a2 = C106531e.m177306a(hVar.f297207b);
                if (a2 == null) {
                    a2 = C106531e.UNKNOWN;
                }
                boolean equals = a2.equals(C106531e.CAR_BLUETOOTH);
                ((C58970a) ((C58970a) this.f297751a.mo56224b()).mo56372aa(23333)).mo56389s("#shouldHandleContext: Car bluetooth connected %s.", Boolean.valueOf(equals));
                return equals;
            }
            ((C58970a) ((C58970a) this.f297751a.mo56224b()).mo56372aa(23334)).mo56386p("#shouldHandleContext: Last trigger source is not HEADSET_STATE. Not handling...");
            return false;
        }
    }

    /* renamed from: b */
    public final C50701am mo95697b() {
        return C50701am.DRIVE_MODE;
    }

    /* renamed from: c */
    public final C60870cx mo95698c(C106596h hVar) {
        ((C58970a) ((C58970a) this.f297751a.mo56224b()).mo56372aa(23331)).mo56386p("#generateSuggestions: Called");
        if (!this.f297752b.mo79746e(C90051dc.f248841aw) || !this.f297752b.mo79746e(C90017bw.f247898aM)) {
            C106862c cVar = new C106862c(this, hVar);
            return C60856cj.m92904m(C47810es.m84978r(cVar), this.f297754d);
        }
        C22871g gVar = this.f297755e;
        C14643c cVar2 = this.f297758h;
        Objects.requireNonNull(cVar2);
        return C47633f.m84733g(gVar.mo28201a("generateSuggestions", new C106860a(cVar2))).mo51515h(new C106861b(this, hVar), this.f297754d);
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo95699d() {
        return false;
    }

    /* renamed from: e */
    public final C50738bc mo95700e(String str) {
        ((C58970a) ((C58970a) this.f297751a.mo56224b()).mo56372aa(23330)).mo56386p("#getSuggestionCandidate: Sending chip");
        C49156z c = this.f297756f.mo95750c(Optional.empty(), Duration.ofMillis(this.f297752b.mo79743a(C90017bw.f248042s)));
        boolean e = this.f297752b.mo79746e(C90017bw.f248020ct);
        if (!e) {
            str = this.f297753c.getString(R.string.aa_drive_mode_title);
        } else if (str.isEmpty()) {
            str = this.f297753c.getString(R.string.aa_drive_mode_default_bluetooth_name);
        }
        C107060a aVar = this.f297756f;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.morris2.drivingscreen.DrivingScreenActivity"));
        intent.setFlags(268435456);
        C50702an a = aVar.mo95749a(intent);
        a.copyOnWrite();
        C50738bc bcVar = (C50738bc) a.instance;
        C50738bc bcVar2 = C50738bc.f132032l;
        str.getClass();
        bcVar.f132034a |= 1;
        bcVar.f132037d = str;
        C50701am amVar = C50701am.DRIVE_MODE;
        a.copyOnWrite();
        C50738bc bcVar3 = (C50738bc) a.instance;
        bcVar3.f132040g = amVar.f131953N;
        bcVar3.f132034a |= 8;
        String format = String.format(Locale.getDefault(), "%s-%d", new Object[]{C50701am.DRIVE_MODE.name(), Long.valueOf(this.f297757g.mo57444a().toEpochMilli())});
        a.copyOnWrite();
        C50738bc bcVar4 = (C50738bc) a.instance;
        format.getClass();
        bcVar4.f132034a = 2 | bcVar4.f132034a;
        bcVar4.f132038e = format;
        C50710av b = C107060a.m177773b("https://fonts.gstatic.com/s/i/googlematerialicons/time_to_leave/v6/white-48dp/2x/gm_time_to_leave_white_48dp.png");
        a.copyOnWrite();
        C50738bc bcVar5 = (C50738bc) a.instance;
        b.getClass();
        bcVar5.f132039f = b;
        bcVar5.f132034a |= 4;
        a.copyOnWrite();
        C50738bc bcVar6 = (C50738bc) a.instance;
        c.getClass();
        bcVar6.f132041h = c;
        bcVar6.f132034a |= 16;
        if (!e) {
            return (C50738bc) a.build();
        }
        C50705aq aqVar = (C50705aq) C50706ar.f131960a.createBuilder();
        C62940bt btVar = C50840l.f132374d;
        C50839k kVar = (C50839k) C50840l.f132373c.createBuilder();
        String string = this.f297753c.getString(R.string.aa_drive_mode_subtitle);
        kVar.copyOnWrite();
        C50840l lVar = (C50840l) kVar.instance;
        string.getClass();
        lVar.f132376a = 1 | lVar.f132376a;
        lVar.f132377b = string;
        aqVar.mo58885m(btVar, (C50840l) kVar.build());
        C50706ar arVar = (C50706ar) aqVar.build();
        a.copyOnWrite();
        C50738bc bcVar7 = (C50738bc) a.instance;
        arVar.getClass();
        bcVar7.f132044k = arVar;
        bcVar7.f132034a |= 512;
        return (C50738bc) a.build();
    }
}
