package com.google.android.play.core.p3538g;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.io.File;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.play.core.g.ad */
/* compiled from: PG */
public final class C45118ad implements C68220f {

    /* renamed from: a */
    private final C69464a f117802a;

    public C45118ad(C69464a aVar) {
        this.f117802a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        String string;
        Context context = ((C45116ab) this.f117802a).f117800a.f117799a;
        C68225k.m98532d(context);
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (!(bundle == null || (string = bundle.getString("local_testing_dir")) == null)) {
                return new File(context.getExternalFilesDir((String) null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
