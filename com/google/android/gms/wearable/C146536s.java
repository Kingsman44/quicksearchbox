package com.google.android.gms.wearable;

import android.content.Context;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.wearable.internal.C146422ag;
import com.google.android.gms.wearable.internal.C146465bw;
import com.google.android.gms.wearable.internal.C146473cd;
import com.google.android.gms.wearable.internal.C146520t;

/* renamed from: com.google.android.gms.wearable.s */
/* compiled from: PG */
public final class C146536s {
    @Deprecated

    /* renamed from: a */
    public static final C143841m f395737a;

    /* renamed from: b */
    private static final C143840l f395738b;

    /* renamed from: c */
    private static final C143707a f395739c;

    static {
        C143840l lVar = new C143840l();
        f395738b = lVar;
        C146534q qVar = new C146534q();
        f395739c = qVar;
        f395737a = new C143841m("Wearable.API", qVar, lVar);
    }

    /* renamed from: a */
    public static C146409d m238538a(Context context) {
        return new C146520t(context, C143846r.f389923a);
    }

    /* renamed from: b */
    public static C146414i m238539b(Context context) {
        return new C146422ag(context, C143846r.f389923a);
    }

    /* renamed from: c */
    public static C146531n m238540c(Context context) {
        return new C146465bw(context, C143846r.f389923a);
    }

    /* renamed from: d */
    public static C146532o m238541d(Context context) {
        return new C146473cd(context, C143846r.f389923a);
    }
}
