package com.google.android.libraries.web.coordinator.internal.fragment;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.base.WebConfig;
import dagger.hilt.C68286a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.coordinator.internal.fragment.h */
/* compiled from: PG */
public final class C43749h {

    /* renamed from: a */
    public static final C43271v f114109a = C43271v.WEB_VIEW;

    /* renamed from: a */
    public static final WebCoordinatorInfoInternal m77260a(Fragment fragment) {
        C69664n.m101061g(fragment, "<this>");
        return ((C43744c) C68286a.m98629a(C43757p.m77267b(fragment), C43744c.class)).mo46778fR().mo46781a();
    }

    /* renamed from: b */
    public static final void m77261b(Fragment fragment, Class cls) {
        C69664n.m101061g(cls, "configFactory");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("webx-coordinator-confac", cls.getName());
        fragment.setArguments(arguments);
    }

    /* renamed from: c */
    public static final void m77262c(Fragment fragment, WebConfig webConfig) {
        C69664n.m101061g(webConfig, "config");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putParcelable("webx-coordinator-config", webConfig);
        fragment.setArguments(arguments);
    }
}
