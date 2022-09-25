package com.google.android.apps.gsa.nga.engine.p5897ae;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.engine.recognition.C77552ae;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ae.q */
/* compiled from: PG */
public abstract class C74801q {
    /* renamed from: a */
    public abstract Bundle mo71183a();

    /* renamed from: b */
    public abstract ac mo71184b();

    /* renamed from: c */
    public abstract QueryTriggerType mo71185c();

    /* renamed from: d */
    public abstract C58485gu mo71186d();

    /* renamed from: e */
    public abstract Optional mo71187e();

    /* renamed from: f */
    public abstract Optional mo71188f();

    /* renamed from: g */
    public abstract Optional mo71189g();

    /* renamed from: h */
    public abstract Optional mo71190h();

    /* renamed from: i */
    public abstract String mo71191i();

    /* renamed from: j */
    public abstract String mo71192j();

    /* renamed from: k */
    public abstract boolean mo71193k();

    /* renamed from: l */
    public abstract boolean mo71194l();

    /* renamed from: m */
    public abstract boolean mo71195m();

    /* renamed from: n */
    public abstract boolean mo71196n();

    /* renamed from: o */
    public final String mo71197o() {
        return mo71186d().isEmpty() ? BuildConfig.FLAVOR : ((C77552ae) mo71186d().get(0)).mo72618h();
    }
}
