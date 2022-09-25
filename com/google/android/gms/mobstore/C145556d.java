package com.google.android.gms.mobstore;

import android.net.Uri;
import com.google.android.gms.tasks.C146021aq;
import com.google.common.base.C58885cv;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.mobstore.d */
/* compiled from: PG */
public final /* synthetic */ class C145556d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C145559g f393595a;

    /* renamed from: b */
    public final /* synthetic */ Uri f393596b;

    /* renamed from: c */
    public final /* synthetic */ int f393597c;

    public /* synthetic */ C145556d(C145559g gVar, Uri uri, int i) {
        this.f393595a = gVar;
        this.f393596b = uri;
        this.f393597c = i;
    }

    public final Object call() {
        C145559g gVar = this.f393595a;
        return ((OpenFileDescriptorResponse) C146021aq.m237852f(((C145572t) ((C58885cv) gVar.f393600a).f156729a).mo121457b(this.f393596b, this.f393597c))).f393587a;
    }
}
