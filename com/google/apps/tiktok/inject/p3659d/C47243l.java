package com.google.apps.tiktok.inject.p3659d;

import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.common.base.C58838bb;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.apps.tiktok.inject.d.l */
/* compiled from: PG */
public final class C47243l extends C68324h {
    public C47243l(Fragment fragment) {
        super(fragment);
    }

    /* renamed from: a */
    public static final void m84039a(Fragment fragment, MessageLite messageLite) {
        C68324h.m98669f(fragment);
        Bundle arguments = fragment.getArguments();
        messageLite.getClass();
        ProtoParsers.m95532o(arguments, "TIKTOK_FRAGMENT_ARGUMENT", messageLite);
    }

    /* renamed from: b */
    public static final void m84040b(Fragment fragment, String str) {
        C68324h.m98669f(fragment);
        Bundle arguments = fragment.getArguments();
        str.getClass();
        arguments.putString("TIKTOK_FRAGMENT_ARGUMENT", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo51145d(Fragment fragment) {
        C58838bb.m90867b(fragment.getActivity(), "Fragment %s has no parent Activity -- Did you forget @ActivityAgnosticPeer?", fragment.getClass().getSimpleName());
        C58838bb.m90890y(fragment.getActivity() instanceof C47211g, "TikTok Fragment, %s cannot be attached to a non-TikTok Activity, %s", fragment.getClass().getSimpleName(), fragment.getActivity().getClass().getSimpleName());
    }
}
