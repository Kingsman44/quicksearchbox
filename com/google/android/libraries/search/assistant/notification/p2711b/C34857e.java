package com.google.android.libraries.search.assistant.notification.p2711b;

import android.net.Uri;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1787ad;
import androidx.core.app.C1788ae;
import com.google.android.libraries.search.assistant.notification.data.C34881b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;
import java.util.regex.Matcher;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.e */
/* compiled from: PG */
public final /* synthetic */ class C34857e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C34860h f92443a;

    /* renamed from: b */
    public final /* synthetic */ C1788ae f92444b;

    /* renamed from: c */
    public final /* synthetic */ C1787ad f92445c;

    /* renamed from: d */
    public final /* synthetic */ StatusBarNotification f92446d;

    /* renamed from: e */
    public final /* synthetic */ Optional f92447e;

    public /* synthetic */ C34857e(C34860h hVar, C1788ae aeVar, C1787ad adVar, StatusBarNotification statusBarNotification, Optional optional) {
        this.f92443a = hVar;
        this.f92444b = aeVar;
        this.f92445c = adVar;
        this.f92446d = statusBarNotification;
        this.f92447e = optional;
    }

    public final Object apply(Object obj) {
        C58485gu m;
        C34860h hVar = this.f92443a;
        C1788ae aeVar = this.f92444b;
        C1787ad adVar = this.f92445c;
        StatusBarNotification statusBarNotification = this.f92446d;
        String str = (String) obj;
        String str2 = (String) this.f92447e.get();
        if (adVar.f5568a == null) {
            return Optional.empty();
        }
        C34881b bVar = new C34881b();
        C34866n.m63625f(hVar.f92450b, statusBarNotification, bVar);
        bVar.f92516d = Optional.m71637of(Long.valueOf(adVar.f5569b));
        bVar.f92514b = Optional.m71637of("msg");
        C34866n.m63626g(statusBarNotification.getNotification(), bVar);
        C34866n.m63624e(statusBarNotification.getNotification(), adVar, hVar.f92450b, bVar);
        C34854b a = hVar.f92453e.mo39528a(hVar.f92450b, adVar);
        bVar.f92518f = Optional.m71637of(a.mo39530a());
        bVar.f92519g = Optional.m71637of(a.mo39531b());
        Uri uri = adVar.f5572e;
        if (uri != null) {
            bVar.f92523k = Optional.m71637of(uri);
            if (a.mo39531b().startsWith("audio")) {
                Uri uri2 = adVar.f5572e;
                uri2.getClass();
                bVar.f92513a = Optional.m71637of(uri2);
                long j = adVar.f5569b;
                bVar.f92524l = Optional.m71637of("NotifTemp" + j + ".dat");
            }
        }
        bVar.mo39594f(str);
        if (statusBarNotification.getNotification().getGroup() != null) {
            bVar.f92522j = Optional.m71637of(statusBarNotification.getNotification().getGroup());
        }
        Bundle bundle = statusBarNotification.getNotification().extras;
        byte[] byteArray = bundle.getByteArray("opaque_token");
        if (byteArray != null) {
            bVar.f92521i = Optional.m71637of(byteArray);
        }
        String string = bundle.getString("grouping_key");
        if (string != null) {
            bVar.f92520h = Optional.m71637of(string);
        }
        CharSequence charSequence = aeVar.f5576c;
        if (charSequence == null || !aeVar.mo4996i()) {
            bVar.mo39592d(C58485gu.m89845m());
        } else {
            Iterable g = C58869cf.m90938d(", ").mo56153g(charSequence.toString());
            Iterator it = g.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str2.contains(((String) it.next()).trim())) {
                        m = C58485gu.m89841i(g);
                        break;
                    }
                } else {
                    m = C58485gu.m89845m();
                    break;
                }
            }
            bVar.mo39592d(m);
            Matcher matcher = C34860h.f92449a.matcher(charSequence);
            if (matcher.matches()) {
                String group = matcher.group(1);
                group.getClass();
                charSequence = group.trim();
            }
            bVar.f92517e = Optional.m71637of(charSequence);
        }
        return Optional.m71637of(bVar.mo39589a());
    }
}
