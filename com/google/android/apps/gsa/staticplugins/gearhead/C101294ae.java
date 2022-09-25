package com.google.android.apps.gsa.staticplugins.gearhead;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.C142664j;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.ae */
/* compiled from: PG */
public final /* synthetic */ class C101294ae implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282700a;

    /* renamed from: b */
    public final /* synthetic */ int f282701b;

    public /* synthetic */ C101294ae(C101325be beVar, int i) {
        this.f282700a = beVar;
        this.f282701b = i;
    }

    public final void accept(Object obj) {
        C142664j jVar;
        C101325be beVar = this.f282700a;
        int i = this.f282701b;
        if (!((Boolean) obj).booleanValue() && (jVar = beVar.f282755L) != null) {
            try {
                Parcel gA = jVar.mo17260gA();
                gA.writeInt(i);
                jVar.mo17263hf(2, gA);
            } catch (RemoteException e) {
                ((C58970a) ((C58970a) ((C58970a) C101325be.f282743a.mo56225c()).mo56382g(e)).mo56372aa(20039)).mo56386p("Client callback updateSpeechLevel() failed");
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
