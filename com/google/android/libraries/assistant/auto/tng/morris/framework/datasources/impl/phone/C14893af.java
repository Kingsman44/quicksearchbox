package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.telecom.Call;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.af */
/* compiled from: PG */
final class C14893af extends Call.Callback {

    /* renamed from: b */
    public static final /* synthetic */ int f44799b = 0;

    /* renamed from: a */
    final /* synthetic */ C14896ai f44800a;

    public C14893af(C14896ai aiVar) {
        this.f44800a = aiVar;
    }

    public final void onCallDestroyed(Call call) {
        CarCall c;
        C14908g gVar = this.f44800a.f44806e;
        if (gVar != null && (c = gVar.mo21837c(call)) != null) {
            this.f44800a.mo21804a(new C14891ad(c));
        }
    }

    public final void onCannedTextResponsesLoaded(Call call, List list) {
        CarCall c;
        C14908g gVar = this.f44800a.f44806e;
        if (gVar != null && (c = gVar.mo21837c(call)) != null) {
            this.f44800a.mo21804a(new C14926y(c, list));
        }
    }

    public final void onChildrenChanged(Call call, List list) {
        CarCall c;
        C14908g gVar = this.f44800a.f44806e;
        if (gVar != null && (c = gVar.mo21837c(call)) != null) {
            this.f44800a.mo21804a(new C14892ae(this, c, list));
        }
    }

    public final void onConferenceableCallsChanged(Call call, List list) {
        CarCall c;
        C14908g gVar = this.f44800a.f44806e;
        if (gVar != null && (c = gVar.mo21837c(call)) != null) {
            this.f44800a.mo21804a(new C14889ab(this, c, list));
        }
    }

    public final void onDetailsChanged(Call call, Call.Details details) {
        CarCall c;
        C14908g gVar = this.f44800a.f44806e;
        if (gVar != null && (c = gVar.mo21837c(call)) != null && c.f387936f != null) {
            this.f44800a.mo21804a(new C14925x(c));
        }
    }

    public final void onParentChanged(Call call, Call call2) {
        C14908g gVar = this.f44800a.f44806e;
        if (gVar != null) {
            CarCall c = gVar.mo21837c(call);
            CarCall c2 = this.f44800a.f44806e.mo21837c(call2);
            if (c != null && c2 != null) {
                this.f44800a.mo21804a(new C14888aa(c, c2));
            }
        }
    }

    public final void onPostDialWait(Call call, String str) {
        CarCall c;
        C14908g gVar = this.f44800a.f44806e;
        if (gVar != null && (c = gVar.mo21837c(call)) != null) {
            this.f44800a.mo21804a(new C14890ac(c, str));
        }
    }

    public final void onStateChanged(Call call, int i) {
        CarCall c;
        C14908g gVar = this.f44800a.f44806e;
        if (gVar != null && (c = gVar.mo21837c(call)) != null) {
            this.f44800a.mo21804a(new C14927z(c, i));
        }
    }
}
