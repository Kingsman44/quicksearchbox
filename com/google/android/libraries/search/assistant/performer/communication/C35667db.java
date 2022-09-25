package com.google.android.libraries.search.assistant.performer.communication;

import android.text.TextUtils;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.db */
/* compiled from: PG */
public abstract class C35667db {
    /* renamed from: a */
    public abstract C35668dc mo39785a();

    /* renamed from: b */
    public abstract void mo39786b(C58485gu guVar);

    /* renamed from: c */
    public abstract void mo39787c(String str);

    /* renamed from: d */
    public abstract void mo39788d(C58485gu guVar);

    /* renamed from: e */
    public abstract void mo39789e(String str);

    /* renamed from: f */
    public final C35668dc mo39790f() {
        C35668dc a = mo39785a();
        if (!TextUtils.isEmpty(a.mo39793c())) {
            return a;
        }
        throw new IllegalArgumentException("MimeType cannot be empty. Must set a MimeType.");
    }
}
