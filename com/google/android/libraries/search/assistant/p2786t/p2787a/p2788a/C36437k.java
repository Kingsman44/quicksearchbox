package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1806aw;
import androidx.core.app.C1811ba;
import androidx.core.app.C1832s;
import com.google.android.libraries.search.assistant.notification.p2712c.C34867a;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2791a.C36469c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Arrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C36437k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36447u f95138a;

    /* renamed from: b */
    public final /* synthetic */ String f95139b;

    /* renamed from: c */
    public final /* synthetic */ Optional f95140c;

    /* renamed from: d */
    public final /* synthetic */ String f95141d;

    public /* synthetic */ C36437k(C36447u uVar, String str, Optional optional, String str2) {
        this.f95138a = uVar;
        this.f95139b = str;
        this.f95140c = optional;
        this.f95141d = str2;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C36447u uVar = this.f95138a;
        String str = this.f95139b;
        Optional optional2 = this.f95140c;
        String str2 = this.f95141d;
        Optional optional3 = (Optional) obj;
        if (optional3.isEmpty()) {
            return C60856cj.m92899h(new IllegalStateException("No active notification found with key: ".concat(String.valueOf(str))));
        }
        Notification notification = ((StatusBarNotification) optional3.get()).getNotification();
        if (optional2.isPresent()) {
            optional = uVar.f95166f.mo40176b(notification);
        } else {
            optional = Optional.ofNullable((C1832s) C34867a.m63629a(notification).orElse(null));
        }
        if (optional.isEmpty()) {
            return C60856cj.m92899h(new IllegalStateException(str2.concat(" Action not found")));
        }
        C1832s sVar = (C1832s) optional.get();
        if (!optional2.isPresent()) {
            return uVar.f95166f.mo40175a(sVar.f5662i, (Intent) null);
        }
        C36469c cVar = uVar.f95166f;
        String str3 = (String) optional2.get();
        C1811ba[] baVarArr = sVar.f5655b;
        if (baVarArr == null) {
            return C60856cj.m92899h(new IllegalArgumentException("No RemoteInputs found"));
        }
        C1811ba[] baVarArr2 = baVarArr;
        Bundle bundle = new Bundle();
        for (C1811ba baVar : Arrays.asList(baVarArr2)) {
            if (baVar.f5639d) {
                bundle.putCharSequence(baVar.f5636a, str3);
            }
        }
        if (bundle.isEmpty()) {
            return C60856cj.m92899h(new IllegalArgumentException("No patching RemoteInput found"));
        }
        Intent intent = new Intent();
        C1806aw.m4969c(C1811ba.m4980a(baVarArr2), intent, bundle);
        return cVar.mo40175a(sVar.f5662i, intent);
    }
}
