package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51676ah;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52801c;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.protobuf.C62940bt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.s */
/* compiled from: PG */
public final /* synthetic */ class C93229s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C51676ah f259984a;

    public /* synthetic */ C93229s(C51676ah ahVar) {
        this.f259984a = ahVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C52829f fVar;
        C51676ah ahVar = this.f259984a;
        for (DirectAction directAction : (List) obj) {
            if (directAction.getId().equals("app_action")) {
                C62940bt btVar = C48775a.f126216h;
                Bundle extras = directAction.getExtras();
                if (extras == null) {
                    fVar = C52829f.f138611c;
                } else {
                    Bundle bundle = extras.getBundle("metadata");
                    if (bundle == null) {
                        fVar = C52829f.f138611c;
                    } else {
                        try {
                            fVar = (C52829f) C52801c.m86708a(bundle, "app_action_metadata", C52829f.f138611c);
                        } catch (C52802d unused) {
                            fVar = C52829f.f138611c;
                        }
                    }
                }
                ahVar.mo58885m(btVar, fVar);
                return C22402a.m41821a("app_control_result", "assistant.api.client_op.AppControlResult", ahVar.build());
            }
        }
        return C22402a.m41821a("app_control_result", "assistant.api.client_op.AppControlResult", ahVar.build());
    }
}
