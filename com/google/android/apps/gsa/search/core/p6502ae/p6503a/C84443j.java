package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.j */
/* compiled from: PG */
final class C84443j extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C84431am f229783a;

    /* renamed from: b */
    final /* synthetic */ C84432an f229784b;

    /* renamed from: c */
    final /* synthetic */ C91043j f229785c;

    /* renamed from: d */
    final /* synthetic */ C84444k f229786d;

    public C84443j(C84444k kVar, C84431am amVar, C84432an anVar, C91043j jVar) {
        this.f229786d = kVar;
        this.f229783a = amVar;
        this.f229784b = anVar;
        this.f229785c = jVar;
    }

    public final void onReceive(Context context, Intent intent) {
        Collection collection;
        Feature[] featureArr;
        String action = intent.getAction();
        if ("com.google.android.gms.icing.GlobalSearchAppRegistered3".equals(action)) {
            C84431am amVar = this.f229783a;
            C84432an anVar = this.f229784b;
            if ("com.google.android.gms.icing.GlobalSearchAppRegistered3".equals(intent.getAction()) || "com.google.android.gms.icing.GlobalSearchAppRegistered2".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                byte[] byteArray = extras != null ? extras.getByteArray("App") : null;
                if (byteArray != null) {
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(byteArray, 0, byteArray.length);
                        obtain.setDataPosition(0);
                        GlobalSearchApplication globalSearchApplication = (GlobalSearchApplication) GlobalSearchApplication.CREATOR.createFromParcel(obtain);
                        if (globalSearchApplication == null) {
                            collection = Collections.emptyList();
                        } else {
                            GlobalSearchApplicationInfo globalSearchApplicationInfo = globalSearchApplication.f387458a;
                            String str = globalSearchApplicationInfo.f387461a;
                            if (str == null) {
                                collection = Collections.emptyList();
                            } else {
                                GetGlobalSearchSourcesCall$GlobalSearchSource getGlobalSearchSourcesCall$GlobalSearchSource = new GetGlobalSearchSourcesCall$GlobalSearchSource();
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394450b = globalSearchApplicationInfo.f387462b;
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394449a = str;
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394451c = globalSearchApplicationInfo.f387463c;
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394452d = globalSearchApplicationInfo.f387464d;
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394453e = globalSearchApplicationInfo.f387465e;
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394454f = globalSearchApplicationInfo.f387466f;
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394455g = globalSearchApplicationInfo.f387467g;
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394456h = globalSearchApplicationInfo.f387468h;
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394457i = new GetGlobalSearchSourcesCall$CorpusInfo[globalSearchApplication.mo117632a().size()];
                                Iterator it = globalSearchApplication.mo117632a().iterator();
                                int i = 0;
                                while (true) {
                                    GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr = getGlobalSearchSourcesCall$GlobalSearchSource.f394457i;
                                    if (i >= getGlobalSearchSourcesCall$CorpusInfoArr.length) {
                                        break;
                                    }
                                    GetGlobalSearchSourcesCall$CorpusInfo getGlobalSearchSourcesCall$CorpusInfo = new GetGlobalSearchSourcesCall$CorpusInfo();
                                    getGlobalSearchSourcesCall$CorpusInfoArr[i] = getGlobalSearchSourcesCall$CorpusInfo;
                                    getGlobalSearchSourcesCall$CorpusInfo.f394445a = (String) it.next();
                                    GetGlobalSearchSourcesCall$CorpusInfo getGlobalSearchSourcesCall$CorpusInfo2 = getGlobalSearchSourcesCall$GlobalSearchSource.f394457i[i];
                                    String str2 = getGlobalSearchSourcesCall$CorpusInfo2.f394445a;
                                    if (globalSearchApplication.f387459b != null) {
                                        int i2 = 0;
                                        while (true) {
                                            GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr = globalSearchApplication.f387459b;
                                            if (i2 >= globalSearchAppCorpusFeaturesArr.length) {
                                                break;
                                            } else if (globalSearchAppCorpusFeaturesArr[i2].f387456a.equals(str2)) {
                                                featureArr = globalSearchApplication.f387459b[i2].f387457b;
                                                break;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        getGlobalSearchSourcesCall$CorpusInfo2.f394446b = featureArr;
                                        i++;
                                    }
                                    featureArr = null;
                                    getGlobalSearchSourcesCall$CorpusInfo2.f394446b = featureArr;
                                    i++;
                                }
                                getGlobalSearchSourcesCall$GlobalSearchSource.f394458j = true;
                                collection = anVar.mo78015b(new GetGlobalSearchSourcesCall$GlobalSearchSource[]{getGlobalSearchSourcesCall$GlobalSearchSource});
                            }
                        }
                        amVar.mo78011b(collection);
                        ((C84425ag) this.f229786d.f229789b.mo27525b()).mo77994b(this.f229785c);
                    } finally {
                        obtain.recycle();
                    }
                } else {
                    throw new IllegalArgumentException("Invalid intent");
                }
            } else {
                throw new IllegalArgumentException("Not an GLOBAL_SEARCH_APP_REGISTERED_N_INTENT_ACTION intent");
            }
        } else if ("com.google.android.gms.icing.GlobalSearchableAppUnRegistered".equals(action)) {
            this.f229783a.mo78013e(intent.getStringExtra("AppPackageName"));
        }
    }
}
