package com.google.apps.tiktok.experiments.phenotype;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.libraries.phenotype.registration.C31768a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58801sm;
import com.google.p343ac.p357d.C6659a;
import com.google.p343ac.p357d.C6662d;
import com.google.p343ac.p357d.C6663e;
import com.google.p5274y.p5275a.p5276a.C67967d;
import com.google.protobuf.C63088z;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.cx */
/* compiled from: PG */
public final class C46984cx implements C68220f {
    /* renamed from: a */
    public static Map m83632a(Context context, PackageManager packageManager) {
        int i;
        int i2;
        PackageManager packageManager2 = packageManager;
        String str = "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService";
        C69664n.m101061g(context, "context");
        C69664n.m101061g(packageManager2, "packageManager");
        try {
            int i3 = 0;
            PackageInfo packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
            List<ResolveInfo> queryIntentServices = packageManager2.queryIntentServices(new Intent(str).setPackage(context.getPackageName()), 787072);
            packageInfo.getClass();
            List arrayList = new ArrayList();
            if (!queryIntentServices.isEmpty()) {
                try {
                    HashSet hashSet = new HashSet();
                    C58480gp e = C58485gu.m89837e();
                    HashMap a = C31768a.m59112a(packageInfo, queryIntentServices, packageManager2);
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (it.hasNext()) {
                        ServiceInfo serviceInfo = it.next().serviceInfo;
                        if (!(serviceInfo == null || !str.equals(serviceInfo.name) || serviceInfo.metaData == null)) {
                            for (String str2 : serviceInfo.metaData.keySet()) {
                                if (("com.google.android.gms.phenotype.registration.binarypb".equals(str2) || str2.startsWith("com.google.android.gms.phenotype.registration.binarypb:")) && (i = serviceInfo.metaData.getInt(str2, i3)) != 0) {
                                    C6663e eVar = (C6663e) C6663e.f19901o.getParserForType().mo59009h(packageManager2.getResourcesForApplication(packageInfo.packageName).openRawResource(i));
                                    C6659a aVar = (C6659a) C6663e.f19901o.createBuilder();
                                    String c = C31768a.m59114c(eVar.f19908f, packageInfo, eVar.f19909g);
                                    aVar.copyOnWrite();
                                    C6663e eVar2 = (C6663e) aVar.instance;
                                    c.getClass();
                                    String str3 = str;
                                    Iterator<ResolveInfo> it2 = it;
                                    eVar2.f19903a |= 1;
                                    eVar2.f19908f = c;
                                    if (eVar.f19904b == 2) {
                                        i2 = ((Integer) eVar.f19905c).intValue();
                                    } else {
                                        i2 = packageInfo.versionCode;
                                    }
                                    aVar.copyOnWrite();
                                    C6663e eVar3 = (C6663e) aVar.instance;
                                    eVar3.f19904b = 2;
                                    eVar3.f19905c = Integer.valueOf(i2);
                                    boolean z = eVar.f19909g;
                                    aVar.copyOnWrite();
                                    C6663e eVar4 = (C6663e) aVar.instance;
                                    eVar4.f19903a |= 8;
                                    eVar4.f19909g = z;
                                    aVar.mo13720a(eVar.f19910h);
                                    String str4 = packageInfo.packageName;
                                    aVar.copyOnWrite();
                                    C6663e eVar5 = (C6663e) aVar.instance;
                                    str4.getClass();
                                    eVar5.f19906d = 7;
                                    eVar5.f19907e = str4;
                                    int a2 = C6662d.m18014a(eVar.f19912j);
                                    if (a2 == 0) {
                                        a2 = 1;
                                    }
                                    aVar.copyOnWrite();
                                    C6663e eVar6 = (C6663e) aVar.instance;
                                    eVar6.f19912j = a2 - 1;
                                    eVar6.f19903a |= 256;
                                    aVar.copyOnWrite();
                                    C6663e eVar7 = (C6663e) aVar.instance;
                                    eVar7.f19913k = 3;
                                    eVar7.f19903a |= 512;
                                    if (!eVar.f19911i.mo59173M()) {
                                        C63088z zVar = eVar.f19911i;
                                        aVar.copyOnWrite();
                                        C6663e eVar8 = (C6663e) aVar.instance;
                                        zVar.getClass();
                                        eVar8.f19903a |= 16;
                                        eVar8.f19911i = zVar;
                                    }
                                    if (eVar.f19914l) {
                                        aVar.copyOnWrite();
                                        C6663e eVar9 = (C6663e) aVar.instance;
                                        eVar9.f19903a |= 1024;
                                        eVar9.f19914l = true;
                                    }
                                    long j = C67967d.m98227a(packageManager2, packageInfo.packageName).f184184a;
                                    aVar.copyOnWrite();
                                    C6663e eVar10 = (C6663e) aVar.instance;
                                    eVar10.f19903a |= 2048;
                                    eVar10.f19915m = j;
                                    C63088z zVar2 = (C63088z) a.get(eVar.f19908f);
                                    if (zVar2 != null) {
                                        aVar.copyOnWrite();
                                        C6663e eVar11 = (C6663e) aVar.instance;
                                        eVar11.f19903a |= 4096;
                                        eVar11.f19916n = zVar2;
                                    }
                                    e.mo55395g((C6663e) aVar.build());
                                    it = it2;
                                    str = str3;
                                    i3 = 0;
                                }
                            }
                        }
                    }
                    C58801sm G = e.mo55394f().listIterator(0);
                    while (G.hasNext()) {
                        C6663e eVar12 = (C6663e) G.next();
                        hashSet.add(eVar12.f19908f);
                        arrayList.add(eVar12);
                    }
                    for (C6663e eVar13 : C31768a.m59113b(packageInfo, packageManager2)) {
                        if (!hashSet.contains(eVar13.f19908f)) {
                            arrayList.add(eVar13);
                        }
                    }
                } catch (Exception e2) {
                    Log.e("PhenotypeResourceReader", "Error reading phenotype registration: ".concat(String.valueOf(packageInfo.packageName)), e2);
                    arrayList = new ArrayList();
                }
            } else {
                try {
                    arrayList = C31768a.m59113b(packageInfo, packageManager2);
                } catch (Exception e3) {
                    Log.e("PhenotypeResourceReader", "Error reading phenotype registration: ".concat(String.valueOf(packageInfo.packageName)), e3);
                    arrayList = new ArrayList();
                }
            }
            C58495hd d = C58662ni.m90345d(arrayList, C46978cr.f122494a);
            C69664n.m101060f(d, "{\n        val packageInf…t.configPackage }\n      }");
            C68225k.m98532d(d);
            return d;
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
