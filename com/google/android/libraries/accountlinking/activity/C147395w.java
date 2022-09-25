package com.google.android.libraries.accountlinking.activity;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.libraries.accountlinking.C147435m;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.p3562ao.p3563a.p3568d.C45549at;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.accountlinking.activity.w */
/* compiled from: PG */
public final class C147395w {

    /* renamed from: a */
    public final C58528ij f397892a;

    /* renamed from: b */
    public final Account f397893b;

    /* renamed from: c */
    public final boolean f397894c;

    /* renamed from: d */
    public final int f397895d;

    /* renamed from: e */
    public final String f397896e;

    /* renamed from: f */
    public final String f397897f;

    /* renamed from: g */
    public final int f397898g;

    /* renamed from: h */
    public final String f397899h;

    /* renamed from: i */
    public final C58485gu f397900i;

    /* renamed from: j */
    public final C45549at f397901j;

    /* renamed from: k */
    public final C58528ij f397902k;

    /* renamed from: l */
    public final boolean f397903l;

    /* renamed from: m */
    public final int f397904m;

    /* renamed from: n */
    public final C58485gu f397905n;

    /* renamed from: o */
    public final String f397906o;

    /* renamed from: p */
    public final C58485gu f397907p;

    /* renamed from: q */
    public final int f397908q;

    /* renamed from: r */
    private final C58528ij f397909r;

    public C147395w(C147394v vVar) {
        Account account = vVar.f397876c;
        account.getClass();
        String str = vVar.f397880g;
        str.getClass();
        String str2 = vVar.f397882i;
        str2.getClass();
        C58485gu guVar = vVar.f397883j;
        guVar.getClass();
        C45549at atVar = vVar.f397884k;
        atVar.getClass();
        int i = vVar.f397891r;
        if (i != 0) {
            this.f397892a = vVar.f397874a;
            this.f397909r = vVar.f397875b;
            this.f397895d = vVar.f397878e;
            this.f397896e = vVar.f397879f;
            this.f397893b = account;
            this.f397894c = vVar.f397877d;
            this.f397897f = str;
            this.f397898g = vVar.f397881h;
            this.f397899h = str2;
            this.f397900i = guVar;
            this.f397901j = atVar;
            this.f397902k = vVar.f397885l;
            this.f397903l = vVar.f397886m;
            this.f397904m = vVar.f397887n;
            this.f397905n = vVar.f397888o;
            this.f397906o = vVar.f397889p;
            this.f397907p = vVar.f397890q;
            this.f397908q = i;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final Bundle mo124153a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("scopes", new ArrayList(this.f397892a));
        bundle.putStringArrayList("capabilities", new ArrayList(this.f397909r));
        bundle.putParcelable("account", this.f397893b);
        bundle.putBoolean("using_custom_dependency_supplier", this.f397894c);
        bundle.putInt("session_id", this.f397895d);
        String str = this.f397896e;
        if (str != null) {
            bundle.putString("bucket", str);
        }
        bundle.putString("service_host", this.f397897f);
        bundle.putInt("service_port", this.f397898g);
        bundle.putString("service_id", this.f397899h);
        bundle.putStringArrayList("flows", new ArrayList(C58485gu.m89841i(C58431eu.m89654f(this.f397900i).mo55247g(C147390r.f397870a).mo55248h())));
        bundle.putByteArray("linking_session", this.f397901j.toByteArray());
        bundle.putStringArrayList("google_scopes", new ArrayList(this.f397902k));
        bundle.putBoolean("two_way_account_linking", this.f397903l);
        bundle.putInt("account_linking_entry_point", this.f397904m);
        bundle.putStringArrayList("data_usage_notices", new ArrayList(C58485gu.m89841i(C58431eu.m89654f(this.f397905n).mo55247g(C147391s.f397871a).mo55248h())));
        String str2 = this.f397906o;
        if (str2 != null) {
            bundle.putString("consent_language_keys", str2);
        }
        bundle.putStringArrayList("experiment_server_tokens", new ArrayList(this.f397907p));
        int i = this.f397908q;
        String a = C147435m.m240361a(i);
        if (i != 0) {
            bundle.putString("gal_color_scheme", a);
            return bundle;
        }
        throw null;
    }
}
