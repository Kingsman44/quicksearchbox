package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6473b;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84125ae;
import com.google.android.libraries.componentview.services.application.C20611ck;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.b.x */
/* compiled from: PG */
public final class C84096x implements C20611ck {

    /* renamed from: a */
    private static final C59071e f229008a = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.b.x");

    /* renamed from: b */
    private final C84125ae f229009b;

    public C84096x(C84125ae aeVar) {
        this.f229009b = aeVar;
    }

    /* renamed from: a */
    public final Intent mo25492a(String str, String str2, int i, String str3, String str4) {
        try {
            return this.f229009b.mo77553a(str, str2, i, str3, str4);
        } catch (RemoteException unused) {
            ((C59052c) ((C59052c) f229008a.mo56225c()).mo56372aa(7044)).mo56386p("RemoteException while handling image viewer createIntent");
            return null;
        }
    }
}
