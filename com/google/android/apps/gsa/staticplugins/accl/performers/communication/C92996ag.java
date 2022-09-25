package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer;
import com.google.android.p445a.C8850c;
import com.google.android.search.verification.api.C45233a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.ag */
/* compiled from: PG */
final class C92996ag implements ServiceConnection {

    /* renamed from: a */
    private final Intent f259427a;

    /* renamed from: b */
    private final C58833ax f259428b;

    public C92996ag(Intent intent, C58833ax axVar) {
        this.f259427a = intent;
        this.f259428b = axVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C45233a aVar;
        if (iBinder == null) {
            aVar = null;
        } else {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.IMessageActionService");
                aVar = queryLocalInterface instanceof C45233a ? (C45233a) queryLocalInterface : new C45233a(iBinder);
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) ChatPerformer.f259389a.mo56226d()).mo56382g(e)).mo56372aa(13160)).mo56386p("Unable to share message using binder API.");
                Bundle bundle = new Bundle();
                bundle.putString("com.google.android.voicesearch.extra.ERROR_MESSAGE", e.getMessage());
                ((ChatPerformer.ResultReceiverCallback) ((C58847bk) this.f259428b).f156646a).mo87509a(-1, bundle);
                return;
            }
        }
        if (aVar != null) {
            Intent intent = this.f259427a;
            Parcel gA = aVar.mo17260gA();
            C8850c.m23497f(gA, intent);
            aVar.mo17263hf(1, gA);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59071e eVar = ChatPerformer.f259389a;
    }
}
