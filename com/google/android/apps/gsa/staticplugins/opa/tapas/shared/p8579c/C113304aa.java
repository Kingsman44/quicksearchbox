package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import android.content.ContentResolver;
import android.content.Context;
import androidx.core.content.C1882h;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.aa */
/* compiled from: PG */
public final class C113304aa {

    /* renamed from: a */
    public static final String[] f313789a = {"display_name", "display_name_alt", "phonetic_name"};

    /* renamed from: b */
    static final String[] f313790b = {"_id", "display_name", "display_name_alt", "phonetic_name"};

    /* renamed from: c */
    public static final String[] f313791c = {"display_name", "data1", "starred", "custom_ringtone"};

    /* renamed from: d */
    public final C22871g f313792d;

    /* renamed from: e */
    public final ContentResolver f313793e;

    /* renamed from: f */
    private final Context f313794f;

    public C113304aa(C22871g gVar, Context context, ContentResolver contentResolver) {
        this.f313792d = gVar;
        this.f313794f = context;
        this.f313793e = contentResolver;
    }

    /* renamed from: a */
    public final boolean mo100108a() {
        return C1882h.m5137c(this.f313794f, "android.permission.READ_CONTACTS") == 0;
    }
}
