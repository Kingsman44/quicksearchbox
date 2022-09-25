package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.j */
/* compiled from: PG */
public abstract class C78071j {

    /* renamed from: a */
    private static final Duration f215056a = Duration.ofSeconds(10);

    /* renamed from: d */
    public static C78070i m125368d() {
        C78038ak akVar = new C78038ak();
        akVar.f214957b = true;
        akVar.f214962g = (byte) (akVar.f214962g | 4);
        akVar.mo73008d(false);
        akVar.mo73007c();
        akVar.f214958c = f215056a;
        akVar.f214963h = 1;
        C58485gu m = C58485gu.m89845m();
        if (m != null) {
            akVar.f214961f = m;
            return akVar;
        }
        throw new NullPointerException("Null suggestions");
    }

    /* renamed from: a */
    public abstract Uri mo73009a();

    /* renamed from: b */
    public abstract Fragment mo73010b();

    /* renamed from: c */
    public abstract View mo73011c();

    /* renamed from: e */
    public abstract C58485gu mo73012e();

    /* renamed from: f */
    public abstract Duration mo73014f();

    /* renamed from: g */
    public abstract CharSequence mo73015g();

    /* renamed from: h */
    public abstract Runnable mo73016h();

    /* renamed from: i */
    public abstract String mo73018i();

    /* renamed from: j */
    public abstract boolean mo73019j();

    /* renamed from: k */
    public abstract boolean mo73020k();

    /* renamed from: l */
    public abstract boolean mo73021l();

    /* renamed from: m */
    public abstract int mo73022m();
}
