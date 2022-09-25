package com.google.android.libraries.search.assistant.notification.data.p2713a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.common.p4522b.C58557jl;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.a.g */
/* compiled from: PG */
public final class C34879g {
    /* renamed from: a */
    public static Optional m63707a(BundledMessageNotification bundledMessageNotification) {
        Optional c = m63709c(bundledMessageNotification);
        return c.isPresent() ? ((MessageNotification) c.get()).mo39544c() : Optional.empty();
    }

    /* renamed from: b */
    public static Optional m63708b(BundledMessageNotification bundledMessageNotification) {
        Optional c = m63709c(bundledMessageNotification);
        if (c.isPresent()) {
            return ((MessageNotification) c.get()).mo39554k();
        }
        return Optional.empty();
    }

    /* renamed from: c */
    public static Optional m63709c(BundledMessageNotification bundledMessageNotification) {
        return Optional.ofNullable((MessageNotification) C58557jl.m90132m(bundledMessageNotification.mo39538a(), (Object) null));
    }

    /* renamed from: d */
    public static String m63710d(BundledMessageNotification bundledMessageNotification) {
        Optional c = m63709c(bundledMessageNotification);
        return c.isPresent() ? ((MessageNotification) c.get()).mo39563t() : BuildConfig.FLAVOR;
    }

    /* renamed from: e */
    public static String m63711e(BundledMessageNotification bundledMessageNotification) {
        return (String) Collection.EL.stream(bundledMessageNotification.mo39538a()).filter(C34873a.f92507a).map(C34874b.f92508a).reduce(BuildConfig.FLAVOR, C34875c.f92509a);
    }
}
