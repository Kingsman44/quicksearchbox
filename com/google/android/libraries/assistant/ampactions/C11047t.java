package com.google.android.libraries.assistant.ampactions;

import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.assistant.ampactions.t */
/* compiled from: PG */
public final /* synthetic */ class C11047t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11049v f36283a;

    /* renamed from: b */
    public final /* synthetic */ AmpWebView f36284b;

    /* renamed from: c */
    public final /* synthetic */ String f36285c;

    public /* synthetic */ C11047t(C11049v vVar, AmpWebView ampWebView, String str) {
        this.f36283a = vVar;
        this.f36284b = ampWebView;
        this.f36285c = str;
    }

    public final Object apply(Object obj) {
        C11049v vVar = this.f36283a;
        AmpWebView ampWebView = this.f36284b;
        String str = this.f36285c;
        if (((C58833ax) obj).mo56111f() == ampWebView.f36228a) {
            return C58833ax.m90834k(ampWebView);
        }
        vVar.mo19518d(str);
        return C58836b.f156633a;
    }
}
