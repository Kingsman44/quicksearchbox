package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.staticplugins.opa.ambient.activity.media.PlayMediaActivity;
import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.q */
/* compiled from: PG */
public class C106963q implements C106868ac {

    /* renamed from: a */
    private final Context f297938a;

    /* renamed from: b */
    public final C52560wg f297939b;

    /* renamed from: c */
    private final C58974d f297940c;

    /* renamed from: d */
    private final C50690ab f297941d;

    /* renamed from: e */
    private C58833ax f297942e = C58836b.f156633a;

    public C106963q(Context context, C83564a aVar, C52560wg wgVar, C50690ab abVar) {
        this.f297938a = context;
        this.f297940c = aVar.mo76900a("DefaultMediaItemWrapper");
        this.f297939b = wgVar;
        this.f297941d = abVar;
        C52568wo woVar = wgVar.f137950f;
        C51012dc dcVar = (woVar == null ? C52568wo.f137992v : woVar).f138004k;
        C63088z zVar = (dcVar == null ? C51012dc.f132813k : dcVar).f132819e;
        if (!zVar.mo59173M()) {
            this.f297942e = C58833ax.m90834k(zVar);
        }
    }

    /* renamed from: a */
    public C58833ax mo95701a() {
        if (!this.f297939b.f137952h.isEmpty()) {
            return C58833ax.m90834k(this.f297939b.f137952h);
        }
        if (!this.f297939b.f137948d.isEmpty()) {
            return C58833ax.m90834k(this.f297939b.f137948d);
        }
        return C50690ab.MEDIA_SESSION.equals(this.f297941d) ? C58833ax.m90834k(mo95709j()) : C58836b.f156633a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Intent mo95722b(C52560wg wgVar, int i, boolean z) {
        C51058ev evVar;
        Intent intent = new Intent(this.f297938a, PlayMediaActivity.class);
        intent.setAction("ACTION_PLAY");
        C52559wf wfVar = (C52559wf) C52560wg.f137943j.createBuilder();
        String str = wgVar.f137952h;
        wfVar.copyOnWrite();
        C52560wg wgVar2 = (C52560wg) wfVar.instance;
        str.getClass();
        wgVar2.f137945a |= 64;
        wgVar2.f137952h = str;
        String str2 = wgVar.f137948d;
        wfVar.copyOnWrite();
        C52560wg wgVar3 = (C52560wg) wfVar.instance;
        str2.getClass();
        wgVar3.f137945a |= 1;
        wgVar3.f137948d = str2;
        C51098gh ghVar = wgVar.f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        wfVar.copyOnWrite();
        C52560wg wgVar4 = (C52560wg) wfVar.instance;
        ghVar.getClass();
        wgVar4.f137949e = ghVar;
        wgVar4.f137945a |= 4;
        C52568wo woVar = wgVar4.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52563wj wjVar = (C52563wj) woVar.toBuilder();
        wjVar.copyOnWrite();
        C52568wo woVar2 = (C52568wo) wjVar.instance;
        woVar2.f138004k = null;
        woVar2.f137994a &= -1025;
        wfVar.copyOnWrite();
        C52560wg wgVar5 = (C52560wg) wfVar.instance;
        C52568wo woVar3 = (C52568wo) wjVar.build();
        woVar3.getClass();
        wgVar5.f137950f = woVar3;
        wgVar5.f137945a |= 8;
        intent.putExtra("KEY_MEDIA_ITEM", Base64.encodeToString(((C52560wg) wfVar.build()).toByteArray(), 0));
        C51098gh ghVar2 = wgVar.f137949e;
        if (ghVar2 == null) {
            ghVar2 = C51098gh.f133009e;
        }
        if (ghVar2.f133012b == 1) {
            evVar = (C51058ev) ghVar2.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str3 = evVar.f132944b;
        if (C58837ba.m90859h(str3)) {
            C59104x c = PlayMediaActivity.f296849k.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PMediaAct");
            ((C59052c) ((C59052c) c).mo56372aa(23056)).mo56386p("#getPackageName() package name is empty");
            str3 = BuildConfig.FLAVOR;
        }
        intent.putExtra("KEY_PACKAGE_NAME", str3);
        intent.putExtra("KEY_OPEN_IN_FOREGROUND", z);
        C52568wo woVar4 = (C52568wo) wjVar.instance;
        if ((woVar4.f137995b & 2) != 0) {
            intent.putExtra("KEY_AVAILABLE_ACTIONS", woVar4.f138012s);
        }
        intent.setFlags(268435456);
        Intent c2 = C92122r.m151185c(intent.toUri(1), C50794cr.MEDIA, C50731p.START_ACTIVITY, false);
        c2.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_SUBCARD_INDEX", i);
        return c2;
    }

    /* renamed from: c */
    public final C50690ab mo95702c() {
        return this.f297941d;
    }

    /* renamed from: d */
    public final C52560wg mo95703d() {
        return this.f297939b;
    }

    /* renamed from: e */
    public final C58833ax mo95704e() {
        return this.f297942e;
    }

    /* renamed from: f */
    public String mo95705f(int i) {
        String uri = mo95722b(this.f297939b, i, false).toUri(1);
        ((C58970a) ((C58970a) this.f297940c.mo56224b()).mo56372aa(23347)).mo56389s("#generateIntentUri: %s", uri);
        return uri;
    }

    /* renamed from: g */
    public final String mo95706g() {
        C52568wo woVar = this.f297939b.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        return woVar.f137999f;
    }

    /* renamed from: h */
    public final String mo95707h() {
        C52568wo woVar = this.f297939b.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        return woVar.f138000g;
    }

    /* renamed from: i */
    public final String mo95708i() {
        C52568wo woVar = this.f297939b.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        return woVar.f137998e;
    }

    /* renamed from: j */
    public final String mo95709j() {
        C51058ev evVar;
        C51098gh ghVar = this.f297939b.f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        return evVar.f132944b;
    }

    /* renamed from: k */
    public final void mo95710k(C63088z zVar) {
        this.f297942e = C58833ax.m90834k(zVar);
    }
}
