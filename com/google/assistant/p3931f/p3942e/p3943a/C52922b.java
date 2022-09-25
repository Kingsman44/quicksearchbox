package com.google.assistant.p3931f.p3942e.p3943a;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.assistant.f.e.a.b */
/* compiled from: PG */
public final class C52922b extends C8848a implements IInterface {
    public C52922b(IBinder iBinder) {
        super(iBinder, "com.google.assistant.appactions.widgets.pinappwidget.IPinAppWidgetProxy");
    }

    /* renamed from: e */
    public final void mo53947e(ComponentName componentName, Bundle bundle, C52921a aVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, componentName);
        C8850c.m23497f(gA, bundle);
        C8850c.m23499h(gA, aVar);
        Parcel gT = mo17261gT(2, gA);
        C8850c.m23500i(gT);
        gT.recycle();
    }
}
