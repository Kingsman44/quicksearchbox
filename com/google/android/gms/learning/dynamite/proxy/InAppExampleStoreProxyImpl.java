package com.google.android.gms.learning.dynamite.proxy;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.dynamite.C144655s;
import com.google.android.gms.learning.internal.C144784p;
import com.google.android.gms.learning.internal.C144786r;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.libraries.micore.learning.base.C29711c;
import com.google.android.libraries.micore.learning.p2258a.C29698h;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58889cz;
import com.google.common.p4552o.p4554b.p4555a.C59627g;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.common.p4552o.p4554b.p4555a.C59631k;
import com.google.common.p4552o.p4554b.p4555a.C59632l;
import com.google.common.p4552o.p4554b.p4555a.C59635o;
import com.google.common.p4552o.p4554b.p4555a.C59636p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class InAppExampleStoreProxyImpl extends C144786r {

    /* renamed from: a */
    public Context f391330a;

    /* renamed from: b */
    public C144784p f391331b;

    /* renamed from: c */
    public final Object f391332c = new Object();

    /* renamed from: d */
    public final List f391333d = new ArrayList();

    /* renamed from: e */
    public C58889cz f391334e;

    /* renamed from: f */
    private C29711c f391335f;

    /* renamed from: g */
    private C144827n f391336g;

    /* renamed from: h */
    private C144573b f391337h;

    /* renamed from: i */
    private final IBinder f391338i = new C144651u(this);

    /* renamed from: b */
    private final void m235123b(int i, String str) {
        C144827n nVar = this.f391336g;
        C59627g gVar = (C59627g) C59628h.f159873h.createBuilder();
        C59631k kVar = (C59631k) C59632l.f159887c.createBuilder();
        C59635o oVar = (C59635o) C59636p.f159895c.createBuilder();
        oVar.copyOnWrite();
        C59636p pVar = (C59636p) oVar.instance;
        str.getClass();
        pVar.f159897a |= 1;
        pVar.f159898b = str;
        kVar.copyOnWrite();
        C59632l lVar = (C59632l) kVar.instance;
        C59636p pVar2 = (C59636p) oVar.build();
        pVar2.getClass();
        lVar.f159890b = pVar2;
        lVar.f159889a |= 1;
        gVar.copyOnWrite();
        C59628h hVar = (C59628h) gVar.instance;
        C59632l lVar2 = (C59632l) kVar.build();
        lVar2.getClass();
        hVar.f159880f = lVar2;
        hVar.f159875a |= 4096;
        this.f391336g.mo120052d(8, nVar.mo120048a((C59628h) gVar.build()), (long) C29698h.m54786a(i));
        this.f391336g.mo120049b();
    }

    /* renamed from: a */
    public final void mo120079a(int i, String str) {
        this.f391336g.mo120056h(i);
        if (this.f391337h.mo119975aI()) {
            m235123b(i, str);
        }
    }

    public void init(C144165j jVar, C144784p pVar) {
        Log.d("brella.InAppExStPrxImpl", "onCreate()");
        Context context = (Context) C144166k.m234388a(jVar);
        this.f391330a = context;
        this.f391331b = pVar;
        C31654aj.m58985d(context);
        C144655s.m235152a();
        C29711c b = C29711c.m54796b(this.f391330a.getApplicationContext());
        this.f391335f = b;
        this.f391336g = (C144827n) b.mo34852c(C144827n.class);
        this.f391337h = (C144573b) this.f391335f.mo34852c(C144573b.class);
        this.f391334e = C58274c.f155808a;
    }

    public IBinder onBind(Intent intent) {
        if (Log.isLoggable("brella.InAppExStPrxImpl", 3)) {
            String valueOf = String.valueOf(intent);
            Log.d("brella.InAppExStPrxImpl", "onBind(" + valueOf + ")");
        }
        return this.f391338i;
    }

    public void onDestroy() {
        if (Log.isLoggable("brella.InAppExStPrxImpl", 3)) {
            Log.d("brella.InAppExStPrxImpl", "onDestroy()");
        }
        synchronized (this.f391332c) {
            if (!this.f391333d.isEmpty()) {
                int size = this.f391333d.size();
                Log.w("brella.InAppExStPrxImpl", size + " orphaned iterators, cleaning them up");
                this.f391336g.mo120056h(977);
                if (this.f391337h.mo119975aI()) {
                    for (C144633c cVar : this.f391333d) {
                        m235123b(977, cVar.f391341a);
                    }
                }
            }
            while (!this.f391333d.isEmpty()) {
                ((C144633c) this.f391333d.get(0)).mo120089b(C144631a.f391339a);
            }
        }
        this.f391336g.mo120055g(902);
        C29711c cVar2 = this.f391335f;
        if (cVar2 != null) {
            cVar2.close();
            this.f391335f = null;
        }
    }

    public void onRebind(Intent intent) {
    }

    public void onTrimMemory(int i) {
        if (Log.isLoggable("brella.InAppExStPrxImpl", 3)) {
            Log.d("brella.InAppExStPrxImpl", "onTrimMemory(" + i + ")");
        }
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }
}
