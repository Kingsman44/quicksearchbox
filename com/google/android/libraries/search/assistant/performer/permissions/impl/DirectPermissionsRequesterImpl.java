package com.google.android.libraries.search.assistant.performer.permissions.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* compiled from: PG */
public final class DirectPermissionsRequesterImpl implements C36197b {

    /* renamed from: a */
    public static final C59071e f94562a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.permissions.impl.DirectPermissionsRequesterImpl");

    /* renamed from: d */
    private static final Duration f94563d = Duration.ofSeconds(30);

    /* renamed from: b */
    public final Context f94564b;

    /* renamed from: c */
    public final C46428ao f94565c;

    /* renamed from: e */
    private final C60888db f94566e;

    /* compiled from: PG */
    final class PermissionsCallback extends ResultReceiver {

        /* renamed from: a */
        private final Consumer f94567a;

        public PermissionsCallback(C46428ao aoVar, Consumer consumer) {
            super(aoVar);
            this.f94567a = consumer;
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            int[] intArray = bundle.getIntArray("permissions-grants");
            if (intArray != null && intArray.length == 1 && intArray[0] == 0) {
                ((C59052c) ((C59052c) DirectPermissionsRequesterImpl.f94562a.mo56224b()).mo56372aa(52182)).mo56386p("Call phone permission is granted.");
                this.f94567a.accept(true);
                return;
            }
            ((C59052c) ((C59052c) DirectPermissionsRequesterImpl.f94562a.mo56224b()).mo56372aa(52181)).mo56386p("Call phone permission is rejected.");
            this.f94567a.accept(false);
        }
    }

    public DirectPermissionsRequesterImpl(Context context, C60888db dbVar, C46428ao aoVar) {
        this.f94564b = context;
        this.f94566e = dbVar;
        this.f94565c = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo20788a(C35470f fVar, String[] strArr) {
        return C60856cj.m92908q(C2169h.m6027a(new C36198a(this, fVar, strArr)), f94563d.getSeconds(), TimeUnit.SECONDS, this.f94566e);
    }
}
