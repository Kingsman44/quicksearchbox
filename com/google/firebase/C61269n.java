package com.google.firebase;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143924bm;
import com.google.android.gms.common.util.C144015o;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.firebase.n */
/* compiled from: PG */
public final class C61269n {

    /* renamed from: a */
    public final String f165713a;

    /* renamed from: b */
    public final String f165714b;

    /* renamed from: c */
    public final String f165715c;

    /* renamed from: d */
    public final String f165716d;

    /* renamed from: e */
    private final String f165717e;

    /* renamed from: f */
    private final String f165718f;

    /* renamed from: g */
    private final String f165719g;

    public C61269n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C143919bh.m233967j(!C144015o.m234195a(str), "ApplicationId must be set.");
        this.f165714b = str;
        this.f165713a = str2;
        this.f165717e = str3;
        this.f165718f = str4;
        this.f165715c = str5;
        this.f165719g = str6;
        this.f165716d = str7;
    }

    /* renamed from: a */
    public static C61269n m93754a(Context context) {
        C143919bh.m233958a(context);
        Resources resources = context.getResources();
        String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String a = C143924bm.m233974a("google_app_id", resources, resourcePackageName);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C61269n(a, C143924bm.m233974a("google_api_key", resources, resourcePackageName), C143924bm.m233974a("firebase_database_url", resources, resourcePackageName), C143924bm.m233974a("ga_trackingId", resources, resourcePackageName), C143924bm.m233974a("gcm_defaultSenderId", resources, resourcePackageName), C143924bm.m233974a("google_storage_bucket", resources, resourcePackageName), C143924bm.m233974a("project_id", resources, resourcePackageName));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C61269n)) {
            return false;
        }
        C61269n nVar = (C61269n) obj;
        if (!C143912ba.m233950b(this.f165714b, nVar.f165714b) || !C143912ba.m233950b(this.f165713a, nVar.f165713a) || !C143912ba.m233950b(this.f165717e, nVar.f165717e) || !C143912ba.m233950b(this.f165718f, nVar.f165718f) || !C143912ba.m233950b(this.f165715c, nVar.f165715c) || !C143912ba.m233950b(this.f165719g, nVar.f165719g) || !C143912ba.m233950b(this.f165716d, nVar.f165716d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f165714b, this.f165713a, this.f165717e, this.f165718f, this.f165715c, this.f165719g, this.f165716d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("applicationId", this.f165714b, arrayList);
        C143910az.m233947b("apiKey", this.f165713a, arrayList);
        C143910az.m233947b("databaseUrl", this.f165717e, arrayList);
        C143910az.m233947b("gcmSenderId", this.f165715c, arrayList);
        C143910az.m233947b("storageBucket", this.f165719g, arrayList);
        C143910az.m233947b("projectId", this.f165716d, arrayList);
        return C143910az.m233946a(arrayList, this);
    }
}
