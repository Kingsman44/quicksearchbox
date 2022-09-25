package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.c */
/* compiled from: PG */
public final class C90396c {

    /* renamed from: a */
    final CharSequence f252471a;

    /* renamed from: b */
    final CharSequence f252472b;

    /* renamed from: c */
    final CharSequence f252473c;

    /* renamed from: d */
    final CharSequence[] f252474d;

    /* renamed from: e */
    final Set f252475e;

    /* renamed from: f */
    CharSequence f252476f;

    public C90396c(Notification notification) {
        this.f252471a = notification.extras.getCharSequence("android.template");
        this.f252472b = notification.extras.getCharSequence("android.title");
        this.f252473c = notification.extras.getCharSequence("android.text");
        this.f252474d = notification.extras.getCharSequenceArray("android.textLines");
        Bundle bundle = notification.extras;
        HashSet hashSet = new HashSet();
        String[] stringArray = bundle.getStringArray("android.people");
        if (stringArray != null) {
            Collections.addAll(hashSet, stringArray);
        }
        this.f252475e = hashSet;
    }
}
