package com.google.android.apps.gsa.staticplugins.opa.util;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.apps.gsa.search.shared.p6930h.C87558a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.a */
/* compiled from: PG */
public final /* synthetic */ class C113745a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113784b f314997a;

    /* renamed from: b */
    public final /* synthetic */ int f314998b;

    /* renamed from: c */
    public final /* synthetic */ String[] f314999c;

    /* renamed from: d */
    public final /* synthetic */ Activity f315000d;

    /* renamed from: e */
    public final /* synthetic */ C87558a f315001e;

    public /* synthetic */ C113745a(C113784b bVar, int i, String[] strArr, Activity activity, C87558a aVar) {
        this.f314997a = bVar;
        this.f314998b = i;
        this.f314999c = strArr;
        this.f315000d = activity;
        this.f315001e = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f314997a.mo100623c(this.f314998b, this.f314999c, this.f315000d, this.f315001e, dialogInterface, i);
    }
}
