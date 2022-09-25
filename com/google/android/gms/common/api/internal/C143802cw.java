package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.signin.C145992d;
import com.google.android.gms.signin.C145993e;
import com.google.android.gms.signin.internal.C145996b;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.cw */
/* compiled from: PG */
public final class C143802cw extends C145996b implements C143849u, C143850v {

    /* renamed from: a */
    public final Context f389844a;

    /* renamed from: b */
    public final Handler f389845b;

    /* renamed from: c */
    public final Set f389846c;

    /* renamed from: d */
    public final C143944s f389847d;

    /* renamed from: e */
    public C145993e f389848e;

    /* renamed from: f */
    public C143766bn f389849f;

    static {
        C143840l lVar = C145992d.f394665a;
    }

    public C143802cw(Context context, Handler handler, C143944s sVar) {
        this.f389844a = context;
        this.f389845b = handler;
        this.f389847d = sVar;
        this.f389846c = sVar.f390170b;
    }

    /* renamed from: a */
    public final void mo119147a(SignInResponse signInResponse) {
        this.f389845b.post(new C143801cv(this, signInResponse));
    }

    /* renamed from: d */
    public final void mo26993d(ConnectionResult connectionResult) {
        this.f389849f.mo119205b(connectionResult);
    }

    /* renamed from: kq */
    public final void mo26991kq(Bundle bundle) {
        this.f389848e.mo122464g(this);
    }

    /* renamed from: kr */
    public final void mo26992kr(int i) {
        this.f389848e.mo118925n();
    }
}
