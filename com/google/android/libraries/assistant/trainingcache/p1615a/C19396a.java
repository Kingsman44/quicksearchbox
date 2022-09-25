package com.google.android.libraries.assistant.trainingcache.p1615a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.learning.C144823j;
import com.google.android.gms.learning.C144825l;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.TrainingInterval;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19408l;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.protobuf.C63088z;
import java.io.File;

/* renamed from: com.google.android.libraries.assistant.trainingcache.a.a */
/* compiled from: PG */
public final class C19396a {
    /* renamed from: a */
    public static Uri m36984a(Context context, File file) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = context.getFilesDir().getAbsolutePath();
        String absolutePath3 = context.getCacheDir().getAbsolutePath();
        String absolutePath4 = context.getDir("foo", 0).getAbsolutePath();
        String substring = absolutePath4.substring(0, absolutePath4.length() - 3);
        if (absolutePath.startsWith(absolutePath2)) {
            return Uri.parse("appfiles:".concat(String.valueOf(absolutePath.substring(absolutePath2.length()))));
        }
        if (absolutePath.startsWith(absolutePath3)) {
            return Uri.parse("appcache:".concat(String.valueOf(absolutePath.substring(absolutePath3.length()))));
        }
        if (absolutePath.startsWith(substring)) {
            String substring2 = absolutePath.substring(substring.length());
            if (!TextUtils.isEmpty(substring2) && substring2.startsWith("/")) {
                substring2 = substring2.substring(1);
            }
            return Uri.parse("appdir:/".concat(String.valueOf(substring2)));
        }
        throw new IllegalArgumentException("File path must be path of app files or cache");
    }

    /* renamed from: b */
    public static InAppTrainerOptions m36985b(C19408l lVar, boolean z) {
        C144823j jVar = new C144823j();
        jVar.mo120237e(lVar.mo24549c());
        jVar.f391654a = lVar.mo24547a();
        jVar.f391655b = true;
        jVar.mo120235c(lVar.mo24548b());
        if (z) {
            jVar.f391657d = 5000;
            jVar.f391656c = C144825l.m235363a();
        }
        return jVar.mo120233a();
    }

    /* renamed from: c */
    public static InAppTrainerOptions m36986c(Context context, C19414r rVar, boolean z) {
        C144823j jVar = new C144823j();
        jVar.mo120237e(rVar.mo24572g());
        jVar.f391654a = rVar.mo24565a();
        jVar.f391655b = true;
        jVar.mo120236d(m36984a(context, rVar.mo24568d()), m36984a(context, rVar.mo24567c()), m36984a(context, rVar.mo24569e()));
        jVar.f391658e = new TrainingInterval(1, 0);
        C63088z b = rVar.mo24566b();
        if (b != null) {
            jVar.mo120234b(b.mo59174N());
        }
        if (z) {
            jVar.f391657d = 5000;
            jVar.f391656c = C144825l.m235363a();
        }
        return jVar.mo120233a();
    }
}
