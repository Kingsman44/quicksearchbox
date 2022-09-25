package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6473b;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84144s;
import com.google.android.libraries.componentview.services.application.C20579bf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.b.h */
/* compiled from: PG */
public final class C84080h extends C20579bf {

    /* renamed from: a */
    private static final C59071e f228983a = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.b.h");

    /* renamed from: b */
    private final C84144s f228984b;

    /* renamed from: c */
    private final int f228985c;

    public C84080h(C84144s sVar, int i) {
        this.f228984b = sVar;
        this.f228985c = i;
    }

    /* renamed from: a */
    public final C60870cx mo25516a() {
        try {
            return C60856cj.m92900i(this.f228984b.mo77574b());
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f228983a.mo56225c()).mo56382g(e)).mo56372aa(7028)).mo56386p("Exception executing cross-process fetch.");
            return C60856cj.m92900i("www.google.com");
        }
    }

    /* renamed from: b */
    public final C60870cx mo25517b() {
        try {
            return C60856cj.m92900i(this.f228984b.mo77575c());
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f228983a.mo56225c()).mo56382g(e)).mo56372aa(7029)).mo56386p("Exception executing cross-process fetch.");
            return C60856cj.m92900i("https");
        }
    }

    /* renamed from: c */
    public final C60870cx mo25518c(Uri uri, Map map, boolean z) {
        SettableFuture settableFuture = new SettableFuture();
        try {
            this.f228984b.mo77577g(this.f228985c, new C84079g(settableFuture), uri, z, map);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f228983a.mo56225c()).mo56382g(e)).mo56372aa(7027)).mo56386p("Exception executing cross-process fetch.");
            settableFuture.mo57357o(e);
        }
        return settableFuture;
    }
}
