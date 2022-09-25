package com.google.android.apps.gsa.staticplugins.gearhead;

import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.C142664j;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.l */
/* compiled from: PG */
public final /* synthetic */ class C101342l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282831a;

    /* renamed from: b */
    public final /* synthetic */ boolean f282832b;

    public /* synthetic */ C101342l(C101325be beVar, boolean z) {
        this.f282831a = beVar;
        this.f282832b = z;
    }

    public final void accept(Object obj) {
        C101325be beVar = this.f282831a;
        boolean z = this.f282832b;
        if (!((Boolean) obj).booleanValue() && z != beVar.f282751H) {
            beVar.f282751H = z;
            try {
                C142664j jVar = beVar.f282755L;
                if (jVar != null) {
                    jVar.mo117448e(true != z ? 2 : 6);
                }
            } catch (RemoteException e) {
                ((C58970a) ((C58970a) ((C58970a) C101325be.f282743a.mo56225c()).mo56382g(e)).mo56372aa(20036)).mo56386p("Client callback setVoicePlateState() failed");
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
