package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.api.internal.C145198g;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.hv */
/* compiled from: PG */
final class C145431hv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f393195a;

    /* renamed from: b */
    final /* synthetic */ String f393196b;

    /* renamed from: c */
    final /* synthetic */ AppMetadata f393197c;

    /* renamed from: d */
    final /* synthetic */ boolean f393198d;

    /* renamed from: e */
    final /* synthetic */ C145198g f393199e;

    /* renamed from: f */
    final /* synthetic */ C145456it f393200f;

    public C145431hv(C145456it itVar, String str, String str2, AppMetadata appMetadata, boolean z, C145198g gVar) {
        this.f393200f = itVar;
        this.f393195a = str;
        this.f393196b = str2;
        this.f393197c = appMetadata;
        this.f393198d = z;
        this.f393199e = gVar;
    }

    public final void run() {
        Throwable th;
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            C145456it itVar = this.f393200f;
            C145316do doVar = itVar.f393272c;
            if (doVar == null) {
                itVar.f393011w.mo120965ar().f392795c.mo120896c("Failed to get user properties; not connected to service", this.f393195a, this.f393196b);
                this.f393200f.f393011w.mo120977o().mo121257N(this.f393199e, bundle2);
                return;
            }
            C143919bh.m233958a(this.f393197c);
            List<UserAttributeParcel> i = doVar.mo120859i(this.f393195a, this.f393196b, this.f393198d, this.f393197c);
            bundle = new Bundle();
            if (i != null) {
                for (UserAttributeParcel userAttributeParcel : i) {
                    String str = userAttributeParcel.f392544e;
                    if (str != null) {
                        bundle.putString(userAttributeParcel.f392541b, str);
                    } else {
                        Long l = userAttributeParcel.f392543d;
                        if (l != null) {
                            bundle.putLong(userAttributeParcel.f392541b, l.longValue());
                        } else {
                            Double d = userAttributeParcel.f392546g;
                            if (d != null) {
                                bundle.putDouble(userAttributeParcel.f392541b, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                this.f393200f.mo121158n();
                this.f393200f.f393011w.mo120977o().mo121257N(this.f393199e, bundle);
            } catch (RemoteException e2) {
                e = e2;
                try {
                    this.f393200f.f393011w.mo120965ar().f392795c.mo120896c("Failed to get user properties; remote exception", this.f393195a, e);
                    this.f393200f.f393011w.mo120977o().mo121257N(this.f393199e, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.f393200f.f393011w.mo120977o().mo121257N(this.f393199e, bundle2);
                    throw th;
                }
            }
        } catch (RemoteException e3) {
            bundle = bundle2;
            e = e3;
            this.f393200f.f393011w.mo120965ar().f392795c.mo120896c("Failed to get user properties; remote exception", this.f393195a, e);
            this.f393200f.f393011w.mo120977o().mo121257N(this.f393199e, bundle);
        } catch (Throwable th3) {
            th = th3;
            this.f393200f.f393011w.mo120977o().mo121257N(this.f393199e, bundle2);
            throw th;
        }
    }
}
