package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.p823a;

import android.os.Bundle;
import android.speech.RecognitionListener;
import androidx.core.p094f.C1888a;
import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.C12620b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13010a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13028ap;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13029aq;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13030ar;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13031as;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13032at;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13033au;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13038b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13059e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13069o;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13071q;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13072r;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13073s;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13075u;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13076v;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13077w;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.android.libraries.search.p2904c.p2952o.p2959e.C37935b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.g.a.d */
/* compiled from: PG */
final class C12617d implements RecognitionListener {

    /* renamed from: a */
    final /* synthetic */ C12618e f39588a;

    /* renamed from: b */
    private final C58833ax f39589b;

    public C12617d(C12618e eVar, C58833ax axVar) {
        this.f39588a = eVar;
        this.f39589b = axVar;
    }

    public final void onBeginningOfSpeech() {
        C12618e eVar = this.f39588a;
        C13059e eVar2 = eVar.f39594e;
        C13076v vVar = (C13076v) C13077w.f40573c.createBuilder();
        C16730ar arVar = C16730ar.ASSUMING_GOOD_NETWORK;
        vVar.copyOnWrite();
        C13077w wVar = (C13077w) vVar.instance;
        wVar.f40576b = arVar.f48937e;
        wVar.f40575a |= 1;
        eVar2.copyOnWrite();
        C13060f fVar = (C13060f) eVar2.instance;
        C13077w wVar2 = (C13077w) vVar.build();
        C13060f fVar2 = C13060f.f40536l;
        wVar2.getClass();
        fVar.f40545h = wVar2;
        fVar.f40538a |= 64;
        C13010a aVar = (C13010a) C13038b.f40471d.createBuilder();
        C13069o oVar = (C13069o) C13075u.f40569c.createBuilder();
        C13073s sVar = C13073s.f40565c;
        oVar.copyOnWrite();
        C13075u uVar = (C13075u) oVar.instance;
        sVar.getClass();
        uVar.f40572b = sVar;
        uVar.f40571a = 1;
        aVar.copyOnWrite();
        C13038b bVar = (C13038b) aVar.instance;
        C13075u uVar2 = (C13075u) oVar.build();
        uVar2.getClass();
        bVar.f40474b = uVar2;
        bVar.f40473a |= 1;
        eVar2.copyOnWrite();
        C13060f fVar3 = (C13060f) eVar2.instance;
        C13038b bVar2 = (C13038b) aVar.build();
        bVar2.getClass();
        fVar3.f40539b = bVar2;
        fVar3.f40538a |= 1;
        eVar.f39594e = eVar2;
        C12618e eVar3 = this.f39588a;
        eVar3.f39593d.f155056f.mo54591h((C13060f) eVar3.f39594e.build());
    }

    public final void onBufferReceived(byte[] bArr) {
    }

    public final void onEndOfSpeech() {
    }

    public final void onError(int i) {
        C60870cx cxVar = null;
        switch (i) {
            case 1:
            case 8:
                C12618e eVar = this.f39588a;
                C13059e eVar2 = eVar.f39594e;
                C13076v vVar = (C13076v) C13077w.f40573c.createBuilder();
                C16730ar arVar = C16730ar.SLOW_CONNECTION;
                vVar.copyOnWrite();
                C13077w wVar = (C13077w) vVar.instance;
                wVar.f40576b = arVar.f48937e;
                wVar.f40575a |= 1;
                eVar2.copyOnWrite();
                C13060f fVar = (C13060f) eVar2.instance;
                C13077w wVar2 = (C13077w) vVar.build();
                C13060f fVar2 = C13060f.f40536l;
                wVar2.getClass();
                fVar.f40545h = wVar2;
                fVar.f40538a |= 64;
                eVar.f39594e = eVar2;
                C12618e eVar3 = this.f39588a;
                eVar3.f39593d.f155056f.mo54591h((C13060f) eVar3.f39594e.build());
                break;
            case 2:
            case 4:
                C12618e eVar4 = this.f39588a;
                C13059e eVar5 = eVar4.f39594e;
                C13076v vVar2 = (C13076v) C13077w.f40573c.createBuilder();
                C16730ar arVar2 = C16730ar.OFFLINE;
                vVar2.copyOnWrite();
                C13077w wVar3 = (C13077w) vVar2.instance;
                wVar3.f40576b = arVar2.f48937e;
                wVar3.f40575a |= 1;
                eVar5.copyOnWrite();
                C13060f fVar3 = (C13060f) eVar5.instance;
                C13077w wVar4 = (C13077w) vVar2.build();
                C13060f fVar4 = C13060f.f40536l;
                wVar4.getClass();
                fVar3.f40545h = wVar4;
                fVar3.f40538a |= 64;
                eVar4.f39594e = eVar5;
                C12618e eVar6 = this.f39588a;
                eVar6.f39593d.f155056f.mo54591h((C13060f) eVar6.f39594e.build());
                break;
            case 3:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                ((C59052c) ((C59052c) C12618e.f39590a.mo56225c()).mo56372aa(44331)).mo56387q("speech recognition cancelled, error code %d", i);
                break;
            case 7:
                cxVar = this.f39588a.f39592c.mo20372c();
                break;
            default:
                ((C59052c) ((C59052c) C12618e.f39590a.mo56225c()).mo56372aa(44330)).mo56386p("unhandled error case");
                break;
        }
        if (cxVar == null) {
            cxVar = this.f39588a.f39592c.mo20370a();
        }
        C46459k.m82829b(cxVar, "Error playing back microphone failure / no input earcon", new Object[0]);
        this.f39588a.f39593d.f155056f.mo54589f(false);
        if (this.f39589b.mo56113h()) {
            ((C12620b) this.f39589b.mo56107c()).mo20160c();
        }
        C2164c cVar = this.f39588a.f39595f;
        cVar.getClass();
        cVar.mo5438c();
    }

    public final void onEvent(int i, Bundle bundle) {
    }

    public final void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        String str = (stringArrayList == null || stringArrayList.isEmpty()) ? BuildConfig.FLAVOR : stringArrayList.get(0);
        C13028ap apVar = (C13028ap) C13033au.f40462c.createBuilder();
        C13031as asVar = (C13031as) C13032at.f40457d.createBuilder();
        asVar.copyOnWrite();
        C13032at atVar = (C13032at) asVar.instance;
        str.getClass();
        atVar.f40459a |= 1;
        atVar.f40460b = str;
        C13032at atVar2 = (C13032at) asVar.build();
        apVar.copyOnWrite();
        C13033au auVar = (C13033au) apVar.instance;
        atVar2.getClass();
        auVar.f40465b = atVar2;
        auVar.f40464a = 1;
        C13033au auVar2 = (C13033au) apVar.build();
        C12618e eVar = this.f39588a;
        C13059e eVar2 = eVar.f39594e;
        eVar2.copyOnWrite();
        C13060f fVar = (C13060f) eVar2.instance;
        C13060f fVar2 = C13060f.f40536l;
        auVar2.getClass();
        fVar.f40540c = auVar2;
        fVar.f40538a |= 2;
        eVar.f39594e = eVar2;
        C12618e eVar3 = this.f39588a;
        eVar3.f39593d.f155056f.mo54591h((C13060f) eVar3.f39594e.build());
        if (this.f39589b.mo56113h()) {
            ((C12620b) this.f39589b.mo56107c()).mo20161d(str);
        }
        if (!C1888a.m5150d() && bundle.getBoolean("final_result")) {
            C13028ap apVar2 = (C13028ap) C13033au.f40462c.createBuilder();
            C13029aq aqVar = (C13029aq) C13030ar.f40453c.createBuilder();
            aqVar.copyOnWrite();
            C13030ar arVar = (C13030ar) aqVar.instance;
            str.getClass();
            arVar.f40455a |= 1;
            arVar.f40456b = str;
            C13030ar arVar2 = (C13030ar) aqVar.build();
            apVar2.copyOnWrite();
            C13033au auVar3 = (C13033au) apVar2.instance;
            arVar2.getClass();
            auVar3.f40465b = arVar2;
            auVar3.f40464a = 2;
            C13033au auVar4 = (C13033au) apVar2.build();
            C12618e eVar4 = this.f39588a;
            C13059e eVar5 = eVar4.f39594e;
            C13010a aVar = (C13010a) C13038b.f40471d.createBuilder();
            C13069o oVar = (C13069o) C13075u.f40569c.createBuilder();
            C13071q qVar = C13071q.f40563a;
            oVar.copyOnWrite();
            C13075u uVar = (C13075u) oVar.instance;
            qVar.getClass();
            uVar.f40572b = qVar;
            uVar.f40571a = 2;
            aVar.copyOnWrite();
            C13038b bVar = (C13038b) aVar.instance;
            C13075u uVar2 = (C13075u) oVar.build();
            uVar2.getClass();
            bVar.f40474b = uVar2;
            bVar.f40473a |= 1;
            eVar5.copyOnWrite();
            C13060f fVar3 = (C13060f) eVar5.instance;
            C13038b bVar2 = (C13038b) aVar.build();
            bVar2.getClass();
            fVar3.f40539b = bVar2;
            fVar3.f40538a |= 1;
            eVar5.copyOnWrite();
            C13060f fVar4 = (C13060f) eVar5.instance;
            auVar4.getClass();
            fVar4.f40540c = auVar4;
            fVar4.f40538a |= 2;
            eVar4.f39594e = eVar5;
            C12618e eVar6 = this.f39588a;
            eVar6.f39593d.f155056f.mo54591h((C13060f) eVar6.f39594e.build());
            this.f39588a.f39593d.f155056f.mo54589f(false);
            C2164c cVar = this.f39588a.f39595f;
            cVar.getClass();
            cVar.mo5437b((Object) null);
            if (str.length() > 0) {
                C46459k.m82829b(this.f39588a.f39592c.mo20373d(), "Error playing microphone recognition", new Object[0]);
            }
            if (this.f39589b.mo56113h()) {
                if (str.length() > 0) {
                    ((C12620b) this.f39589b.mo56107c()).mo20159b(str);
                }
                ((C12620b) this.f39589b.mo56107c()).mo20160c();
            }
        }
    }

    public final void onReadyForSpeech(Bundle bundle) {
        C46459k.m82829b(this.f39588a.f39592c.mo20371b(), "Error playing back microphone open success earcon", new Object[0]);
    }

    public final void onResults(Bundle bundle) {
    }

    public final void onRmsChanged(float f) {
        int d = C37935b.m66966d(f);
        C12618e eVar = this.f39588a;
        C13059e eVar2 = eVar.f39594e;
        C13010a aVar = (C13010a) C13038b.f40471d.createBuilder();
        C13069o oVar = (C13069o) C13075u.f40569c.createBuilder();
        C13072r rVar = (C13072r) C13073s.f40565c.createBuilder();
        rVar.copyOnWrite();
        C13073s sVar = (C13073s) rVar.instance;
        sVar.f40567a |= 1;
        sVar.f40568b = d;
        C13073s sVar2 = (C13073s) rVar.build();
        oVar.copyOnWrite();
        C13075u uVar = (C13075u) oVar.instance;
        sVar2.getClass();
        uVar.f40572b = sVar2;
        uVar.f40571a = 1;
        aVar.copyOnWrite();
        C13038b bVar = (C13038b) aVar.instance;
        C13075u uVar2 = (C13075u) oVar.build();
        uVar2.getClass();
        bVar.f40474b = uVar2;
        bVar.f40473a |= 1;
        eVar2.copyOnWrite();
        C13060f fVar = (C13060f) eVar2.instance;
        C13038b bVar2 = (C13038b) aVar.build();
        C13060f fVar2 = C13060f.f40536l;
        bVar2.getClass();
        fVar.f40539b = bVar2;
        fVar.f40538a |= 1;
        eVar.f39594e = eVar2;
        C12618e eVar3 = this.f39588a;
        eVar3.f39593d.f155056f.mo54591h((C13060f) eVar3.f39594e.build());
    }
}
