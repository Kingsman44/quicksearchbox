package com.google.android.gms.mobiledataplan;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.mobiledataplan.consent.C145523d;
import com.google.android.gms.mobiledataplan.consent.C145527h;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.mobiledataplan.l */
/* compiled from: PG */
public final class C145537l extends C143847s implements C145550x {

    /* renamed from: a */
    private static final C143840l f393576a;

    /* renamed from: b */
    private static final C143707a f393577b;

    /* renamed from: c */
    private static final C143841m f393578c;

    /* renamed from: d */
    private String f393579d;

    /* renamed from: e */
    private String f393580e;

    /* renamed from: f */
    private int f393581f;

    static {
        C143840l lVar = new C143840l();
        f393576a = lVar;
        C145532g gVar = new C145532g();
        f393577b = gVar;
        f393578c = new C143841m("MobileDataPlan.API", gVar, lVar);
    }

    public C145537l(Context context, C145549w wVar) {
        super(context, (Activity) null, f393578c, wVar, C143846r.f389923a);
        String packageName = context.getApplicationContext().getPackageName();
        this.f393579d = packageName;
        if (packageName != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.f393579d, 0);
                this.f393580e = packageInfo.versionName;
                this.f393581f = packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                this.f393579d = "PACKAGE_NAME_NOT_FOUND";
                this.f393580e = "PACKAGE_VERSION_NOT_FOUND";
                this.f393581f = -1;
            }
        } else {
            throw new PackageManager.NameNotFoundException();
        }
    }

    /* renamed from: d */
    private final Bundle m236605d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("client_package_name", this.f393579d);
        bundle.putString("client_version_name", this.f393580e);
        bundle.putLong("client_version_code", (long) this.f393581f);
        return bundle;
    }

    /* renamed from: a */
    public final C146006ab mo121412a(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest) {
        C143919bh.m233970m(mdpCarrierPlanIdRequest.f393434a, "getCarrierPlanId needs a valid API key provided by GTAF team.");
        C145538m mVar = new C145538m(mdpCarrierPlanIdRequest);
        mVar.f393582a.f393435b = m236605d(mdpCarrierPlanIdRequest.f393435b);
        C143809dc dcVar = new C143809dc();
        dcVar.f389863d = 16201;
        dcVar.f389860a = new C145529d(mVar);
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo121413b(GetConsentInformationRequest getConsentInformationRequest) {
        C143919bh.m233970m(getConsentInformationRequest.f393547a, "getConsentInformation needs a non-empty Client CPID");
        C145523d dVar = new C145523d(getConsentInformationRequest);
        dVar.f393568a.f393551e = m236605d(getConsentInformationRequest.f393551e);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145531f(dVar);
        dcVar.f389862c = new Feature[]{C145517c.f393526a};
        dcVar.f389863d = 16206;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo121414c(SetConsentStatusRequest setConsentStatusRequest) {
        C143919bh.m233970m(setConsentStatusRequest.f393559a, "setConsentStatus needs a non-empty Client CPID");
        C143919bh.m233960c(setConsentStatusRequest.f393560b != null, "setConsentStatus needs a non-null Session ID");
        C143919bh.m233960c(setConsentStatusRequest.f393561c != null, "setConsentStatus needs a non-null ConsentStatus");
        C143919bh.m233960c(setConsentStatusRequest.f393562d != null, "setConsentStatus needs a non-null Consent Time");
        C145527h hVar = new C145527h(setConsentStatusRequest);
        hVar.f393569a.f393566h = m236605d(setConsentStatusRequest.f393566h);
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145530e(hVar);
        dcVar.f389862c = new Feature[]{C145517c.f393526a};
        dcVar.f389863d = 16207;
        return super.mo119290u(1, dcVar.mo119260a());
    }
}
