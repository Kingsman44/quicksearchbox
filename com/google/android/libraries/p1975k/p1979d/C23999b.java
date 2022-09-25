package com.google.android.libraries.p1975k.p1979d;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.phenotype.C145748z;
import com.google.android.gms.tasks.C146042v;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.k.d.b */
/* compiled from: PG */
public final /* synthetic */ class C23999b implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ C145748z f65601a;

    /* renamed from: b */
    public final /* synthetic */ String f65602b;

    /* renamed from: c */
    public final /* synthetic */ Executor f65603c;

    public /* synthetic */ C23999b(C145748z zVar, String str, Executor executor) {
        this.f65601a = zVar;
        this.f65602b = str;
        this.f65603c = executor;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        C145748z zVar = this.f65601a;
        String str = this.f65602b;
        Executor executor = this.f65603c;
        Void voidR = (Void) obj;
        boolean z = C24001d.f65605a;
        zVar.mo121902b(str, BuildConfig.FLAVOR).mo122494m(executor, new C23998a(str));
    }
}
