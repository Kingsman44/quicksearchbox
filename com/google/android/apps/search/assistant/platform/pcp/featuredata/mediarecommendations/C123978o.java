package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.o */
/* compiled from: PG */
public final class C123978o {

    /* renamed from: a */
    private final Context f342447a;

    public C123978o(Context context) {
        this.f342447a = context;
    }

    /* renamed from: b */
    public static Optional m203353b(C52560wg wgVar) {
        C52568wo woVar = wgVar.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C51012dc dcVar = woVar.f138004k;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        C63088z zVar = dcVar.f132819e;
        if (!zVar.mo59173M()) {
            return Optional.m71637of(zVar);
        }
        return Optional.empty();
    }

    /* renamed from: a */
    public final Intent mo106222a(C52560wg wgVar, int i, boolean z) {
        C51058ev evVar;
        Intent intent = new Intent(this.f342447a, PlayMediaActivity.class);
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
            C59104x c = C123943as.f342338a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.PlayMedia");
            ((C59052c) ((C59052c) c).mo56372aa(35313)).mo56386p("#getPackageName() package name is empty");
            str3 = BuildConfig.FLAVOR;
        }
        intent.putExtra("KEY_PACKAGE_NAME", str3);
        intent.putExtra("KEY_OPEN_IN_FOREGROUND", z);
        C52568wo woVar4 = (C52568wo) wjVar.instance;
        if ((woVar4.f137995b & 2) != 0) {
            intent.putExtra("KEY_AVAILABLE_ACTIONS", woVar4.f138012s);
        }
        intent.setFlags(268435456);
        Intent a = C123943as.m203259a(intent.toUri(1));
        a.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_SUBCARD_INDEX", i);
        return a;
    }
}
