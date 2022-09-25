package com.google.android.gms.auth.p10737a.p10738a;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.C142839a;
import com.google.android.gms.auth.C142901c;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143722g;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10780c.C143858a;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.auth.a.a.ae */
/* compiled from: PG */
public final class C142846ae extends C143847s implements C142847b {

    /* renamed from: a */
    private static final C143840l f387657a;

    /* renamed from: b */
    private static final C143707a f387658b;

    /* renamed from: c */
    private static final C143841m f387659c;

    /* renamed from: d */
    private static final C143858a f387660d = C142839a.m231773a("GoogleAuthServiceClient");

    static {
        C143840l lVar = new C143840l();
        f387657a = lVar;
        C142870y yVar = new C142870y();
        f387658b = yVar;
        f387659c = new C143841m("GoogleAuthService.API", yVar, lVar);
    }

    public C142846ae(Context context) {
        super(context, (Activity) null, f387659c, C143722g.f389627f, C143846r.f389923a);
    }

    /* renamed from: f */
    public static void m231785f(Status status, Object obj, C146010af afVar) {
        if (!C143811de.m233725b(status, obj, afVar)) {
            f387660d.mo119307d("The task is already complete.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final C146006ab mo117778a(ClearTokenRequest clearTokenRequest) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C142901c.f387742h};
        dcVar.f389860a = new C142868w(clearTokenRequest);
        dcVar.f389863d = 1513;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo117779b(GetAccountsRequest getAccountsRequest) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C142901c.f387741g};
        dcVar.f389860a = new C142869x(getAccountsRequest);
        dcVar.f389863d = 1516;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo117780c(Account account, String str, Bundle bundle) {
        C143919bh.m233971n(account, "Account name cannot be null!");
        C143919bh.m233970m(str, "Scope cannot be null!");
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C142901c.f387742h};
        dcVar.f389860a = new C142867v(account, str, bundle);
        dcVar.f389863d = 1512;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: d */
    public final C146006ab mo117781d(HasCapabilitiesRequest hasCapabilitiesRequest) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C142901c.f387735a};
        dcVar.f389860a = new C142866u(hasCapabilitiesRequest);
        dcVar.f389863d = 1644;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: e */
    public final C146006ab mo117782e(String str) {
        C143919bh.m233971n(str, "Client package name cannot be null!");
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C142901c.f387741g};
        dcVar.f389860a = new C142865t(str);
        dcVar.f389863d = 1514;
        return super.mo119290u(1, dcVar.mo119260a());
    }
}
