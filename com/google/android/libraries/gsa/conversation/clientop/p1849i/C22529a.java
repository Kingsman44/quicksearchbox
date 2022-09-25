package com.google.android.libraries.gsa.conversation.clientop.p1849i;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.i.a */
/* compiled from: PG */
public final class C22529a {

    /* renamed from: a */
    public static final C59071e f62134a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.i.a");

    /* renamed from: b */
    public final C68214a f62135b;

    /* renamed from: c */
    public final KeyguardManager f62136c;

    public C22529a(C68214a aVar, Context context) {
        this.f62135b = aVar;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        keyguardManager.getClass();
        this.f62136c = keyguardManager;
    }
}
