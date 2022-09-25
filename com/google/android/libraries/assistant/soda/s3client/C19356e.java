package com.google.android.libraries.assistant.soda.s3client;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.ExecutionException;
import org.chromium.net.ExperimentalCronetEngine;

/* renamed from: com.google.android.libraries.assistant.soda.s3client.e */
/* compiled from: PG */
public final class C19356e implements C19353b {

    /* renamed from: a */
    public static final C59071e f54165a = C59071e.m91332i("com.google.android.libraries.assistant.soda.s3client.e");

    /* renamed from: b */
    public final Context f54166b;

    /* renamed from: c */
    private final C46423aj f54167c;

    public C19356e(Context context, C60887da daVar) {
        this.f54166b = context;
        this.f54167c = new C46423aj(new C19355d(this), daVar);
    }

    /* renamed from: a */
    public final ExperimentalCronetEngine mo24492a() {
        try {
            return (ExperimentalCronetEngine) C90877ak.m148472f(this.f54167c.mo50395b());
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
