package com.google.android.libraries.search.assistant.invocation.android.parcelables;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.AssistStateCompat;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61540d;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61545i;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.parcelables.a */
/* compiled from: PG */
public final class C33487a {

    /* renamed from: a */
    public static final C61541e f89616a;

    /* renamed from: b */
    public static final C61541e f89617b;

    /* renamed from: c */
    public static final C61541e f89618c;

    /* renamed from: d */
    public static final C61541e f89619d;

    /* renamed from: e */
    public static final C61541e f89620e;

    /* renamed from: f */
    public static final C61545i f89621f;

    static {
        C61541e a = C61540d.m94272a("Bundle", Bundle.CREATOR);
        f89616a = a;
        C61541e a2 = C61540d.m94272a("Bitmap", Bitmap.CREATOR);
        f89617b = a2;
        C61541e a3 = C61540d.m94272a("AssistState", AssistStateCompat.CREATOR);
        f89618c = a3;
        C61541e a4 = C61540d.m94272a("Intent", Intent.CREATOR);
        f89619d = a4;
        C61541e a5 = C61540d.m94272a("IBinderContainer", IBinderContainer.CREATOR);
        f89620e = a5;
        f89621f = new C61545i(a3, a2, a, a4, a5);
    }
}
