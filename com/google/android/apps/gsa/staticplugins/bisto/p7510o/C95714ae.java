package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124552h;
import com.google.android.p10712d.C142471go;
import com.google.android.p10712d.C142472gp;
import com.google.android.p10712d.C142481gy;
import com.google.android.p10712d.C142482gz;
import com.google.android.p10712d.C142488he;
import com.google.android.p10712d.C142489hf;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.ae */
/* compiled from: PG */
public final /* synthetic */ class C95714ae implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95724ao f267967a;

    /* renamed from: b */
    public final /* synthetic */ Context f267968b;

    /* renamed from: c */
    public final /* synthetic */ C89656k f267969c;

    public /* synthetic */ C95714ae(C95724ao aoVar, Context context, C89656k kVar) {
        this.f267967a = aoVar;
        this.f267968b = context;
        this.f267969c = kVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95724ao aoVar = this.f267967a;
        Context context = this.f267968b;
        C89656k kVar = this.f267969c;
        C124552h hVar = (C124552h) obj;
        String str = aoVar.f267988f;
        ArrayList d = C95795ca.m158755d(context, kVar, C95724ao.m158504m(hVar.mo106530b()));
        if (!d.isEmpty()) {
            C142488he heVar = (C142488he) C142489hf.f386673c.createBuilder();
            C142481gy gyVar = (C142481gy) C142482gz.f386657c.createBuilder();
            gyVar.copyOnWrite();
            str.getClass();
            ((C142482gz) gyVar.instance).f386659a = str;
            String o = C95724ao.m158505o(hVar.mo106529a());
            gyVar.copyOnWrite();
            ((C142482gz) gyVar.instance).f386660b = o;
            heVar.copyOnWrite();
            C142489hf hfVar = (C142489hf) heVar.instance;
            C142482gz gzVar = (C142482gz) gyVar.build();
            gzVar.getClass();
            hfVar.mo117137a();
            hfVar.f386676b.add(gzVar);
            C142489hf hfVar2 = (C142489hf) heVar.build();
            C142471go goVar = (C142471go) C142472gp.f386640c.createBuilder();
            goVar.copyOnWrite();
            C142472gp gpVar = (C142472gp) goVar.instance;
            hfVar2.getClass();
            gpVar.f386643b = hfVar2;
            gpVar.f386642a = 1;
            byte[] byteArray = ((C142472gp) goVar.build()).toByteArray();
            int size = d.size();
            for (int i = 0; i < size; i++) {
                Intent intent = (Intent) d.get(i);
                intent.putExtra("bisto_sdk_payload", byteArray);
                context.sendBroadcast(intent);
            }
        }
    }
}
