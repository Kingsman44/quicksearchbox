package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.assistant.p3897e.p3929l.p3930a.C52708bn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65848q;
import com.google.protos.p5129p.p5131b.C65849r;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.cd */
/* compiled from: PG */
public final class C108874cd extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302719b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.cd");

    /* renamed from: c */
    public C21370a f302720c;

    /* renamed from: d */
    public u f302721d;

    /* renamed from: e */
    public C86054o f302722e;

    /* renamed from: f */
    public C22871g f302723f;

    /* renamed from: g */
    private C52686as f302724g = C52686as.f138291q;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final void mo97247e(C52708bn bnVar) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        C52685ar arVar = (C52685ar) this.f302724g.toBuilder();
        arVar.copyOnWrite();
        C52686as asVar = (C52686as) arVar.instance;
        asVar.f138295c = bnVar.f138363g;
        asVar.f138293a |= 4;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        azVar.f178795a |= 4;
        azVar.f178798d = "driving_settings";
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(this.f302720c.mo26870b());
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = micros;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C65139d dVar2 = (C65139d) cVar.build();
        dVar2.getClass();
        azVar2.f178796b = dVar2;
        azVar2.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.AssistantSettingsElement";
        C65848q qVar = (C65848q) C65849r.f179002c.createBuilder();
        C52686as asVar2 = (C52686as) arVar.build();
        qVar.copyOnWrite();
        C65849r rVar = (C65849r) qVar.instance;
        asVar2.getClass();
        rVar.f179005b = asVar2;
        rVar.f179004a = 10;
        C63088z byteString = ((C65849r) qVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar3 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar3.f178799e = hVar;
        azVar3.f178795a |= 8;
        C65768az azVar4 = (C65768az) ayVar.build();
        String F = this.f302722e.mo79659F();
        if (F == null) {
            C59104x c = f302719b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MorrisBtFragment");
            ((C59052c) ((C59052c) c).mo56372aa(24404)).mo56386p("Account name cannot be null.");
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = this.f302721d.d(F, C65753ak.ASSISTANT_SETTINGS, azVar4, true);
        }
        this.f302723f.mo28211k(cxVar, String.valueOf(String.valueOf(cxVar)).concat("writeGellerFuture"), new C108873cc());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        byte[] byteArray = getArguments().getByteArray("opa_android:morris_permissions");
        if (byteArray != null) {
            try {
                this.f302724g = (C52686as) C62942bv.parseFrom((C62942bv) C52686as.f138291q, byteArray, C62921ba.m95368a());
            } catch (Exception e) {
                C59104x d = f302719b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "MorrisBtFragment");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24405)).mo56386p("Unable to parse DrivingSettings proto.");
            }
        }
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        opaPageLayout.mo77370b(R.layout.morris_bluetooth_auto_trigger);
        C28295m.m52919e(opaPageLayout, new C28292j(135762));
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.morris_bt_auto_trigger_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.morris_bt_auto_trigger_description, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(24, 0, 24, 0);
        ((TextView) headerLayout.findViewById(R.id.opa_error_title)).setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(24, 23, 24, 0);
        ((TextView) headerLayout.findViewById(R.id.opa_error_message)).setLayoutParams(layoutParams2);
        C84012g a = opaPageLayout.mo77369a();
        a.mo77475d(2);
        C84010e e2 = C84011f.m133882e();
        e2.mo77375c(getText(R.string.morris_yes_button));
        ((C83958a) e2).f228734b = new C89943l(new C108871ca(this));
        a.mo77472a(e2.mo77373a());
        C84010e e3 = C84011f.m133882e();
        e3.mo77375c(getText(R.string.morris_not_now_button));
        ((C83958a) e3).f228734b = new C89943l(new C108872cb(this));
        a.mo77473b(e3.mo77373a());
        return opaPageLayout;
    }
}
