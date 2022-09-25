package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.content.Context;
import android.content.IntentFilter;
import android.speech.tts.TextToSpeech;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.m */
/* compiled from: PG */
public final /* synthetic */ class C95198m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95210y f266339a;

    /* renamed from: b */
    public final /* synthetic */ Context f266340b;

    public /* synthetic */ C95198m(C95210y yVar, Context context) {
        this.f266339a = yVar;
        this.f266340b = context;
    }

    public final void run() {
        C95210y yVar = this.f266339a;
        Context context = this.f266340b;
        TextToSpeech a = yVar.mo89080a();
        if (a == null) {
            C59104x d = C95210y.f266359j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TtsPlayer");
            ((C59052c) ((C59052c) d).mo56372aa(14614)).mo56386p("TTS was destroyed before onInitDone ran.");
            return;
        }
        a.setOnUtteranceProgressListener(yVar.f266372v);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        context.registerReceiver(yVar.f266363m, intentFilter);
        yVar.f266363m.f266356a = yVar;
        ArrayList arrayList = new ArrayList();
        synchronized (yVar.f266362l) {
            yVar.f266364n = true;
            Runnable runnable = yVar.f266368r;
            if (runnable != null) {
                arrayList.add(runnable);
                yVar.f266368r = null;
            }
            arrayList.addAll(yVar.f266365o);
            yVar.f266365o.clear();
            yVar.f266366p = true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Runnable) arrayList.get(i)).run();
        }
    }
}
