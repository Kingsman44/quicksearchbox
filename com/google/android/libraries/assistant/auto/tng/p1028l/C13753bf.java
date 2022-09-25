package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.bf */
/* compiled from: PG */
public abstract class C13753bf {
    /* renamed from: a */
    public abstract C58817ah mo21239a();

    /* renamed from: b */
    public abstract C60870cx mo21240b();

    /* renamed from: c */
    public abstract C60870cx mo21241c();

    /* renamed from: d */
    public abstract Optional mo21242d();

    /* renamed from: e */
    public final C60870cx mo21248e() {
        return (C60870cx) mo21239a().apply((Object) null);
    }

    /* renamed from: f */
    public final C60870cx mo21249f() {
        if (mo21242d().isPresent()) {
            return (C60870cx) ((C58817ah) mo21242d().get()).apply((Object) null);
        }
        return C60866ct.f164955a;
    }
}
