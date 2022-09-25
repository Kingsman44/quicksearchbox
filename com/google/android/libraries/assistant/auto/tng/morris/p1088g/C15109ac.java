package com.google.android.libraries.assistant.auto.tng.morris.p1088g;

import android.animation.ObjectAnimator;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;
import android.os.UserHandle;
import android.util.SizeF;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1745d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14129bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14144n;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14548nh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14551nk;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14553nm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14555no;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14574og;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14582oo;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14586os;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14588ou;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14590ow;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14592oy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14595pa;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14599pe;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14601pg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14632v;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15169af;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15174ak;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15181ar;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15188ay;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15191ba;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15193bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15199bi;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15201bk;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15206bp;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15208br;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15209bs;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15210bt;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15211bu;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15212bv;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15220cc;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15221cd;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15222ce;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15223cf;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15224cg;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15226ci;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15229cl;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15230cm;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15231cn;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15232co;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15233cp;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15234cq;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15235cr;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15236cs;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15237ct;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15238cu;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15239cv;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15240cw;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15241cx;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15242cy;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15243cz;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15245da;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15246db;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15247dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15248dd;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15253i;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15258n;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15262r;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d.C15265u;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15325a;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15336j;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16753c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.assistant.p3931f.p3939c.C52817ag;
import com.google.assistant.p3931f.p3939c.C52818ah;
import com.google.assistant.p3931f.p3939c.C52842s;
import com.google.assistant.p3931f.p3939c.C52845v;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.ac */
/* compiled from: PG */
public final class C15109ac {

    /* renamed from: a */
    public static final C59071e f45336a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.ac");

    /* renamed from: A */
    private final C69464a f45337A;

    /* renamed from: B */
    private int f45338B = 5;

    /* renamed from: b */
    public final C60887da f45339b;

    /* renamed from: c */
    public final C14986h f45340c;

    /* renamed from: d */
    public C14602ph f45341d = C14602ph.TASK_NOT_SET;

    /* renamed from: e */
    public boolean f45342e;

    /* renamed from: f */
    private final C15174ak f45343f;

    /* renamed from: g */
    private final C15243cz f45344g;

    /* renamed from: h */
    private final C15241cx f45345h;

    /* renamed from: i */
    private final C15253i f45346i;

    /* renamed from: j */
    private final C15181ar f45347j;

    /* renamed from: k */
    private final C15235cr f45348k;

    /* renamed from: l */
    private final C15191ba f45349l;

    /* renamed from: m */
    private final C15201bk f45350m;

    /* renamed from: n */
    private final C15206bp f45351n;

    /* renamed from: o */
    private final C15193bc f45352o;

    /* renamed from: p */
    private final C15199bi f45353p;

    /* renamed from: q */
    private final C15208br f45354q;

    /* renamed from: r */
    private final C15188ay f45355r;

    /* renamed from: s */
    private final C15231cn f45356s;

    /* renamed from: t */
    private final C15169af f45357t;

    /* renamed from: u */
    private final C15262r f45358u;

    /* renamed from: v */
    private final C15212bv f45359v;

    /* renamed from: w */
    private final C15258n f45360w;

    /* renamed from: x */
    private final C15248dd f45361x;

    /* renamed from: y */
    private final C15265u f45362y;

    /* renamed from: z */
    private final C15220cc f45363z;

    public C15109ac(C14986h hVar, C15174ak akVar, C15243cz czVar, C15241cx cxVar, C15253i iVar, C15181ar arVar, C15235cr crVar, C15191ba baVar, C15201bk bkVar, C15206bp bpVar, C15193bc bcVar, C15199bi biVar, C15208br brVar, C15188ay ayVar, C15231cn cnVar, C15169af afVar, C15262r rVar, C15212bv bvVar, C15258n nVar, C15248dd ddVar, C15265u uVar, C15220cc ccVar, C69464a aVar, C60887da daVar) {
        this.f45340c = hVar;
        this.f45343f = akVar;
        this.f45344g = czVar;
        this.f45345h = cxVar;
        this.f45346i = iVar;
        this.f45347j = arVar;
        this.f45348k = crVar;
        this.f45349l = baVar;
        this.f45350m = bkVar;
        this.f45351n = bpVar;
        this.f45352o = bcVar;
        this.f45353p = biVar;
        this.f45354q = brVar;
        this.f45355r = ayVar;
        this.f45356s = cnVar;
        this.f45357t = afVar;
        this.f45358u = rVar;
        this.f45359v = bvVar;
        this.f45360w = nVar;
        this.f45361x = ddVar;
        this.f45362y = uVar;
        this.f45363z = ccVar;
        this.f45337A = aVar;
        this.f45339b = daVar;
    }

    /* renamed from: e */
    private final void m31672e(ViewGroup viewGroup, boolean z) {
        this.f45342e = false;
        if (viewGroup.getAnimation() != null && !viewGroup.getAnimation().hasEnded()) {
            C59104x b = f45336a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.ModeTaskRndr");
            ((C59052c) ((C59052c) b).mo56372aa(45934)).mo56389s("Cancelling existing animation: renderingNewTask=%b", Boolean.valueOf(z));
            this.f45342e = z;
            viewGroup.setAnimation((Animation) null);
        }
    }

    /* renamed from: a */
    public final void mo21971a(boolean z, int i, boolean z2) {
        if (i != 0 && !z) {
            ((C15113ag) this.f45337A.mo17428b()).mo21986f(i, z2);
        }
    }

    /* renamed from: b */
    public final void mo21972b() {
        this.f45341d = C14602ph.TASK_NOT_SET;
        this.f45338B = 5;
    }

    /* renamed from: c */
    public final boolean mo21973c(C14603pi piVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper, boolean z) {
        boolean z2;
        C14565ny nyVar;
        C14599pe peVar;
        C14597pc pcVar;
        C14572oe oeVar;
        C14568oa oaVar;
        C14574og ogVar;
        C14582oo ooVar;
        C14584oq oqVar;
        C14584oq oqVar2;
        C14576oi oiVar;
        C14578ok okVar;
        C14586os osVar;
        C14595pa paVar;
        C14558nr nrVar;
        C14588ou ouVar;
        C14548nh nhVar;
        C14592oy oyVar;
        int i;
        String languageTag;
        String string;
        AppWidgetProviderInfo appWidgetProviderInfo;
        boolean bindAppWidgetIdIfAllowed;
        C14555no noVar;
        C14590ow owVar;
        C14603pi piVar2 = piVar;
        ViewGroup viewGroup2 = viewGroup;
        ContextThemeWrapper contextThemeWrapper2 = contextThemeWrapper;
        int i2 = 1;
        if (C14602ph.m30643a(piVar2.f44160a) != this.f45341d) {
            viewGroup.removeAllViews();
            this.f45341d = C14602ph.m30643a(piVar2.f44160a);
            z2 = true;
        } else {
            z2 = z;
        }
        switch (C14602ph.m30643a(piVar2.f44160a).ordinal()) {
            case 0:
                if (z2) {
                    this.f45343f.mo22050b();
                }
                C15174ak akVar = this.f45343f;
                if (piVar2.f44160a == 1) {
                    nyVar = (C14565ny) piVar2.f44161b;
                } else {
                    nyVar = C14565ny.f44034e;
                }
                akVar.mo22049a(nyVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 1:
                if (z2) {
                    C15243cz czVar = this.f45344g;
                    czVar.f45744d = null;
                    czVar.f45745e = null;
                }
                C15243cz czVar2 = this.f45344g;
                if (piVar2.f44160a == 2) {
                    peVar = (C14599pe) piVar2.f44161b;
                } else {
                    peVar = C14599pe.f44128c;
                }
                if (czVar2.f45744d == null) {
                    ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.outgoing_call_mini, viewGroup2, true);
                    viewGroup3.getClass();
                    View findViewById = viewGroup3.findViewById(R.id.outgoing_call_mini_container);
                    czVar2.f45743c.mo21444a(findViewById, 114321);
                    findViewById.getClass();
                    ImageView imageView = (ImageView) findViewById.findViewById(R.id.outgoing_call_mini_end_call_button);
                    czVar2.f45743c.mo21444a(imageView, 114320);
                    imageView.setOnClickListener(new C14129bc(czVar2.f45743c, Optional.empty(), new C15242cy(czVar2)));
                    czVar2.f45744d = (TextView) findViewById.findViewById(R.id.outgoing_call_mini_callee_name);
                }
                if (peVar.equals(czVar2.f45745e)) {
                    return true;
                }
                TextView textView = czVar2.f45744d;
                textView.getClass();
                textView.setText(peVar.f44130a);
                czVar2.f45745e = peVar;
                return true;
            case 2:
                if (z2) {
                    C15241cx cxVar = this.f45345h;
                    cxVar.f45736f = null;
                    cxVar.f45739i = null;
                }
                C15241cx cxVar2 = this.f45345h;
                if (piVar2.f44160a == 3) {
                    pcVar = (C14597pc) piVar2.f44161b;
                } else {
                    pcVar = C14597pc.f44122e;
                }
                if (cxVar2.f45736f == null) {
                    ViewGroup viewGroup4 = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(R.layout.ongoing_call_mini, viewGroup2, true);
                    viewGroup4.getClass();
                    View findViewById2 = viewGroup4.findViewById(R.id.ongoing_call_mini_container);
                    cxVar2.f45735e.mo21444a(findViewById2, 114256);
                    findViewById2.getClass();
                    ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.ongoing_call_mini_end_call_button);
                    cxVar2.f45735e.mo21444a(imageView2, 114257);
                    imageView2.setOnClickListener(new C14129bc(cxVar2.f45735e, Optional.empty(), new C15236cs(cxVar2)));
                    View findViewById3 = findViewById2.findViewById(R.id.ongoing_call_dismiss_caret);
                    cxVar2.f45735e.mo21444a(findViewById3, 114849);
                    findViewById3.setOnClickListener(new C14129bc(cxVar2.f45735e, Optional.empty(), new C15237ct(cxVar2)));
                    cxVar2.f45736f = (TextView) findViewById2.findViewById(R.id.ongoing_call_mini_caller_name);
                    cxVar2.f45737g = (Chronometer) findViewById2.findViewById(R.id.ongoing_call_mini_call_duration);
                    cxVar2.f45738h = (TextView) findViewById2.findViewById(R.id.ongoing_call_mini_call_status);
                    viewGroup4.setAccessibilityDelegate(new C15238cu(cxVar2));
                    viewGroup4.setOnClickListener(new C15239cv(cxVar2));
                    viewGroup4.setOnTouchListener(new C14144n(cxVar2.f45734d, cxVar2.f45735e, new C15240cw(cxVar2)));
                }
                if (pcVar.equals(cxVar2.f45739i)) {
                    return true;
                }
                TextView textView2 = cxVar2.f45736f;
                textView2.getClass();
                textView2.setText(pcVar.f44124a);
                C15336j jVar = cxVar2.f45733c;
                int b = C14632v.m30648b(pcVar.f44126c);
                int i3 = b == 0 ? 1 : b;
                Chronometer chronometer = cxVar2.f45737g;
                chronometer.getClass();
                TextView textView3 = cxVar2.f45738h;
                textView3.getClass();
                jVar.mo22208d(i3, chronometer, textView3, pcVar.f44127d);
                cxVar2.f45739i = pcVar;
                return true;
            case 3:
                if (z2) {
                    this.f45355r.mo22066b();
                }
                C15188ay ayVar = this.f45355r;
                if (piVar2.f44160a == 6) {
                    oeVar = (C14572oe) piVar2.f44161b;
                } else {
                    oeVar = C14572oe.f44055i;
                }
                ayVar.mo22065a(oeVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 4:
                if (z2) {
                    this.f45347j.mo22058b();
                }
                C15181ar arVar = this.f45347j;
                if (piVar2.f44160a == 4) {
                    oaVar = (C14568oa) piVar2.f44161b;
                } else {
                    oaVar = C14568oa.f44045d;
                }
                arVar.mo22057a(oaVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 5:
                if (z2) {
                    C15191ba baVar = this.f45349l;
                    baVar.f45598a = null;
                    baVar.f45599b = null;
                    baVar.f45601d = null;
                    baVar.f45600c = null;
                }
                C15191ba baVar2 = this.f45349l;
                if (piVar2.f44160a == 15) {
                    ogVar = (C14574og) piVar2.f44161b;
                } else {
                    ogVar = C14574og.f44066c;
                }
                baVar2.mo22068a(ogVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 6:
                if (z2) {
                    C15201bk bkVar = this.f45350m;
                    bkVar.f45630a = null;
                    bkVar.f45631b = null;
                    bkVar.f45632c = null;
                    bkVar.f45634e = null;
                    bkVar.f45633d = null;
                }
                C15201bk bkVar2 = this.f45350m;
                if (piVar2.f44160a == 9) {
                    ooVar = (C14582oo) piVar2.f44161b;
                } else {
                    ooVar = C14582oo.f44087c;
                }
                bkVar2.mo22075a(ooVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 7:
                if (z2) {
                    this.f45351n.mo22080b();
                }
                C15206bp bpVar = this.f45351n;
                if (piVar2.f44160a == 12) {
                    oqVar = (C14584oq) piVar2.f44161b;
                } else {
                    oqVar = C14584oq.f44091f;
                }
                bpVar.mo22079a(oqVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 8:
                if (z2) {
                    this.f45351n.mo22080b();
                }
                C15206bp bpVar2 = this.f45351n;
                if (piVar2.f44160a == 16) {
                    oqVar2 = (C14584oq) piVar2.f44161b;
                } else {
                    oqVar2 = C14584oq.f44091f;
                }
                bpVar2.mo22079a(oqVar2, viewGroup2, contextThemeWrapper2);
                return true;
            case 9:
                if (z2) {
                    C15193bc bcVar = this.f45352o;
                    bcVar.f45607a = null;
                    bcVar.f45608b = null;
                    bcVar.f45609c = null;
                    bcVar.f45610d = null;
                }
                C15193bc bcVar2 = this.f45352o;
                if (piVar2.f44160a == 10) {
                    oiVar = (C14576oi) piVar2.f44161b;
                } else {
                    oiVar = C14576oi.f44070d;
                }
                bcVar2.mo22069a(oiVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 10:
                if (z2) {
                    C15199bi biVar = this.f45353p;
                    biVar.f45623e = null;
                    biVar.f45624f = null;
                    biVar.f45620b = null;
                    biVar.f45621c = null;
                    biVar.f45622d = null;
                }
                C15199bi biVar2 = this.f45353p;
                if (piVar2.f44160a == 7) {
                    okVar = (C14578ok) piVar2.f44161b;
                } else {
                    okVar = C14578ok.f44075f;
                }
                biVar2.mo22074a(okVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 11:
                if (z2) {
                    C15208br brVar = this.f45354q;
                    brVar.f45655b = null;
                    brVar.f45656c = null;
                }
                C15208br brVar2 = this.f45354q;
                if (piVar2.f44160a == 8) {
                    osVar = (C14586os) piVar2.f44161b;
                } else {
                    osVar = C14586os.f44098b;
                }
                brVar2.mo22084a(osVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 12:
                if (z2) {
                    C15235cr crVar = this.f45348k;
                    crVar.f45723d = null;
                    crVar.f45724e = null;
                    crVar.f45722c = null;
                    crVar.f45725f = null;
                }
                C15235cr crVar2 = this.f45348k;
                if (piVar2.f44160a == 20) {
                    paVar = (C14595pa) piVar2.f44161b;
                } else {
                    paVar = C14595pa.f44120a;
                }
                C58976aa aaVar = C58975e.f156826a;
                if (crVar2.f45723d == null) {
                    LayoutInflater.from(contextThemeWrapper).inflate(R.layout.ongoing_call_education_message, viewGroup2, true);
                    View findViewById4 = viewGroup2.findViewById(R.id.ongoing_call_education_message_container);
                    crVar2.f45721b.mo21444a(findViewById4, 137601);
                    findViewById4.getClass();
                    crVar2.f45722c = (CircularProgressIndicator) findViewById4.findViewById(R.id.cancel_fuse);
                    crVar2.f45721b.mo21444a(crVar2.f45722c, 138227);
                    crVar2.f45722c.setOnClickListener(new C14129bc(crVar2.f45721b, Optional.empty(), new C15232co(crVar2)));
                    findViewById4.findViewById(R.id.ongoing_call_education_message_dismiss_caret).setOnClickListener(new C14129bc(crVar2.f45721b, Optional.empty(), new C15233cp(crVar2)));
                    crVar2.f45723d = (TextView) findViewById4.findViewById(R.id.ongoing_call_education_message_text);
                }
                if (paVar.equals(crVar2.f45724e)) {
                    return true;
                }
                TextView textView4 = crVar2.f45723d;
                textView4.getClass();
                textView4.setText(R.string.ongoing_call_education_message_text);
                CircularProgressIndicator circularProgressIndicator = crVar2.f45722c;
                circularProgressIndicator.getClass();
                circularProgressIndicator.setProgress(0);
                crVar2.f45725f = ObjectAnimator.ofInt(crVar2.f45722c, "progress", new int[]{100});
                ObjectAnimator objectAnimator = crVar2.f45725f;
                objectAnimator.getClass();
                objectAnimator.setDuration(15000).start();
                ObjectAnimator objectAnimator2 = crVar2.f45725f;
                objectAnimator2.getClass();
                objectAnimator2.addListener(new C15234cq(crVar2));
                crVar2.f45724e = paVar;
                return true;
            case 13:
                if (z2) {
                    this.f45357t.mo22046c();
                }
                C15169af afVar = this.f45357t;
                if (piVar2.f44160a == 11) {
                    nrVar = (C14558nr) piVar2.f44161b;
                } else {
                    nrVar = C14558nr.f44013g;
                }
                afVar.mo22045b(nrVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 14:
                if (z2) {
                    this.f45358u.f45790b = null;
                }
                C15262r rVar = this.f45358u;
                if (piVar2.f44160a == 13) {
                    C14553nm nmVar = (C14553nm) piVar2.f44161b;
                } else {
                    C14553nm nmVar2 = C14553nm.f44006a;
                }
                rVar.mo22148a(viewGroup2, contextThemeWrapper2);
                return true;
            case 15:
                if (z2) {
                    C15212bv bvVar = this.f45359v;
                    bvVar.f45665d = null;
                    bvVar.f45666e = null;
                }
                C15212bv bvVar2 = this.f45359v;
                if (piVar2.f44160a == 14) {
                    ouVar = (C14588ou) piVar2.f44161b;
                } else {
                    ouVar = C14588ou.f44101b;
                }
                bvVar2.f45666e = ouVar;
                if (bvVar2.f45665d != null) {
                    return true;
                }
                LayoutInflater.from(contextThemeWrapper).inflate(R.layout.notification_permissions, viewGroup2, true);
                bvVar2.f45665d = (ViewGroup) viewGroup2.findViewById(R.id.notification_permissions);
                bvVar2.f45664c.mo21444a(bvVar2.f45665d, 111199);
                C15211bu buVar = new C15211bu(bvVar2);
                ViewGroup viewGroup5 = bvVar2.f45665d;
                viewGroup5.getClass();
                viewGroup5.findViewById(R.id.notification_permissions_scroll_container).setOnTouchListener(new C14144n(contextThemeWrapper2, bvVar2.f45664c, buVar));
                ViewGroup viewGroup6 = bvVar2.f45665d;
                viewGroup6.getClass();
                View findViewById5 = viewGroup6.findViewById(R.id.notification_permissions_scrim);
                bvVar2.f45664c.mo21444a(findViewById5, 111201);
                findViewById5.setOnClickListener(new C14129bc(bvVar2.f45664c, Optional.empty(), new C15209bs(bvVar2)));
                ViewGroup viewGroup7 = bvVar2.f45665d;
                viewGroup7.getClass();
                viewGroup7.findViewById(R.id.dismiss_chevron).setOnClickListener(new C14129bc(bvVar2.f45664c, Optional.empty(), new C15209bs(bvVar2)));
                ViewGroup viewGroup8 = bvVar2.f45665d;
                viewGroup8.getClass();
                View findViewById6 = viewGroup8.findViewById(R.id.notification_permissions_button);
                bvVar2.f45664c.mo21444a(findViewById6, 111200);
                findViewById6.setOnClickListener(new C14129bc(bvVar2.f45664c, Optional.empty(), new C15210bt(bvVar2, ouVar)));
                return true;
            case 16:
                if (z2) {
                    this.f45360w.f45784b = null;
                }
                C15258n nVar = this.f45360w;
                if (piVar2.f44160a == 17) {
                    C14551nk nkVar = (C14551nk) piVar2.f44161b;
                } else {
                    C14551nk nkVar2 = C14551nk.f44004a;
                }
                nVar.mo22144a(viewGroup2, contextThemeWrapper2);
                return true;
            case 17:
                if (z2) {
                    this.f45346i.mo22138c();
                }
                C15253i iVar = this.f45346i;
                if (piVar2.f44160a == 18) {
                    nhVar = (C14548nh) piVar2.f44161b;
                } else {
                    nhVar = C14548nh.f44000c;
                }
                iVar.mo22137b(nhVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 18:
                if (z2) {
                    this.f45361x.f45753c = null;
                }
                C15248dd ddVar = this.f45361x;
                if (piVar2.f44160a == 19) {
                    C14601pg pgVar = (C14601pg) piVar2.f44161b;
                } else {
                    C14601pg pgVar2 = C14601pg.f44132a;
                }
                if (ddVar.f45753c != null) {
                    return true;
                }
                LayoutInflater.from(contextThemeWrapper).inflate(R.layout.privacy_disclaimer, viewGroup2, true);
                ddVar.f45753c = (ViewGroup) viewGroup2.findViewById(R.id.privacy_disclaimer);
                ddVar.f45752b.mo21444a(ddVar.f45753c, 135108);
                C15247dc dcVar = new C15247dc(ddVar);
                ViewGroup viewGroup9 = ddVar.f45753c;
                viewGroup9.getClass();
                viewGroup9.findViewById(R.id.privacy_disclaimer_scroll_container).setOnTouchListener(new C14144n(contextThemeWrapper2, ddVar.f45752b, dcVar));
                ViewGroup viewGroup10 = ddVar.f45753c;
                viewGroup10.getClass();
                View findViewById7 = viewGroup10.findViewById(R.id.scrim);
                ddVar.f45752b.mo21444a(findViewById7, 135107);
                findViewById7.setOnClickListener(new C14129bc(ddVar.f45752b, Optional.empty(), new C15245da(ddVar)));
                ViewGroup viewGroup11 = ddVar.f45753c;
                viewGroup11.getClass();
                viewGroup11.findViewById(R.id.dismiss_chevron).setOnClickListener(new C14129bc(ddVar.f45752b, Optional.empty(), new C15245da(ddVar)));
                ViewGroup viewGroup12 = ddVar.f45753c;
                viewGroup12.getClass();
                View findViewById8 = viewGroup12.findViewById(R.id.dismiss_button);
                ddVar.f45752b.mo21444a(findViewById8, 135106);
                findViewById8.setOnClickListener(new C14129bc(ddVar.f45752b, Optional.empty(), new C15245da(ddVar)));
                ViewGroup viewGroup13 = ddVar.f45753c;
                viewGroup13.getClass();
                View findViewById9 = viewGroup13.findViewById(R.id.learn_more_button);
                ddVar.f45752b.mo21444a(findViewById9, 135105);
                findViewById9.setOnClickListener(new C14129bc(ddVar.f45752b, Optional.empty(), new C15246db(ddVar)));
                ViewGroup viewGroup14 = ddVar.f45753c;
                viewGroup14.getClass();
                TextView textView5 = (TextView) viewGroup14.findViewById(R.id.privacy_disclaimer_sources);
                textView5.setText(String.format("%s\n%s\n%s", new Object[]{contextThemeWrapper2.getString(R.string.privacy_disclaimer_source_location_history_text), contextThemeWrapper2.getString(R.string.privacy_disclaimer_source_recent_searches_text), contextThemeWrapper2.getString(R.string.privacy_disclaimer_source_calendar_text)}));
                textView5.setContentDescription(String.format("%s, %s, %s", new Object[]{contextThemeWrapper2.getString(R.string.privacy_disclaimer_source_location_history_text), contextThemeWrapper2.getString(R.string.privacy_disclaimer_source_recent_searches_text), contextThemeWrapper2.getString(R.string.privacy_disclaimer_source_calendar_text)}));
                return true;
            case 19:
                if (z2) {
                    C15231cn cnVar = this.f45356s;
                    if (cnVar.f45707j) {
                        try {
                            C15229cl clVar = cnVar.f45704g;
                            clVar.getClass();
                            clVar.stopListening();
                        } catch (NullPointerException e) {
                            C59104x d = C15231cn.f45698a.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "Morris.OneShotWgtRndr");
                            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(46027)).mo56386p("Issue while stopping AppWidgetHost.");
                        }
                        cnVar.f45707j = false;
                    }
                    cnVar.f45699b = null;
                    cnVar.f45700c = null;
                    cnVar.f45701d = null;
                    cnVar.f45703f = null;
                    cnVar.f45704g = null;
                    cnVar.f45702e = null;
                    cnVar.mo22109c();
                }
                C15231cn cnVar2 = this.f45356s;
                if (piVar2.f44160a == 21) {
                    oyVar = (C14592oy) piVar2.f44161b;
                } else {
                    oyVar = C14592oy.f44108c;
                }
                if (oyVar.equals(cnVar2.f45702e)) {
                    return true;
                }
                if (cnVar2.f45699b == null) {
                    LayoutInflater.from(contextThemeWrapper).inflate(R.layout.immersive_task, viewGroup2, true);
                    ViewGroup viewGroup15 = (ViewGroup) viewGroup2.findViewById(R.id.immersive_view);
                    viewGroup15.getClass();
                    cnVar2.f45699b = viewGroup15.findViewById(R.id.immersive_card_background);
                    C15226ci ciVar = new C15226ci(cnVar2);
                    View view = cnVar2.f45699b;
                    view.getClass();
                    view.setOnTouchListener(new C14144n(contextThemeWrapper2, cnVar2.f45712o, ciVar));
                    viewGroup15.findViewById(R.id.immersive_info_button).setVisibility(8);
                    viewGroup15.findViewById(R.id.immersive_title).setVisibility(8);
                    cnVar2.f45700c = viewGroup15.findViewById(R.id.immersive_scrim_view);
                    C14132bf bfVar = cnVar2.f45712o;
                    View view2 = cnVar2.f45700c;
                    view2.getClass();
                    bfVar.mo21444a(view2, 149361);
                    View view3 = cnVar2.f45700c;
                    view3.getClass();
                    view3.setOnClickListener(new C14129bc(cnVar2.f45712o, Optional.empty(), new C15222ce(cnVar2, contextThemeWrapper2)));
                    cnVar2.f45701d = viewGroup15.findViewById(R.id.immersive_dismiss_chevron);
                    C14132bf bfVar2 = cnVar2.f45712o;
                    View view4 = cnVar2.f45701d;
                    view4.getClass();
                    bfVar2.mo21444a(view4, 149380);
                    View view5 = cnVar2.f45701d;
                    view5.getClass();
                    view5.setOnClickListener(new C14129bc(cnVar2.f45712o, Optional.empty(), new C15223cf(cnVar2, contextThemeWrapper2)));
                    C58976aa aaVar2 = C58975e.f156826a;
                    View view6 = cnVar2.f45699b;
                    if (view6 != null) {
                        view6.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper2, R.anim.immersive_shelf_show_up));
                    }
                    View view7 = cnVar2.f45700c;
                    if (view7 != null) {
                        view7.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper2, R.anim.immersive_scrim));
                    }
                    View view8 = cnVar2.f45701d;
                    if (view8 != null) {
                        view8.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper2, R.anim.immersive_fab));
                    }
                }
                C16754d dVar = oyVar.f44110a;
                if (dVar == null) {
                    dVar = C16754d.f49023f;
                }
                ViewGroup viewGroup16 = (ViewGroup) viewGroup2.findViewById(R.id.immersive_view);
                if (cnVar2.f45703f == null) {
                    viewGroup16.getClass();
                    cnVar2.f45703f = (ViewGroup) viewGroup16.findViewById(R.id.immersive_content);
                    C14132bf bfVar3 = cnVar2.f45712o;
                    ViewGroup viewGroup17 = cnVar2.f45703f;
                    viewGroup17.getClass();
                    bfVar3.mo21444a(viewGroup17, 149362);
                }
                if (cnVar2.f45704g == null) {
                    cnVar2.f45704g = new C15229cl(cnVar2.f45710m);
                }
                cnVar2.mo22111e();
                C15229cl clVar2 = cnVar2.f45704g;
                clVar2.getClass();
                cnVar2.f45706i = clVar2.allocateAppWidgetId();
                int dimensionPixelSize = cnVar2.f45710m.getResources().getDimensionPixelSize(R.dimen.immersive_widget_content_margin_horizontal);
                ViewGroup viewGroup18 = cnVar2.f45703f;
                viewGroup18.getClass();
                viewGroup18.measure(View.MeasureSpec.makeMeasureSpec(cnVar2.f45710m.getResources().getDisplayMetrics().widthPixels - (dimensionPixelSize + dimensionPixelSize), 1073741824), 0);
                ViewGroup viewGroup19 = cnVar2.f45703f;
                viewGroup19.getClass();
                C15325a aVar = new C15325a(viewGroup19.getMeasuredWidth(), cnVar2.f45710m);
                AppWidgetManager appWidgetManager = cnVar2.f45713p;
                int i4 = cnVar2.f45706i;
                C16753c cVar = dVar.f49027c;
                if (cVar == null) {
                    cVar = C16753c.f49018d;
                }
                String str = cVar.f49021b;
                List<AppWidgetProviderInfo> installedProvidersForPackage = appWidgetManager.getInstalledProvidersForPackage(str, (UserHandle) null);
                if (installedProvidersForPackage.isEmpty()) {
                    C59104x d2 = C15231cn.f45698a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "Morris.OneShotWgtRndr");
                    ((C59052c) ((C59052c) d2).mo56372aa(46022)).mo56389s("No widget providers found for %s", str);
                    i = 3;
                } else {
                    Iterator<AppWidgetProviderInfo> it = installedProvidersForPackage.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            appWidgetProviderInfo = it.next();
                            int i5 = appWidgetProviderInfo.widgetFeatures & i2;
                            if (Build.VERSION.SDK_INT > 30) {
                                i5 = (i5 == 0 && (appWidgetProviderInfo.widgetFeatures & 4) == 0) ? 0 : 1;
                            }
                            if (appWidgetProviderInfo.configure != null && i5 == 0) {
                                i2 = 1;
                            }
                        } else {
                            appWidgetProviderInfo = null;
                        }
                    }
                    if (appWidgetProviderInfo == null) {
                        C59104x d3 = C15231cn.f45698a.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "Morris.OneShotWgtRndr");
                        ((C59052c) ((C59052c) d3).mo56372aa(46021)).mo56389s("No widget providers found without a configuration activity for %s", str);
                        i = 4;
                    } else {
                        C16753c cVar2 = dVar.f49027c;
                        if (cVar2 == null) {
                            cVar2 = C16753c.f49018d;
                        }
                        if (cVar2.f49022c.isEmpty()) {
                            bindAppWidgetIdIfAllowed = appWidgetManager.bindAppWidgetIdIfAllowed(i4, appWidgetProviderInfo.provider, cnVar2.mo22107a(aVar, appWidgetProviderInfo));
                        } else {
                            C16753c cVar3 = dVar.f49027c;
                            String str2 = (cVar3 == null ? C16753c.f49018d : cVar3).f49021b;
                            if (cVar3 == null) {
                                cVar3 = C16753c.f49018d;
                            }
                            ComponentName componentName = new ComponentName(str2, cVar3.f49022c);
                            Bundle a = cnVar2.mo22107a(aVar, appWidgetProviderInfo);
                            C52846w wVar = dVar.f49028d;
                            if (wVar == null) {
                                wVar = C52846w.f138653b;
                            }
                            if (!wVar.f138655a.isEmpty()) {
                                C52845v vVar = (C52845v) wVar.f138655a.get(0);
                                a.putString("com.google.assistant.appactions.widgets.APP_ACTIONS_BII", vVar.f138650a);
                                a.putString("com.google.assistant.appactions.widgets.APP_ACTIONS_IDENTIFIER", vVar.f138651b);
                                C62971cq cqVar = vVar.f138652c;
                                Bundle bundle = new Bundle();
                                Iterator it2 = cqVar.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C52842s sVar = (C52842s) it2.next();
                                        String str3 = sVar.f138642a;
                                        if (!sVar.f138643b.isEmpty()) {
                                            C52818ah ahVar = (C52818ah) sVar.f138643b.get(0);
                                            if ((ahVar.f138578a & 1) != 0) {
                                                bundle.putString(str3, ahVar.f138581d);
                                            } else {
                                                int i6 = ahVar.f138579b;
                                                int a2 = C52817ag.m86714a(i6);
                                                Iterator it3 = it2;
                                                int i7 = a2 - 1;
                                                if (a2 != 0) {
                                                    if (i7 == 0) {
                                                        bundle.putString(str3, i6 == 2 ? (String) ahVar.f138580c : BuildConfig.FLAVOR);
                                                    } else if (i7 != 5) {
                                                        C59104x d4 = C15231cn.f45698a.mo56226d();
                                                        d4.mo56378ag(C58975e.f156826a, "Morris.OneShotWgtRndr");
                                                        ((C59052c) ((C59052c) d4).mo56372aa(46019)).mo56389s("Received a param with not supported value %s", str3);
                                                    } else {
                                                        C59104x d5 = C15231cn.f45698a.mo56226d();
                                                        d5.mo56378ag(C58975e.f156826a, "Morris.OneShotWgtRndr");
                                                        ((C59052c) ((C59052c) d5).mo56372aa(46020)).mo56389s("Received a param with no value for name %s", str3);
                                                    }
                                                    it2 = it3;
                                                } else {
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                                a.putBundle("com.google.assistant.appactions.widgets.APP_ACTIONS_PARAMS", bundle);
                            }
                            bindAppWidgetIdIfAllowed = appWidgetManager.bindAppWidgetIdIfAllowed(i4, componentName, a);
                        }
                        i = true != bindAppWidgetIdIfAllowed ? 5 : 1;
                    }
                }
                int i8 = i - 1;
                if (i8 != 0) {
                    if (i8 != 2) {
                        if (i8 == 4) {
                            C59104x c = C15231cn.f45698a.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "Morris.OneShotWgtRndr");
                            C59052c cVar4 = (C59052c) ((C59052c) c).mo56372aa(46026);
                            C16753c cVar5 = dVar.f49027c;
                            String str4 = (cVar5 == null ? C16753c.f49018d : cVar5).f49021b;
                            if (cVar5 == null) {
                                cVar5 = C16753c.f49018d;
                            }
                            cVar4.mo56354G("no permission to bind to widget: package=%s, class=%s", str4, cVar5.f49022c);
                        }
                        languageTag = Locale.getDefault().toLanguageTag();
                        string = cnVar2.f45710m.getString(R.string.cannot_render_widget_text, new Object[]{dVar.f49029e});
                    } else {
                        languageTag = Locale.getDefault().toLanguageTag();
                        string = cnVar2.f45710m.getString(R.string.no_widget_available_text, new Object[]{dVar.f49029e});
                    }
                    cnVar2.mo22110d(languageTag, string);
                } else {
                    if (!cnVar2.f45707j) {
                        C15229cl clVar3 = cnVar2.f45704g;
                        clVar3.getClass();
                        clVar3.startListening();
                        cnVar2.f45707j = true;
                    }
                    AppWidgetProviderInfo appWidgetInfo = cnVar2.f45713p.getAppWidgetInfo(cnVar2.f45706i);
                    C15229cl clVar4 = cnVar2.f45704g;
                    clVar4.getClass();
                    C15230cm cmVar = (C15230cm) clVar4.createView(cnVar2.f45710m, cnVar2.f45706i, appWidgetInfo);
                    cmVar.f45697a = new C15221cd(cnVar2, dVar);
                    ViewGroup viewGroup20 = cnVar2.f45703f;
                    viewGroup20.getClass();
                    viewGroup20.setVisibility(0);
                    SizeF c2 = aVar.mo22191c(appWidgetInfo);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) C15325a.m31900a(cnVar2.f45710m, c2.getHeight()));
                    if ((appWidgetInfo.resizeMode | 1) == 0) {
                        layoutParams.width = (int) C15325a.m31900a(cnVar2.f45710m, c2.getWidth());
                    }
                    ViewGroup viewGroup21 = cnVar2.f45703f;
                    viewGroup21.getClass();
                    viewGroup21.addView(cmVar, layoutParams);
                    ViewGroup viewGroup22 = cnVar2.f45703f;
                    viewGroup22.getClass();
                    C1745d dVar2 = (C1745d) viewGroup22.getLayoutParams();
                    int dimensionPixelSize2 = cnVar2.f45710m.getResources().getDimensionPixelSize(R.dimen.immersive_widget_content_margin_horizontal);
                    dVar2.getClass();
                    dVar2.setMarginStart(dimensionPixelSize2);
                    dVar2.setMarginEnd(dimensionPixelSize2);
                    dVar2.f5248Q = cnVar2.f45715r;
                }
                long a3 = cnVar2.f45711n.mo79743a(C90051dc.f248915l);
                if (a3 <= 0) {
                    cnVar2.mo22109c();
                } else if (cnVar2.f45705h == null) {
                    cnVar2.f45705h = cnVar2.f45714q.mo29164d(new C15224cg(cnVar2, contextThemeWrapper2), a3, TimeUnit.MILLISECONDS);
                }
                View view9 = cnVar2.f45700c;
                view9.getClass();
                view9.setVisibility(true != oyVar.f44111b ? 8 : 0);
                cnVar2.f45702e = oyVar;
                return true;
            case 20:
                if (z2) {
                    this.f45362y.mo22151b();
                }
                C15265u uVar = this.f45362y;
                if (piVar2.f44160a == 22) {
                    noVar = (C14555no) piVar2.f44161b;
                } else {
                    noVar = C14555no.f44008d;
                }
                uVar.mo22150a(noVar, viewGroup2, contextThemeWrapper2);
                return true;
            case 21:
                if (z2) {
                    C15220cc ccVar = this.f45363z;
                    ccVar.f45676b = null;
                    ccVar.f45681g = null;
                    ccVar.f45679e = null;
                    ccVar.f45680f = null;
                    ccVar.f45678d = null;
                    ccVar.f45677c = null;
                }
                C15220cc ccVar2 = this.f45363z;
                if (piVar2.f44160a == 23) {
                    owVar = (C14590ow) piVar2.f44161b;
                } else {
                    owVar = C14590ow.f44104b;
                }
                ccVar2.mo22093a(owVar, viewGroup2, contextThemeWrapper2);
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21974d(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi r17, int r18, android.view.ViewGroup r19, android.view.ViewGroup r20, android.view.ViewGroup r21, android.view.ViewGroup r22, android.view.ViewGroup r23, int r24, android.view.ContextThemeWrapper r25, boolean r26, int r27, boolean r28, boolean r29) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r0 = r24
            r15 = r25
            r6 = r26
            r5 = r27
            r4 = r28
            if (r6 == 0) goto L_0x001f
            r16.mo21972b()
        L_0x001f:
            r3 = 0
            r7.f45342e = r3
            r2 = 3
            java.lang.String r1 = "Morris.ModeTaskRndr"
            if (r9 != r2) goto L_0x01ba
            r7.mo21971a(r4, r5, r3)
            r2 = 1
            r7.m31672e(r11, r2)
            int r14 = r7.f45338B
            if (r0 != r14) goto L_0x0033
            goto L_0x0068
        L_0x0033:
            r14 = 2131433967(0x7f0b19ef, float:1.8489735E38)
            android.view.View r14 = r11.findViewById(r14)
            if (r14 == 0) goto L_0x0068
            if (r0 != r2) goto L_0x004c
            r14.setVisibility(r3)
            r3 = 2130772126(0x7f01009e, float:1.7147362E38)
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r15, r3)
            r14.startAnimation(r3)
            goto L_0x0068
        L_0x004c:
            int r3 = r7.f45338B
            if (r3 != r2) goto L_0x0063
            r3 = 2130772127(0x7f01009f, float:1.7147364E38)
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r15, r3)
            com.google.android.libraries.assistant.auto.tng.morris.g.aa r2 = new com.google.android.libraries.assistant.auto.tng.morris.g.aa
            r2.<init>(r14)
            r3.setAnimationListener(r2)
            r14.startAnimation(r3)
            goto L_0x0068
        L_0x0063:
            r2 = 8
            r14.setVisibility(r2)
        L_0x0068:
            r7.f45338B = r0
            int r2 = r20.getVisibility()
            if (r2 != 0) goto L_0x0080
            int r2 = r8.f44160a
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph.m30643a(r2)
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r3 = r7.f45341d
            if (r2 != r3) goto L_0x0080
            r7.mo21973c(r8, r12, r15, r6)
            r9 = r6
            goto L_0x01ad
        L_0x0080:
            int r2 = r20.getVisibility()
            if (r2 != 0) goto L_0x00e5
            int r2 = r8.f44160a
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r2 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph.m30643a(r2)
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r3 = r7.f45341d
            if (r2 == r3) goto L_0x00e5
            r2 = 2130772125(0x7f01009d, float:1.714736E38)
            android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r15, r2)
            com.google.android.libraries.assistant.auto.tng.morris.g.w r2 = new com.google.android.libraries.assistant.auto.tng.morris.g.w
            r0 = r2
            r14 = r1
            r1 = r16
            r13 = r2
            r2 = r17
            r10 = r3
            r3 = r21
            r4 = r25
            r5 = r26
            r9 = r6
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.setAnimationListener(r13)
            int r0 = r21.getChildCount()
            if (r0 != 0) goto L_0x00db
            r0 = 8
            r11.setVisibility(r0)
            com.google.common.f.e r0 = f45336a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r14)
            com.google.common.f.aa r1 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            r2 = 160351205(0x98ec3e5, float:3.4369475E-33)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Cannot fade out ongoing task because child view does not exist."
            r4 = 45940(0xb374, float:6.4376E-41)
            android.databinding.C0118a.m108p(r0, r3, r4, r1, r2)
        L_0x00d7:
            r3 = 0
        L_0x00d8:
            r6 = 0
            goto L_0x0259
        L_0x00db:
            r1 = 0
            android.view.View r0 = r12.getChildAt(r1)
            r0.startAnimation(r10)
            goto L_0x01ad
        L_0x00e5:
            r14 = r1
            r9 = r6
            r1 = 0
            r7.mo21973c(r8, r12, r15, r9)
            r11.setVisibility(r1)
            r1 = 3
            if (r0 == r1) goto L_0x00fc
            r1 = 2
            if (r0 == r1) goto L_0x00fc
        L_0x00f4:
            r0 = 1119748096(0x42be0000, float:95.0)
            r1 = 0
        L_0x00f7:
            r2 = 2131493156(0x7f0c0124, float:1.8609784E38)
            goto L_0x016a
        L_0x00fc:
            r0 = 2131430592(0x7f0b0cc0, float:1.848289E38)
            android.view.View r0 = r11.findViewById(r0)
            if (r0 != 0) goto L_0x0119
            com.google.common.f.e r0 = f45336a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r14)
            java.lang.String r1 = "#maybeShowScrim scrim view not found."
            r2 = 45938(0xb372, float:6.4373E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x00f4
        L_0x0119:
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0133
            com.google.common.f.e r0 = f45336a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r14)
            java.lang.String r1 = "#maybeShowScrim scrim was already visible."
            r2 = 45937(0xb371, float:6.4371E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x00f4
        L_0x0133:
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph.INCOMING_CALL_TASK
            int r1 = r8.f44160a
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph.m30643a(r1)
            int r1 = r1.ordinal()
            r2 = 20
            if (r1 == r2) goto L_0x0151
            switch(r1) {
                case 5: goto L_0x0147;
                case 6: goto L_0x0147;
                case 7: goto L_0x0147;
                case 8: goto L_0x0147;
                case 9: goto L_0x0147;
                case 10: goto L_0x0147;
                case 11: goto L_0x0147;
                default: goto L_0x0146;
            }
        L_0x0146:
            goto L_0x00f4
        L_0x0147:
            com.google.android.libraries.assistant.auto.tng.morris.g.u r1 = new com.google.android.libraries.assistant.auto.tng.morris.g.u
            r1.<init>(r7)
            r0.setOnClickListener(r1)
        L_0x014f:
            r1 = 0
            goto L_0x015a
        L_0x0151:
            com.google.android.libraries.assistant.auto.tng.morris.g.v r1 = new com.google.android.libraries.assistant.auto.tng.morris.g.v
            r1.<init>(r7)
            r0.setOnClickListener(r1)
            goto L_0x014f
        L_0x015a:
            r0.setVisibility(r1)
            r2 = 2130772124(0x7f01009c, float:1.7147358E38)
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r15, r2)
            r0.startAnimation(r2)
            r0 = 1119748096(0x42be0000, float:95.0)
            goto L_0x00f7
        L_0x016a:
            android.view.animation.Animation r0 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31958p(r15, r0, r2, r1)
            r11.startAnimation(r0)
            int r0 = r21.getChildCount()
            if (r0 != 0) goto L_0x019a
            r0 = 8
            r11.setVisibility(r0)
            com.google.common.f.e r0 = f45336a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r14)
            com.google.common.f.aa r1 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            r2 = 160351205(0x98ec3e5, float:3.4369475E-33)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Cannot expand ongoing task because child view does not exist."
            r4 = 45939(0xb373, float:6.4374E-41)
            android.databinding.C0118a.m108p(r0, r3, r4, r1, r2)
            goto L_0x00d7
        L_0x019a:
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            r0 = 1101004800(0x41a00000, float:20.0)
            r2 = 17
            r3 = 2131493156(0x7f0c0124, float:1.8609784E38)
            android.view.animation.Animation r0 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31958p(r15, r0, r3, r2)
            r1.startAnimation(r0)
        L_0x01ad:
            int r0 = r8.f44160a
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph.m30643a(r0)
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph.TASK_NOT_SET
            if (r0 == r1) goto L_0x00d7
            r3 = 1
            goto L_0x00d8
        L_0x01ba:
            r14 = r1
            r9 = r6
            if (r29 != 0) goto L_0x0257
            int r1 = r20.getVisibility()
            if (r1 != 0) goto L_0x0257
            r6 = 0
            r7.m31672e(r11, r6)
            r1 = 3
            if (r0 == r1) goto L_0x01d1
            r1 = 2
            if (r0 == r1) goto L_0x01d1
        L_0x01ce:
            r0 = 1119748096(0x42be0000, float:95.0)
            goto L_0x021c
        L_0x01d1:
            r0 = 2131430592(0x7f0b0cc0, float:1.848289E38)
            android.view.View r0 = r11.findViewById(r0)
            if (r0 != 0) goto L_0x01ed
            com.google.common.f.e r1 = f45336a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r14)
            java.lang.String r2 = "#maybeHideScrim scrim view not found."
            r3 = 45936(0xb370, float:6.437E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x01ed:
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto L_0x0209
            com.google.common.f.e r0 = f45336a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r14)
            java.lang.String r1 = "#maybeHideScrim scrim was already gone."
            r2 = 45935(0xb36f, float:6.4369E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x01ce
        L_0x0209:
            r1 = 2130772125(0x7f01009d, float:1.714736E38)
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r15, r1)
            com.google.android.libraries.assistant.auto.tng.morris.g.ab r2 = new com.google.android.libraries.assistant.auto.tng.morris.g.ab
            r2.<init>(r0)
            r1.setAnimationListener(r2)
            r0.startAnimation(r1)
            goto L_0x01ce
        L_0x021c:
            float r0 = com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z.m31949a(r15, r0)
            android.view.animation.TranslateAnimation r10 = new android.view.animation.TranslateAnimation
            r1 = 0
            r10.<init>(r1, r1, r1, r0)
            android.content.res.Resources r0 = r25.getResources()
            r1 = 2131493156(0x7f0c0124, float:1.8609784E38)
            int r0 = r0.getInteger(r1)
            long r0 = (long) r0
            r10.setDuration(r0)
            r0 = 2130772104(0x7f010088, float:1.7147317E38)
            r10.setInterpolator(r15, r0)
            r0 = 17
            r10.setStartOffset(r0)
            com.google.android.libraries.assistant.auto.tng.morris.g.y r13 = new com.google.android.libraries.assistant.auto.tng.morris.g.y
            r0 = r13
            r1 = r16
            r2 = r21
            r3 = r20
            r4 = r28
            r5 = r27
            r0.<init>(r1, r2, r3, r4, r5)
            r10.setAnimationListener(r13)
            r11.startAnimation(r10)
            goto L_0x0258
        L_0x0257:
            r6 = 0
        L_0x0258:
            r3 = 0
        L_0x0259:
            r0 = 4
            r1 = r18
            r2 = r9
            if (r1 != r0) goto L_0x0272
            r0 = r27
            r4 = r28
            r5 = 1
            r7.mo21971a(r4, r0, r5)
            r5 = r19
            r5.setVisibility(r6)
            boolean r5 = r7.mo21973c(r8, r5, r15, r2)
            r3 = r3 | r5
            goto L_0x02a0
        L_0x0272:
            r5 = r19
            r0 = r27
            r4 = r28
            int r9 = r19.getVisibility()
            if (r9 != 0) goto L_0x02a0
            android.view.animation.Animation r9 = r19.getAnimation()
            if (r9 == 0) goto L_0x028e
            android.view.animation.Animation r9 = r19.getAnimation()
            boolean r9 = r9.hasEnded()
            if (r9 == 0) goto L_0x02a0
        L_0x028e:
            r9 = 2130772096(0x7f010080, float:1.71473E38)
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r15, r9)
            com.google.android.libraries.assistant.auto.tng.morris.g.z r10 = new com.google.android.libraries.assistant.auto.tng.morris.g.z
            r10.<init>(r7, r5, r4, r0)
            r9.setAnimationListener(r10)
            r5.startAnimation(r9)
        L_0x02a0:
            r5 = 5
            if (r1 != r5) goto L_0x02b1
            r7.mo21971a(r4, r0, r6)
            r5 = r22
            r5.setVisibility(r6)
            boolean r0 = r7.mo21973c(r8, r5, r15, r2)
            r3 = r3 | r0
            goto L_0x02c7
        L_0x02b1:
            r5 = r22
            int r9 = r22.getVisibility()
            if (r9 != 0) goto L_0x02c5
            r22.removeAllViews()
            r9 = 8
            r5.setVisibility(r9)
            r7.mo21971a(r4, r0, r6)
            goto L_0x02c7
        L_0x02c5:
            r9 = 8
        L_0x02c7:
            r0 = r23
            r4 = 8
            if (r0 == 0) goto L_0x02df
            r5 = 6
            if (r1 != r5) goto L_0x02d9
            r0.setVisibility(r6)
            boolean r0 = r7.mo21973c(r8, r0, r15, r2)
            r3 = r3 | r0
            goto L_0x02df
        L_0x02d9:
            r23.removeAllViews()
            r0.setVisibility(r4)
        L_0x02df:
            if (r3 != 0) goto L_0x02e5
            com.google.android.libraries.assistant.auto.tng.morris.e.ph r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14602ph.TASK_NOT_SET
            r7.f45341d = r0
        L_0x02e5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.p1088g.C15109ac.mo21974d(com.google.android.libraries.assistant.auto.tng.morris.e.pi, int, android.view.ViewGroup, android.view.ViewGroup, android.view.ViewGroup, android.view.ViewGroup, android.view.ViewGroup, int, android.view.ContextThemeWrapper, boolean, int, boolean, boolean):boolean");
    }
}
