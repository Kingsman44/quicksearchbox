package com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146025e;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.C31869b;
import com.google.android.libraries.places.api.p2426a.p2427a.p2430c.p2431a.C31788a;
import com.google.android.libraries.places.api.p2437b.C31859o;
import com.google.android.libraries.places.api.p2437b.C31864t;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.places.api.a.a.c.a.l */
/* compiled from: PG */
public final /* synthetic */ class C31804l implements C146025e {
    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C31797e eVar = (C31797e) abVar.mo122488g();
        String str = eVar.status;
        int a = C31823v.m59184a(str);
        if (!C31864t.m59274b(a)) {
            ArrayList arrayList = new ArrayList();
            C31788a[] aVarArr = eVar.predictions;
            if (aVarArr != null) {
                int length = aVarArr.length;
                int i = 0;
                while (i < length) {
                    C31788a aVar = aVarArr[i];
                    if (aVar == null || TextUtils.isEmpty(aVar.placeId)) {
                        throw new C143842n(new Status(1, 8, "Unexpected server error: Place ID not provided for an autocomplete prediction result", (PendingIntent) null, (ConnectionResult) null));
                    }
                    String str2 = aVar.placeId;
                    C31869b bVar = new C31869b();
                    if (str2 != null) {
                        bVar.f85738a = str2;
                        bVar.f85740c = new ArrayList();
                        bVar.f85741d = BuildConfig.FLAVOR;
                        bVar.f85742e = BuildConfig.FLAVOR;
                        bVar.f85743f = BuildConfig.FLAVOR;
                        bVar.f85739b = aVar.distanceMeters;
                        String[] strArr = aVar.types;
                        C58485gu guVar = null;
                        bVar.f85740c = C31811s.m59177a(C31811s.m59178b(strArr != null ? C58485gu.m89844l(strArr) : null));
                        bVar.f85741d = C58837ba.m90858g(aVar.description);
                        C31788a.C31790b[] bVarArr = aVar.matchedSubstrings;
                        bVar.f85744g = C31798f.m59163a(bVarArr != null ? C58485gu.m89844l(bVarArr) : null);
                        C31788a.C31789a aVar2 = aVar.structuredFormatting;
                        if (aVar2 != null) {
                            bVar.f85742e = C58837ba.m90858g(aVar2.mainText);
                            C31788a.C31790b[] bVarArr2 = aVar2.mainTextMatchedSubstrings;
                            bVar.f85745h = C31798f.m59163a(bVarArr2 != null ? C58485gu.m89844l(bVarArr2) : null);
                            bVar.f85743f = C58837ba.m90858g(aVar2.secondaryText);
                            C31788a.C31790b[] bVarArr3 = aVar2.secondaryTextMatchedSubstrings;
                            if (bVarArr3 != null) {
                                guVar = C58485gu.m89844l(bVarArr3);
                            }
                            bVar.f85746i = C31798f.m59163a(guVar);
                        }
                        AutocompletePrediction a2 = bVar.mo37594a();
                        C58485gu j = C58485gu.m89842j(a2.mo37467g());
                        if (j != null) {
                            bVar.f85740c = j;
                            List f = a2.mo37466f();
                            if (f != null) {
                                bVar.f85744g = C58485gu.m89842j(f);
                            }
                            List h = a2.mo37468h();
                            if (h != null) {
                                bVar.f85745h = C58485gu.m89842j(h);
                            }
                            List i2 = a2.mo37470i();
                            if (i2 != null) {
                                bVar.f85746i = C58485gu.m89842j(i2);
                            }
                            arrayList.add(bVar.mo37594a());
                            i++;
                        } else {
                            throw new NullPointerException("Null placeTypes");
                        }
                    } else {
                        throw new NullPointerException("Null placeId");
                    }
                }
            }
            return C31859o.m59262b(arrayList);
        }
        throw new C143842n(new Status(1, a, C31823v.m59185b(str, eVar.errorMessage), (PendingIntent) null, (ConnectionResult) null));
    }
}
