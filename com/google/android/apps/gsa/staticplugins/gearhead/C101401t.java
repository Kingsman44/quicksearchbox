package com.google.android.apps.gsa.staticplugins.gearhead;

import android.os.RemoteException;
import com.google.android.apps.gsa.search.core.carassistant.C85729g;
import com.google.android.gearhead.sdk.assistant.C142664j;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.t */
/* compiled from: PG */
public final /* synthetic */ class C101401t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282932a;

    /* renamed from: b */
    public final /* synthetic */ int f282933b;

    public /* synthetic */ C101401t(C101325be beVar, int i) {
        this.f282932a = beVar;
        this.f282933b = i;
    }

    public final void accept(Object obj) {
        C142664j jVar;
        C101325be beVar = this.f282932a;
        int i = this.f282933b;
        if (!((Boolean) obj).booleanValue()) {
            int i2 = 0;
            switch (i) {
                case 1:
                case 6:
                case 8:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                case 10:
                    i2 = 4;
                    break;
                case 4:
                case 5:
                case 9:
                    i2 = 5;
                    break;
                case 7:
                    i2 = 1;
                    break;
            }
            try {
                if (!beVar.f282751H && (jVar = beVar.f282755L) != null) {
                    jVar.mo117448e(i2);
                }
            } catch (RemoteException e) {
                ((C58970a) ((C58970a) ((C58970a) C101325be.f282743a.mo56225c()).mo56382g(e)).mo56372aa(20038)).mo56386p("Client callback setVoicePlateState() failed");
            }
        } else {
            C85729g gVar = beVar.f282787q.f229169d;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
