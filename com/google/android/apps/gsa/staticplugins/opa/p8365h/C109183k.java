package com.google.android.apps.gsa.staticplugins.opa.p8365h;

import android.content.Intent;
import android.os.Message;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.k */
/* compiled from: PG */
public final /* synthetic */ class C109183k implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C109191s f304006a;

    /* renamed from: b */
    public final /* synthetic */ int f304007b;

    /* renamed from: c */
    public final /* synthetic */ Message f304008c;

    /* renamed from: d */
    public final /* synthetic */ Intent f304009d;

    public /* synthetic */ C109183k(C109191s sVar, int i, Message message, Intent intent) {
        this.f304006a = sVar;
        this.f304007b = i;
        this.f304008c = message;
        this.f304009d = intent;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C109191s sVar = this.f304006a;
        int i = this.f304007b;
        Message message = this.f304008c;
        Intent intent = this.f304009d;
        Map map = sVar.f304030l;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, cVar);
        sVar.f304022d.add(message);
        if (sVar.f304028j == null) {
            sVar.mo97657b();
        } else {
            sVar.mo97659d();
        }
        return String.format(Locale.US, "sendMessage(): received broadcast id:%d with action:%s", new Object[]{valueOf, intent.getAction()});
    }
}
