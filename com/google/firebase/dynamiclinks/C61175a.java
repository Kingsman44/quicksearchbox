package com.google.firebase.dynamiclinks;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.C146006ab;
import com.google.firebase.C61204g;
import com.google.firebase.dynamiclinks.internal.C61185h;
import com.google.firebase.dynamiclinks.internal.C61186i;

/* renamed from: com.google.firebase.dynamiclinks.a */
/* compiled from: PG */
public final class C61175a {

    /* renamed from: a */
    public final Bundle f165515a;

    /* renamed from: b */
    public final Bundle f165516b;

    /* renamed from: c */
    private final C61186i f165517c;

    public C61175a(C61186i iVar) {
        this.f165517c = iVar;
        Bundle bundle = new Bundle();
        this.f165515a = bundle;
        C61204g gVar = iVar.f165536b;
        gVar.mo57770f();
        bundle.putString("apiKey", gVar.f165557e.f165713a);
        Bundle bundle2 = new Bundle();
        this.f165516b = bundle2;
        bundle.putBundle("parameters", bundle2);
    }

    /* renamed from: a */
    public final C146006ab mo57735a() {
        if (this.f165515a.getString("apiKey") != null) {
            this.f165515a.putInt("suffix", 2);
            C61186i iVar = this.f165517c;
            Bundle bundle = this.f165515a;
            C61186i.m93559d(bundle);
            return iVar.f165535a.mo119290u(1, new C61185h(bundle));
        }
        throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
    }

    /* renamed from: b */
    public final void mo57736b(Uri uri) {
        this.f165516b.putParcelable("link", uri);
    }
}
