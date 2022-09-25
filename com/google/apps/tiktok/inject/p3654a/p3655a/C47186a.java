package com.google.apps.tiktok.inject.p3654a.p3655a;

import android.os.Bundle;
import androidx.lifecycle.C2319a;
import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2358bf;
import androidx.savedstate.C4091g;
import com.google.android.apps.gsa.binaries.satin.app.awt;
import com.google.android.apps.gsa.binaries.satin.app.ayw;
import com.google.apps.tiktok.inject.p3654a.p3655a.C47187b;
import dagger.hilt.C68286a;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.inject.a.a.a */
/* compiled from: PG */
final class C47186a extends C2319a {

    /* renamed from: a */
    final /* synthetic */ awt f122842a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47186a(C4091g gVar, Bundle bundle, awt awt) {
        super(gVar, bundle);
        this.f122842a = awt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C2358bf mo5722d(Class cls, C2344as asVar) {
        awt awt = this.f122842a;
        awt.f204599d = asVar;
        C68225k.m98529a(awt.f204599d, C2344as.class);
        C69464a aVar = (C69464a) ((C47187b.C47188a) C68286a.m98629a(new ayw(awt.f204596a, awt.f204597b, awt.f204598c, awt.f204599d), C47187b.C47188a.class)).mo51097i().get(cls.getName());
        if (aVar != null) {
            return (C2358bf) aVar.mo17428b();
        }
        String name = cls.getName();
        throw new IllegalStateException("Expected the @AccountViewModel-annotated class '" + name + "' to be available in the multi-binding of @AccountViewModelMap but none was found.");
    }
}
