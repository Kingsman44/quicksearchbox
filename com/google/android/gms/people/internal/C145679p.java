package com.google.android.gms.people.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143900ap;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.people.C145629a;
import com.google.android.gms.people.internal.p10857a.C145657a;
import com.google.android.gms.people.p10854a.C145630a;
import com.google.android.gms.people.p10856c.C145645a;
import com.google.android.p445a.C8850c;
import java.util.HashMap;

/* renamed from: com.google.android.gms.people.internal.p */
/* compiled from: PG */
public final class C145679p extends C143887ac {

    /* renamed from: c */
    private static volatile Bundle f393920c;

    /* renamed from: d */
    private static volatile Bundle f393921d;

    /* renamed from: a */
    public final String f393922a;

    /* renamed from: b */
    public final String f393923b;

    /* renamed from: e */
    private final HashMap f393924e = new HashMap();

    public C145679p(Context context, Looper looper, C143849u uVar, C143850v vVar, String str, C143944s sVar) {
        super(context.getApplicationContext(), looper, 5, sVar, uVar, vVar);
        this.f393922a = str;
        this.f393923b = sVar.f390173e;
    }

    /* renamed from: q */
    public static Status m236798q(int i, Bundle bundle) {
        return new Status(1, i, (String) null, bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent"), (ConnectionResult) null);
    }

    /* renamed from: W */
    public final void mo121724W(C143825n nVar, int i) {
        super.mo119455M();
        C145673j jVar = new C145673j(nVar);
        try {
            C145668e eVar = (C145668e) super.mo119451G();
            Parcel gA = eVar.mo17260gA();
            C8850c.m23499h(gA, jVar);
            gA.writeString((String) null);
            gA.writeString((String) null);
            gA.writeInt(i);
            eVar.mo17262he(403, gA);
        } catch (RemoteException unused) {
            jVar.mo121711a(8, (Bundle) null, (DataHolder) null);
        }
    }

    /* renamed from: X */
    public final void mo121725X(C143825n nVar, int i) {
        super.mo119455M();
        C145675l lVar = new C145675l(nVar);
        try {
            C145668e eVar = (C145668e) super.mo119451G();
            Parcel gA = eVar.mo17260gA();
            C8850c.m23499h(gA, lVar);
            C8850c.m23495d(gA, false);
            C8850c.m23495d(gA, false);
            gA.writeString((String) null);
            gA.writeString((String) null);
            gA.writeInt(i);
            eVar.mo17262he(305, gA);
        } catch (RemoteException unused) {
            lVar.mo121711a(8, (Bundle) null, (DataHolder) null);
        }
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        return queryLocalInterface instanceof C145668e ? (C145668e) queryLocalInterface : new C145668e(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.people.service.START";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C145629a.f393809t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Bundle mo117789i() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.f393922a);
        bundle.putString("real_client_package_name", this.f393923b);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    /* renamed from: m */
    public final synchronized void mo121726m(Bundle bundle) {
        if (bundle != null) {
            C145657a.f393902a = bundle.getBoolean("use_contactables_api", true);
            C145645a.f393872a.mo121684b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
            f393920c = bundle.getBundle("config.email_type_map");
            f393921d = bundle.getBundle("config.phone_type_map");
        }
    }

    /* renamed from: n */
    public final void mo118925n() {
        synchronized (this.f393924e) {
            if (mo119467w()) {
                for (C145674k kVar : this.f393924e.values()) {
                    C143784ce ceVar = kVar.f393913a;
                    ceVar.f389805a = null;
                    ceVar.f389806b = null;
                    try {
                        ((C145668e) super.mo119451G()).mo121715e(kVar, false, 0);
                    } catch (RemoteException e) {
                        C145630a.m236728a("Failed to unregister listener", e);
                    } catch (IllegalStateException e2) {
                        C145630a.m236728a("PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.f393924e.clear();
        }
        super.mo118925n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo118927p(int i, IBinder iBinder, Bundle bundle, int i2) {
        Bundle bundle2;
        if (i == 0) {
            i = 0;
            if (bundle != null) {
                mo121726m(bundle.getBundle("post_init_configuration"));
            }
        }
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = bundle.getBundle("post_init_resolution");
        }
        super.mo118927p(i, iBinder, bundle2, i2);
    }

    /* renamed from: r */
    public final C143900ap mo121727r(C143825n nVar, String str, int i) {
        C143900ap apVar;
        C145676m mVar = new C145676m(nVar);
        try {
            C145668e eVar = (C145668e) super.mo119451G();
            Parcel gA = eVar.mo17260gA();
            C8850c.m23499h(gA, mVar);
            gA.writeString(str);
            gA.writeString((String) null);
            gA.writeInt(i);
            gA.writeInt(1);
            Parcel gT = eVar.mo17261gT(505, gA);
            IBinder readStrongBinder = gT.readStrongBinder();
            if (readStrongBinder == null) {
                apVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                apVar = queryLocalInterface instanceof C143900ap ? (C143900ap) queryLocalInterface : new C143900ap(readStrongBinder);
            }
            gT.recycle();
            return apVar;
        } catch (RemoteException unused) {
            mVar.mo121712b(8, (Bundle) null, (ParcelFileDescriptor) null, (Bundle) null);
            return null;
        }
    }
}
