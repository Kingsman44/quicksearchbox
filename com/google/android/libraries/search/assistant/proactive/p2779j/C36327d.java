package com.google.android.libraries.search.assistant.proactive.p2779j;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36268g;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36269h;
import com.google.assistant.p3803ag.p3804a.C48800ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.ajz;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.assistant.proactive.j.d */
/* compiled from: PG */
public final class C36327d {

    /* renamed from: a */
    private static final C59071e f94858a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.j.d");

    /* renamed from: a */
    public static PendingIntent m64817a(Context context, List list, byte[] bArr, String str, ajz ajz, C58833ax axVar, String str2, Instant instant, int i, boolean z) {
        C36268g gVar = (C36268g) C36269h.f94733k.createBuilder();
        gVar.mo40075a(list);
        if (axVar.mo56113h()) {
            C48800ah ahVar = (C48800ah) axVar.mo56107c();
            gVar.copyOnWrite();
            C36269h hVar = (C36269h) gVar.instance;
            ahVar.getClass();
            hVar.f94740f = ahVar;
            hVar.f94735a |= 8;
        }
        if (bArr != null) {
            C63088z A = C63088z.m96139A(bArr);
            gVar.copyOnWrite();
            C36269h hVar2 = (C36269h) gVar.instance;
            hVar2.f94735a |= 1;
            hVar2.f94737c = A;
        }
        if (!C58837ba.m90859h(str)) {
            gVar.copyOnWrite();
            C36269h hVar3 = (C36269h) gVar.instance;
            str.getClass();
            hVar3.f94735a |= 2;
            hVar3.f94738d = str;
        }
        if (ajz != null) {
            gVar.copyOnWrite();
            C36269h hVar4 = (C36269h) gVar.instance;
            hVar4.f94739e = ajz;
            hVar4.f94735a |= 4;
        }
        if (!C58837ba.m90859h(str2)) {
            gVar.copyOnWrite();
            C36269h hVar5 = (C36269h) gVar.instance;
            str2.getClass();
            hVar5.f94735a |= 16;
            hVar5.f94741g = str2;
        }
        if (instant.isAfter(Instant.EPOCH)) {
            long epochMilli = instant.toEpochMilli();
            gVar.copyOnWrite();
            C36269h hVar6 = (C36269h) gVar.instance;
            hVar6.f94735a |= 32;
            hVar6.f94742h = epochMilli;
        }
        if (i > 0) {
            gVar.copyOnWrite();
            C36269h hVar7 = (C36269h) gVar.instance;
            hVar7.f94735a |= 64;
            hVar7.f94743i = i;
        }
        gVar.copyOnWrite();
        C36269h hVar8 = (C36269h) gVar.instance;
        hVar8.f94735a |= 128;
        hVar8.f94744j = z;
        Intent className = new Intent().setAction("com.google.android.search.core.action.OPA_PROACTIVE_NOTIFICATION_DISMISSED").setClassName(context, "com.google.android.apps.gsa.search.core.service.SearchService");
        className.putExtra("dismissed-context", ((C36269h) gVar.build()).toByteArray());
        if (className != null) {
            return m64818b(context, className);
        }
        throw new IllegalStateException("The dismiss intent is null.");
    }

    /* renamed from: b */
    public static PendingIntent m64818b(Context context, Intent intent) {
        ((C59052c) ((C59052c) f94858a.mo56224b()).mo56372aa(52335)).mo56389s("createNotificationPendingIntent(Context: %s", intent);
        return C147798a.m240897c(context, 0, intent, 201326592);
    }
}
