package com.google.android.apps.gsa.staticplugins.opa.samson.host;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.libraries.assistant.p1356b.p1359b.p1361b.C16927b;
import com.google.android.libraries.assistant.p1518i.p1519a.C18391b;
import com.google.android.libraries.assistant.p1518i.p1519a.C18392c;
import com.google.android.libraries.assistant.p1518i.p1519a.C18394e;
import com.google.android.libraries.assistant.p1518i.p1519a.C18395f;

/* compiled from: PG */
public class AmbientDynamicBridgeImpl extends C16927b {
    private final C110171i contentViewControllerFactory;
    private final Context wrappedContext;

    public AmbientDynamicBridgeImpl(IBinder iBinder, IBinder iBinder2) {
        C18394e eVar;
        C18394e eVar2 = null;
        if (iBinder2 == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.libraries.assistant.dynamicloading.shared.IObjectWrapper");
            eVar = queryLocalInterface instanceof C18394e ? (C18394e) queryLocalInterface : new C18392c(iBinder2);
        }
        Context context = (Context) C18395f.m35842a(eVar);
        if (iBinder != null) {
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.libraries.assistant.dynamicloading.shared.IObjectWrapper");
            eVar2 = queryLocalInterface2 instanceof C18394e ? (C18394e) queryLocalInterface2 : new C18392c(iBinder);
        }
        Context context2 = (Context) C18395f.m35842a(eVar2);
        C18391b bVar = new C18391b(context, context2.getResources(), context2.getClassLoader());
        this.wrappedContext = bVar;
        this.contentViewControllerFactory = new C110171i(bVar);
    }

    public C18394e getAmbientContentView(C18394e eVar) {
        Runnable runnable = eVar != null ? (Runnable) C18395f.m35842a(eVar) : null;
        Context context = this.contentViewControllerFactory.f306989a;
        C110176n nVar = new C110176n(context, runnable, new C110168f(context));
        nVar.mo98452a();
        return new C18395f(nVar.f306998d);
    }
}
