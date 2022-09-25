package com.google.android.gms.feedback.p10795a;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.feedback.C144198c;
import com.google.android.gms.feedback.C144207l;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.p10810b.C144285a;
import com.google.android.gms.googlehelp.p10810b.C144286b;
import com.google.android.p10905k.C146609h;
import com.google.p4446cc.p4447a.p4448a.C57932b;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.feedback.a.a */
/* compiled from: PG */
public final class C144190a extends C143887ac {

    /* renamed from: a */
    public final Context f390594a;

    public C144190a(Context context, Looper looper, C143849u uVar, C143850v vVar, C143944s sVar) {
        super(context, looper, 29, sVar, uVar, vVar);
        this.f390594a = context;
        C146609h.f395979a = context.getContentResolver();
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        return queryLocalInterface instanceof C144196d ? (C144196d) queryLocalInterface : new C144196d(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C144198c.f390608b;
    }

    /* renamed from: m */
    public final void mo119732m(FeedbackOptions feedbackOptions) {
        String str;
        if (feedbackOptions == null) {
            feedbackOptions = new C144207l(this.f390594a).mo119741a();
        }
        C144285a aVar = (C144285a) C144286b.f390797n.createBuilder();
        String str2 = feedbackOptions.f390570g;
        if (!TextUtils.isEmpty(str2)) {
            aVar.copyOnWrite();
            C144286b bVar = (C144286b) aVar.instance;
            str2.getClass();
            bVar.f390799a |= 2;
            bVar.f390801c = str2;
        } else {
            String packageName = this.f390594a.getApplicationContext().getPackageName();
            aVar.copyOnWrite();
            C144286b bVar2 = (C144286b) aVar.instance;
            packageName.getClass();
            bVar2.f390799a |= 2;
            bVar2.f390801c = packageName;
        }
        try {
            str = this.f390594a.getPackageManager().getPackageInfo(((C144286b) aVar.instance).f390801c, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (str != null) {
            aVar.copyOnWrite();
            C144286b bVar3 = (C144286b) aVar.instance;
            bVar3.f390800b |= 2;
            bVar3.f390808j = str;
        }
        String str3 = feedbackOptions.f390564a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String num = Integer.toString(new Account(str3, "com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
            aVar.copyOnWrite();
            C144286b bVar4 = (C144286b) aVar.instance;
            num.getClass();
            bVar4.f390799a |= 4;
            bVar4.f390802d = num;
        }
        String str4 = feedbackOptions.f390577n;
        if (str4 != null) {
            aVar.copyOnWrite();
            C144286b bVar5 = (C144286b) aVar.instance;
            bVar5.f390799a |= 64;
            bVar5.f390804f = str4;
        }
        aVar.copyOnWrite();
        C144286b bVar6 = (C144286b) aVar.instance;
        bVar6.f390799a |= 16;
        bVar6.f390803e = "feedback.android";
        int i = C143875g.f389988b;
        aVar.copyOnWrite();
        C144286b bVar7 = (C144286b) aVar.instance;
        bVar7.f390799a |= 1073741824;
        bVar7.f390807i = i;
        long currentTimeMillis = System.currentTimeMillis();
        aVar.copyOnWrite();
        C144286b bVar8 = (C144286b) aVar.instance;
        bVar8.f390799a |= 16777216;
        bVar8.f390806h = currentTimeMillis;
        if (!(feedbackOptions.f390576m == null && feedbackOptions.f390569f == null)) {
            aVar.copyOnWrite();
            C144286b bVar9 = (C144286b) aVar.instance;
            bVar9.f390800b |= 16;
            bVar9.f390811m = true;
        }
        Bundle bundle = feedbackOptions.f390565b;
        if (bundle != null && !bundle.isEmpty()) {
            int size = feedbackOptions.f390565b.size();
            aVar.copyOnWrite();
            C144286b bVar10 = (C144286b) aVar.instance;
            bVar10.f390800b |= 4;
            bVar10.f390809k = size;
        }
        List list = feedbackOptions.f390571h;
        if (list != null && !list.isEmpty()) {
            int size2 = feedbackOptions.f390571h.size();
            aVar.copyOnWrite();
            C144286b bVar11 = (C144286b) aVar.instance;
            bVar11.f390800b |= 8;
            bVar11.f390810l = size2;
        }
        C144285a aVar2 = (C144285a) ((C144286b) aVar.build()).toBuilder();
        aVar2.copyOnWrite();
        C144286b bVar12 = (C144286b) aVar2.instance;
        bVar12.f390805g = 164;
        bVar12.f390799a |= 256;
        C144286b bVar13 = (C144286b) aVar2.build();
        Context context = this.f390594a;
        if (bVar13.f390801c.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires appPackageName to be set");
        }
        if (bVar13.f390804f.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires sessionId to be set");
        }
        if (bVar13.f390803e.isEmpty()) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires flow to be set");
        }
        if (bVar13.f390807i <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires clientVersion to be set");
        }
        if (bVar13.f390806h <= 0) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires timestamp to be set");
        }
        int a = C57932b.m88566a(bVar13.f390805g);
        if (a == 0 || a == 1) {
            Log.e("gF_BaseMetricsLogger", "MetricsData requires user action type to be set");
        }
        context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", bVar13.toByteArray()));
    }
}
