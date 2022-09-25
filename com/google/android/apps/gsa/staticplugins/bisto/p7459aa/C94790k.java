package com.google.android.apps.gsa.staticplugins.bisto.p7459aa;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124843bn;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.k */
/* compiled from: PG */
public final /* synthetic */ class C94790k implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94794o f265043a;

    /* renamed from: b */
    public final /* synthetic */ String f265044b;

    /* renamed from: c */
    public final /* synthetic */ String f265045c;

    /* renamed from: d */
    public final /* synthetic */ Bundle f265046d;

    public /* synthetic */ C94790k(C94794o oVar, String str, String str2, Bundle bundle) {
        this.f265043a = oVar;
        this.f265044b = str;
        this.f265045c = str2;
        this.f265046d = bundle;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94794o oVar = this.f265043a;
        String str = this.f265044b;
        String str2 = this.f265045c;
        Bundle bundle = this.f265046d;
        Intent intent = (Intent) obj;
        C58976aa aaVar = C58975e.f156826a;
        C124843bn bnVar = (C124843bn) C124844bo.f344417m.createBuilder();
        bnVar.copyOnWrite();
        C124844bo boVar = (C124844bo) bnVar.instance;
        str.getClass();
        boVar.f344419a |= 1;
        boVar.f344420b = str;
        bnVar.copyOnWrite();
        C124844bo boVar2 = (C124844bo) bnVar.instance;
        boVar2.f344419a |= 128;
        boVar2.f344427i = true;
        if (str2 != null) {
            bnVar.copyOnWrite();
            C124844bo boVar3 = (C124844bo) bnVar.instance;
            boVar3.f344419a |= 2;
            boVar3.f344421c = str2;
        }
        if (bundle.containsKey("node_id")) {
            String string = bundle.getString("node_id");
            string.getClass();
            bnVar.copyOnWrite();
            C124844bo boVar4 = (C124844bo) bnVar.instance;
            boVar4.f344419a |= 4;
            boVar4.f344422d = string;
        }
        if (bundle.containsKey("assistant_device_jwt")) {
            String string2 = bundle.getString("assistant_device_jwt");
            string2.getClass();
            bnVar.copyOnWrite();
            C124844bo boVar5 = (C124844bo) bnVar.instance;
            boVar5.f344419a |= 64;
            boVar5.f344426h = string2;
        }
        if (bundle.containsKey("dark_theme")) {
            boolean z = bundle.getBoolean("dark_theme");
            bnVar.copyOnWrite();
            C124844bo boVar6 = (C124844bo) bnVar.instance;
            boVar6.f344419a |= 512;
            boVar6.f344429k = z;
        }
        if (bundle.containsKey("FORCE_OOBE")) {
            boolean z2 = bundle.getBoolean("FORCE_OOBE");
            bnVar.copyOnWrite();
            C124844bo boVar7 = (C124844bo) bnVar.instance;
            boVar7.f344419a |= 1024;
            boVar7.f344430l = z2;
        }
        boolean z3 = bundle.getBoolean("acct_sync_on");
        bnVar.copyOnWrite();
        C124844bo boVar8 = (C124844bo) bnVar.instance;
        boVar8.f344419a |= 16;
        boVar8.f344424f = z3;
        boolean z4 = bundle.getBoolean("short_setup");
        bnVar.copyOnWrite();
        C124844bo boVar9 = (C124844bo) bnVar.instance;
        boVar9.f344419a |= 32;
        boVar9.f344425g = z4;
        boolean z5 = bundle.getBoolean("enable_wear_data_layer_api");
        bnVar.copyOnWrite();
        C124844bo boVar10 = (C124844bo) bnVar.instance;
        boVar10.f344419a |= 8;
        boVar10.f344423e = z5;
        oVar.f265056c.mo65089a(intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.OobeActivity")).putExtra("args", new ProtoParsers.InternalDontUse((byte[]) null, (C124844bo) bnVar.build())).addFlags(268468224));
    }
}
