package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22869e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.v */
/* compiled from: PG */
public final /* synthetic */ class C95129v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95130w f266144a;

    /* renamed from: b */
    public final /* synthetic */ C89496ch f266145b;

    /* renamed from: c */
    public final /* synthetic */ Context f266146c;

    public /* synthetic */ C95129v(C95130w wVar, C89496ch chVar, Context context) {
        this.f266144a = wVar;
        this.f266145b = chVar;
        this.f266146c = context;
    }

    public final void run() {
        String str;
        C95130w wVar = this.f266144a;
        C89496ch chVar = this.f266145b;
        Context context = this.f266146c;
        C124548d b = chVar.mo83401b(wVar.f266152f);
        if (b != null) {
            String M = b.mo106472M();
            C124721s l = b.mo106514l();
            if (C124721s.BAYWOLF.equals(l)) {
                str = "baywolf";
            } else if (C124721s.APOLLO.equals(l)) {
                str = "Apollo";
            } else if ((!C124721s.GENERIC_SCALED.equals(l) && !C124721s.WIRED.equals(l)) || (str = b.mo106481V()) == null) {
                str = "unknown";
            }
            wVar.f266148b.set(C95130w.m157242d(context, M, str, b.mo106513k(), (String) null));
            wVar.f266149c.set(str);
            boolean z = true;
            wVar.f266150d.set(C124719q.CAR_ACCESSORY == b.mo106513k());
            AtomicBoolean atomicBoolean = wVar.f266151e;
            if (C124719q.HEADPHONES != b.mo106513k()) {
                z = false;
            }
            atomicBoolean.set(z);
        }
    }
}
