package com.google.android.libraries.search.silk.p3162a.p3171i;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.p090a.C1848c;
import androidx.core.content.p090a.C1850e;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.silk.a.i.a */
/* compiled from: PG */
public final /* synthetic */ class C40599a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C40603e f106552a;

    /* renamed from: b */
    public final /* synthetic */ C1848c f106553b;

    public /* synthetic */ C40599a(C40603e eVar, C1848c cVar) {
        this.f106552a = eVar;
        this.f106553b = cVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C40603e eVar = this.f106552a;
        C1848c cVar2 = this.f106553b;
        ((C59052c) ((C59052c) C40603e.f106562a.mo56224b()).mo56372aa(53370)).mo56386p("#install");
        int incrementAndGet = eVar.f106563b.incrementAndGet();
        Intent intent = new Intent("com.google.android.libraries.search.silk.impl.homescreenshortcuts.BROADCAST_SHORTCUT_INSTALLED");
        intent.putExtra("com.google.android.libraries.search.silk.impl.homescreenshortcuts.RESULT_CODE_EXTRA", incrementAndGet);
        intent.setPackage(eVar.f106564c.getPackageName());
        C40602d dVar = new C40602d(eVar, incrementAndGet, cVar);
        cVar.mo5436a(new C40601c(eVar, dVar), eVar.f106565d);
        eVar.f106564c.registerReceiver(dVar, new IntentFilter("com.google.android.libraries.search.silk.impl.homescreenshortcuts.BROADCAST_SHORTCUT_INSTALLED"));
        Context context = eVar.f106564c;
        if (C1850e.m5070c(context, cVar2, PendingIntent.getBroadcast(context, incrementAndGet, intent, 1140850688).getIntentSender())) {
            return "SilkHomescreenShortcutsApiImpl";
        }
        ((C59052c) ((C59052c) C40603e.f106562a.mo56225c()).mo56372aa(53371)).mo56386p("RequestPinShortcut didn't succeed");
        cVar.mo5439d(new RuntimeException("RequestPinShortcut didn't succeed"));
        eVar.mo42543b(dVar);
        return "SilkHomescreenShortcutsApiImpl";
    }
}
