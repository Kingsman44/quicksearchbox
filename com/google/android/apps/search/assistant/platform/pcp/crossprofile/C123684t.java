package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.crossprofile.C123676m;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.C142587l;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.t */
/* compiled from: PG */
public final class C123684t {

    /* renamed from: a */
    public static final C123684t f341650a = new C123684t();

    /* renamed from: b */
    public static final Bundler f341651b = new PcpCrossProfileHandler_Bundler();

    /* renamed from: c */
    public final C142587l[] f341652c = {new C123680p(), new C123681q(), new C123682r(), new C123683s()};

    private C123684t() {
    }

    /* renamed from: a */
    static final C123669f m203055a(Context context) {
        C123664ae aeVar = C123664ae.f341627a;
        if (aeVar.f341628b == null) {
            synchronized (C123664ae.class) {
                if (aeVar.f341628b == null) {
                    aeVar.f341628b = new C123676m();
                }
            }
        }
        return ((C123676m.C123677a) C47266f.m84076a(context, C123676m.C123677a.class)).mo106097bh();
    }
}
