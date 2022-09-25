package com.google.android.libraries.gsa.p1859d.p1860a;

import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.d.a.m */
/* compiled from: PG */
final class C22742m extends C22731b {

    /* renamed from: a */
    final /* synthetic */ C22744o f62569a;

    /* renamed from: b */
    private long f62570b = -1;

    /* renamed from: c */
    private final List f62571c = new ArrayList();

    /* renamed from: d */
    private final C22739j f62572d;

    public C22742m(C22744o oVar, C22739j jVar) {
        this.f62569a = oVar;
        this.f62572d = jVar;
    }

    /* renamed from: a */
    public final void mo27883a(long j, RemoteViews remoteViews, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("extra_remoteviews", remoteViews);
        mo27884b(j, bundle3, bundle, bundle2);
    }

    /* renamed from: b */
    public final void mo27884b(long j, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        Log.d("PomoConnector", "Responding request " + j + ": addContent.");
        if (j != this.f62570b) {
            Log.w("PomoConnector", "Request id changed in addContent().");
            mo27888e(new Exception("Request id changed in addContent()."));
        } else if (bundle == null || bundle2 == null || bundle3 == null) {
            Log.w("PomoConnector", "Received null arguments when adding content.");
            mo27888e(new Exception("Received null arguments when adding content."));
        } else {
            this.f62571c.add(new C22740k(bundle, bundle2, bundle3));
        }
    }

    /* renamed from: c */
    public final void mo27885c(long j) {
        Log.d("PomoConnector", "Responding request " + j + ": endContent.");
        if (j != this.f62570b) {
            Log.w("PomoConnector", "Request id changed in endContent().");
            mo27888e(new Exception("Request id changed in endContent()."));
            return;
        }
        Log.d("PomoConnector", "Request " + j + " is completed. Received " + this.f62571c.size() + " contents.");
        synchronized (this.f62569a.f62573a) {
            C22739j jVar = this.f62572d;
            C22744o oVar = this.f62569a;
            if (jVar == oVar.f62575c) {
                oVar.mo27891c();
                C22739j jVar2 = this.f62572d;
                jVar2.f62564d.mo57356n(C58485gu.m89842j(this.f62571c));
                this.f62569a.mo27892d();
            }
        }
    }

    /* renamed from: d */
    public final void mo27886d(long j) {
        Log.d("PomoConnector", "Responding request " + j + ": startContent.");
        if (j != this.f62570b) {
            this.f62570b = j;
            this.f62571c.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo27888e(Exception exc) {
        synchronized (this.f62569a.f62573a) {
            C22739j jVar = this.f62572d;
            C22744o oVar = this.f62569a;
            if (jVar == oVar.f62575c) {
                oVar.mo27891c();
                this.f62572d.f62564d.mo57357o(exc);
                this.f62569a.mo27892d();
            }
        }
    }
}
