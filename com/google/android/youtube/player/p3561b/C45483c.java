package com.google.android.youtube.player.p3561b;

import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p031v4.app.C0167am;
import com.google.android.youtube.player.C45510f;

/* renamed from: com.google.android.youtube.player.b.c */
final class C45483c extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ C45485e f118887a;

    public /* synthetic */ C45483c(C45485e eVar) {
        this.f118887a = eVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        C45475bg bgVar;
        Void[] voidArr = (Void[]) objArr;
        if (!this.f118887a.mo49657w()) {
            return null;
        }
        C0167am a = this.f118887a.mo49636a();
        try {
            C45465ax axVar = this.f118887a.f118901m;
            IBinder b = axVar.mo49613b();
            IBinder a2 = axVar.mo49612a();
            if (a != null) {
                Context a3 = C45458aq.m81130a(a.getWindow().getContext());
                if (a3 == null) {
                    throw new C45454am("Could not create remote context");
                } else if (b == null || a2 == null) {
                    throw new C45454am("Could not create fragment with null binder");
                } else {
                    IBinder a4 = C45455an.m81109a(a3.getClassLoader().loadClass("com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment"), new C45453al(a3), b, a2);
                    if (a4 == null) {
                        bgVar = null;
                    } else {
                        IInterface queryLocalInterface = a4.queryLocalInterface("com.google.android.youtube.player.internal.IEmbedFragment");
                        bgVar = queryLocalInterface instanceof C45475bg ? (C45475bg) queryLocalInterface : new C45475bg(a4);
                    }
                    C45453al alVar = new C45453al(a);
                    Parcel lr = bgVar.mo49586lr();
                    lr.writeStrongBinder(alVar);
                    bgVar.mo49588lt(31, lr);
                    return bgVar;
                }
            } else {
                throw new C45454am("No valid Activity or Window. Could not create fragment.");
            }
        } catch (ClassNotFoundException e) {
            throw new C45454am("Unable to find dynamic class com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment", e);
        } catch (RemoteException e2) {
            throw new C45454am("Unable to initialize dynamic class com.google.android.apps.youtube.embeddedplayer.service.jar.client.RemoteEmbedFragment", e2);
        } catch (C45454am | IllegalStateException e3) {
            C45457ap.m81128a(e3.getMessage(), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        C45475bg bgVar = (C45475bg) obj;
        C45485e eVar = this.f118887a;
        eVar.f118904p = bgVar;
        if (bgVar == null) {
            C45485e.m81199s(eVar, C45510f.ERROR_CONNECTING_TO_SERVICE);
            return;
        }
        eVar.mo49653r();
        this.f118887a.f118896h.mo49671k(bgVar);
        this.f118887a.mo49652q(C45510f.SUCCESS);
    }
}
