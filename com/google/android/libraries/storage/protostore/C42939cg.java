package com.google.android.libraries.storage.protostore;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.cg */
/* compiled from: PG */
public final class C42939cg implements C43019v {

    /* renamed from: a */
    public final Context f112329a;

    /* renamed from: b */
    public final String f112330b;

    /* renamed from: c */
    public final Set f112331c;

    /* renamed from: d */
    public final boolean f112332d;

    /* renamed from: e */
    public SharedPreferences f112333e;

    /* renamed from: f */
    private final Executor f112334f;

    /* renamed from: g */
    private final C58881cr f112335g;

    /* renamed from: h */
    private final C42935cc f112336h;

    public C42939cg(C42936cd cdVar) {
        this.f112329a = cdVar.f112319a;
        this.f112334f = cdVar.f112320b;
        this.f112330b = cdVar.f112321c;
        this.f112331c = cdVar.f112322d;
        this.f112336h = cdVar.f112326h;
        this.f112332d = cdVar.f112324f;
        this.f112335g = cdVar.f112325g;
    }

    /* renamed from: d */
    public static C42936cd m75826d(Context context, Executor executor) {
        return new C42936cd(context.getApplicationContext(), executor);
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        if (((Boolean) this.f112335g.mo6453a()).booleanValue()) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92904m(new C42933ca(this), this.f112334f);
    }

    /* renamed from: b */
    public final C60870cx mo18055b(MessageLite messageLite) {
        C42935cc ccVar = this.f112336h;
        return C60856cj.m92900i(ccVar.f112318a.mo34548a(new C42938cf(this.f112333e, this.f112331c), messageLite));
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92904m(new C42930bz(this), this.f112334f);
    }
}
