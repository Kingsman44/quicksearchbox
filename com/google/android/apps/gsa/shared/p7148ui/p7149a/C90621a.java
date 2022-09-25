package com.google.android.apps.gsa.shared.p7148ui.p7149a;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C91070p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.ui.a.a */
/* compiled from: PG */
public final class C90621a {

    /* renamed from: a */
    public String f253402a = "SimpleDialogBuilder";

    /* renamed from: b */
    public String f253403b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f253404c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f253405d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f253406e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public Intent f253407f = null;

    /* renamed from: g */
    private final Context f253408g;

    /* renamed from: h */
    private FragmentManager f253409h;

    /* renamed from: i */
    private C90624d f253410i;

    public C90621a(Context context) {
        this.f253408g = context;
    }

    /* renamed from: a */
    public final void mo84869a() {
        C90624d dVar = this.f253410i;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo84871c() {
        if (this.f253403b.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (this.f253404c.isEmpty()) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else if (this.f253405d.isEmpty()) {
            C58976aa aaVar3 = C58975e.f156826a;
        } else if (this.f253406e.isEmpty()) {
            C58976aa aaVar4 = C58975e.f156826a;
        } else {
            String str = this.f253403b;
            String str2 = this.f253404c;
            String str3 = this.f253405d;
            String str4 = this.f253406e;
            Intent intent = this.f253407f;
            C90624d dVar = new C90624d();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("text", str2);
            bundle.putString("positive_button_text", str3);
            bundle.putString("negative_button_text", str4);
            bundle.putParcelable("positive_button_intent", intent);
            dVar.setArguments(bundle);
            this.f253410i = dVar;
        }
    }

    /* renamed from: b */
    public final void mo84870b() {
        Context context = this.f253408g;
        FragmentManager fragmentManager = this.f253409h;
        if (fragmentManager == null) {
            Activity a = C91070p.m148776a(context);
            if (a != null) {
                fragmentManager = a.getFragmentManager();
                this.f253409h = fragmentManager;
            } else {
                fragmentManager = null;
            }
        }
        if (fragmentManager == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        if (this.f253410i == null) {
            mo84871c();
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(this.f253402a);
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        C90624d dVar = this.f253410i;
        if (dVar != null) {
            dVar.show(beginTransaction, this.f253402a);
        }
    }
}
