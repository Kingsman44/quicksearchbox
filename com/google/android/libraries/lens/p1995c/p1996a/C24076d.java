package com.google.android.libraries.lens.p1995c.p1996a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24070a;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24073d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.c.a.d */
/* compiled from: PG */
public final class C24076d {

    /* renamed from: a */
    public static final String f65764a = String.format("content://%s/publicvalue/lens_oem_availability", new Object[]{"com.google.android.googlequicksearchbox.GsaPublicContentProvider"});

    /* renamed from: b */
    public static final String f65765b = String.format("content://%s/publicvalue/ar_stickers_availability", new Object[]{"com.google.android.googlequicksearchbox.GsaPublicContentProvider"});

    /* renamed from: h */
    private static final C24073d f65766h;

    /* renamed from: c */
    public final Context f65767c;

    /* renamed from: d */
    public final PackageManager f65768d;

    /* renamed from: e */
    public final List f65769e = new ArrayList();

    /* renamed from: f */
    public C24073d f65770f;

    /* renamed from: g */
    public boolean f65771g;

    static {
        C24070a aVar = (C24070a) C24073d.f65753f.createBuilder();
        aVar.copyOnWrite();
        C24073d dVar = (C24073d) aVar.instance;
        dVar.f65755a = 1 | dVar.f65755a;
        dVar.f65756b = "1.2.1";
        aVar.copyOnWrite();
        C24073d dVar2 = (C24073d) aVar.instance;
        dVar2.f65755a |= 2;
        dVar2.f65757c = BuildConfig.FLAVOR;
        aVar.copyOnWrite();
        C24073d dVar3 = (C24073d) aVar.instance;
        dVar3.f65758d = -1;
        dVar3.f65755a |= 4;
        aVar.copyOnWrite();
        C24073d dVar4 = (C24073d) aVar.instance;
        dVar4.f65759e = -1;
        dVar4.f65755a |= 8;
        f65766h = (C24073d) aVar.build();
    }

    public C24076d(Context context, PackageManager packageManager) {
        this.f65767c = context;
        this.f65768d = packageManager;
        this.f65771g = false;
        C24073d dVar = f65766h;
        this.f65770f = dVar;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null) {
                C24070a aVar = (C24070a) dVar.toBuilder();
                String str = packageInfo.versionName;
                aVar.copyOnWrite();
                C24073d dVar2 = (C24073d) aVar.instance;
                str.getClass();
                dVar2.f65755a |= 2;
                dVar2.f65757c = str;
                this.f65770f = (C24073d) aVar.build();
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        new C24075c(this).execute(new Void[0]);
        Log.i("LensSdkParamsReader", "Lens SDK version is: 1.2.1");
    }

    /* renamed from: a */
    public final void mo29470a(C24069a aVar) {
        if (this.f65771g) {
            aVar.mo29464a(this.f65770f);
        } else {
            this.f65769e.add(aVar);
        }
    }
}
