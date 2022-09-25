package com.google.android.apps.gsa.staticplugins.gearhead;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.core.carassistant.C85729g;
import com.google.android.gearhead.sdk.assistant.C142664j;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.x */
/* compiled from: PG */
public final /* synthetic */ class C101405x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282937a;

    /* renamed from: b */
    public final /* synthetic */ String f282938b;

    /* renamed from: c */
    public final /* synthetic */ String f282939c;

    public /* synthetic */ C101405x(C101325be beVar, String str, String str2) {
        this.f282937a = beVar;
        this.f282938b = str;
        this.f282939c = str2;
    }

    public final void accept(Object obj) {
        C101325be beVar = this.f282937a;
        String str = this.f282938b;
        String str2 = this.f282939c;
        if (((Boolean) obj).booleanValue()) {
            C85729g gVar = beVar.f282787q.f229169d;
            return;
        }
        try {
            C142664j jVar = beVar.f282755L;
            if (jVar != null) {
                Parcel gA = jVar.mo17260gA();
                gA.writeString(str);
                gA.writeString(str2);
                jVar.mo17263hf(3, gA);
            }
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) C101325be.f282743a.mo56225c()).mo56382g(e)).mo56372aa(20026)).mo56386p("Client callback setProviderInfo() failed");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
