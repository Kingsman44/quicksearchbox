package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124673cl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124699dk;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124700dl;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.cr */
/* compiled from: PG */
public final /* synthetic */ class C124893cr implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C124894cs f344595a;

    public /* synthetic */ C124893cr(C124894cs csVar) {
        this.f344595a = csVar;
    }

    public final void onActivityResult(Object obj) {
        boolean z;
        C124894cs csVar = this.f344595a;
        ActivityResult activityResult = (ActivityResult) obj;
        C59104x b = C124894cs.f344596a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceMatchFragment");
        ((C59052c) ((C59052c) b).mo56372aa(36356)).mo56387q("VM result: %d", activityResult.f2755a);
        ((ScreenStateView) csVar.f344597b.requireView().findViewById(R.id.assistant_oobe_template_screen_root)).mo106777c();
        if (activityResult.f2755a == -1) {
            csVar.f344604i.mo106637a().mo106662b("VoiceMatch-OK");
            csVar.f344604i.f344279f = true;
            z = true;
        } else {
            csVar.f344604i.mo106637a().mo106662b("VoiceMatch-Skip");
            z = false;
        }
        csVar.f344609n = 2;
        C46439e eVar = csVar.f344602g;
        C124669ch chVar = csVar.f344601f;
        C124699dk dkVar = (C124699dk) C124700dl.f344019d.createBuilder();
        C124844bo boVar = csVar.f344598c.f344439b;
        if (boVar == null) {
            boVar = C124844bo.f344417m;
        }
        String str = boVar.f344420b;
        dkVar.copyOnWrite();
        C124700dl dlVar = (C124700dl) dkVar.instance;
        str.getClass();
        dlVar.f344021a = 1 | dlVar.f344021a;
        dlVar.f344022b = str;
        dkVar.copyOnWrite();
        C124700dl dlVar2 = (C124700dl) dkVar.instance;
        dlVar2.f344021a = 2 | dlVar2.f344021a;
        dlVar2.f344023c = z;
        C46438d b2 = C46438d.m82810b(C70876o.m103760a(chVar.f189039a.mo39510a(C124673cl.m204369g(), chVar.f189040b), (C124700dl) dkVar.build()));
        eVar.mo50428h(b2.f121541a, (Object) null, csVar.f344608m);
    }
}
