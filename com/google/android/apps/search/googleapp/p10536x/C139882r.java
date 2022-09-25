package com.google.android.apps.search.googleapp.p10536x;

import android.content.Context;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.search.googleapp.x.r */
/* compiled from: PG */
public final class C139882r implements C139880p {

    /* renamed from: a */
    private final String f380280a;

    /* renamed from: b */
    private final String f380281b;

    /* renamed from: c */
    private final boolean f380282c;

    /* renamed from: d */
    private final int f380283d;

    /* renamed from: e */
    private final int f380284e;

    /* renamed from: f */
    private final C139874j f380285f;

    public C139882r(Context context, int i, int i2, boolean z, int i3, C139874j jVar) {
        this.f380280a = context.getResources().getString(jVar.f380279k);
        this.f380281b = i != -1 ? context.getResources().getString(i) : BuildConfig.FLAVOR;
        this.f380284e = i2;
        this.f380282c = z;
        this.f380283d = i3;
        this.f380285f = jVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return this.f380283d;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return this.f380284e;
    }

    /* renamed from: c */
    public final C139874j mo112666c() {
        return this.f380285f;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f380281b;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f380280a;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return this.f380282c;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
