package com.google.android.libraries.elements.p1726e;

import android.content.Context;
import android.provider.Settings;
import com.google.android.libraries.elements.interfaces.C21280bw;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.e.c */
/* compiled from: PG */
public final /* synthetic */ class C21140c implements C21280bw {

    /* renamed from: a */
    public final /* synthetic */ String f59295a;

    /* renamed from: b */
    public final /* synthetic */ Context f59296b;

    /* renamed from: c */
    public final /* synthetic */ C69464a f59297c;

    public /* synthetic */ C21140c(String str, Context context, C69464a aVar) {
        this.f59295a = str;
        this.f59296b = context;
        this.f59297c = aVar;
    }

    /* renamed from: a */
    public final Object mo26022a() {
        String str = this.f59295a;
        Context context = this.f59296b;
        return DebuggerClient.create(str, String.valueOf(Settings.Secure.getString(context.getContentResolver(), "android_id")).concat(String.valueOf(context.getPackageName())), "Android - ".concat(String.valueOf(String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager())))), (DebuggerCallback) this.f59297c.mo17428b());
    }
}
