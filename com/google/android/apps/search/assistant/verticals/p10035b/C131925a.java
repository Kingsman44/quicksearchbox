package com.google.android.apps.search.assistant.verticals.p10035b;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.b.a */
/* compiled from: PG */
public final /* synthetic */ class C131925a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C131929e f360210a;

    /* renamed from: b */
    public final /* synthetic */ String f360211b;

    public /* synthetic */ C131925a(C131929e eVar, String str) {
        this.f360210a = eVar;
        this.f360211b = str;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        int intValue;
        int intValue2;
        C131929e eVar = this.f360210a;
        String str = this.f360211b;
        try {
            PackageInfo packageInfo = eVar.f360222d.getPackageManager().getPackageInfo((String) obj, 0);
            eVar.f360227i = true;
            C58485gu b = C131929e.m214391b(packageInfo.versionName);
            C58485gu b2 = C131929e.m214391b(str);
            if (b.isEmpty()) {
                return false;
            }
            if (b2.isEmpty()) {
                return false;
            }
            int i = 0;
            while (i < b.size() && i < b2.size() && (intValue = ((Integer) b.get(i)).intValue()) <= (intValue2 = ((Integer) b2.get(i)).intValue())) {
                if (intValue < intValue2) {
                    return false;
                }
                i++;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
