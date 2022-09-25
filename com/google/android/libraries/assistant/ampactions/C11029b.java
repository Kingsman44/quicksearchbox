package com.google.android.libraries.assistant.ampactions;

import android.util.Log;
import com.google.assistant.p3897e.p3921j.acy;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.ampactions.b */
/* compiled from: PG */
public final /* synthetic */ class C11029b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11031d f36237a;

    /* renamed from: b */
    public final /* synthetic */ String f36238b;

    /* renamed from: c */
    public final /* synthetic */ acy f36239c;

    public /* synthetic */ C11029b(C11031d dVar, String str, acy acy) {
        this.f36237a = dVar;
        this.f36238b = str;
        this.f36239c = acy;
    }

    public final C60870cx apply(Object obj) {
        C11031d dVar = this.f36237a;
        String str = this.f36238b;
        acy acy = this.f36239c;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            Log.d("AmpActions", "Found prerendered ampWebView.");
            return C60856cj.m92900i((AmpWebView) axVar.mo56107c());
        }
        Log.d("AmpActions", "Creating new ampWebView as it was not prerendered.");
        return C60922j.m93044g(dVar.f36243a.mo19515a(str), new C11028a(dVar, acy), C60826bg.f164896a);
    }
}
