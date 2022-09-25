package com.google.android.apps.gsa.nga.engine.warmactions.p6257i;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.speech.p5218j.C67111ll;
import com.google.speech.p5218j.p5219a.C66752s;
import java.io.InputStream;
import java.io.OutputStream;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.i.d */
/* compiled from: PG */
public final /* synthetic */ class C79621d implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79630m f218422a;

    /* renamed from: b */
    public final /* synthetic */ C67111ll f218423b;

    /* renamed from: c */
    public final /* synthetic */ C66752s f218424c;

    public /* synthetic */ C79621d(C79630m mVar, C67111ll llVar, C66752s sVar) {
        this.f218422a = mVar;
        this.f218423b = llVar;
        this.f218424c = sVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C79630m mVar = this.f218422a;
        C67111ll llVar = this.f218423b;
        C66752s sVar = this.f218424c;
        Soda soda = (Soda) obj;
        if (!mVar.f218441l.isEmpty()) {
            soda.mo24353t();
            soda.nativeUpdateRuntime(soda.f53871d, llVar.toByteArray());
            if (soda.f53870c.get()) {
                soda.mo24349p();
            }
            return soda.mo24326c(sVar, (InputStream) mVar.f218441l.get(), C58836b.f156633a, C58833ax.m90833j((OutputStream) mVar.f218435f.flatMap(new C79627j()).orElse(null)));
        }
        throw new IllegalStateException("Cannot start capture without an open mic");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
