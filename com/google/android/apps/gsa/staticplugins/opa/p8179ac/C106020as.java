package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90041ct;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3917i.p3918a.C51622on;
import com.google.assistant.p3897e.p3917i.p3918a.C51623oo;
import com.google.protobuf.C63034ez;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.as */
/* compiled from: PG */
public final /* synthetic */ class C106020as implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106023av f295975a;

    /* renamed from: b */
    public final /* synthetic */ String f295976b;

    public /* synthetic */ C106020as(C106023av avVar, String str) {
        this.f295975a = avVar;
        this.f295976b = str;
    }

    public final void run() {
        C106023av avVar = this.f295975a;
        String str = this.f295976b;
        C63034ez ezVar = avVar.f295980a.f295989F;
        ezVar.copyOnWrite();
        C63037fb fbVar = C63037fb.f170144b;
        ((C63037fb) ezVar.instance).mo59084a().clear();
        if (avVar.f295980a.mo95218H(str, BuildConfig.FLAVOR)) {
            if (avVar.f295980a.f296013k.mo79746e(C90041ct.f248691d)) {
                avVar.f295980a.mo95216F(str, BuildConfig.FLAVOR);
            } else {
                avVar.f295980a.mo95215E(str);
            }
        }
        C51622on onVar = (C51622on) C51623oo.f134536c.createBuilder();
        C63037fb fbVar2 = (C63037fb) avVar.f295980a.f295989F.build();
        onVar.copyOnWrite();
        C51623oo ooVar = (C51623oo) onVar.instance;
        fbVar2.getClass();
        ooVar.f134539b = fbVar2;
        ooVar.f134538a |= 1;
        avVar.f295980a.mo95212B((C51623oo) onVar.build());
    }
}
