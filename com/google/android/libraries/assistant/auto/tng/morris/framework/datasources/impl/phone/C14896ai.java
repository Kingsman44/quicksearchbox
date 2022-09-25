package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.os.RemoteException;
import android.telecom.Call;
import com.google.android.gms.car.C143145ca;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.ai */
/* compiled from: PG */
public final class C14896ai extends C14897aj {

    /* renamed from: a */
    public static final C59071e f44802a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.ai");

    /* renamed from: b */
    public final CopyOnWriteArraySet f44803b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final C14894ag f44804c = new C14894ag(this);

    /* renamed from: d */
    public final MorrisInCallService f44805d;

    /* renamed from: e */
    public final C14908g f44806e;

    /* renamed from: f */
    public final Call.Callback f44807f = new C14893af(this);

    public C14896ai(MorrisInCallService morrisInCallService, C14908g gVar) {
        this.f44805d = morrisInCallService;
        this.f44806e = gVar;
    }

    /* renamed from: a */
    public final void mo21804a(C14895ah ahVar) {
        Iterator it = this.f44803b.iterator();
        while (it.hasNext()) {
            try {
                ahVar.mo21795a((C143145ca) it.next());
            } catch (RemoteException e) {
                C59104x c = f44802a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.InCallService");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(45747)).mo56386p("Error notifying listener: remote exception");
            }
        }
    }
}
