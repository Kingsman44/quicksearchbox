package com.google.android.libraries.search.logging.p3041d;

import android.app.Application;
import android.content.Context;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.logging.d.kq */
/* compiled from: PG */
public final class C39142kq {

    /* renamed from: a */
    private static final C59071e f103055a = C59071e.m91332i("com.google.android.libraries.search.logging.d.kq");

    /* renamed from: a */
    public static Application m68561a(Context context) {
        try {
            return (Application) context;
        } catch (ClassCastException e) {
            ((C59052c) ((C59052c) ((C59052c) f103055a.mo56226d()).mo56382g(e)).mo56372aa(53187)).mo56386p("Application Context not convertible to Application for client streamz");
            return null;
        }
    }
}
