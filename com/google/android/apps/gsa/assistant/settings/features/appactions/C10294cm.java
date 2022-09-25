package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10277v;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C49860br;
import com.google.assistant.p3861at.C49863bu;
import com.google.assistant.p3861at.act;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cm */
/* compiled from: PG */
public final /* synthetic */ class C10294cm implements C69464a {

    /* renamed from: a */
    public final /* synthetic */ C10301ct f34883a;

    public /* synthetic */ C10294cm(C10301ct ctVar) {
        this.f34883a = ctVar;
    }

    /* renamed from: b */
    public final Object mo17428b() {
        C63088z zVar;
        C10301ct ctVar = this.f34883a;
        C10277v vVar = ctVar.f34898e;
        int i = vVar.f34827b;
        int i2 = i != 0 ? i != 3 ? i != 6 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            C10325al alVar = ctVar.f34899f;
            C49838aw awVar = vVar.f34829d;
            if (awVar == null) {
                awVar = C49838aw.f129504g;
            }
            String str = awVar.f129507b;
            C10277v vVar2 = ctVar.f34898e;
            String str2 = vVar2.f34827b == 3 ? (String) vVar2.f34828c : BuildConfig.FLAVOR;
            C49860br brVar = (C49860br) C49863bu.f129572f.createBuilder();
            brVar.copyOnWrite();
            C49863bu buVar = (C49863bu) brVar.instance;
            str2.getClass();
            buVar.f129575b = 4;
            buVar.f129576c = str2;
            return alVar.mo18424f(str, brVar);
        } else if (i3 != 1) {
            return C60856cj.m92900i(act.f128872P);
        } else {
            C10325al alVar2 = ctVar.f34899f;
            C49838aw awVar2 = vVar.f34829d;
            if (awVar2 == null) {
                awVar2 = C49838aw.f129504g;
            }
            String str3 = awVar2.f129507b;
            C10277v vVar3 = ctVar.f34898e;
            if (vVar3.f34827b == 6) {
                zVar = (C63088z) vVar3.f34828c;
            } else {
                zVar = C63088z.f170246b;
            }
            C49860br brVar2 = (C49860br) C49863bu.f129572f.createBuilder();
            brVar2.copyOnWrite();
            C49863bu buVar2 = (C49863bu) brVar2.instance;
            zVar.getClass();
            buVar2.f129575b = 5;
            buVar2.f129576c = zVar;
            return alVar2.mo18424f(str3, brVar2);
        }
    }
}
