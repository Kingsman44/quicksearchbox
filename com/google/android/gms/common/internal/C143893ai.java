package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.ai */
/* compiled from: PG */
final class C143893ai implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C143894aj f390089a;

    public C143893ai(C143894aj ajVar) {
        this.f390089a = ajVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f390089a.f390090c) {
                C143890af afVar = (C143890af) message.obj;
                C143892ah ahVar = (C143892ah) this.f390089a.f390090c.get(afVar);
                if (ahVar != null && ahVar.mo119409c()) {
                    if (ahVar.f390084c) {
                        ahVar.f390088g.f390092e.removeMessages(1, ahVar.f390086e);
                        C143894aj ajVar = ahVar.f390088g;
                        ajVar.f390093f.mo119311b(ajVar.f390091d, ahVar);
                        ahVar.f390084c = false;
                        ahVar.f390083b = 2;
                    }
                    this.f390089a.f390090c.remove(afVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f390089a.f390090c) {
                C143890af afVar2 = (C143890af) message.obj;
                C143892ah ahVar2 = (C143892ah) this.f390089a.f390090c.get(afVar2);
                if (ahVar2 != null && ahVar2.f390083b == 3) {
                    String valueOf = String.valueOf(afVar2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName componentName = ahVar2.f390087f;
                    if (componentName == null) {
                        componentName = afVar2.f390076d;
                    }
                    if (componentName == null) {
                        String str = afVar2.f390075c;
                        C143919bh.m233958a(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    ahVar2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
