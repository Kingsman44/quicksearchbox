package com.google.android.libraries.assistant.soda.s3client;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5218j.C67113ln;
import java.util.Arrays;
import org.chromium.net.ExperimentalCronetEngine;
import p3186j$.util.Optional;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5523c.C70261e;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5527g.C70835p;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.assistant.soda.s3client.i */
/* compiled from: PG */
public final class C19360i implements SodaTransportFactory {

    /* renamed from: a */
    private static final C59071e f54178a = C59071e.m91332i("com.google.android.libraries.assistant.soda.s3client.i");

    /* renamed from: b */
    private final Context f54179b;

    /* renamed from: c */
    private final Optional f54180c;

    /* renamed from: d */
    private final C19353b f54181d;

    /* renamed from: e */
    private String f54182e;

    /* renamed from: f */
    private C70888j f54183f;

    public C19360i(C19353b bVar, Context context, Optional optional) {
        this.f54179b = context;
        this.f54180c = optional;
        this.f54181d = bVar;
    }

    /* renamed from: a */
    public final C19361j mo24484a(C67113ln lnVar) {
        return new C19358g(mo24499b(lnVar.f182446a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C70888j mo24499b(String str) {
        String str2;
        if (TextUtils.isEmpty(str) && this.f54180c.isPresent()) {
            str = (String) this.f54180c.get();
        }
        if (TextUtils.isEmpty(str)) {
            str = true != TextUtils.equals(this.f54179b.getApplicationInfo().packageName, "com.google.android.googlequicksearchbox") ? null : "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU";
        }
        if (!(this.f54183f == null || (str2 = this.f54182e) == null)) {
            if (str2.equals(str)) {
                return this.f54183f;
            }
        }
        this.f54182e = str;
        ExperimentalCronetEngine a = this.f54181d.mo24492a();
        if (a != null) {
            Context context = this.f54179b;
            C70261e b = C70261e.m102411b("speechs3proto2-pa.googleapis.com", 443, a);
            C70334de a2 = C19352a.m36858a(context, str);
            if (a2 != null) {
                b.f187275c.mo62292g(Arrays.asList(new C70899n[]{new C70879r(a2)}));
            }
            this.f54183f = b.f187275c.mo57963c();
        } else {
            ((C59052c) ((C59052c) f54178a.mo56226d()).mo56372aa(47747)).mo56386p("Falling back to OkHttp.");
            Context context2 = this.f54179b;
            C70835p pVar = new C70835p(C70460dv.m102876d("speechs3proto2-pa.googleapis.com", 443));
            C70334de a3 = C19352a.m36858a(context2, str);
            if (a3 != null) {
                pVar.f188921c.mo62292g(Arrays.asList(new C70899n[]{new C70879r(a3)}));
            }
            this.f54183f = pVar.f188921c.mo57963c();
        }
        return this.f54183f;
    }
}
