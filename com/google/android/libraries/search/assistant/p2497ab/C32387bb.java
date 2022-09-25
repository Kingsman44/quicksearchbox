package com.google.android.libraries.search.assistant.p2497ab;

import android.provider.CallLog;
import android.provider.Telephony;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.ab.bb */
/* compiled from: PG */
public final /* synthetic */ class C32387bb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32389bd f86810a;

    public /* synthetic */ C32387bb(C32389bd bdVar) {
        this.f86810a = bdVar;
    }

    public final C60870cx apply(Object obj) {
        C32374ap apVar = (C32374ap) obj;
        C32409d dVar = this.f86810a.f86816d;
        Locale locale = Locale.US;
        ArrayList arrayList = new ArrayList();
        Map unmodifiableMap = Collections.unmodifiableMap(apVar.f86794b);
        String str = apVar.f86795c;
        HashMap hashMap = new HashMap();
        for (String str2 : unmodifiableMap.keySet()) {
            for (String put : ((C32365ag) unmodifiableMap.get(str2)).f86764e) {
                hashMap.put(put, str2);
            }
        }
        C32359aa aaVar = (C32359aa) dVar;
        long b = aaVar.f86749g.mo26870b();
        C47633f h = C47633f.m84733g(aaVar.f86750h.mo50872b(CallLog.Calls.CONTENT_URI, C32359aa.f86746d, "date > ?", new String[]{String.valueOf(b - C32359aa.f86744b.toMillis())}, "date DESC").f121591a.mo57272e(C47810es.m84970j(new C32430y(locale, unmodifiableMap, b, hashMap)), aaVar.f86751i).mo57275g()).mo51515h(new C32425t(unmodifiableMap), aaVar.f86751i).mo51515h(new C32426u(unmodifiableMap, str), aaVar.f86751i);
        Map unmodifiableMap2 = Collections.unmodifiableMap(apVar.f86794b);
        String str3 = apVar.f86795c;
        HashMap hashMap2 = new HashMap();
        for (String str4 : unmodifiableMap2.keySet()) {
            for (String put2 : ((C32365ag) unmodifiableMap2.get(str4)).f86764e) {
                hashMap2.put(put2, str4);
            }
        }
        long b2 = aaVar.f86749g.mo26870b();
        String[] strArr = {String.valueOf(b2 - C32359aa.f86744b.toMillis())};
        C47633f h2 = C47633f.m84733g(aaVar.f86750h.mo50872b(Telephony.Sms.CONTENT_URI, C32359aa.f86747e, "date > ?", strArr, "date DESC").f121591a.mo57272e(C47810es.m84970j(new C32431z(locale, unmodifiableMap2, b2, hashMap2)), aaVar.f86751i).mo57275g()).mo51515h(new C32416k(unmodifiableMap2), aaVar.f86751i).mo51515h(new C32417l(unmodifiableMap2, str3), aaVar.f86751i);
        return C47638k.m84751b(h, h2).mo51520a(new C32410e(h, h2, apVar, arrayList), C60826bg.f164896a);
    }
}
