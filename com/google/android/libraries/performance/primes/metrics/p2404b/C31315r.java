package com.google.android.libraries.performance.primes.metrics.p2404b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import com.google.android.libraries.flashmanagement.p1732a.C21386a;
import com.google.android.libraries.performance.primes.p2399d.C31230a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.r */
/* compiled from: PG */
public final class C31315r {

    /* renamed from: a */
    public final Context f84326a;

    /* renamed from: b */
    public final String f84327b;

    /* renamed from: c */
    public final String f84328c;

    /* renamed from: d */
    public final String f84329d;

    /* renamed from: e */
    public final C21386a f84330e;

    /* renamed from: f */
    public final C58881cr f84331f;

    /* renamed from: g */
    public final C58881cr f84332g;

    /* renamed from: h */
    public final int f84333h;

    public C31315r(Context context, C58833ax axVar, String str) {
        int i;
        this.f84326a = context;
        this.f84327b = context.getPackageName();
        boolean z = C31230a.f84140a;
        String packageName = context.getPackageName();
        String b = C31230a.m58230b(Process.myPid());
        C58881cr crVar = null;
        if (!(b == null || packageName == null || !b.startsWith(packageName))) {
            int length = packageName.length();
            b = b.length() == length ? null : b.substring(length + 1);
        }
        this.f84328c = b;
        this.f84332g = axVar.mo56113h() ? ((C31300c) axVar.mo56107c()).mo37018a() : crVar;
        this.f84329d = str;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 3;
        } else {
            i = packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        }
        this.f84333h = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : i;
        this.f84330e = new C21386a(context);
        this.f84331f = C58886cw.m90973a(new C31314q(this));
    }
}
