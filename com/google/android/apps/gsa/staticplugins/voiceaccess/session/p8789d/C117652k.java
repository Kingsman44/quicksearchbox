package com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8789d;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8786a.C117624e;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5295b.C68283d;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.session.d.k */
/* compiled from: PG */
public final /* synthetic */ class C117652k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117624e f326578a;

    /* renamed from: b */
    public final /* synthetic */ Context f326579b;

    /* renamed from: c */
    public final /* synthetic */ C68283d f326580c;

    public /* synthetic */ C117652k(C117624e eVar, Context context, C68283d dVar) {
        this.f326578a = eVar;
        this.f326579b = context;
        this.f326580c = dVar;
    }

    public final void run() {
        C117624e eVar = this.f326578a;
        Context context = this.f326579b;
        C68283d dVar = this.f326580c;
        try {
            eVar.mo103412a();
        } catch (RemoteException e) {
            C59104x c = C117655n.f326583a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceAccessPM");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(33615)).mo56386p("Unable to connect to Voice Access");
            new Handler().post(new C117653l(context));
            dVar.mo60297gq();
        }
    }
}
