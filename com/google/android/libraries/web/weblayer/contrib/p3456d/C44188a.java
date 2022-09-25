package com.google.android.libraries.web.weblayer.contrib.p3456d;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.web.weblayer.p3464f.p3467b.C44268u;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72318an;
import org.chromium.weblayer.C72583as;
import org.chromium.weblayer.C72587aw;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72621j;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.d.a */
/* compiled from: PG */
public final /* synthetic */ class C44188a implements C72621j {

    /* renamed from: a */
    public final /* synthetic */ C44192e f114959a;

    /* renamed from: b */
    public final /* synthetic */ Uri f114960b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f114961c;

    public /* synthetic */ C44188a(C44192e eVar, Uri uri, C2164c cVar) {
        this.f114959a = eVar;
        this.f114960b = uri;
        this.f114961c = cVar;
    }

    /* renamed from: a */
    public final void mo46626a(Object obj) {
        C44192e eVar = this.f114959a;
        Uri uri = this.f114960b;
        C2164c cVar = this.f114961c;
        C72587aw a = C44268u.m78127a((C72611bt) obj, eVar.f114967a);
        C72604bm.m107399a();
        C72583as asVar = a.f193124f;
        C72604bm.m107399a();
        try {
            C72318an anVar = asVar.f193115a;
            String uri2 = uri.toString();
            Parcel gA = anVar.mo17260gA();
            gA.writeString(uri2);
            anVar.mo17262he(1, gA);
            cVar.mo5437b((Object) null);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
