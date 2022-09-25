package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4552o.C60492rx;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
abstract class UrlIntentResult implements Parcelable {
    /* renamed from: m */
    public static C139821v m227288m() {
        C139799a aVar = new C139799a();
        aVar.mo115277h(false);
        aVar.mo115278i(false);
        aVar.mo115274e(false);
        aVar.mo115273d(false);
        aVar.f379962c = new Intent();
        aVar.mo115276g(C60492rx.YES_OVERRIDE);
        aVar.mo115272c(false);
        aVar.f379963d = 0;
        aVar.f379961b = BuildConfig.FLAVOR;
        aVar.mo115271b(false);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent mo115252a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C60492rx mo115253b();

    /* renamed from: c */
    public abstract ProtoParsers.ParcelableProto mo115254c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Integer mo115255d();

    /* renamed from: e */
    public abstract String mo115256e();

    /* renamed from: f */
    public abstract boolean mo115258f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo115259g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo115260h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo115262i();

    /* renamed from: j */
    public abstract boolean mo115263j();

    /* renamed from: k */
    public abstract boolean mo115264k();

    /* renamed from: l */
    public abstract int mo115265l();

    /* renamed from: n */
    public final Integer mo115269n() {
        if (mo115259g()) {
            return mo115255d();
        }
        return null;
    }
}
