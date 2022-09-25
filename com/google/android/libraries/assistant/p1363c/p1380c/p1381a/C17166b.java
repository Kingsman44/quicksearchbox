package com.google.android.libraries.assistant.p1363c.p1380c.p1381a;

import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import com.google.speech.micro.GoogleEndpointer;
import com.google.speech.micro.GoogleEndpointerData;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.c.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C17166b implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ int f49874a;

    /* renamed from: b */
    public final /* synthetic */ Executor f49875b;

    public /* synthetic */ C17166b(int i, Executor executor) {
        this.f49874a = i;
        this.f49875b = executor;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        int i = this.f49874a;
        Executor executor = this.f49875b;
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        GoogleEndpointerData googleEndpointerData = new GoogleEndpointerData(bArr, i);
        GoogleEndpointer googleEndpointer = new GoogleEndpointer(googleEndpointerData);
        Objects.requireNonNull(googleEndpointer);
        atVar.mo57268a(new C17167c(googleEndpointer), executor);
        return new C17170f(googleEndpointer, googleEndpointerData.idealBufferBytes());
    }
}
