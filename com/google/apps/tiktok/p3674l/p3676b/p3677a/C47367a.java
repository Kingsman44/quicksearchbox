package com.google.apps.tiktok.p3674l.p3676b.p3677a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3676b.C47372c;
import com.google.apps.tiktok.p3674l.p3676b.C47379j;
import com.google.apps.tiktok.p3674l.p3676b.C47380k;
import org.chromium.net.NetworkException;

/* renamed from: com.google.apps.tiktok.l.b.a.a */
/* compiled from: PG */
public final class C47367a implements C47372c {

    /* renamed from: a */
    private final Context f123093a;

    public C47367a(Context context) {
        this.f123093a = context;
    }

    /* renamed from: c */
    private static final int m84199c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return R.string.unknown_cronet_error;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C47380k mo20458a(Throwable th) {
        C47379j jVar = new C47379j();
        jVar.f123102a.f123104a = this.f123093a.getString(m84199c(((NetworkException) th).getErrorCode()));
        return jVar.mo51244a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo20459b(Throwable th) {
        return m84199c(((NetworkException) th).getErrorCode()) != 0;
    }
}
