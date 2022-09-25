package com.google.android.libraries.assistant.p1467d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;

/* renamed from: com.google.android.libraries.assistant.d.k */
/* compiled from: PG */
final class C17933k extends Handler {

    /* renamed from: a */
    final /* synthetic */ C17934l f51366a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17933k(C17934l lVar, Looper looper) {
        super(looper);
        this.f51366a = lVar;
    }

    public final void handleMessage(Message message) {
        if (message.what != 100) {
            Log.w("AssistantIntegClient", "#handleMessage(): unknown msg (" + message.what + ") is posted");
            return;
        }
        C17934l lVar = this.f51366a;
        if (lVar.f51373g.mo23487a() && lVar.f51372f != null) {
            C17914p pVar = (C17914p) C17881ak.f51231h.createBuilder();
            C17873ac acVar = lVar.f51372f;
            pVar.copyOnWrite();
            C17881ak akVar = (C17881ak) pVar.instance;
            C17880aj ajVar = (C17880aj) acVar.build();
            ajVar.getClass();
            akVar.f51235c = ajVar;
            akVar.f51233a |= 2;
            try {
                C17934l.m35122c(lVar.mo23491b(pVar), "sendPendingVoicePlateParams");
                lVar.f51372f = null;
            } catch (RemoteException unused) {
                Log.w("AssistantIntegClient", "#sendPendingVoicePlateParams(): failed to send VoicePlateParams");
            }
        }
    }
}
