package com.google.apps.tiktok.tracing.contrib.p3708i.p3709a.p3710a;

import androidx.lifecycle.C2333ah;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C47691a implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C47692b f123643a;

    /* renamed from: b */
    public final /* synthetic */ C2333ah f123644b;

    /* renamed from: c */
    public final /* synthetic */ String f123645c;

    public /* synthetic */ C47691a(C47692b bVar, C2333ah ahVar, String str) {
        this.f123643a = bVar;
        this.f123644b = ahVar;
        this.f123645c = str;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C47692b bVar = this.f123643a;
        C2333ah ahVar = this.f123644b;
        String str = this.f123645c;
        if (C47831fm.m85027v()) {
            ahVar.mo774hX(obj);
            return;
        }
        C47538ax c = bVar.f123646a.mo51613c(str);
        try {
            ahVar.mo774hX(obj);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
