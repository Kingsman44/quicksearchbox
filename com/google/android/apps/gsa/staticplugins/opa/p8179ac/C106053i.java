package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87710as;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87711at;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87712au;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88092ow;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88093ox;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88094oy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88388zv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88389zw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88390zx;
import com.google.android.apps.gsa.searchplate.widget.StreamingTextView;
import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109460f;
import com.google.android.apps.gsa.staticplugins.opa.p8592ui.OpaEditText;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1528m.p1529a.C18431p;
import com.google.android.libraries.assistant.p1622v.C19457a;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52210jh;
import com.google.assistant.p3897e.p3921j.C52211ji;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.i */
/* compiled from: PG */
public final class C106053i implements C87682aj {

    /* renamed from: a */
    public final C107698i f296071a;

    /* renamed from: b */
    public final LogoView f296072b;

    /* renamed from: c */
    public final ImageView f296073c;

    /* renamed from: d */
    public final LogoView f296074d;

    /* renamed from: e */
    public final OpaEditText f296075e;

    /* renamed from: f */
    public final ImageButton f296076f;

    /* renamed from: g */
    public final View f296077g;

    /* renamed from: h */
    public boolean f296078h = false;

    /* renamed from: i */
    public boolean f296079i = false;

    /* renamed from: j */
    final View f296080j;

    /* renamed from: k */
    final StreamingTextView f296081k;

    /* renamed from: l */
    private final Resources f296082l;

    /* renamed from: m */
    private final Query f296083m;

    /* renamed from: n */
    private final InputMethodManager f296084n;

    /* renamed from: o */
    private final C19457a f296085o;

    /* renamed from: p */
    private boolean f296086p = false;

    /* renamed from: q */
    private final C106005ad f296087q;

    public C106053i(Context context, View view, C19457a aVar, C106005ad adVar, C107698i iVar, C107710u uVar, Query query) {
        this.f296071a = iVar;
        this.f296083m = query;
        this.f296080j = view;
        this.f296085o = aVar;
        this.f296087q = adVar;
        Resources resources = view.getResources();
        this.f296082l = resources;
        this.f296081k = (StreamingTextView) view.findViewById(R.id.canvas_voice_transcription);
        uVar.mo96220c(this, C88244um.UPDATE_SPEECH_EVENT, C88244um.UPDATE_RECOGNIZED_TEXT, C88244um.SET_FINAL_RECOGNIZED_TEXT, C88244um.SHOW_RECOGNITION_STATE);
        this.f296084n = (InputMethodManager) context.getSystemService("input_method");
        LogoView logoView = (LogoView) view.findViewById(R.id.mic_button);
        this.f296072b = logoView;
        logoView.mo28225e(13, true);
        logoView.f63000g.mo28247c(aVar, 2);
        logoView.mo28223c((float) resources.getInteger(R.integer.canvas_logo_view_logo_width), (float) resources.getInteger(R.integer.canvas_logo_view_logo_height));
        logoView.setOnClickListener(new C106048d(this));
        ImageView imageView = (ImageView) view.findViewById(R.id.keyboard_indicator);
        this.f296073c = imageView;
        LogoView logoView2 = (LogoView) view.findViewById(R.id.mic_button_toggle);
        this.f296074d = logoView2;
        OpaEditText opaEditText = (OpaEditText) view.findViewById(R.id.input_text);
        this.f296075e = opaEditText;
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.send_button);
        this.f296076f = imageButton;
        this.f296077g = view.findViewById(R.id.type_container);
        opaEditText.setInputType(32769);
        logoView2.mo28223c((float) resources.getInteger(R.integer.canvas_logo_view_toggle_logo_width), (float) resources.getInteger(R.integer.canvas_logo_view_toggle_logo_height));
        logoView2.mo28225e(7, true);
        imageView.setOnClickListener(new C106049e(this));
        logoView2.setOnClickListener(new C106050f(this));
        opaEditText.setOnEditorActionListener(new C106051g(this));
        opaEditText.addTextChangedListener(new C106052h(this));
        imageButton.setOnClickListener(new C106047c(this));
    }

    /* renamed from: k */
    private final void m176659k() {
        C107698i iVar = this.f296071a;
        C88489j jVar = new C88489j(C87739bu.CANCEL);
        C62940bt btVar = C87710as.f237179a;
        C87711at atVar = (C87711at) C87712au.f237180c.createBuilder();
        atVar.copyOnWrite();
        C87712au auVar = (C87712au) atVar.instance;
        auVar.f237182a |= 1;
        auVar.f237183b = false;
        jVar.mo82014b(btVar, (C87712au) atVar.build());
        iVar.mo96219b(jVar.mo82013a());
    }

    /* renamed from: a */
    public final void mo95269a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f296087q.mo95209a(4);
        this.f296072b.mo28225e(13, false);
        this.f296074d.mo28225e(13, false);
        this.f296073c.setVisibility(0);
        mo95276i(false);
        this.f296081k.mo82924c(BuildConfig.FLAVOR);
    }

    /* renamed from: b */
    public final void mo95270b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f296087q.mo95209a(3);
        mo95277j(false);
        this.f296075e.setText(BuildConfig.FLAVOR);
        this.f296072b.mo28225e(4, false);
        this.f296074d.mo28225e(4, false);
    }

    /* renamed from: d */
    public final void mo95271d(String str, boolean z) {
        C51805du duVar;
        if (!this.f296078h) {
            mo95272e();
            mo95274g();
            if (z) {
                duVar = C109460f.m182157a(str);
            } else {
                amm amm = (amm) C51682amp.f135384d.createBuilder();
                String obj = str.toString();
                amm.copyOnWrite();
                C51682amp amp = (C51682amp) amm.instance;
                obj.getClass();
                amp.f135386a |= 1;
                amp.f135387b = obj;
                amo amo = amo.UNTRUSTED;
                amm.copyOnWrite();
                C51682amp amp2 = (C51682amp) amm.instance;
                amp2.f135388c = amo.f135383d;
                amp2.f135386a |= 2;
                duVar = C109460f.m182158b((C51682amp) amm.build());
            }
            C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
            C63088z byteString = duVar.toByteString();
            oxVar.copyOnWrite();
            C88094oy oyVar = (C88094oy) oxVar.instance;
            byteString.getClass();
            oyVar.f238176a |= 1;
            oyVar.f238177b = byteString;
            C51209d dVar = C51209d.APP_INITIATED;
            oxVar.copyOnWrite();
            C88094oy oyVar2 = (C88094oy) oxVar.instance;
            oyVar2.f238181f = dVar.f133323n;
            oyVar2.f238176a |= 16;
            C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
            jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
            this.f296071a.mo96219b(jVar.mo82013a());
            this.f296078h = true;
            mo95270b();
        }
    }

    /* renamed from: e */
    public final void mo95272e() {
        this.f296071a.mo96218a(this.f296083m.mo84259V().mo84244G(true));
    }

    /* renamed from: f */
    public final void mo95273f() {
        Editable text = this.f296075e.getText();
        if (!C58879cp.m90962d(text.toString())) {
            this.f296071a.mo96218a(this.f296083m.mo84268aE(text.toString(), false).mo84245H(0, true, QueryTriggerType.USER).mo84264aA("and.opa", new Bundle()));
            this.f296078h = true;
            mo95270b();
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal != 70) {
            switch (ordinal) {
                case 44:
                    if (!this.f296079i) {
                        this.f296081k.mo82924c(((C88262vd) serviceEventData.mo81918e(C88260vb.f238727a)).f238731b);
                        return;
                    }
                    return;
                case 45:
                    if (!this.f296079i) {
                        this.f296086p = true;
                        mo95276i(true);
                        C88382zp zpVar = (C88382zp) serviceEventData.mo81918e(C88380zn.f238990a);
                        this.f296081k.mo82923b(zpVar.f238994b, zpVar.f238995c);
                        return;
                    }
                    return;
                case 46:
                    int i = ((C88304ws) serviceEventData.mo81918e(C88302wq.f238816a)).f238820b;
                    if (this.f296072b.f63000g.f63060j != 1 && i == 2) {
                        this.f296078h = false;
                        this.f296087q.mo95209a(2);
                        mo95277j(false);
                        this.f296077g.setVisibility(8);
                        this.f296073c.setVisibility(8);
                        this.f296072b.setVisibility(0);
                        this.f296072b.mo28225e(1, false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            int a2 = C88388zv.m142799a(((C88389zw) serviceEventData.mo81918e(C88390zx.f239007a)).f239006b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 1) {
                this.f296072b.mo28225e(2, false);
            } else if (i2 == 2) {
                if (this.f296086p) {
                    this.f296078h = true;
                    mo95270b();
                } else {
                    mo95269a();
                    m176659k();
                }
                this.f296086p = false;
            } else if (i2 == 3 && !this.f296078h) {
                mo95269a();
                m176659k();
            }
        }
    }

    /* renamed from: g */
    public final void mo95274g() {
        this.f296071a.mo96219b(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
        C52210jh jhVar = (C52210jh) C52211ji.f137015c.createBuilder();
        jhVar.copyOnWrite();
        C52211ji jiVar = (C52211ji) jhVar.instance;
        jiVar.f137018b = 1;
        jiVar.f137017a |= 1;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MicInputParam";
        C63088z byteString = ((C52211ji) jhVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "mic.ACTIVATE";
        dsVar.mo53729a("mic_input_params", (C52230ka) jzVar.build());
        C88093ox oxVar = (C88093ox) C88094oy.f238174g.createBuilder();
        C63088z byteString2 = ((C51805du) dsVar.build()).toByteString();
        oxVar.copyOnWrite();
        C88094oy oyVar = (C88094oy) oxVar.instance;
        byteString2.getClass();
        oyVar.f238176a = 1 | oyVar.f238176a;
        oyVar.f238177b = byteString2;
        C88489j jVar = new C88489j(C87739bu.OPA_CLIENT_INPUT);
        jVar.mo82014b(C88092ow.f238173a, (C88094oy) oxVar.build());
        this.f296071a.mo96219b(jVar.mo82013a());
    }

    /* renamed from: h */
    public final void mo95275h() {
        C58976aa aaVar = C58975e.f156826a;
        mo95277j(false);
        this.f296071a.mo96219b(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
        this.f296071a.mo96218a(this.f296083m.mo84245H(1, true, (QueryTriggerType) null).mo84264aA("and.opa", new Bundle()));
    }

    /* renamed from: i */
    public final void mo95276i(boolean z) {
        this.f296080j.findViewById(R.id.canvas_mic_plate_text_container).setVisibility(true != z ? 8 : 0);
    }

    /* renamed from: j */
    public final void mo95277j(boolean z) {
        if (z) {
            this.f296075e.requestFocus();
            this.f296084n.showSoftInput(this.f296075e, 1);
            C106005ad adVar = this.f296087q;
            if (adVar.f295946a.f296013k.mo79746e(C90041ct.f248694g)) {
                if (!adVar.f295946a.f296005c.mo56113h()) {
                    C59104x d = C106025ax.f295983a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "ImmersiveCanvasCtrlr");
                    ((C59052c) ((C59052c) d).mo56372aa(24656)).mo56386p("Cannot send user interaction when canvas webview container is not present.");
                    return;
                }
                ((C18431p) adVar.f295946a.f296005c.mo56107c()).mo23971n(3);
                return;
            }
            return;
        }
        this.f296075e.clearFocus();
        this.f296084n.hideSoftInputFromWindow(this.f296075e.getWindowToken(), 0);
    }
}
