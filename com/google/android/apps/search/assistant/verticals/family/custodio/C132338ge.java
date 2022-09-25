package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.common.p4526f.C59052c;
import com.google.p427am.p432b.p433a.C8632ak;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63223c;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63224d;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ge */
/* compiled from: PG */
public final /* synthetic */ class C132338ge implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C132339gf f361247a;

    public /* synthetic */ C132338ge(C132339gf gfVar) {
        this.f361247a = gfVar;
    }

    public final void onActivityResult(Object obj) {
        C8633al alVar;
        C132339gf gfVar = this.f361247a;
        ActivityResult activityResult = (ActivityResult) obj;
        ((VoiceMatchDeeplinkingFragmentViewModel) Objects.requireNonNull(gfVar.f361259l)).f360620a = true;
        Intent intent = activityResult.f2756b;
        if (activityResult.f2755a == 2) {
            gfVar.f361253f.mo50482c(gfVar.f361249b).mo50510f();
        }
        Bundle extras = intent != null ? intent.getExtras() : new Bundle();
        ArrayList<String> stringArrayList = extras != null ? extras.getStringArrayList("assistant_settings_devices_enrolled") : new ArrayList<>();
        C63223c cVar = (C63223c) C63224d.f170803n.createBuilder();
        int size = stringArrayList != null ? stringArrayList.size() : 0;
        cVar.copyOnWrite();
        C63224d dVar = (C63224d) cVar.instance;
        dVar.f170806a |= 512;
        dVar.f170816k = size;
        if (gfVar.f361250c.getBoolean("custodio_is_from_device_list")) {
            cVar.copyOnWrite();
            C63224d dVar2 = (C63224d) cVar.instance;
            C62961ch chVar = dVar2.f170817l;
            if (!chVar.mo58948c()) {
                dVar2.f170817l = C62942bv.mutableCopy(chVar);
            }
            dVar2.f170817l.mo58916g(1);
        }
        gfVar.f361257j.mo19974a(C37176a.f96997dI.mo40812e(C63224d.f170804o, (C63224d) cVar.build()));
        if (gfVar.f361250c.getBoolean("custodio_is_from_device_list")) {
            String string = gfVar.f361250c.getString("supervised_oid");
            if (string == null) {
                ((C59052c) ((C59052c) C132339gf.f361248a.mo56225c()).mo56372aa(39592)).mo56386p("Required information missing from args!");
                gfVar.mo110654b();
                return;
            }
            gfVar.f361252e.mo110506f(string);
            gfVar.f361253f.mo50482c(gfVar.f361249b).mo50510f();
            return;
        }
        C8675e eVar = ((VoiceMatchDeeplinkingFragmentViewModel) Objects.requireNonNull(gfVar.f361259l)).f360621b;
        if (eVar == null) {
            ((C59052c) ((C59052c) C132339gf.f361248a.mo56225c()).mo56372aa(39591)).mo56386p("Latest settings are not available!");
            gfVar.mo110654b();
        } else if (!eVar.f29995d) {
            String string2 = gfVar.f361250c.getString("entry_point_id");
            String string3 = gfVar.f361250c.getString("supervised_oid");
            if (string2 == null || string3 == null) {
                ((C59052c) ((C59052c) C132339gf.f361248a.mo56225c()).mo56372aa(39590)).mo56386p("Required argument not provided!");
                gfVar.mo110654b();
                return;
            }
            if (gfVar.f361258k) {
                alVar = eVar.f29993b;
                if (alVar == null) {
                    alVar = C8633al.f29901j;
                }
            } else {
                C8633al alVar2 = eVar.f29993b;
                if (alVar2 == null) {
                    alVar2 = C8633al.f29901j;
                }
                C8632ak akVar = (C8632ak) alVar2.toBuilder();
                akVar.copyOnWrite();
                ((C8633al) akVar.instance).f29910h = null;
                alVar = (C8633al) akVar.build();
            }
            gfVar.f361255h.mo50428h(C46438d.m82810b(gfVar.f361252e.mo110505e(string2, string3, alVar)).f121541a, (Object) null, gfVar.f361256i);
        } else {
            gfVar.mo110653a();
        }
    }
}
