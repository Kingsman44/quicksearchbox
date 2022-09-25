package com.google.android.apps.search.assistant.surfaces.appactions.service;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.gsa.binaries.satin.app.aeh;
import com.google.android.apps.search.assistant.surfaces.appactions.p9370b.p9371a.C124368a;
import com.google.android.libraries.appactions.service.C147861c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4449cd.p4462i.C58048g;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.service.c */
/* compiled from: PG */
public final class C124371c {

    /* renamed from: a */
    public static final C58974d f343287a = C58974d.m91134h("AppShortcutsServiceBndr");

    /* renamed from: b */
    public final Context f343288b;

    /* renamed from: c */
    public final Executor f343289c;

    /* renamed from: d */
    public final aeh f343290d;

    /* renamed from: e */
    public final C58048g f343291e;

    /* renamed from: f */
    public final C124368a f343292f;

    public C124371c(Context context, Executor executor, aeh aeh, C58048g gVar, C124368a aVar) {
        this.f343288b = context;
        this.f343289c = executor;
        this.f343290d = aeh;
        this.f343291e = gVar;
        this.f343292f = aVar;
    }

    /* renamed from: a */
    public static void m203827a(C147861c cVar, int i, String str, Throwable th) {
        if (th != null) {
            ((C58970a) ((C58970a) ((C58970a) f343287a.mo56225c()).mo56382g(th)).mo56372aa(36223)).mo56395y("Calling back the client with errorCode = %s, errorMessage = %s", i, str);
        } else {
            ((C58970a) ((C58970a) f343287a.mo56225c()).mo56372aa(36221)).mo56395y("Calling back the client with errorCode = %s, errorMessage = %s", i, str);
        }
        try {
            Parcel gA = cVar.mo17260gA();
            gA.writeInt(i);
            gA.writeString(str);
            cVar.mo17263hf(2, gA);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f343287a.mo56225c()).mo56382g(e)).mo56372aa(36222)).mo56386p("Callback failed");
        }
    }
}
