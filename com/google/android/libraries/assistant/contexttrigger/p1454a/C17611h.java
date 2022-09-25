package com.google.android.libraries.assistant.contexttrigger.p1454a;

import android.content.Context;
import com.google.android.libraries.assistant.contexttrigger.C17603a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.a.h */
/* compiled from: PG */
public final class C17611h implements C17603a {

    /* renamed from: a */
    public static final C59071e f50723a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.a.h");

    /* renamed from: b */
    public final Executor f50724b;

    /* renamed from: c */
    public final Context f50725c;

    /* renamed from: d */
    private final C46175b f50726d;

    /* renamed from: com.google.android.libraries.assistant.contexttrigger.a.h$a */
    /* compiled from: PG */
    public interface C17612a {
        /* renamed from: eu */
        C17613i mo23412eu();
    }

    public C17611h(C46175b bVar, Executor executor, Context context) {
        this.f50726d = bVar;
        this.f50724b = executor;
        this.f50725c = context;
    }

    /* renamed from: a */
    public final C60870cx mo23406a() {
        return C47633f.m84733g(this.f50726d.mo50247d()).mo51516i(new C17607d(this), this.f50724b).mo51515h(C17608e.f50721a, C60826bg.f164896a);
    }
}
